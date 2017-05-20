package bertucci.pedro.iotbrasil.geteway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bertucci.pedro.iotbrasil.Dados.Gateway;
import bertucci.pedro.iotbrasil.Dados.GatewayBD;
import bertucci.pedro.iotbrasil.R;

public class AlteraGeteway extends AppCompatActivity {

    private EditText edtNome, edtNumero;
    private Button btnSalva;

    Gateway gateway;
    GatewayBD db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera_geteway);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtNumero = (EditText) findViewById(R.id.edtNumero);

        btnSalva = (Button) findViewById(R.id.btnAlteraGateway);

        db = new GatewayBD(this);


    }


    public void inserir(View v){
        try{
            Gateway gateway = new Gateway();

            gateway.setNome(edtNome.getText().toString());
            gateway.setTelefone(edtNumero.getText().toString());

            db.inserir(gateway);

            Toast.makeText(AlteraGeteway.this,"Gateway salvo com sucesso", Toast.LENGTH_LONG).show();

        }catch (Exception e){
            Toast.makeText(AlteraGeteway.this,"Error ao salvar o Gateway", Toast.LENGTH_LONG).show();
        }
    }
}
