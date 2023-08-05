package youcandev.mentoring.java_syntax._08_data_types._02_primitive_types_java;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class PrimitiveTypesJavaTest {

    @Test
    void testAllPrimitiveTypesAreDeclared() {
        Field[] fields = PrimitiveTypesJava.class.getDeclaredFields();

        boolean hasByte = false;
        boolean hasShort = false;
        boolean hasInt = false;
        boolean hasLong = false;
        boolean hasFloat = false;
        boolean hasDouble = false;
        boolean hasBoolean = false;
        boolean hasChar = false;

        for (Field field : fields) {
            switch (field.getType().getName()) {
                case "byte" -> hasByte = true;
                case "short" -> hasShort = true;
                case "int" -> hasInt = true;
                case "long" -> hasLong = true;
                case "float" -> hasFloat = true;
                case "double" -> hasDouble = true;
                case "boolean" -> hasBoolean = true;
                case "char" -> hasChar = true;
            }
        }

        assertTrue(hasByte, "byte type is not declared.");
        assertTrue(hasShort, "short type is not declared.");
        assertTrue(hasInt, "int type is not declared.");
        assertTrue(hasLong, "long type is not declared.");
        assertTrue(hasFloat, "float type is not declared.");
        assertTrue(hasDouble, "double type is not declared.");
        assertTrue(hasBoolean, "boolean type is not declared.");
        assertTrue(hasChar, "char type is not declared.");
    }
}
