package com.metlife.team09.global.security;


import com.metlife.team09.domain.member.persistence.Member;
import com.metlife.team09.domain.member.persistence.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findById(Long.parseLong(username)).orElseThrow(()->new UsernameNotFoundException("사용자를 찾을 수 없습니다."));
        return User.builder().username(String.valueOf(member.getId()))
            .password("")
            .roles("USER")
            .build();
    }
}
