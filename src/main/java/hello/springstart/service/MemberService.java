package hello.springstart.service;

import hello.springstart.domain.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
