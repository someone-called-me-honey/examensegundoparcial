/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rosal
 */
public class PDF {

    public void credencial(String photopath, String nombre, String apellidoP, String apellidoM, String calle, String casa, String colonia, String cp, String municipio, String estado, String curp) {
        //creamos el documento
        Document document = new Document();
        try {
            //creamos el escritor
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("Credencial.pdf"));
            //abrimos el documento
            document.open();
            //
            PdfContentByte cb = writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());
            //pagina
            ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/plantilla.jpg"));
            g.drawImage(img.getImage(), 0, 0, 620, 379, null);
            ImageIcon foto = new ImageIcon(photopath);
            g.drawImage(foto.getImage(), 50, 110, 145, 225, null);
            g.drawImage(foto.getImage(), 524, 150, 85, 113, null);
            //nombre
            Font f = new Font("Tahoma", Font.BOLD, 14);
            g.setFont(f);
            g.drawString(nombre, 200, 125);
            //apellidoP
            g.drawString(apellidoP, 200, 140);
            //apellidoM
            g.drawString(apellidoM, 200, 155);
            //calle
            g.drawString(calle, 200, 205);
            //numero de casa
            g.drawString(casa, 360, 205);
            //colonia
            g.drawString(colonia, 200, 220);
            //cp
            g.drawString(cp, 360, 220);
            //municipio
            g.drawString(municipio, 200, 235);
            //estado
            g.drawString(estado, 350, 235);
            //curp
            g.drawString(curp, 240, 290);

        } catch (DocumentException e) {
            System.out.println(e);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        document.close();
        JOptionPane.showMessageDialog(null, "El pdf se guardo correctamente");

    }
}
