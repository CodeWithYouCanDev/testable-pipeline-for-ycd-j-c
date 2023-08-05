package youcandev.mentoring.java_syntax._09_useful_nuances._06_fortune_book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FortuneBookTest {

    @Test
    void testGetFortuneReturnsValidResponses() {
        for (int i = 0; i < 1000; i++) {  // Run the test multiple times to increase confidence
            String response = FortuneBook.getFortune();

            assertTrue(
                    response.equals(FortuneBook.FOR_SURE) ||
                            response.equals(FortuneBook.YES_DEFINITELY) ||
                            response.equals(FortuneBook.PROBABLY) ||
                            response.equals(FortuneBook.MAYBE_YES) ||
                            response.equals(FortuneBook.NOT_NOW) ||
                            response.equals(FortuneBook.TRY_AGAIN) ||
                            response.equals(FortuneBook.DONT_THINK_SO) ||
                            response.equals(FortuneBook.HIGHLY_UNLIKELY),
                    "Invalid response from FortuneBook: " + response
            );
        }
    }
}
