package com.portfolio.ann;

public class BeerSong {
//    psvm
    public static void main(String[] args) {
        int beerNum = 99; //declares int
        String word = "bottles"; //declares string

        while (beerNum > 0) { //while this number is less than 0, do this:

            if (beerNum == 1) { //if that number is 1, change the word to singular
                word = "bottle";
            }
//            sout
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println((beerNum + " " + word + " of beer."));
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1; //takes away that one beer

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall" + "\n"); //\n newline character
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
