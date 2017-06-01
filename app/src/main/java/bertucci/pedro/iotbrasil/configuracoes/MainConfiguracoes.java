package bertucci.pedro.iotbrasil.configuracoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.geteway.ProfileGetway;

public class MainConfiguracoes extends AppCompatActivity {

    String gateway1,gateway2, gateway3, gateway4;


    Button btnGateway, btnGateway2,btnGateway3,btnGateway4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_configuracoes);


        btnGateway = (Button) findViewById(R.id.btnGateway1);
        btnGateway2 = (Button) findViewById(R.id.btnGeteway2);
        btnGateway3 = (Button) findViewById(R.id.btnGateway3);
        btnGateway4 = (Button) findViewById(R.id.btnGateway4);

        btnGateway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainConfiguracoes.this,ProfileGetway.class);
                startActivity(it);
            }
        });
        btnGateway2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainConfiguracoes.this,ProfileGetway.class);
                startActivity(it);
            }
        });
        btnGateway3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainConfiguracoes.this,ProfileGetway.class);
                startActivity(it);
            }
        });
        btnGateway4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainConfiguracoes.this,ProfileGetway.class);
                startActivity(it);
            }
        });


    }
}
