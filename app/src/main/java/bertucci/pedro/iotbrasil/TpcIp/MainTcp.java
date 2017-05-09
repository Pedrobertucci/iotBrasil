package bertucci.pedro.iotbrasil.TpcIp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import bertucci.pedro.iotbrasil.Mask;
import bertucci.pedro.iotbrasil.R;

public class MainTcp extends AppCompatActivity {

    EditText tcpIp1, tcpIp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tcp);

        tcpIp1 = (EditText) findViewById(R.id.edtTcp1);
        tcpIp2 = (EditText) findViewById(R.id.edtTcp2);

        tcpIp1.addTextChangedListener(Mask.insert(Mask.TCP_IP, tcpIp1));
        tcpIp2.addTextChangedListener(Mask.insert(Mask.TCP_IP, tcpIp2));

    }
}
