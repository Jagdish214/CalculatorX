package com.example.caculatorx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // define the global variable

    // variable number1, number2 for input number
    // Add_button, result textView

    EditText number1;
    EditText number2;
    Button Add_button;
    Button Sub_button;
    Button Mul_button;
    Button Div_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component which id is assign in xml file
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        Add_button=(Button) findViewById(R.id.add_button);
        Sub_button=(Button) findViewById(R.id.sub_button);
        Mul_button=(Button) findViewById(R.id.mul_button);
        Div_button=(Button) findViewById(R.id.div_button);
        result = (TextView) findViewById(R.id.textView_answer);

        // Add_button add clicklistener
        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double sum = num1 + num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });

        // Sub_button add clicklistener
        Sub_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double sub = num1 - num2;
                // set it ot result textview
                result.setText(Double.toString(sub));
            }
        });

        // Mul_button add clicklistener
        Mul_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double mul = num1 * num2;
                // set it ot result textview
                result.setText(Double.toString(mul));
            }
        });

        // Div_button add clicklistener
        Div_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double div = num1 / num2;
                // set it ot result textview
                result.setText(Double.toString(div));
            }
        });
    }
}