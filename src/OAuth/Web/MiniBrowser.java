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
import javax.swing.*;
import java.awt.*;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.events.TitleEvent;
import com.teamdev.jxbrowser.chromium.events.TitleListener;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.util.concurrent.TimeUnit;

public class MiniBrowser {

    public void start(String url) throws InterruptedException {
        Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.loadURL(url);
        while (browser.isLoading()) {
            TimeUnit.MILLISECONDS.wait(50);
        }
        browser.addTitleListener(new TitleListener() {
            public void onTitleChange(TitleEvent event) {
                System.out.println("Title = " + event.getTitle());
            }
        });
    }
}
