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

public class SubActivity extends AppCompatActivity {


    Button b6;

    EditText e3,e4;

    TextView t2;

    String getNum1,getNum2,result;

    Integer num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        b6=(Button) findViewById(R.id.subbtn);
        e3=(EditText) findViewById(R.id.subnum1);
        e4=(EditText) findViewById(R.id.subnum2);
        t2=(TextView) findViewById(R.id.subresult);


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=e3.getText().toString();
                getNum2=e4.getText().toString();

                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);

                sum=num1-num2;

                result=String.valueOf(sum);

                t2.setText(result);



            }
        });
    }
}