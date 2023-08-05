package youcandev.mentoring.java_syntax._01_commands_and_first_program._06_comments_using;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;

class CommentsUsingTest {
    @Test
    void shouldContainsTwoRows(){
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        CommentsUsing.main(new String[]{});
        String printedText = outputStream.toString().trim();

        //then
        assertFalse(printedText.contains("rośliny"));
        assertFalse(printedText.contains("zwierzęta"));
        assertFalse(printedText.contains("ludzi"));
    }

}
