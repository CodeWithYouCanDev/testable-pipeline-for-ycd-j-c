package youcandev.mentoring.java_syntax._03_conditional_operator._18_comparison_by_reference;

/*
Porównywanie poprzez referencje
 */
public class ComparisonByReference {
    public static String string1 = "Java";
    public static String string2 = string1;
    public static String string3 = string1;

    public static void main(String[] args) {
        String same = "referencje są takie same";
        String different = "referencje są rózne";
        //napisz tutaj swój kod
        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}
