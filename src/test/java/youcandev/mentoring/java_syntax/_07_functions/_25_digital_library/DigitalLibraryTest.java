package youcandev.mentoring.java_syntax._07_functions._25_digital_library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitalLibraryTest {

    private DigitalLibrary library;

    @BeforeEach
    void setUp() {
        library = new DigitalLibrary();
    }

    @Test
    void testDefaultValues() {
        // Validate the default values
        assertEquals("Władca Pierścieni", library.title, "Default title should be 'Władca Pierścieni'");
        assertEquals("J.R.R. Tolkien", library.author, "Default author should be 'J.R.R. Tolkien'");
        assertEquals(1954, library.year, "Default year should be 1954");
    }

    @Test
    void testSetAuthor() {
        // Change the author and validate
        library.setAuthor("Another Author");
        assertEquals("Another Author", library.author, "Author should be changed to 'Another Author'");
    }

    @Test
    void testSetYear() {
        // Change the year and validate
        library.setYear(2000);
        assertEquals(2000, library.year, "Year should be changed to 2000");
    }
}
