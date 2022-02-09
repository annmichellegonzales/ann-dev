import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // first, i would define the total number of integers in the array
        double totalInt = arr.size();
        // next, set each variable to zero
        double negInt = 0, posInt = 0, zeroInt = 0;
        // create a new array list that uses doubles
        List<Double> ratioList = new ArrayList<Double>();
        // loop through the array to find the integers that meet the conditional statement. the conditional would add one to the designated variable created earlier on.
        for (double i : arr) {
            if (i < 0) {
                negInt++;
            } else if (i > 0) {
                posInt++;
            } else if (i == 0) {
                zeroInt++;
            }
        }

        // define the ratios of negative integers, positive, and zero. add to ratioList accordingly, and sout to six decimal places.
        double negativeRatio = negInt / totalInt;
        double positiveRatio = posInt / totalInt;
        double zeroRatio = zeroInt / totalInt;

        ratioList.add(positiveRatio);
        ratioList.add(negativeRatio);
        ratioList.add(zeroRatio);
        // loop and sout.
        for (double r : ratioList) {
            System.out.printf("%.6f \n", r);
        }
    }

    public static void miniMaxSum(List<Integer> arr) {
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
