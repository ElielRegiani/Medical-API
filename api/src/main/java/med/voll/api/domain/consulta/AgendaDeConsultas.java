package med.voll.api.domain.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.Paciente;
import med.voll.api.domain.paciente.PacienteRepository;

@Service
public class AgendaDeConsultas {

    @Autowired
    private ConsultaRepository Consultarepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    public void agendar(DadosAgendamentoConsulta dados) {
        if (!pacienteRepository.existsById(dados.getIdPaciente())) {
            throw new ValidacaoException("Id do paciente informado não existe!");
        }
        Paciente paciente = pacienteRepository.getReferenceById(dados.getIdPaciente());

        if (dados.getIdMedico() != null && !medicoRepository.existsById(dados.getIdMedico())) {
            throw new ValidacaoException("Id do médico informado não existe!");
        }
        Medico medico = escolherMedico(dados);

        Consulta consulta = new Consulta(medico, paciente, dados.getData());
        Consultarepository.save(consulta);
    }

    private Medico escolherMedico(DadosAgendamentoConsulta dados) {
        if (dados.getIdMedico() != null) {
            return medicoRepository.getReferenceById(dados.getIdMedico());
        }

        if (dados.getEspecialidade() == null) {
            throw new ValidacaoException("Especialidade é obrigatória quando médico não for escolhido!");
        }

        return medicoRepository.escolherMedicoAleatorioLivreNaData(dados.getEspecialidade(), dados.getData());
    }
}