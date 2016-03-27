/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OAuth;

import OAuth.Web.MiniBrowser;
import OAuth.Web.PageTitle;

/**
 *
 * @author Brian Lu
 */
public class Token {
    String pageTitle = "";
    String authURL = "https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/plus.login%20https://www.googleapis.com/auth/plus.me%20email%20profile%20https://www.googleapis.com/auth/devstorage.read_write&redirect_uri=urn:ietf:wg:oauth:2.0:oob:auto&response_type=code&client_id=37883390958-t6qulaee915mmt1cfe27efftej0kl8ti.apps.googleusercontent.com";
    public Token(String[] args) throws Exception {
        MiniBrowser mib = new MiniBrowser();
        mib.start(authURL);
        PageTitle pgt = new PageTitle();  
    }
    public void printPageTitle() {
        System.out.println(pageTitle);
    }
}
