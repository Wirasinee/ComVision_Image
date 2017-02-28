# ComVision_Image

public class BrightnessInverse { ///กลับดำเป็นขาว กลับขาวเป็นดำ
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    BufferedImage img = null;
    File file = new File(in.nextLine());
        try {
            img = ImageIO.read(file);
        } catch (IOException ex) {
            System.err.println("err");
            return;
        }
    
        
        int colorPixel[] = new int[1];
        
        for(int r=0;r<img.getHeight();r++){
            for(int c=0;c<img.getWidth();c++){
            
            WritableRaster wraster = img.getRaster();
            
            wraster.getPixel(c, r, colorPixel);
            
            colorPixel[0] = 255-colorPixel[0];
        
            wraster.setPixel(c, r, colorPixel);
        }
        }
        
        try{
            File fileNew = new File(in.nextLine());//รับที่อยู่ไฟล์ภาพใหม่   
            ImageIO.write(img, "png", fileNew);
        }catch (IOException ex) {
            System.err.println("Cannot write file");
            return;
        }
    }
    //C:\\Users\\win8\\Desktop\\Tsukuyomi_gray_256.png
    }
