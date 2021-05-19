package com.company;
import java.util.*;

public class LoginView extends View{
    @Override
    public void show() {
        Scanner input = new Scanner(System.in);
        super.show();
        System.out.println("ACCOUNT NUMBER: ");
        int cno = input.nextInt();
        System.out.println("PASSWORD: ");
        int pass = input.nextInt();

        Service service = Service.getInstance();
        service.checkLogin(cno, pass);

    }
}
