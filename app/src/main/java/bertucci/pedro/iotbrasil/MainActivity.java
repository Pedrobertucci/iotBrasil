package bertucci.pedro.iotbrasil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import bertucci.pedro.iotbrasil.Devices.MainDevices;
import bertucci.pedro.iotbrasil.Relatorios.MainRelatorios;
import bertucci.pedro.iotbrasil.configuracoes.MainConfiguracoes;
import bertucci.pedro.iotbrasil.geteway.MainGetway;

public class MainActivity extends AppCompatActivity {

    ImageView imgConfig, imgDevice,imgGetway,imgRelatorios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgConfig = (ImageView) findViewById(R.id.imgConfig);
        imgDevice = (ImageView) findViewById(R.id.imgDevice);
        imgGetway = (ImageView) findViewById(R.id.imgGetway);
        imgRelatorios = (ImageView) findViewById(R.id.imgRelatorios);


        imgConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,MainConfiguracoes.class);
                startActivity(it);
            }
        });

        imgDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,MainDevices.class);
                startActivity(it);
            }
        });

        imgGetway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,MainGetway.class);
                startActivity(it);
            }
        });
        imgRelatorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,MainRelatorios.class);
                startActivity(it);
            }
        });



    }
}
