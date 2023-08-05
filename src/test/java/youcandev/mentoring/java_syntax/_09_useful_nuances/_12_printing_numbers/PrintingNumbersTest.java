package youcandev.mentoring.java_syntax._09_useful_nuances._12_printing_numbers;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrintingNumbersTest {

    @Test
    //TODO this test is unstable, one time it fails another it passes
    void testPrintNumbers() throws InterruptedException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(baos));

        LinkedList<Long> printTimes = new LinkedList<>();

        // Wrap the original print method to capture the print timestamps
        System.setOut(new PrintStream(baos) {
            @Override
            public void println(int x) {
                printTimes.add(System.currentTimeMillis());
                super.println(x);
            }
        });

        PrintingNumbers.printNumbers();
        System.setOut(originalOut);

        // Check printed numbers
        String output = baos.toString();
        StringTokenizer tokenizer = new StringTokenizer(output, System.lineSeparator());

        int i = 1;
        while (tokenizer.hasMoreTokens() && i <= 10) {
            assertEquals(String.valueOf(i), tokenizer.nextToken().trim());
            i++;
        }
        assertEquals(10, i-1, "All numbers from 1 to 10 were not printed");

        // Check the delays between prints
        for (int j = 1; j < printTimes.size(); j++) {
            long difference = printTimes.get(j) - printTimes.get(j - 1);
            assertTrue(difference >= 1 && difference <= 3, "The delay is not approximately 1.3 milliseconds");
        }
    }
}
