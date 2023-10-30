package com.edusys.utility_helper;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class Ximage {

    //folder gồm : Image hoặc logos
    //Name : Là tên của ảnh đó 
    //Thông qua 2 tham số nó sẽ có Path tới src ảnh
    //Sau đó nó đọc dữ liệu từ tệp tin ảnh và tạo ra đối tượng Image
    public static Image getImage(String folder, String name) {
        URL imageUrl = Ximage.class.getResource("/com/edusys/icon/" + folder + "/" + name);
//        System.out.println("ImageUrl (20_Ximage) :  "+imageUrl);
        ImageIcon imageicon = new ImageIcon(imageUrl);
        Image img = imageicon.getImage(); //Đấy là lấy về kiểu Image
//        System.out.println("Image (23_Ximage) :  "+img);
        return img;
    }
    
    public static ImageIcon getImageIcon(String folder, String name) {
        URL imageUrl = Ximage.class.getResource("/com/edusys/icon/" + folder + "/" + name);
//        System.out.println("ImageUrl (29_Ximage) :  "+imageUrl);
        ImageIcon imageicon = new ImageIcon(imageUrl);
//        System.out.println("ImageIcon (31_Ximage) :  "+imageicon);
        return imageicon;
    }

    /*
    Phương thức có tham số là một đối tượng File.
    Mục đích : Sao chép một tệp tin vào thư mục logos. nếu thư mục logos chưa có thì tạo mới.    
    //C:\Users\myName\logos\logo.png    
     */
    public static void save(File src) {
        File dst = new File("logos", src.getName());
        //Tạo một đối tượng File với thư mục cha là logos và tên tệp giống là src. ( logos/logo.png )
        if (!dst.getParentFile().exists()) { //kiểm tra xem thư mục cha có tồn tại hay không.
            //Nếu thư mục không tồn tại thì tạo ra Folder cha.
            dst.getParentFile().mkdirs();
            //p.thức mkdirs() : tạo ra thư mục cha nếu chưa có.
        }
        try {
            //Tạo đối tượng Path từ đường dẫn tuyệt đối.
            Path from = Paths.get(src.getAbsolutePath());//"C:\\Users\\myName\\logos\\logo.png"
            Path to = Paths.get(dst.getAbsolutePath()); //Thư mục hiện hành + logos\\logo.png
            //Sao chép nội dung từ from vào to, nếu to đã tồn tại thì ghi đè lên.
//Một thao tác sao chép tệp hình ảnh ( logo.png ) từ thư mục này sang thư mục khác.
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /*
    Mục đích : Tạo một đối tượng ImageIcon từ một File hình ảnh có tên là fileName trog Thư mục "logos"        
    gọi phương thức getAbsolutePath của đối tương path để trả về đường dẫn tuyệt đối của tệp hình ảnh.
     */
    public static ImageIcon read(String fileName) {
        //C:\Users\myName\logos\logo.png
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

    public static void main(String[] args) {
        System.out.println(getImage("logos", "PHPP"));
    }

}
