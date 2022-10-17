package hello.springstart.service;

import hello.springstart.domain.Member;
import hello.springstart.domain.Order;
import hello.springstart.policy.DiscountPolicy;
import hello.springstart.policy.FixDiscountPolicy;
import hello.springstart.repository.MemberRepository;
import hello.springstart.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}
