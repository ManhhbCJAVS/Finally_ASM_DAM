package com.edusys.utility_helper;
//hỗ trợ xử lý thời gian.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XDate {
    //SimpleDateFormat : lớp định dạng và phân tích các ngày,giờ theo mẫu đã cho.    
    
    static SimpleDateFormat formater = new SimpleDateFormat();
    
    //Chức năng : Chuyển đổi một chuỗi date theo một mẫu pattern thành một đối tượng Date.
    public static Date toDate(String date, String pattern) {
        formater.applyLocalizedPattern(pattern);
        //applyAattern() : thiết lập mẫu cho formater theo chuỗi pattenr đc truyền vào
//Vd: Nếu pattern là "dd/MM/yyyy" --> formater định dạng và phần tích ngày giờ theo dạng "ngày/tháng/năm"
        try {
            return formater.parse(date);
//parse() : chuyển đổi một chuỗi date thành 1 đối tượng Date theo mẫu đc thiết lập cho formater.                        
        } catch (ParseException ex) {
            Logger.getLogger(XDate.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException();
        }
    }

//Chức năng : Chuyển đổi từ một đối tượng Date thành một chuỗi theo một mẫu pattern.    
    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);//thiết lập mẫu cho formater
        return formater.format(date);
//format() : dùng chuyển đổi một đối tượng Date thành một chuỗi theo mẫu đc thiết lập cho formater
//01/01/2020 --> "01/01/2020".
    }
    
    //Chức năng : thêm một số ngày days vào một đối tượng Date và trả về đối tượng Date mới    
    public static Date addDays(Date date, long days) {
//gọi p.thức setTime(long time) của đối tượng date.
//tham số time : dùng thiết lập giá trị cho đối tượng date theo số milisecond.
//time = công giá trị hiện tại của date + số milisecond tương ứng với số ngày days truyền vào.
//vd: nếu date có giá trị là ( 01/01/2020 ) và days là 10. 
//thì tham số time trong date.setTime(long time) : 
//Sẽ đc thiết lập giá trị cho date ở đây là 11/01/2020.
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
//trả về một đối tượng là date đã đc cập nhật dựa vào số ngày truyền vào.
//xem vid ở QLKhoaHoc
//xem chi tiết về lớp Day qua Project_Online
    }

}
