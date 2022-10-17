package hello.springstart.policy;

import hello.springstart.domain.Grade;
import hello.springstart.domain.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private static final int DISCOUNT_FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return DISCOUNT_FIX_AMOUNT;
        }
        return 0;
    }
}
