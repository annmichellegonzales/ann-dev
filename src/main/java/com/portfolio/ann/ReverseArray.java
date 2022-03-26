package com.portfolio.ann;

public class ReverseArray {

    // public static void main(String[] args) {
    //     int[] array = new int[]{1,2,3,4,5};
    //     System.out.println("The oringal array is: ");
    //     for(int i=0; i<array.length; i++){
    //         System.out.print(array[i] + " ");
    //     }
    //     System.out.println();
    //     System.out.println("The reversed array is: ");
    //     for(int i=array.length-1; i>=0; i--){
    //         System.out.print(array[i] + " ");
    //     }

    // }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        System.out.println("The original array: ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("The reversed array: ");
        for(int i=arr1.length-1; i>=0; i--){
            System.out.print(arr1[i] + " ");
        }

    }

    
}
