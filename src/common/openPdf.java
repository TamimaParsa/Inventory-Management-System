/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.InventoryUtils;
import java.awt.*;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author P A R S A
 */
public class openPdf {

    public static void openById(String id) {
        try {
            if((new File(InventoryUtils.billPath + id+ ".pdf")).exists()){
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+ InventoryUtils.billPath+""+id+".pdf");
            }
           // File pdfFile = new File(InventoryUtils.billPath + id + ".pdf"); 
            //if (pdfFile.exists()) {
                // Use Desktop to open the PDF file
            //    Desktop.getDesktop().open(pdfFile);
           // }
            else {
               JOptionPane.showMessageDialog(null, "File doesn't exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
