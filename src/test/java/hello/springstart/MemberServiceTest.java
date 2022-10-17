package hello.springstart;

import hello.springstart.domain.Grade;
import hello.springstart.domain.Member;
import hello.springstart.service.MemberService;
import hello.springstart.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //tehn
        assertThat(member).isEqualTo(findMember);
    }


}