package com.example.mvp.ui.login;

import com.example.mvp.data.db.model.User;

public interface LoginRepository {

    User getUser();

    void logIn();
}