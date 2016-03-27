/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OAuth;

import javafx.application.Application;
import OAuth.Web.MiniBrowser;
import OAuth.Web.PageTitle;
import java.net.URL;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Brian Lu
 */
public class Token {
    String pageTitle = "";
    public Token(String[] args) throws Exception {
        MiniBrowser mib = new MiniBrowser();
        PageTitle pgt = new PageTitle();  
    }
    public void printPageTitle() {
        System.out.println(pageTitle);
    }
}
