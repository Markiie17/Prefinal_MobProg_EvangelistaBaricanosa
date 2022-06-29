package com.example.finals_mp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private Button btnStart;
    private EditText edittextuser;
    private EditText edittextpass;
    private Button btnSignup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        initComponents();

        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String email = edittextuser.getText().toString();
                String password = edittextpass.getText().toString();

                if (email.isEmpty()) {
                    showMessage("Username is required!");
                    return;
                }
                if (password.isEmpty()) {
                    showMessage("Password is required!");
                    return;
                }

                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnSignup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, SignUp.class);
                intent.putExtra("MESSAGE","hello");
                startActivity(intent);
            }
        });

    }

    private void initComponents(){
        btnStart = (Button) findViewById(R.id.btnStart);
        edittextuser = (EditText) findViewById(R.id.edittextuser);
        edittextpass = (EditText) findViewById(R.id.edittextpass);
        btnSignup1 = (Button) findViewById(R.id.btnSignup1);
    }

    private void showMessage(String message) {
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
