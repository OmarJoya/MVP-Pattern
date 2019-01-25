package com.example.mvp.ui.login;

import com.example.mvp.data.db.model.User;

public interface LoginActivityMVP {

    interface Model {
        void createUser(String email, String password);

        User getUser();
    }

    interface View {
        String getEmail();

        String getPassword();

        void showCredentialsNotValid();

        void showInputError();

        void setEmail();

        void setPassword();
    }

    interface Presenter {

        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();
    }
}