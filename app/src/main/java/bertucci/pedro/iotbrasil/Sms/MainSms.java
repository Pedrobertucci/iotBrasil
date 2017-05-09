package bertucci.pedro.iotbrasil.Sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import bertucci.pedro.iotbrasil.Mask;
import bertucci.pedro.iotbrasil.R;

public class MainSms extends AppCompatActivity {

    EditText telefone1, telefone2, telefone3;
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


    }
}
