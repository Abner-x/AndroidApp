package com.example.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取控件
        TextView textView = findViewById(R.id.textView5);

         editText = findViewById(R.id.edit);
        //Double tem = Double.parseDouble(editText.getText().toString());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

        out = findViewById(R.id.output);
        out.setText("请输入数字");

    }

    @Override
    public void onClick(View view) {
        Log.i("main","onClick msg....");
        try {
            Double tem = Double.parseDouble(editText.getText().toString());
            out.setText("摄氏温度为：" + (tem - 32) / 1.8);
        } catch (Exception e) {
            out.setText("请输入纯数字");
        }
    }


}