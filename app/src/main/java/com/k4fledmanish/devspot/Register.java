package com.k4fledmanish.devspot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity {


    EditText mEmail,mPassword;
    Button mRegisterBtn;
    TextView mLoginBtn;
    FirebaseAuth fAuth;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        mEmail      = findViewById(R.id.Email);
        mPassword   = findViewById(R.id.password);

        mRegisterBtn= findViewById(R.id.registerBtn);
        mLoginBtn   = findViewById(R.id.createText);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);



        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),Dashboard.class));
            finish();
        }



        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Required Email");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Required Password");
                    return;
                }

                if(password.length() < 6){
                    mPassword.setError("Password must be equal or grater than 6");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                // register the user in Firebase

                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Toast.makeText(Register.this, "User Registered. Please Login", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(getApplicationContext(),Login.class));


                        } else {

                            Toast.makeText(Register.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.INVISIBLE);
                        }

                    }
                });

            }
        });


        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });


    }
}
