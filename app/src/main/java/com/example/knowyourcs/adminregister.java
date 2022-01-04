package com.example.knowyourcs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class adminregister extends AppCompatActivity {

    EditText usrnam,email,passwd;
    Button register;
    DatabaseReference databaseReference;
    final FirebaseAuth mAuth=FirebaseAuth.getInstance();
    private ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminregister);

        usrnam=(EditText)findViewById(R.id.usernm);
        email=(EditText)findViewById(R.id.email);
        passwd=(EditText)findViewById(R.id.passwd);
        register=(Button)findViewById(R.id.registerbtn);
       // FirebaseDatabase database=FirebaseDatabase.getInstance();

        progress = new ProgressDialog(this);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String usernm=usrnam.getText().toString();
                String mail=email.getText().toString();
                String pass=passwd.getText().toString();

                if (TextUtils.isEmpty(usernm))
                {
                    usrnam.setError("Please Enter a Valid Email");
                    usrnam.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(pass))
                {
                    passwd.setError("Please Enter A Valid Password");
                    passwd.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(mail))
                {
                    email.setError("Please Enter A Valid Password");
                    email.requestFocus();
                    return;
                }
                else
                {
                    usrnam.setText("");
                    passwd.setText("");
                    email.setText("");
                    //Toast.makeText(adminregister.this, "Cannot Be Empty!", Toast.LENGTH_SHORT).show();
                }

                mAuth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            progress.show();
                            Log.d("Successful register", "createUserWithEmail:success");
                            String user = mAuth.getCurrentUser().getUid();
                            databaseReference = FirebaseDatabase.getInstance().getReference().child(user).child("user");
                            databaseReference.setValue(usernm);
                            Intent intent = new Intent(adminregister.this, adminpage.class);
                            startActivity(intent);
                            Toast.makeText(adminregister.this, "Successful Register", Toast.LENGTH_SHORT).show();
                            //updateUI(user);
                        }
                        else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(adminregister.this, "Authentication failed. Check whether you are entering gmail or not.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        });

    }



}
