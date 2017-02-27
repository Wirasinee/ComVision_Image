# Storage-memory-comVision-
import java.awt.image.BufferedImage; //อ่านภาพจากดิส
import java.io.File;
import java.io.IOException;         //เผือไฟล์เสีย
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ImageReading {
    public static void main(String[] args){
    BufferedImage img = null;
    File file = new File("address file");     //Read File img
        try {
            img = ImageIO.read(file);
        } catch (IOException ex) {
            System.err.println("err");      //err outputจะออกมาเป็นสีแดง
            return;                         //จบการทำงานของโปรแกรม exitก็ได้ถ้าretrunในmain
        }
        System.out.println(img.getWidth());
        System.out.println(img.getHeight());
    }
}
