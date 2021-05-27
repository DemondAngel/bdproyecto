
package com.upiita.view.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author Diana Gallegos
 */
public class Fuentes {
    
    
    private String Lemon= "LEMONMILK-Light.otf";
    private String LemonB = "LEMONMILK-Regular.otf";
    private String GlacialB = "GlacialIndifference-Bold.otf";
    private String Glacial = "GlacialIndifference-Regular.otf"; 
    private String Lovelo = "Lovelo Black.otf";
   
   
    private Font font = null;

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public String getLemon() {
        return Lemon;
    }

    public void setLemon(String Lemon) {
        this.Lemon = Lemon;
    }

    public String getLemonB() {
        return LemonB;
    }

    public void setLemonB(String LemonB) {
        this.LemonB = LemonB;
    }

    public String getGlacialB() {
        return GlacialB;
    }

    public void setGlacialB(String GlacialB) {
        this.GlacialB = GlacialB;
    }

    public String getGlacial() {
        return Glacial;
    }

    public void setGlacial(String Glacial) {
        this.Glacial = Glacial;
    }

    public String getLovelo() {
        return Lovelo;
    }

    public void setLovelo(String Lovelo) {
        this.Lovelo = Lovelo;
    }
   
    
   
    
    /**
     *Método que regresa una fuente 
     * @param fontName
     * @param style  (Plana , negrita o cursiva)
     * @param size
     * @return Font 
     * @throws java.awt.FontFormatException 
     */
    public Font nFont (String fontName, int style, float size) throws FontFormatException{
     try {
         //leer la fuente 
         InputStream is = getClass ().getResourceAsStream(fontName);
         //crear fuente
         font = Font.createFont(Font.TRUETYPE_FONT,is); // Crea una nueva fuente
     }catch (FontFormatException | IOException ex){
         System.err.print(ex);
         font = new Font ("Arial",Font.PLAIN,17);
         System.out.println("Hay un problema F");
     }
     Font tfont = font.deriveFont(style,size); // tipografía por defecto
        
        return tfont;
    }  
}
