package com.example.knowyourcs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class adminlogin extends AppCompatActivity{

    private FirebaseAuth Auth;
    private ProgressDialog progressDialog;
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);

        e1=(EditText)findViewById(R.id.usernm);
        e2=(EditText)findViewById(R.id.passwd);
        b1=(Button)findViewById(R.id.loginbtn);
        b2=(Button)findViewById(R.id.gotoregisteradmin);

        progressDialog=new ProgressDialog(this);
        FirebaseApp.initializeApp(adminlogin.this);
        Auth=FirebaseAuth.getInstance();

      //USE FIREBASE HERE PLZ

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=e1.getText().toString();
                String pass=e2.getText().toString();


                if (TextUtils.isEmpty(user))
                {
                    e1.setError("Please Enter a Valid Email");
                    e1.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(pass))
                {
                    e2.setError("Please Enter A Valid Password");
                    e2.requestFocus();
                    return;
                }

                else
                {
                    e1.setText("");
                    e2.setText("");
                }

                progressDialog.setMessage("Processing....");
                progressDialog.show();


                Auth.signInWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if(task.isSuccessful())
                        {

                            Intent intent=new Intent(adminlogin.this,adminpage.class);
                            startActivity(intent);
                            onBackPressed();
                        }
                        else
                        {
                            e1.setText("");
                            e2.setText("");
                            Toast.makeText(adminlogin.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adminlogin.this,adminregister.class);
                startActivity(intent);
                Toast.makeText(adminlogin.this, "Register The Admin", Toast.LENGTH_SHORT).show();
            }
        });



    }

}
