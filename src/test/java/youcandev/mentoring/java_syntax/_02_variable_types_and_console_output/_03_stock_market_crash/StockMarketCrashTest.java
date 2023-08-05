package youcandev.mentoring.java_syntax._02_variable_types_and_console_output._03_stock_market_crash;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StockMarketCrashTest {
    @Test
    public void checkCommentedLine() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_02_variable_types_and_console_output/_03_stock_market_crash/StockMarketCrash.java")));

        Pattern commentedLinePattern = Pattern.compile("//\\s*stockQuote\\s*=\\s*stockQuote\\s*-\\s*300\\s*;");
        Matcher commentedLineMatcher = commentedLinePattern.matcher(content);
        assertThat(commentedLineMatcher.find()).isTrue();
    }
}
