package bertucci.pedro.iotbrasil.configuracoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bertucci.pedro.iotbrasil.Devices.MainAdicionaDevice;
import bertucci.pedro.iotbrasil.MainActivity;
import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.geteway.MainGetway;
import bertucci.pedro.iotbrasil.geteway.ProfileGetway;

public class MainConfiguracoes extends AppCompatActivity {


    Button btnGeteway, btnDevices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_configuracoes);


        btnGeteway = (Button) findViewById(R.id.btnGeteway);
        btnDevices = (Button) findViewById(R.id.btnDevice);
        btnGeteway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainConfiguracoes.this,ProfileGetway.class);
                startActivity(it);
            }
        });

        btnDevices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainConfiguracoes.this,MainAdicionaDevice.class);
                startActivity(it);
            }
        });
    }
}
