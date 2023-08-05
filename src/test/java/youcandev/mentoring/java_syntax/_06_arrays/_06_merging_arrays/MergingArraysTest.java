package youcandev.mentoring.java_syntax._06_arrays._06_merging_arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MergingArraysTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMergingArrays() {
        // Act
        MergingArrays.main(new String[]{});

        // Assert
        // 1. Checking the length of the resultArray
        assertEquals(MergingArrays.firstArray.length + MergingArrays.secondArray.length, MergingArrays.resultArray.length);

        // 2. Checking the contents of the resultArray
        for (int i = 0; i < MergingArrays.firstArray.length; i++) {
            assertEquals(MergingArrays.firstArray[i], MergingArrays.resultArray[i]);
        }

        for (int i = 0; i < MergingArrays.secondArray.length; i++) {
            assertEquals(MergingArrays.secondArray[i], MergingArrays.resultArray[MergingArrays.firstArray.length + i]);
        }

        // 3. Checking the output format
        StringBuilder expectedOutput = new StringBuilder();
        IntStream.range(0, MergingArrays.resultArray.length).forEach(i -> expectedOutput.append(MergingArrays.resultArray[i]).append(", "));
        assertEquals(expectedOutput.toString(), outContent.toString());
    }
}
