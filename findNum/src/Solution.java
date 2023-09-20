import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Enter you input below:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
        for (int i = 0; i < n; i++) {
            int limit = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < limit; j++) {
                list.add(sc.nextInt());
            }
            arr.add(list);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(arr.get(x-1).get(y-1));
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("ERROR!");
            }
        }
    }
}