package com.example.androidexample;

public class User {

    private String username;
    private String password;


    public void SetUsername(String username)
    {
        this.username = username;
    }

    public void SetPassword(String password)
    {
        this.password = password;
    }

    public String GetUsername()
    {
        return this.username;
    }

    public String GetPassword()
    {
        return this.password;
    }
}
