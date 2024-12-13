package StringsPractice;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementsinaStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] arr = new String[n];
        System.out.println("Enter " + n + " Strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        findDuplicates(arr);

        sc.close(); 
    }
    public static void findDuplicates(String[] arr) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String element : arr) {
            if (!seen.add(element)) {
                duplicates.add(element);
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}