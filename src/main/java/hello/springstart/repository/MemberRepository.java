package hello.springstart.repository;

import hello.springstart.domain.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
