package com.alina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    final int N = 20;
        Integer[] arr1 = new Integer[N];
        Random rand = new Random();
        for(int i = 0; i < N; i++){
            arr1[i] = rand.nextInt(20);
        }
        ArrayList<Integer> manyEntries = new ArrayList<>();
        ArrayList<Integer> oneEntry = new ArrayList<>();
        int counter = 1;
        Arrays.sort(arr1);
        Integer[] arr = new Integer[N+1];
        for(int i = 0;i<N;i++){
            arr[i] = arr1[i];
        }
        arr[N] = null;
        for (int item:arr1) {
            System.out.println(item);
        }

        Integer tmp = arr[0];
        for(int i = 1; i<N+1;i++){
            if(arr[i] == tmp){
                counter++;
            } else{
                if(counter == 1){
                    oneEntry.add(arr[i-1]);
                } else if(counter >1){
                    manyEntries.add(arr[i-1]);
                }
                counter = 1;
            }
            tmp = arr[i];
        }

        for (int t:manyEntries) {
            System.out.println("Many:"+t);
        }
        for (int t:oneEntry) {
            System.out.println("One:"+t);
        }

    }
}
