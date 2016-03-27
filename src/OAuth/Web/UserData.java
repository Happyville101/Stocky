/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OAuth.Web;

import Globals.SubtractLastChar;

/**
 *
 * @author Brian Lu
 */
public class UserData {

    String ID = "";
    String Email = "";
    String Name = "";
    String FirstName = "";
    String LastName = "";
    String Link = "";
    String Picture = "";
    String Locale = "";

    public UserData(String[] sa) {
        SubtractLastChar slc = new SubtractLastChar();
        String tempString = "";
        String[] JSON = sa;
        tempString = JSON[1];
        ID = tempString.substring(8);
        ID = slc.subtractString(ID);
        ID = slc.subtractString(ID);
        tempString = JSON[2];
        Email = tempString.substring(11);
        Email = slc.subtractString(Email);
        Email = slc.subtractString(Email);
        tempString = JSON[4];
        Name = tempString.substring(10);
        Name = slc.subtractString(Name);
        Name = slc.subtractString(Name);
        tempString = JSON[5];
        FirstName = tempString.substring(16);
        FirstName = slc.subtractString(FirstName);
        FirstName = slc.subtractString(FirstName);
        tempString = JSON[6];
        LastName = tempString.substring(17);
        LastName = slc.subtractString(LastName);
        LastName = slc.subtractString(LastName);
        tempString = JSON[7];
        Link = tempString.substring(10);
        Link = slc.subtractString(Link);
        Link = slc.subtractString(Link);
        tempString = JSON[8];
        Picture = tempString.substring(13);
        Picture = slc.subtractString(Picture);
        Picture = slc.subtractString(Picture);
        tempString = JSON[9];
        Locale = tempString.substring(12);
        Locale = slc.subtractString(Locale);
    }

    public String getID() {
        return ID;
    }

    public String getEmail() {
        return Email;
    }

    public String getFullName() {
        return Name;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGPlusLink() {
        return Link;
    }

    public String getPictureLink() {
        return Picture;
    }

    public String getLocale() {
        return Locale;
    }
    
    public void printData() {
        System.out.println("The following is a printout of the stored varibles:");
        System.out.println("ID: " + getID());
        System.out.println("Email: " + getEmail());
        System.out.println("Full Name: " + getFullName());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Google+ Link: " + getGPlusLink());
        System.out.println("Picture Link: " + getPictureLink());
        System.out.println("Locale: " + getLocale());
    }
}
