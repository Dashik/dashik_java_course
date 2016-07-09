package com.delphistyle;

public class Main {

    public static void main(String[] args) {
    /*
	int x = 8;


    System.out.println("start");
    if (x < 5) {
        System.out.println ("x is less thatn five");
    } else if (x < 10){
        System.out.println("x is between five and nine (not including 10)");
    }
    } else if (x < 20){
        System.out.println("x is between ten and twenty (not including 20)");
    }


    while (x < 20) {

        System.out.println ("x is less than 20");
        x++;

    }
    System.out.println (x);


    int i = 0;
    while (i < 10) {
        System.out.println("i is " + i);
        i++;
    }

        for (int j = 0; j < ; j++) {
            
        }

        int a = x;
        int b = y;
        if(x > y){
            a = y;
            b = x;
        }
        myFunc(y);

    }

public static void myFunc(int x){
    System.out.println("in myFunc " + x);
}

System.out.println ("end");
*/



}

public static int product(int x, int y){
    int x;
    int y;
    int result;


    for (z = x; z >= y; z++){
        result += y ;
    }

    System.out.println (result);
}

public static int productElad (int x, int y){
    int result = 0;
    for (int i = 0; i < x; i ++){
        result +=y;
    }
}


public static int productElad2 (int x, int y){
    int small = x;
    int large = y;
    if (x > y){
        small = y;
        large = x;
    }
    int result = 0;
    for (int i = 0; i < small; i++){
        result += large;
    }
    return result;

}


public static int distance(int a, int b){
    int a;
    int b;
    int counter = 0;

    if (a == b){
        System.out.println ("distance is 0");
    //}else for (int c = 0; c < b; c++) && for (int c = 0; c < b; c++){
    }else if (a > b){
        for (int d = b; d < a; d++);
        counter ++;
        //return d;
    }else /*if (a < b) */{
        //for (d = 0; d != a &&  d!= b; d++);
        for (int d = a; d < b; d++);
        counter ++;
        //return d;
    }

    return d;
    System.out.println ("distance is " + d);

    }

}


    public static int distanceElad (int x, int y){
        int small = x;
        int large = y;

        if (x > y) {
            small = y;
            large = x;
        }
        int result = 0;
        while(small + result < large)
            result++;
        return result;
    }

}
