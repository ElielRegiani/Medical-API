package med.voll.api.domain.medico;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import med.voll.api.domain.endereco.DadosEndereco;

public class DadosCadastroMedico {

    @NotBlank(message = "{nome.obrigatorio}")
    private String nome;
    @NotBlank(message = "{email.obrigatorio}")
    @Email(message = "{email.invalido}")
    private String email;
    @NotBlank(message = "{telefone.obrigatorio}")
    private String telefone;
    @NotBlank(message = "{crm.obrigatorio}")
    @Pattern(regexp = "\\d{4,6}", message = "{crm.invalido}")
    private String crm;
    @NotNull(message = "{especialidade.obrigatoria}")
    private Especialidade especialidade;
    @NotNull(message = "{endereco.obrigatorio}")
    @Valid
    private DadosEndereco endereco;

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

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
