package com.metlife.team09.domain.member.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(final String username);
    List<Member> findAllByAddress_DongAndIsAdminTrue(final String dong);
}
