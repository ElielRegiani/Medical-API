package med.voll.api.medico;

public class DadosListagemMedico {

    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;

    public DadosListagemMedico(Medico medico) {
        this.nome = medico.getNome();
        this.crm = medico.getCrm();
        this.email = medico.getEmail();
        this.especialidade = medico.getEspecialidade();
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
}
