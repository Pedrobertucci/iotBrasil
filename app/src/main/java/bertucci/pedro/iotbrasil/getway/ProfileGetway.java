package bertucci.pedro.iotbrasil.getway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bertucci.pedro.iotbrasil.Devices.MainDevices;
import bertucci.pedro.iotbrasil.MainActivity;
import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.Sms.MainSms;

public class ProfileGetway extends AppCompatActivity {

    Button btnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_getway);
        setTitle("Getway 1");


        btnSms = (Button) findViewById(R.id.btnSms);

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ProfileGetway.this,MainSms.class);
                startActivity(it);
            }
        });
    }
}
