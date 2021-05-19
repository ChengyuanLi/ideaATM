package com.company;

public class Store {
    private Store() {}
    private static Store s = new Store();
    public static Store getInstance(){
        return s;
    }

    private ArrayBox box = new ArrayBox();
    {
        Card c1 = new Card(1001, 123, "lcy", 100000, 0, 0);
        Card c2 = new Card(1002, 123, "mtf", 200000, 0, 0);
        Card c3 = new Card(1003, 123, "ycl", 300000, 1, 3);
        Card c4 = new Card(1004, 123, "cly", 400000, 2, 0);

        box.add(c1);
        box.add(c2);
        box.add(c3);
        box.add(c4);
    }

    public Card findCardByCno(int cardNum) {
        for (int i = 0; i < box.size(); i++) {
            Card c = (Card) box.get(i);
            if (c.getCno() == cardNum) {
                return c;
            }
        }
        return null;
    }
}
