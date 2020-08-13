package ch12;

class Card{
    enum Kind { CLOVER, HEART, DIAMOND, SPADE }
    enum Value { TWO, THREE, FOUR }

    //final Kind kind;
    //final Value value;
}

public class EnumEx1 {
    public static void main(String[] args) {
        System.out.println(Card.Kind.CLOVER);
        System.out.println(Card.Value.TWO);
       
    }
}
