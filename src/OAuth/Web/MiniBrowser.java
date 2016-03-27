/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OAuth.Web;

/**
 *
 * @author Brian Lu
 */
import com.teamdev.jxbrowser.Browser;
import com.teamdev.jxbrowser.BrowserFactory;
import com.teamdev.jxbrowser.BrowserType;
import javax.swing.*;
import java.awt.*;

public class MiniBrowser {

    public void start(String url) {
        Browser browser = BrowserFactory.createBrowser(BrowserType.Mozilla);
        JFrame frame = new JFrame();
        frame.add(browser.getComponent(), BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.navigate("http://www.google.com");
    }
}
