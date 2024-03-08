package med.voll.api.domain.consulta.validacoes;

import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.paciente.PacienteRepository;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta {

    private PacienteRepository pacienteRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        boolean pacienteEstaAtivo = pacienteRepository.findAllByAtivoTrue(dados.getIdPaciente());
        if (!pacienteEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com paciente excluído!");
        }
    }
}