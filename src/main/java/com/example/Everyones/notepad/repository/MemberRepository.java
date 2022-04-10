package com.example.Everyones.notepad.repository;


import com.example.Everyones.notepad.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);

}
