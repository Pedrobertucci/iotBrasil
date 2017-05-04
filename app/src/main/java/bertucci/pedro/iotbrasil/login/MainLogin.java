package bertucci.pedro.iotbrasil.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bertucci.pedro.iotbrasil.MainActivity;
import bertucci.pedro.iotbrasil.R;

import static android.widget.Toast.LENGTH_LONG;

public class MainLogin extends AppCompatActivity {
    EditText edtUser,edtSenha;
    Button btnLogin;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        edtUser = (EditText) findViewById(R.id.edtUser);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUser.getText().toString();
                String senha = edtSenha.getText().toString();
                validaLogin(user,senha);


            }
        });
    }

    public void validaLogin(String user, String senha){
            context = getApplicationContext();

        if(user.equals("iotbrasil")){
            if(senha.equals("iotbrasil")){
                Intent it = new Intent(MainLogin.this,MainActivity.class);
                startActivity(it);
            }else{

                Toast toast = Toast.makeText(context,"Senha Incorreta! ",LENGTH_LONG);
                toast.show();

            }
        }else{
            Toast toast = Toast.makeText(context,"Usuario Incorreto! ",LENGTH_LONG);
            toast.show();
        }
    }
}
