package com.kea;
import java.util.Random;

public class Dice {
    public int Random(int high, int low){
        Random rand = new Random();
        return rand.nextInt(high-low) + low;

    }
}
