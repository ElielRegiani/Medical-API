package med.voll.api.endereco;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.getLogradouro();
        this.bairro = dadosEndereco.getBairro();
        this.cep = dadosEndereco.getCep();
        this.cidade = dadosEndereco.getCidade();
        this.uf = dadosEndereco.getUf();
        this.complemento = dadosEndereco.getComplemento();
        this.numero = dadosEndereco.getNumero();
    }

    public void atualizarInformacoes(DadosEndereco dadosEndereco) {
        if (dadosEndereco.getLogradouro() != null) {
            this.logradouro = dadosEndereco.getLogradouro();
        }
        if (dadosEndereco.getBairro() != null) {
            this.bairro = dadosEndereco.getBairro();
        }
        if (dadosEndereco.getCep() != null) {
            this.cep = dadosEndereco.getCep();
        }
        if (dadosEndereco.getCidade() != null) {
            this.cidade = dadosEndereco.getCidade();
        }
        if (dadosEndereco.getUf() != null) {
            this.uf = dadosEndereco.getUf();
        }
        if (dadosEndereco.getComplemento() != null) {
            this.complemento = dadosEndereco.getComplemento();
        }
        if (dadosEndereco.getNumero() != null) {
            this.numero = dadosEndereco.getNumero();
        }
    }
}
