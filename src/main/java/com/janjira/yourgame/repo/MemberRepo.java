package com.janjira.yourgame.repo;

import com.janjira.yourgame.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Long> {
}
