package com.javahe.socketdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    TextView content;
    @BindView(R.id.et_sent_content)
    EditText editText;
    @BindView(R.id.tv_canncel)
    TextView tv_canncel;
    @BindView(R.id.tv_ok)
    TextView tv_ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_ok)
    public void sendMsg(View view) {
        Toast.makeText(this,"hello",0).show();
    }
}
