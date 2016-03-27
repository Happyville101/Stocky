/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OAuth.Web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Brian Lu
 */
public class Authencate {

    String[] userJSON = new String[11];

    public Authencate(String Token) throws IOException {
        String accessToken = Token;
        URL tokenDepositURL = new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + accessToken);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(tokenDepositURL.openStream()));
        System.out.println("The following is a JSON response from the google server.");
        String inputLine;
        int inputLineCount = 0;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            userJSON[inputLineCount] = inputLine;
            inputLineCount++;
        }
        in.close();
    }

    public String[] getUserJSON() {
        return userJSON;
    }
}
