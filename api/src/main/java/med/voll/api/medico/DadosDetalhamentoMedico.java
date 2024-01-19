package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public class DadosDetalhamentoMedico {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private Especialidade especialidade;
    private Endereco endereco;

    public DadosDetalhamentoMedico(Medico medico) {
        this.id = medico.getId();
        this.nome = medico.getNome();
        this.email = medico.getEmail();
        this.telefone = medico.getTelefone();
        this.crm = medico.getCrm();
        this.especialidade = medico.getEspecialidade();
        this.endereco = medico.getEndereco();
    }
}
