package com.rku.mahilasuraksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {

    EditText edtNumber;
    Button btnDial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        edtNumber=(EditText)findViewById(R.id.edtNumber);
        btnDial=(Button)findViewById(R.id.btnDial);
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Auto-generated
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel: "+ edtNumber.getText().toString()));
                startActivity(i);
            }
        });
    }
}