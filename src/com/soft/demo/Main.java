package com.soft.demo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	int b = 10;
	Scanner s1 = new Scanner(System.in);
	a = s1.nextInt();
	if (b > a) {
        int c = (int)(Math.random()*(b-a)+1)+a;
        System.out.print(c);
    }else{
	    System.out.print("Первое число больше второго");
    }
    }
}
