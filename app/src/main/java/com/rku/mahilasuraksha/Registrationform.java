package com.rku.mahilasuraksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrationform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationform);

        Button button = (Button) findViewById(R.id.SHOW_PROGRESS);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Phone();
            }

        });

    }

    public void Phone()

    {
        Intent intent = new Intent(this, Phone.class);
        startActivity(intent);
    }
}