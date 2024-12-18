package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {

    Button b5;
    EditText e1,e2;

    TextView t1;

    Integer num1,num2,sum;


    String getNum1,getNum2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        b5=(Button) findViewById(R.id.addbtn);
        e1=(EditText) findViewById(R.id.addnum1);
        e2=(EditText) findViewById(R.id.addnum2);
        t1=(TextView) findViewById(R.id.addresult);


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();

                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);

                sum=num1+num2;

                result=String.valueOf(sum);

                t1.setText(result);



            }
        });

    }
}