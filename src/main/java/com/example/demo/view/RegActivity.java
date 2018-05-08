package com.example.demo.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.demo.R;
import com.example.demo.model.ModelImpl;
import com.example.demo.presenter.Presenter;

public class RegActivity extends AppCompatActivity implements IRegView,View.OnClickListener{
    private EditText mobile;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        initViews();
    }

    private void initViews() {
        mobile = findViewById(R.id.mobile);
        password = findViewById(R.id.pwd);
        Button reg = findViewById(R.id.reg);
        reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.reg:
                Presenter presenter = new Presenter();
                presenter.regPresenter(new ModelImpl(), this);
                break;
        }
    }

    @Override
    public String getMobile() {
        return mobile.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }

    @Override
    public void regSuccess() {
        Toast.makeText(RegActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(RegActivity.this, MainActivity.class));
    }

    @Override
    public void regError() {
        Toast.makeText(RegActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
    }
}
