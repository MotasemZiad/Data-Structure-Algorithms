package com.ds;

import java.util.*;

public class SimpleArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(getFactorial(in.nextInt()));

        // You can uncomment each of the following block of codes if you want to try any algorithm related to Arrays.
        

        // **************************************************
        /*
        int numbers[] = new int[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        } */

        // LinearSearch O(n) Time consuming
        /*
        int tries = 0;
        System.out.println("Enter the number you want to search for: ");
        int n = in.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            tries++;
            if(numbers[i]== n){
                System.out.println("The number "+n+" is found at "+tries+" tries");
                break;
            }

        } */

        // BinarySearch
        /*
        int tries = 0;
        int low = 0, high = numbers.length - 1, mid = 0;
        boolean isFound = false;
        System.out.println("Enter the number you want to search for: ");
        int n = in.nextInt();
        while (!isFound) {
            if (low > high) {
                System.out.println("Number is not found");
                break;
            }
            mid = low + ((high - low) / 2);
            tries++;
            if (numbers[mid] == n) {
                System.out.println("The number " + n + " is found at " + tries + " tries");
                break;
            }
            if (numbers[mid] < n) {
                low = mid + 1;
            }
            if (numbers[mid] > n) {
                high = mid - 1;
            }
        } */

        // InterpolationSearch
        /*


        int tries = 0;
        int low = 0, high = numbers.length - 1, mid = 0;
        boolean isFound = false;
        System.out.println("Enter the number you want to search for: ");
        int n = in.nextInt();
        while (!isFound) {
            if (low > high) {
                System.out.println("Number is not found");
                break;
            }
            mid = low + ((high - low)/(numbers[high]-numbers[low]))*(n-numbers[low]);
            tries++;
            if (numbers[mid] == n) {
                System.out.println("The number " + n + " is found at " + tries + " tries");
                break;
            }
            if (numbers[mid] < n) {
                low = mid + 1;
            }
            if (numbers[mid] > n) {
                high = mid - 1;
            }
        } */

        // **************************************************

       /*
        Stack<String> s = new Stack<String>();
        System.out.println("\tThe items here:");
        s.push("Ahmed");
        s.push("Mohammed");
        s.push("Mahmoud");
        s.push("Sameer");
        s.push("Fathy");
        s.push("Hassan");
        s.push("Fawzy");
        System.out.println("Before");
        System.out.println("size: "+s.size());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println("After");
        System.out.println("size: "+s.size());
        System.out.println(s.empty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println("After");
        System.out.println("size: "+s.size()); */


        // **************************************************
        /*
        LinkedList li = new LinkedList(new Node<Integer>(12, null));
        li.add(new Node<Integer>(13, null));
        li.add(new Node<Integer>(16, null));
        li.add(new Node<Integer>(56, null));
        li.add(new Node<Integer>(98, null));
        li.display();
        li.delete();
        System.out.println("After delete");
        li.display(); */


        // **************************************************
        /*
        // One Dimension Array
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 12;
        numbers[2] = 23;
        numbers[3] = 8;
        numbers[4] = 11;
        System.out.println("\tSimple Array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }

        Employee emp[] = new Employee[3];
        emp[0] = new Employee(1, "Motasem Ziad", "IT", 25000);
        emp[1] = new Employee(2, "Ahmed Ali", "Engineering", 30000);
        emp[2] = new Employee(3, "Khaled Adel", "Medical", 50000);
        System.out.println("\n\n\tObject Array");
        for (Employee e : emp) {
            System.out.println(e.toString());
        }
        // Two Dimension Array
        int data[][] = new int[3][4];
        data[0][0] = 11;
        data[0][1] = 14;
        data[0][2] = 17;
        data[0][3] = 23;
        data[1][0] = 13;
        data[1][1] = 15;
        data[1][2] = 78;
        data[1][3] = 5;
        data[2][0] = 31;
        data[2][1] = 46;
        data[2][2] = 93;
        data[2][3] = 2;
        System.out.println("\n\tTwo Dimension Array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + data[i][j] + "\t");
            }
            System.out.println("\n");
        } */

        // **************************************************

            /*
            ArrayList<Employee> item  = new ArrayList<Employee>();
            System.out.println(item.size());
            */
        // **************************************************
            /*
            DynamicArray<Integer> da = new DynamicArray<Integer>();
            DynamicArray<Employee> da1 = new DynamicArray<Employee>();
            da.put(1);
            System.out.println(da.getSize());
            da.put(1);
            System.out.println(da.getSize());
            da.put(1);
            System.out.println(da.getSize());
            da.put(1);
            System.out.println(da.getSize());
            da.put(1);
            System.out.println(da.getSize());
            da.put(1);
            System.out.println(da.getSize());
            */

    }

    public static int getFactorial(int n){
        if(n==0) return 1;
        try {
            if (n < 0) return -1;
        }catch (Exception e){
            System.out.println("Error");
        }
        if (n==1){
            return 1;
        }else{
            return n * getFactorial(n-1);
        }

    }
}
