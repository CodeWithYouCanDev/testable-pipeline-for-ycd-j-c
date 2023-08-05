package youcandev.mentoring.java_syntax._06_arrays._04_sign_change_for_even;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SignChangeForEvenTest {

    @Test
    void testSignChangeForEvenNumbers() {
        // Act
        SignChangeForEven.main(new String[]{});

        // Assert
        assertEquals(-3, SignChangeForEven.array[0]);  // Odd number, remains unchanged
        assertEquals(5, SignChangeForEven.array[1]);   // Odd number, remains unchanged
        assertEquals(-6, SignChangeForEven.array[2]);  // Even number, sign should be changed
        assertEquals(4, SignChangeForEven.array[3]);   // Even number, sign should be changed
        assertEquals(-2, SignChangeForEven.array[4]);  // Even number, sign should be changed
        assertEquals(-100, SignChangeForEven.array[5]); // Even number, sign should be changed
    }
}
