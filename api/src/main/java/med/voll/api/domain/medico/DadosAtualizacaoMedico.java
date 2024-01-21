package med.voll.api.domain.medico;

import javax.validation.constraints.NotNull;

import med.voll.api.domain.endereco.DadosEndereco;

public class DadosAtualizacaoMedico {

    @NotNull
    private Long id;
    private String nome;
    private String telefone;
    private DadosEndereco endereco;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }
}
