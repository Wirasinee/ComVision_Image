# Storage-memory-comVision-
public class ReaderPixelGray {
    
    public int[][] loadToArray(BufferedImage img){
        int width = img.getWidth();
        int height = img.getHeight();
        
        int[][] arrImg = new int[height][width];
        for(int r=0;r<height;r++){
            for(int c=0;c<width;c++){
                Raster raster = img.getRaster();//คลาส Raster ช่วยในการอ่านค่าพิกเซลจากภาพ
                int[] pixelBuffer = new int[1];//เพื่อสร้างช่องที่รับแต่สีเฉดเทา
                raster.getPixel(c, r, pixelBuffer);
                arrImg[r][c] = pixelBuffer[0];
            }
        
        }
        return arrImg;
    }
    
    public static void main(String arge[]){
        BufferedImage img = null;
        File file = new File("ที่อยู่ไฟล์รูปเฉดเทา");
        try {
            img = ImageIO.read(file);
        } catch (IOException ex) {
            System.err.println("err");
        }
        ReaderPixelGray p =new ReaderPixelGray();
        int[][] a = p.loadToArray(img);
        for(int r=0;r<img.getHeight();r++){
            for(int c=0;c<img.getWidth();c++){
             System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
    }
}
