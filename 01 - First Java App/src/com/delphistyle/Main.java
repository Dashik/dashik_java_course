package com.delphistyle;

public class Main {

    public static void main(String[] args) {
        System.out.println("go to a 15 minutes break");
        System.out.print("hello");
        System.out.print(" ");
        System.out.print("world");

        int x = 8; //4 bytes
        byte b = 100; //1 byte -128 to 127
        short s = 15; //2 bytes 65,536
        long l = 148L; //pay attention to insert L / l, 8 bytes

        float fl = 234.23f; //десятичная дробь, нестандартные числа - либо очень большие, либо очень маленькие, вопрос необходимой шкалы 4 bytes
        double d = 234234.5; //8 bytes

        char c = 'h'; //1 byte
        boolean f = true; //8 booleans in a single byte - true or false, flag

        String myString = "hello"; //non primitive S and not s

        x = 5 / 2; //result is 2, not because the x in int, but because the 5 and 2 are ints
        x = 5 + 2 + 2;

        //f = 5 < 8;
        //System.out.println();
        //System.out.println(f);

        //f = 5 <= 8; // f = x < 9;
        //f = x != 9;
        f = x !=2 && 5 < 12;
        System.out.println(f);



    }
}
