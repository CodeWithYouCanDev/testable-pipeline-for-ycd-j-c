package java_syntax._02_variable_types_and_console_output._03_stock_market_crash;

/*
Krach na giełdzie
 */

public class StockMarketCrash {

    public static void main(String[] args) {
        int stockQuote = 0;
        stockQuote = stockQuote - 25 - 25;
        stockQuote = stockQuote + 20;
//        stockQuote = stockQuote - 300;
        stockQuote = stockQuote + 250;
        stockQuote = stockQuote + 30;
        System.out.println("Quotes went up - " + stockQuote);
    }
}
