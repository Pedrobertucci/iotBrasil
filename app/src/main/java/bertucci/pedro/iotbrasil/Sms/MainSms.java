package bertucci.pedro.iotbrasil.Sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bertucci.pedro.iotbrasil.Dados.Gateway;
import bertucci.pedro.iotbrasil.Dados.GatewayBD;
import bertucci.pedro.iotbrasil.MainActivity;
import bertucci.pedro.iotbrasil.Mask;
import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.configuracoes.MainConfiguracoes;

public class MainSms extends AppCompatActivity {

    EditText telefone1, telefone2, telefone3;
    Button btnEnvia;
    Gateway gateway;
    GatewayBD db;
    String telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sms);

        telefone1 = (EditText) findViewById(R.id.edtTcp1);
        telefone2 = (EditText) findViewById(R.id.edtTcp2);
        telefone3 = (EditText) findViewById(R.id.telefone3);
        telefone1.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, telefone1));
        telefone2.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, telefone2));
        telefone3.addTextChangedListener(Mask.insert(Mask.CELULAR_MASK, telefone3));
        btnEnvia = (Button)findViewById(R.id.btnSalvaSms);

        db = new GatewayBD(this);


        btnEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(telefone1 == null && telefone2 == null && telefone3 == null){
                    Toast.makeText(MainSms.this,"Digite Pelo Menos 1 Telefone",Toast.LENGTH_SHORT).show();
                }else{

                }

            }
        });


    }


    public void mandarSms(){

    }
}
