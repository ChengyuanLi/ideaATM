package com.company;

import java.util.Scanner;

public class WrongPassView extends View{
    @Override
    public void show() {
        Scanner input = new Scanner(System.in);
        super.show();
        System.out.println("---------------------------------");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!INVALID PASSWORD!!!!!!!!!");
        System.out.println("!!!!!PRESS ANY KEY TO GO BACK!!!!");
        input.next();
        Browser b = Browser.getInstance();
        View view = new LoginView();
        b.showView(view);
    }
}
