package bertucci.pedro.iotbrasil.geteway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import bertucci.pedro.iotbrasil.R;

public class AlteraGeteway extends AppCompatActivity {

    private EditText edtNome, edtNumero;
    private Button btnSalva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera_geteway);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtNumero = (EditText) findViewById(R.id.edtNumero);

        btnSalva = (Button) findViewById(R.id.btnAlteraGateway);




    }
}
