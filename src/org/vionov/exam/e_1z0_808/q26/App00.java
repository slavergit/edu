package org.vionov.exam.e_1z0_808.q26;

public class App00 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work done");
            break;
        }
    }
}
