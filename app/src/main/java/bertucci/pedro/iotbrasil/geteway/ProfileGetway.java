package bertucci.pedro.iotbrasil.geteway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bertucci.pedro.iotbrasil.Canal.MainCanal;
import bertucci.pedro.iotbrasil.Devices.MainDevices;
import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.Sms.MainSms;
import bertucci.pedro.iotbrasil.TpcIp.MainTcp;

public class ProfileGetway extends AppCompatActivity {

    Button btnSms, btnTcp, btnCanal, btnDevice, btnGeteway, btnNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_getway);
        setTitle("Gateway 1");


        btnSms = (Button) findViewById(R.id.btnSms);
        btnTcp = (Button) findViewById(R.id.btnTcp);
        btnCanal = (Button) findViewById(R.id.button5);
        btnGeteway = (Button) findViewById(R.id.btnGeteway2);
        btnDevice= (Button) findViewById(R.id.btnDevice);
        btnNumero = (Button) findViewById(R.id.btnNumero);

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ProfileGetway.this,MainSms.class);
                startActivity(it);
            }
        });

        btnTcp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ProfileGetway.this,MainTcp.class);
                startActivity(it);
            }
        });

        btnCanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ProfileGetway.this,MainCanal.class);
                startActivity(it);
            }
        });
        btnDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ProfileGetway.this,MainDevices.class);
                startActivity(it);
            }
        });
        btnGeteway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ProfileGetway.this,AlteraGeteway.class);
                startActivity(it);
            }
        });
        btnNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ProfileGetway.this,MainNumeroGateway.class);
                startActivity(it);
            }
        });
    }
}
