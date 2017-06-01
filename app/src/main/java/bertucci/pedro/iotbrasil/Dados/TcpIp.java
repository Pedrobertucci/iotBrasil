package bertucci.pedro.iotbrasil.Dados;

/**
 * Created by pedro on 31/05/17.
 */

public class TcpIp {

    private int id_tcp;
    private String ip;
    private String selecionado;

    public int getId_tcp() {
        return id_tcp;
    }

    public void setId_tcp(int id_tcp) {
        this.id_tcp = id_tcp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(String selecionado) {
        this.selecionado = selecionado;
    }
}
