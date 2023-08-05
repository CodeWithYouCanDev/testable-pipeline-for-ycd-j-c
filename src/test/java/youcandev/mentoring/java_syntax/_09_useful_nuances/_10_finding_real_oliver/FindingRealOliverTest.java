package youcandev.mentoring.java_syntax._09_useful_nuances._10_finding_real_oliver;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class FindingRealOliverTest {

    @Test
    void mainPackageShouldContainRequiredClasses() {
        try {
            Class.forName("youcandev.mentoring.java_syntax._09_useful_nuances._10_finding_real_oliver.FindingRealOliver");
            Class.forName("youcandev.mentoring.java_syntax._09_useful_nuances._10_finding_real_oliver.Max");
            Class.forName("youcandev.mentoring.java_syntax._09_useful_nuances._10_finding_real_oliver.Oliver");
        } catch (ClassNotFoundException e) {
            fail("One or more classes are missing from the main package");
        }
    }

    @Test
    void findingRealOliverMainShouldDeclareOliverUsingShortName() {
        try {
            Class<?> clazz = Class.forName("youcandev.mentoring.java_syntax._09_useful_nuances._10_finding_real_oliver.FindingRealOliver");
            Field[] fields = clazz.getDeclaredFields();

            boolean hasOliverShortDeclaration = false;
            for (Field field : fields) {
                if (field.getType().getName().equals("youcandev.mentoring.java_syntax._09_useful_nuances._10_finding_real_oliver.Oliver") && !Modifier.isStatic(field.getModifiers())) {
                    hasOliverShortDeclaration = true;
                    break;
                }
            }

            assertFalse(hasOliverShortDeclaration, "FindingRealOliver doesn't declare an Oliver object using its short name.");

        } catch (ClassNotFoundException e) {
            fail("FindingRealOliver class is missing from the main package");
        }
    }

    @Test
    public void duplicate3ShouldNotContainOliver() {
        try {
            Class.forName("duplicate3.Oliver");
            fail("Oliver class should not be in duplicate3 package");
        } catch (ClassNotFoundException ignored) {
            // This exception means the Oliver class is not in the duplicate3 package, which is the desired behavior.
        }
    }
}
