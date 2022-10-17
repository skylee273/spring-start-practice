package hello.springstart;

import hello.springstart.domain.Grade;
import hello.springstart.domain.Member;
import hello.springstart.domain.Order;
import hello.springstart.service.MemberService;
import hello.springstart.service.MemberServiceImpl;
import hello.springstart.service.OrderService;
import hello.springstart.service.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}