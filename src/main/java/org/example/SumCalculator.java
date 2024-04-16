package org.example;

import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n){
        if (n <= 0){
            throw new IllegalArgumentException();
        }
        return IntStream.rangeClosed(0,n).sum();
    }
}
