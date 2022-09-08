package com.example.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountService {
    private String name;
    private String account;
    private static final String ADD_ACCOUNT = "addAccount()";

    public AccountService() {
    }

    public void addAccount() {
        log.info(ADD_ACCOUNT + " method executed successfully");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
