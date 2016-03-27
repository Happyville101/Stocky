/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Globals;

/**
 *
 * @author Brian Lu
 */
public class SubtractLastChar {

    public String subtractString(String str) {
        str = str.substring(0, str.length() - 1);
        return str;
    }
}
