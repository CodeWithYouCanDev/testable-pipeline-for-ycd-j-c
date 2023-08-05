package youcandev.mentoring.java_syntax._07_functions._08_universal_method;

public class UniversalMethod {

    public static void main(String[] args) {
        // Test calls to the methods
        myUniversalMethod(5); // int
        myUniversalMethod(5.5); // double
        myUniversalMethod(5L); // long
        myUniversalMethod(5.5f); // float
        myUniversalMethod(true); // boolean
        myUniversalMethod((byte) 5); // byte
        myUniversalMethod('c'); // char
        myUniversalMethod("string"); // String
        myUniversalMethod(new int[]{1, 2, 3}); // int array
        myUniversalMethod(new Object()); // Object
        myUniversalMethod((short) 5); // short
    }

    public static void myUniversalMethod(int a) {
        System.out.println("int: " + a);
    }

    public static void myUniversalMethod(double b) {
        System.out.println("double: " + b);
    }

    public static void myUniversalMethod(long c) {
        System.out.println("long: " + c);
    }

    public static void myUniversalMethod(float d) {
        System.out.println("float: " + d);
    }

    public static void myUniversalMethod(boolean e) {
        System.out.println("boolean: " + e);
    }

    public static void myUniversalMethod(byte w) {
        System.out.println("byte: " + w);
    }

    // Additional methods:
    public static void myUniversalMethod(char f) {
        System.out.println("char: " + f);
    }

    public static void myUniversalMethod(String g) {
        System.out.println("String: " + g);
    }

    public static void myUniversalMethod(int[] h) {
        System.out.println("int array: " + java.util.Arrays.toString(h));
    }

    public static void myUniversalMethod(Object i) {
        System.out.println("Object: " + i);
    }

    public static void myUniversalMethod(short j) {
        System.out.println("short: " + j);
    }
}
