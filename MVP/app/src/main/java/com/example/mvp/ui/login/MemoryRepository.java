package com.example.mvp.ui.login;

import com.example.mvp.data.db.model.User;

public class MemoryRepository implements LoginRepository {

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void logIn() {

    }
}