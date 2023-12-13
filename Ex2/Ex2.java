import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;

    public static void show(List<Integer> list) {
        for(int num : list)
            System.out.print(num+" ");
    }

    public static void sort(List<Integer> list) {
        Collections.sort(list);
    }

    public static void add(List<Integer> list, int num){
        list.add(num);
    }

    public static boolean isValid(int num) {
        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static int parseInt(String s) {
        int n = -1;
        try {
            n = Integer.parseInt(s);
            // System.out.println("Parse int success");
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
        }
        // System.out.println("n is: " + n);
        return n;
    }

    public static String getInput(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    public static void main(String[] args) {
            System.out.println("Welcome to the Application!");
            System.out.println("Enter 5 valid integers in the range [0, 10]");
            List<Integer> nums = new ArrayList<>();   
            while(nums.size() < MAX) {
                String s = getInput(); 
                // System.out.println("Input: " + s);
                int n = parseInt(s);
                if(isValid(n))
                    add(nums, n);
            }
            sort(nums);
            show(nums);
        }
}