package com.company;

public class Service {
    private Service() {}
    private static Service s;
    public static Service getInstance() {
        if (s == null) {
            s = new Service();
        } return s;
    }

    public void checkLogin(int cno, int pass) {
        // find cno - pass relationship
        Store s = Store.getInstance();
        Card c = s.findCardByCno(cno);
        if (c == null) {
            return;
        }

        switch (c.getFlag()) {
            case 1:
                // locked
                ;return;
            case 2:
                // forzen
                ;return;
            case 3:
                // lost
                ;return;
        }
        if (c.getPass() == pass) {
            //main view
            Browser b = Browser.getInstance();
            View mainView = new MainView();
            b.showView(mainView);
            return;
        }
        c.count++;
        if (c.count == 3) {
            // frozen
            return;
        }
        // show password wrong
        Browser b = Browser.getInstance();
        View wrongPassView = new WrongPassView();
        b.showView(wrongPassView);
    }
}


