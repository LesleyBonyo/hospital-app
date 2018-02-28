package com.wit.android.wit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
//import com.facebook.FacebookSdk;
//import com.facebook.appevents.AppEventsLogger;


public class RegistrationActivity extends AppCompatActivity {


    EditText f_name;
    Spinner g;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        f_name = findViewById(R.id.editText2);
        g = findViewById(R.id.spinner);

    }


    public void goRegister(View view) {
        String firstname = f_name.getText().toString();
        String gender = g.getSelectedItem().toString();
        Toast.makeText(RegistrationActivity.this,"the first name is"+ firstname,Toast.LENGTH_LONG);
        Intent intent1 = new Intent(this,RegistrationActivity.class );
        startActivity(intent1);

    }
}
