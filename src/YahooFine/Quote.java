/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//WARNING!!! THIS PACKAGE IS SERIOUSLY BROKEN IS SHOULD BE FIXED

package YahooFine;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/**
 *
 * @author Brian Lu
 */
public class Quote {

    public String[] getCurrentQuote(String stock) throws IOException {
        try (
                ReadableByteChannel in = Channels.newChannel(
                        new URL("http://download.finance.yahoo.com/d/quotes.csv?f=l1c1&e=.csv&s=" + stock).openStream());
                FileChannel out = new FileOutputStream(
                        "C:\\\\quotes.csv").getChannel()) {
            out.transferFrom(in, 0, Long.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("An error occured, yippe! report this please! Mention YahooFine.Quote.java method getCurrentQuote");
        }
        BufferedReader reader = new BufferedReader(new FileReader("C:\\\\quotes.csv"));

        String line = "";
            String[] data = line.trim().split(",");
            
        
        return data;
    }
}
