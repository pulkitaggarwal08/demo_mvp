package com.demo_mvp.pulkit.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.demo_mvp.pulkit.R;
import com.demo_mvp.pulkit.ui.activities.CountryActivity;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private EditText et_email, et_password;
    private Button btn_submit;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findIds();
        init();
    }

    private void findIds() {
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_submit = findViewById(R.id.btn_submit);
    }

    private void init() {
        loginPresenter = new LoginPresenterImpl(LoginActivity.this);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = et_email.getText().toString();
                String password = et_password.getText().toString();

                loginPresenter.performLogin(userName, password);
            }
        });
    }

    @Override
    public void loginValidations() {
        Toast.makeText(this, "Please Enter username and password", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginsuccess() {
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(), CountryActivity.class);
        startActivity(intent);
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
    }

}
