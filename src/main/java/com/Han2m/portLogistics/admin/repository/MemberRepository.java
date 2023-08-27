package com.Han2m.portLogistics.admin.repository;

import com.Han2m.portLogistics.admin.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberId(String username);
    boolean existsByMemberId(String memberId);

}
