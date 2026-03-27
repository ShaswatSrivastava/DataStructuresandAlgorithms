package com.Shaswat;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Shaswat Srivastava");
            case 2 -> System.out.println("Phil Salt");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Manage Department");
                    default -> System.out.println("No Department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
