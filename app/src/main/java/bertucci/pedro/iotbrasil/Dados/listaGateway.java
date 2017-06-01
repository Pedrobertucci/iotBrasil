package bertucci.pedro.iotbrasil.Dados;

import android.app.ListActivity;
import android.os.Bundle;

/**
 * Created by pedro on 29/05/17.
 */

public class listaGateway extends ListActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GatewayBD gatewayBD = new GatewayBD(this);

        setListAdapter(new GatewayAdapter(this, gatewayBD.listar()));
    }



}
