package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Browser b = Browser.getInstance();
        View view = new LoginView();
        b.showView(view);
    }
}
