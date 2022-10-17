package hello.springstart;

import hello.springstart.domain.Grade;
import hello.springstart.domain.Member;
import hello.springstart.domain.Order;
import hello.springstart.service.MemberService;
import hello.springstart.service.MemberServiceImpl;
import hello.springstart.service.OrderService;
import hello.springstart.service.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        long memberId = 1L;

        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
