package youcandev.mentoring.java_syntax._08_data_types._11_type_casting_operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TypeCastingOperatorsTest {

    @Test
    void testTypeCastingOperators() {
        TypeCastingOperators obj = new TypeCastingOperators();

        // Validate values based on the operations and type casting provided in the class
        assertEquals(124L, obj.a, "Variable a has incorrect value");
        assertEquals(248, obj.b, "Variable b has incorrect value");
        assertEquals(0, obj.c, "Variable c has incorrect value");
        assertEquals(116, obj.d, "Variable d has incorrect value");
    }
}
