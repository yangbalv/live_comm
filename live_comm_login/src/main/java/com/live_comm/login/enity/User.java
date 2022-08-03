package com.live_comm.login.enity;

public class User {
    private String loginKey;
    private String loginPassword;

    public String getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginKey='" + loginKey + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }
}
