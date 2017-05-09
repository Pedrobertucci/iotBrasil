package bertucci.pedro.iotbrasil.configuracoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bertucci.pedro.iotbrasil.MainActivity;
import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.geteway.MainGetway;

public class MainConfiguracoes extends AppCompatActivity {


    Button btnGeteway;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_configuracoes);


        btnGeteway = (Button) findViewById(R.id.btnGeteway);

        btnGeteway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainConfiguracoes.this,MainGetway.class);
                startActivity(it);
            }
        });
    }
}
