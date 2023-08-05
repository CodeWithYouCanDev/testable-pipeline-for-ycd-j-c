package youcandev.mentoring.java_syntax._06_arrays._02_array_initialization_v2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayInitializationV2Test {

    @Test
    void testArrayInitializations() throws NoSuchMethodException {
        // Call the main method
        ArrayInitializationV2.main(new String[]{});

        // Try to access the main method
        Method mainMethod = ArrayInitializationV2.class.getDeclaredMethod("main", String[].class);
        mainMethod.setAccessible(true);

        // Here's the problem - We can't directly get local variables from a method using reflection
        // The Java Reflection API doesn't support this (for good reasons).
        // So we can't actually verify the arrays' sizes or types directly

        // All we can do is ensure that the main method doesn't throw any exceptions (indicating that the arrays were likely initialized correctly)
        assertDoesNotThrow(() -> mainMethod.invoke(null, (Object) new String[]{}));
    }
    @Test
    void testArrayInitializationsWithRegexp() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax/_06_arrays/_02_array_initialization_v2/ArrayInitializationV2.java")));

        // Check for declaration and initialization of int array
        Pattern intArrayPattern = Pattern.compile("int\\[\\]\\s+firstIntArray\\s*=\\s*new\\s+int\\[10\\]\\s*;");
        assertTrue(intArrayPattern.matcher(content).find());

        // Check for declaration and initialization of double array
        Pattern doubleArrayPattern = Pattern.compile("double\\[\\]\\s+firstDoubleArray\\s*=\\s*new\\s+double\\[10\\]\\s*;");
        assertTrue(doubleArrayPattern.matcher(content).find());
    }
}
