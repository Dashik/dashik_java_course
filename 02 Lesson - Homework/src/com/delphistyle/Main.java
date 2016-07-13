package com.delphistyle;

public class Main {

public static void main(String[] args) {

    divToY2 (15,4);
    myMod (17,4);

}



public static int divToY2 (int x, int y) {

    if (y==0)
        return -1; // we cannot return error string, so it's better to return irrational number and take it from there

    int total = 0;
    int res = 0;

    while (total <= x) {

        total += y;
        res++;

    }

    System.out.println (res);
    return res;

}


public static int myMod (int x, int y) {


    int total = 0;
    int res = 0;
    int countMod = 0;


    if ( y > x ){

        return res;

    }

    if ( y == x){

        return res;
    }

    int temp = 0;

    while (temp < x) {

        temp = total+y+y;
        total +=y;

    }

    while (total < x){

        total++;
        countMod++;

    }

    res = countMod;

    System.out.println (res);
    return res;

}

}



