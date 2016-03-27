/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Globals;

import java.io.File;

/**
 *
 * @author Brian Lu
 */
public class Path {

    public File getJarDir() {
        String path = new File(getClass().getResource("").getPath()).getParentFile().getParent();
        File jarDir = new File(path.substring(5));
        return jarDir;
    }
}
