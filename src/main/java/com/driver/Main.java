package com.driver;

public class Main {
    public static class Product {
        // Task 3: Create a method to multiply two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method to multiply three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method to multiply two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        // Task 3: Call method to multiply two integers
        int result1 = p.product(2, 3);

        // Task 4: Call method to multiply three integers
        int result2 = p.product(2, 3, 4);

        // Task 5: Call method to multiply two doubles
        double result3 = p.product(2.5, 3.5);

        System.out.println(result1 + " " + result2 + " " + result3);
    }
}
