package youcandev.mentoring.java_syntax._08_data_types._04_minimal_values;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class MinimalValuesTest {

    @Test
    void testByteVariable() throws NoSuchFieldException, IllegalAccessException {
        Field field = MinimalValues.class.getDeclaredField("a");
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertEquals(Byte.MIN_VALUE, field.getByte(null));
    }

    @Test
    void testShortVariable() throws NoSuchFieldException, IllegalAccessException {
        Field field = MinimalValues.class.getDeclaredField("b");
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertEquals(Short.MIN_VALUE, field.getShort(null));
    }

    @Test
    void testIntVariable() throws NoSuchFieldException, IllegalAccessException {
        Field field = MinimalValues.class.getDeclaredField("c");
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertEquals(Integer.MIN_VALUE, field.getInt(null));
    }

    @Test
    void testLongVariable() throws NoSuchFieldException, IllegalAccessException {
        Field field = MinimalValues.class.getDeclaredField("d");
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertEquals(Long.MIN_VALUE, field.getLong(null));
    }

    @Test
    void testNoMethodsDeclared() {
        Method[] methods = MinimalValues.class.getDeclaredMethods();
        if(methods.length > 1 || (methods.length == 1 && !methods[0].getName().equals("main"))) {
            fail("There should be only the main method in the class.");
        }
    }
}
