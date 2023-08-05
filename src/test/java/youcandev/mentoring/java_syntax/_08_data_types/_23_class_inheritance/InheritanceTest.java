package youcandev.mentoring.java_syntax._08_data_types._23_class_inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InheritanceTest {
    @Test
    void testInheritanceChain() {
        Woman woman = new Woman();
        assertTrue(woman instanceof Woman, "A Woman object should be an instance of Woman.");
        assertTrue(woman instanceof Human, "A Woman object should be an instance of Human because Woman extends Human.");
        assertTrue(woman instanceof Terran, "A Woman object should be an instance of Terran because Woman -> Human -> Terran.");
    }
}
