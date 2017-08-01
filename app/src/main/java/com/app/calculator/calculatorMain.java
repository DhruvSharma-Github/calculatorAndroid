package com.app.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class calculatorMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);

    }

  public void  btn8 (View view)
  {

      Button btn =(Button)findViewById(R.id.button8);
      EditText editText=(EditText)findViewById(R.id.editTextCalculator);
      editText.setText(btn.getText().toString());


  }



}
