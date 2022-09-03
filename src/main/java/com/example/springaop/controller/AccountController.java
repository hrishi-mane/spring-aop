package com.example.springaop.controller;

import com.example.springaop.service.AccountService;
import com.example.springaop.service.MembershipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AccountController {
    private final AccountService accountService;
    private final MembershipService membershipService;


    @Autowired
    public AccountController(AccountService accountService, MembershipService membershipService) {
        this.accountService = accountService;
        this.membershipService = membershipService;
    }

    @GetMapping("/test")
    public boolean getData() {
        try {
            accountService.addAccount();
            membershipService.addMember();
        } catch (Exception e) {
            log.error("Some error has occurred we will get back you you u some time");
            return false;
        }
        return true;
    }


}
