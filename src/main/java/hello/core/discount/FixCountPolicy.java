package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixCountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int prince) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else{
            return 0;
        }
    }
}
