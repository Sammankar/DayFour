package sanjyot.project.dayfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttondot, buttonClear, buttonEqual;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 =findViewById(R.id.zero);
        button1 =findViewById(R.id.one);
        button2 =findViewById(R.id.two);
        button3 =findViewById(R.id.three);
        button4 =findViewById(R.id.four);
        button5 =findViewById(R.id.five);
        button6 =findViewById(R.id.six);
        button7 =findViewById(R.id.seven);
        button8 =findViewById(R.id.eight);
        button9 =findViewById(R.id.nine);
        buttondot =findViewById(R.id.Dot);
        buttonAdd =findViewById(R.id.add);
        buttonSub =findViewById(R.id.Sub);
        buttonMul =findViewById(R.id.Mul);
        buttonDivision =findViewById(R.id.Div);
        buttonClear =findViewById(R.id.Clear);
        buttonEqual =findViewById(R.id.Equal);
        editText1 =findViewById(R.id.editTextNumber);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + "0");
            }
        });


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText() + ".");
            }
        });
    }
}

