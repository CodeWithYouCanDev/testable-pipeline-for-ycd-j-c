package youcandev.mentoring.java_syntax._08_data_types._10_setting_values_for_variables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettingValuesForVariablesTest {

    @Test
    public void testSetValues() {
        long inputValue = 100L;

        // Call the method
        SettingValuesForVariables.setValues(inputValue);

        // Verify that each variable has the expected value
        assertEquals((byte) inputValue, SettingValuesForVariables.a, "Variable a has incorrect value");
        assertEquals((short) inputValue, SettingValuesForVariables.b, "Variable b has incorrect value");
        assertEquals((int) inputValue, SettingValuesForVariables.c, "Variable c has incorrect value");
        assertEquals(inputValue, SettingValuesForVariables.d, "Variable d has incorrect value");
    }
}
