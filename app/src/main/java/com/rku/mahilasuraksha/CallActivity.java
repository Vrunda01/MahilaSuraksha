package com.rku.mahilasuraksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {

    EditText edtNumber;
    ImageButton btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        edtNumber = findViewById(R.id.edtNumber);
        btnCall = findViewById(R.id.btnCall);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = edtNumber.getText().toString();
                //if phone number is empty
                if(phone.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please enter Mobile Number!",Toast.LENGTH_SHORT).show();
                }
                //call if number is entered
                else{
                    String call = "tel:" + phone;
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(call));
                    startActivity(intent);
                }
            }
        });
    }
}