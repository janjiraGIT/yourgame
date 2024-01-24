package com.janjira.yourgame.controller;

import com.janjira.yourgame.entity.Member;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberController {

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        System.out.println("test");
        return Arrays.asList(new Member("001","Janjira Eriksson"));
    }

    @PostMapping
    public String addMember(@RequestBody Member member) {
        return "Create member";
    }

    @PutMapping
    public String updateMember(@RequestBody Member member) {
        return "Update member";
    }

}
