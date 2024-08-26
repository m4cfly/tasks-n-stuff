package main.utils;

import java.util.Scanner;

public class Input {
    public int scan (int scanner){
        Scanner s = new Scanner(System.in);
        s.nextLine();
        return s.nextInt();
    }
}
