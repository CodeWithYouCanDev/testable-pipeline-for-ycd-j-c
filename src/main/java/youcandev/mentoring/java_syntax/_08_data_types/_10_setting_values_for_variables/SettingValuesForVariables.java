package youcandev.mentoring.java_syntax._08_data_types._10_setting_values_for_variables;

/*
Ustawianie wartości dla zmiennych
 */
public class SettingValuesForVariables {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value) {
        //napsiz tutaj swój kod
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
