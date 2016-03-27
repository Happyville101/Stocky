/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Init;

import Globals.Reference;
import OAuth.Token;
import OAuth.Web.UserData;
import OAuth.Web.Authencate;
import OAuth.Web.MiniBrowser;
import java.io.IOException;
import YahooFine.Quote;
import javafx.stage.Stage;

/**
 *
 * @author Brian Lu
 */
public class Init {
    public static void main(String[] args) throws Exception {
        Token tkn = new Token(args);
        //tkn.printPageTitle();
        //Reference ref = new Reference();
        //Authencate getJSON = new Authencate(ref.getToken());
        //UserData gud = new UserData(getJSON.getUserJSON());
        //gud.printData();
        
    }
}
