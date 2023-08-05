package youcandev.mentoring.java_syntax._08_data_types._01_displaying_character_array;


/*
Wyświetlanie tablicy znaków
 */
public class DisplayingCharacterArray {

    public static char[] chars = {118, 101, 68, 110, 97, 67, 117, 111, 89};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}

