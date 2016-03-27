/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OAuth.Web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Brian Lu
 */
public class PageTitle {
    public String getPageTitle(URL url) throws Exception {
      BufferedReader in = new BufferedReader(
              new InputStreamReader(url.openStream()));
 
      Pattern pHead = Pattern.compile("(?i)</HEAD>");
      Matcher mHead;
      Pattern pTitle = Pattern.compile("(?i)</TITLE>");
      Matcher mTitle;
       
      String inputLine;
      boolean found=false;
      boolean notFound=false;
      String html = "";
      String title=new String();
      try{
          while (!(((inputLine = in.readLine()) == null) || found || notFound)){
              html=html+inputLine;
              mHead=pHead.matcher(inputLine);
              if(mHead.find()){
                  notFound=true;
                  }
              else{
                  mTitle=pTitle.matcher(inputLine);
                  if(mTitle.find()){
                      found=true;
                      //System.out.println(inputLine);
                  }
              }                                       
          }
          in.close();
      
          html = html.replaceAll("\\s+", " ");
          if(found){
              Pattern p = Pattern.compile("(?i)<TITLE.*?>(.*?)</TITLE>");
              Matcher m = p.matcher(html);            
              while (m.find() == true) {
                  title=m.group(1);
                //System.out.println("Title "+title); 
              }
          }
      }catch(Exception e){
      }
      return title;
    }
}
