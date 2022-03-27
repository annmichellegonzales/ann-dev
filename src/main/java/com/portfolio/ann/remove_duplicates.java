package com.portfolio.ann;

import java.util.HashMap;

public class remove_duplicates {

// This function uses the parameters for array a and int n
// Instantiates a new HashMap to store unique elements
// uses for loop to iterate over the integers
// conditional to check if element is in HashMap

    // static void removeDups(int[] a, int n){
        
    //     HashMap<Integer, Boolean> mp = new HashMap<>();

    //     for(int i=0; i<n; i++){
    //         if (mp.get(a[i]) == null){
    //             System.out.println(a[i] + " ");
    //             mp.put(a[i], true);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int [] arr = {1,1,2,2,2};
    //     int n = arr.length;
    //     removeDups(arr, n);
    // }


    static void removeDups(int[] arr){

        HashMap<Integer, Boolean> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(mp.get(arr[i]) == null){
                System.out.println(arr[i] + " ");
                mp.put(arr[i], true);
            }
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5};
        removeDups(arr);
        
    }

}
