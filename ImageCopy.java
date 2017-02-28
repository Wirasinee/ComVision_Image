# ComVision_Image

public class ImageCopy { //สร้างภาพใหม่จากภาพต้นฉบับ
    public static void main(String[] args){
    BufferedImage img = null;
    Scanner in = new Scanner(System.in);
    //C:\\Users\\win8\\Desktop\\gray.png
    
        try {
            File fileOld = new File(in.nextLine()); //รับที่อยู่ไฟล์ภาพต้นฉบับ    
            img = ImageIO.read(fileOld);
        } catch (IOException ex) {
            System.err.print("Wrong input");
            return;
        }
        try{
            File fileNew = new File(in.nextLine());//รับที่อยู่ไฟล์ภาพใหม่   
            ImageIO.write(img, "png", fileNew);
        }catch (IOException ex) {
            System.err.println("Cannot write file");
            return;
        }
        
        
    
    }
}
