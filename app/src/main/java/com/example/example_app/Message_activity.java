package com.example.example_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Message_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_activity);
    }


    Intent intent=getIntent();
    String message=intent.getStringExtra("Message");
    TextView text=findViewById(R.id.message_id);

    public void setText(TextView text) {
        this.text = text;
        text.setText(message);
    }

    public void finalactivity(View view)
    {
        startActivity(new Intent(this,final_activity.class));
    }
}
