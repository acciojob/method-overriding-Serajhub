package com.driver;

public class Main {
    static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static class MethodOverridingExample {
        public static void main(String[] args) {
            A objA = new A();
            System.out.println(objA.meth()); // Task 3

            B objB = new B();
            System.out.println(objB.meth()); // Task 5
        }
    }
}
