package bertucci.pedro.iotbrasil.Dados;

/**
 * Created by b_ped on 19/05/2017.
 */

public class Gateway {

    private int id_gateway;
    private String nome;
    private String telefone;


    public int getId_gateway() {
        return id_gateway;
    }

    public void setId_gateway(int id_gateway) {
        this.id_gateway = id_gateway;
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
}
