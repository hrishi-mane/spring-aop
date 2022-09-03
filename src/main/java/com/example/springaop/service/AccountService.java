package com.example.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountService {
    private static final String ADD_ACCOUNT = "addAccount()";

    public void addAccount() {
        log.info(ADD_ACCOUNT + " method executed successfully");
    }
}
