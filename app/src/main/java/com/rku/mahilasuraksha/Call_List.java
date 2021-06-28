package com.rku.mahilasuraksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Call_List extends AppCompatActivity {

    ImageButton person, call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_list);

        person = findViewById(R.id.ic_add_contact);
        call = findViewById(R.id.ic_call);
        setTitle("Call List");

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Call_List.this, CallActivity.class);
                startActivity(intent);
            }
        });

        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Call_List.this, Contact_Add.class);
                startActivity(intent);
            }
        });
    }
}