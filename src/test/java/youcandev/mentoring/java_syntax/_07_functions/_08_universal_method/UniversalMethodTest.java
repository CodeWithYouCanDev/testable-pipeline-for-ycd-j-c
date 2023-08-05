package youcandev.mentoring.java_syntax._07_functions._08_universal_method;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniversalMethodTest {

    @Test
    void testMyUniversalMethod() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        UniversalMethod.myUniversalMethod(5);
        assertTrue(outContent.toString().contains("int: 5"));

        outContent.reset();
        UniversalMethod.myUniversalMethod(5.5);
        assertTrue(outContent.toString().contains("double: 5.5"));

        outContent.reset();
        UniversalMethod.myUniversalMethod(5L);
        assertTrue(outContent.toString().contains("long: 5"));

        outContent.reset();
        UniversalMethod.myUniversalMethod(5.5f);
        assertTrue(outContent.toString().contains("float: 5.5"));

        outContent.reset();
        UniversalMethod.myUniversalMethod(true);
        assertTrue(outContent.toString().contains("boolean: true"));

        outContent.reset();
        UniversalMethod.myUniversalMethod((byte)5);
        assertTrue(outContent.toString().contains("byte: 5"));

        outContent.reset();
        UniversalMethod.myUniversalMethod('c');
        assertTrue(outContent.toString().contains("char: c"));

        outContent.reset();
        UniversalMethod.myUniversalMethod("string");
        assertTrue(outContent.toString().contains("String: string"));

        outContent.reset();
        UniversalMethod.myUniversalMethod(new int[]{1, 2, 3});
        assertTrue(outContent.toString().contains("int array: [1, 2, 3]"));

        outContent.reset();
        UniversalMethod.myUniversalMethod(new Object());
        assertTrue(outContent.toString().contains("Object: "));

        outContent.reset();
        UniversalMethod.myUniversalMethod((short)5);
        assertTrue(outContent.toString().contains("short: 5"));
    }
}
