package bertucci.pedro.iotbrasil.Dados;

/**
 * Created by pedro on 31/05/17.
 */

public class Sms {

    private int  id_sms;
    private String numero;
    private String selecionado;


    public int getId_sms() {
        return id_sms;
    }

    public void setId_sms(int id_sms) {
        this.id_sms = id_sms;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(String selecionado) {
        this.selecionado = selecionado;
    }
}
