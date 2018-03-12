package com.demo_mvp.pulkit.login;

import android.text.TextUtils;

/**
 * Created by pulkit on 12/3/18.
 */

public class LoginPresenterImpl implements LoginPresenter {

    LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void performLogin(String userName, String password) {
        if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(password)) {
            loginView.loginValidations();

        } else {
            if (userName.equalsIgnoreCase("Pulkit") && password.equalsIgnoreCase("Pulkit")) {
                loginView.loginsuccess();

            } else {
                loginView.loginError();
            }
        }
    }
}
