package com.example.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MembershipService {
    private String name;
    private String account;
    private static final String ADD_MEMBER = "addMember()";

    public MembershipService() {
    }

    public void addMember() {
        log.info(ADD_MEMBER + " Method executed successfully");
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
