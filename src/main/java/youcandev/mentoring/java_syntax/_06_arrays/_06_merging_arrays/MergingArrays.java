package youcandev.mentoring.java_syntax._06_arrays._06_merging_arrays;

/*
Lączenie tablic
 */
public class MergingArrays {
    public static int[] firstArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] secondArray = new int[]{40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
    public static int[] resultArray;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        resultArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length + 0, secondArray.length);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
