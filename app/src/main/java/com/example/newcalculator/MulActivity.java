package com.example.newcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MulActivity extends AppCompatActivity {


    Button b7;
    EditText e5,e6;

    TextView t3;

    Integer num1,num2,sum;


    String getNum1,getNum2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);

        b7=(Button) findViewById(R.id.mulbtn);
        e5=(EditText) findViewById(R.id.mulnum1);
        e6=(EditText) findViewById(R.id.mulnum2);
        t3=(TextView) findViewById(R.id.mulresult);


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=e5.getText().toString();
                getNum2=e6.getText().toString();

                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);

                sum=num1*num2;

                result=String.valueOf(sum);

                t3.setText(result);



            }
        });

    }
}