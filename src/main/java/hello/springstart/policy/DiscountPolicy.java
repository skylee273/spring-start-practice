package hello.springstart.policy;

import hello.springstart.domain.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
