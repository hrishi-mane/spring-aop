package com.example.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MembershipService {

    private static final String ADD_MEMBER = "addMember()";

    public void addMember() {
        log.info(ADD_MEMBER + " Method executed successfully");
    }

}
