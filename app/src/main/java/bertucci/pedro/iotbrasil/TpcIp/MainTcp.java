package bertucci.pedro.iotbrasil.TpcIp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import bertucci.pedro.iotbrasil.Dados.Gateway;
import bertucci.pedro.iotbrasil.Dados.GatewayBD;
import bertucci.pedro.iotbrasil.Mask;
import bertucci.pedro.iotbrasil.R;

public class MainTcp extends AppCompatActivity {

    EditText tcpIp1, tcpIp2;
    CheckBox check1, check2, check3,check4;
    Button salvarEnviar;
    Gateway gateway;
    GatewayBD db;
    String telefone,sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tcp);

        tcpIp1 = (EditText) findViewById(R.id.edtTcp1);
        tcpIp2 = (EditText) findViewById(R.id.edtTcp2);

        tcpIp1.addTextChangedListener(Mask.insert(Mask.TCP_IP, tcpIp1));
        tcpIp2.addTextChangedListener(Mask.insert(Mask.TCP_IP, tcpIp2));

        check1 = (CheckBox) findViewById(R.id.checkTcp01);
        check2 = (CheckBox) findViewById(R.id.checkTcp02);

        salvarEnviar = (Button) findViewById(R.id.btnSalvaTcp);

        db = new GatewayBD(this);
        telefone = db.listar();

        salvarEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                  sms = "#ip,"+tcpIp1.getText().toString();


                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(telefone, null, sms, null, null);
                    Toast.makeText(getApplicationContext(), "Envio do TCP/IP com Sucesso!",
                            Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "Falha ao enviar TCP/IP!",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }

            }
        });


    }
}
