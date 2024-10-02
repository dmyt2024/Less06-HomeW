package app;

public class Solution {
    public static void main(String[]args) {

        int sumIs = 0;
        int num = 0;
        while (num < 6) {
            num++;
            sumIs = sumIs + num;

            System.out.println(num + ") Num is " + num + ", sum is " + sumIs);
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sumIs);

    }}