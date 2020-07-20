package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstvalue;
    EditText secondvalue;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstvalue = findViewById(R.id.Firstvalue);
        secondvalue = findViewById(R.id.second_value);
        answer = findViewById(R.id.answer);
    }

    String answerstring = "";

    public void add(View view) {
        String firstvaluedata = firstvalue.getText().toString();
        String secondvaluedata = secondvalue.getText().toString();
        if (firstvaluedata.isEmpty() | secondvaluedata.isEmpty()) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
        } else {
            try {

                int first = Integer.parseInt(firstvaluedata);
                int second = Integer.parseInt(secondvaluedata);
                int answervalue = first + second;
                String answerstring = String.valueOf(answervalue);
                answer.setText(answerstring);
            } catch (Exception e) {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void subtract(View view) {
        String firstvaluedata = firstvalue.getText().toString();
        String secondvaluedata = secondvalue.getText().toString();
        if (firstvaluedata.isEmpty() | secondvaluedata.isEmpty()) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
        } else {
            try {
                int first = Integer.parseInt(firstvaluedata);
                int second = Integer.parseInt(secondvaluedata);
                int answervalue = first - second;
                String answerstring = String.valueOf(answervalue);
                answer.setText(answerstring);
            } catch (Exception e) {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void multiply(View view) {
        String firstvaluedata = firstvalue.getText().toString();
        String secondvaluedata = secondvalue.getText().toString();
        if (firstvaluedata.isEmpty() | secondvaluedata.isEmpty()) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
        } else {
            try {
                int first = Integer.parseInt(firstvaluedata);
                int second = Integer.parseInt(secondvaluedata);
                int answervalue = first * second;
                String answerstring = String.valueOf(answervalue);
                answer.setText(answerstring);
            } catch (Exception e) {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void division(View view) {
        String firstvaluedata = firstvalue.getText().toString();
        String secondvaluedata = secondvalue.getText().toString();
        if (firstvaluedata.isEmpty() | secondvaluedata.isEmpty()) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
        } else {
            try {

                int first = Integer.parseInt(firstvaluedata);
                int second = Integer.parseInt(secondvaluedata);
                int answervalue = first / second;
                String answerstring = String.valueOf(answervalue);
                answer.setText(answerstring);
            } catch (Exception e) {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void power(View view) {
        String firstvaluedata = firstvalue.getText().toString();
        String secondvaluedata = secondvalue.getText().toString();
        if (firstvaluedata.isEmpty() | secondvaluedata.isEmpty()) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
        } else {
            try {
                int first = Integer.parseInt(firstvaluedata);
                int second = Integer.parseInt(secondvaluedata);
                int answervalue = 1;
                for (int i = 0; i <= second; i++) {
                    answervalue = first * answervalue;
                }
                answerstring = String.valueOf(answervalue);
                answer.setText(answerstring);
            } catch (Exception e) {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void mod(View view) {
        String firstvaluedata = firstvalue.getText().toString();
        String secondvaluedata = secondvalue.getText().toString();
        if (firstvaluedata.isEmpty() | secondvaluedata.isEmpty()) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
        } else {
            try {
                int first = Integer.parseInt(firstvaluedata);
                int second = Integer.parseInt(secondvaluedata);
                int answervalue = first%second;
                answerstring = String.valueOf(answervalue);
                answer.setText(answerstring);
            } catch (Exception e) {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        }
    }
}

