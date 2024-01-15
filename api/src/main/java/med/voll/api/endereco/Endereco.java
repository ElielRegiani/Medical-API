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
        System.out.println(dadosEndereco != null);
        this.logradouro = dadosEndereco.getLogradouro();
        this.bairro = dadosEndereco.getBairro();
        this.cep = dadosEndereco.getCep();
        this.cidade = dadosEndereco.getCidade();
        this.uf = dadosEndereco.getUf();
        this.complemento = dadosEndereco.getComplemento();
        this.numero = dadosEndereco.getNumero();
    }
}
