package com.example.example_app;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.example_app.R.id.action_bar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     EditText edittext=findViewById(R.id.user_message);


     public void send_message(View view)
     {
         String message=edittext.getText().toString();
         Intent intent=new Intent(this,Message_activity.class);
         intent.putExtra("Message",message);
         startActivity(intent);
     }

}
