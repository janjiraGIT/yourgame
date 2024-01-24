package com.janjira.yourgame.controller;

import com.janjira.yourgame.entity.Member;
import com.janjira.yourgame.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class MemberController {
    @Autowired
    MemberRepo memberRepo;
    @PostMapping("api/members")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        return new ResponseEntity<>(memberRepo.save(member), HttpStatus.CREATED);
    }
}
