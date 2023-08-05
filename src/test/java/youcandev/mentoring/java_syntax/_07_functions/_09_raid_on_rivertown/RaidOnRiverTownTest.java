package youcandev.mentoring.java_syntax._07_functions._09_raid_on_rivertown;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RaidOnRiverTownTest {

    @Test
    void testDefeatWolf() {
        assertEquals("<wilk_1> został pokonany", RaidOnRiverTown.defeatWolf("wilk_1"));
        assertEquals("<wilk_2> został pokonany", RaidOnRiverTown.defeatWolf("wilk_2"));
    }

    @Test
    void testMainMethodOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        RaidOnRiverTown.main(new String[]{});

        String expectedOutput = Stream.of(RaidOnRiverTown.wolves)
                .map(wolf -> "<" + wolf + "> został pokonany\r\n")
                .reduce("", String::concat);

        assertEquals(expectedOutput, outContent.toString());
    }
}
