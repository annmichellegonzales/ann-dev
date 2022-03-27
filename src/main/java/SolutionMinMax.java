import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

class ResultMinMax {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // use Collections framework to incorporate sort. create variables min, max
        Collections.sort(arr);long max=0;long min=0;
        //loop through array starting at 0
        for(int i=0;i<arr.size()-1;i++){
            min+=arr.get(i);
        }
        //loop through array starting at 1
        for(int i=1;i<arr.size();i++){
            max+=arr.get(i);
        }
        //sout min and max with space in between
        System.out.println(min + " " +max);

    }

}

public class SolutionMinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}