# ComVision_Image

public class PixelWriter {
    public static void main(String[] args){
         BufferedImage img = null;
        File file = new File("C:\\Users\\win8\\Desktop\\gray_150.png");
        try {
            img = ImageIO.read(file);
        } catch (IOException ex) {
            System.err.println("err");
        }
        
    WritableRaster wraster = img.getRaster();
    final int height = img.getHeight();
    int middleRow = height / 2; //หาเตำแหน่งแถวกลางภาพ
    
    //เตรียมค่าสีขาวไว้ในที่พักข้อมูล
    final int white = 255;
    int[] pixelBuffer = new int[1];
    pixelBuffer[0] = white;
    
    //สุดท้าย เราจะท าการวนลูปจากคอลัมน์ซ้ายสุด ไปคอลัมน์ขวาสุด 
    final int width = img.getWidth();
    for(int col = 0; col < width; ++col) {      
        wraster.setPixel(col, middleRow, pixelBuffer);
    }
    try{
    File fileNew = new File ("C:\\Users\\win8\\Desktop\\gray_150New.png");
    ImageIO.write(img, "png", fileNew);
     }catch (IOException ex) {
            System.err.println("Cannot write file");
            return;
        }
        
    }
    
}
