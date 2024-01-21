package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
