package com.kea;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int random_integer = new Dice().Random(7,1);
        System.out.println("Tilfældigt tal: "+random_integer);

    }
}
