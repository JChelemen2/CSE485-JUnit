package net.cse485;

public class Main {
    public static void main(String[] args) {

        Calculator test1 = new Calculator(0, 0);
        System.out.println("add: " + test1.add());
        System.out.println("sub: " + test1.sub());
        System.out.println("mul: " + test1.mul());
        System.out.println("div: " + test1.div());
        System.out.println("pow: " + test1.pow());

    }
}