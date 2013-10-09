/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package custom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sistemas
 */
public class Funcoes {

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd.HHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
