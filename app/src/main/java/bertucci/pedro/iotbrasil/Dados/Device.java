package bertucci.pedro.iotbrasil.Dados;

/**
 * Created by pedro on 31/05/17.
 */

public class Device {

    private int id_device;
    private String id;
    private String nome_device;

    public int getId_device() {
        return id_device;
    }

    public void setId_device(int id_device) {
        this.id_device = id_device;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome_device() {
        return nome_device;
    }

    public void setNome_device(String nome_device) {
        this.nome_device = nome_device;
    }
}
