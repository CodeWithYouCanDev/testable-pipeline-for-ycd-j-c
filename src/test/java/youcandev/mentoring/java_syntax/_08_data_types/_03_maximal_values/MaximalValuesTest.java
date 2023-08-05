package youcandev.mentoring.java_syntax._08_data_types._03_maximal_values;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class MaximalValuesTest {

    @Test
    void testByteVariable() throws NoSuchFieldException, IllegalAccessException {
        Field byteField = MaximalValues.class.getDeclaredField("a");
        byteField.setAccessible(true);
        byte value = byteField.getByte(null);  // null because it's a static field
        assertEquals(Byte.MAX_VALUE, value, "byte variable does not have the maximum value.");
    }

    @Test
    void testShortVariable() throws NoSuchFieldException, IllegalAccessException {
        Field shortField = MaximalValues.class.getDeclaredField("b");
        shortField.setAccessible(true);
        short value = shortField.getShort(null);  // null because it's a static field
        assertEquals(Short.MAX_VALUE, value, "short variable does not have the maximum value.");
    }

    @Test
    void testIntVariable() throws NoSuchFieldException, IllegalAccessException {
        Field intField = MaximalValues.class.getDeclaredField("c");
        intField.setAccessible(true);
        int value = intField.getInt(null);  // null because it's a static field
        assertEquals(Integer.MAX_VALUE, value, "int variable does not have the maximum value.");
    }

    @Test
    void testLongVariable() throws NoSuchFieldException, IllegalAccessException {
        Field longField = MaximalValues.class.getDeclaredField("d");
        longField.setAccessible(true);
        long value = longField.getLong(null);  // null because it's a static field
        assertEquals(Long.MAX_VALUE, value, "long variable does not have the maximum value.");
    }

    @Test
    void testNoMethodsDeclared() {
        Method[] methods = MaximalValues.class.getDeclaredMethods();
        if(methods.length > 1 || (methods.length == 1 && !methods[0].getName().equals("main"))) {
            fail("There should be only the main method in the class.");
        }
    }
}
