package youcandev.mentoring.java_syntax._07_functions._10_access_control_to_vip_class;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AccessControlToVIPClassTest {

    @Test
    void testNoAccessWithoutInvitation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AccessControlToVIPClass.accessToClass("noInvite");

        assertEquals("", outContent.toString());
    }

    @Test
    void testAccessWithInvitation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String inviteeName = "JohnDoe";
        AccessControlToVIPClass.accessToClass(inviteeName);

        String expectedOutput = "Witamy w klasie VIP, " + inviteeName + "\r\n" +
                "Ciesz się specjalnymi przywilejami, " + inviteeName + "\r\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}
