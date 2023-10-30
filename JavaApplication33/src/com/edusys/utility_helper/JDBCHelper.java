
package com.edusys.utility_helper;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCHelper {
    public static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String url    = "jdbc:sqlserver://localhost:1433;databaseName=EduSysASM;\n" + "encrypt=true;trustServerCertificate=true;";
    public static final String user   = "sa";
    public static final String password = "123";
    
    //Nạp Driver
    static{
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lỗi Driver");
            ex.printStackTrace();
        }
    }
    /*
        Truyền vào 2 tham số. 
        Tham số đầu là câu lệnh truy vấn
        Tham số 2 là một mảng chứa các đối tượng có kiểu dữ liệu là Object.
    => Method dùng để xác định xem câu lệnh truy vấn là gì để tạo ra đối tượng thực hiện truy vấn hợp lý.
        Xác định tham số truyền vào để tạo độ dài mảng sao cho phù hợp với tham số truyền vào.
    */
    public static PreparedStatement getStmt(String sql , Object...args) throws SQLException{
            
            //Thực hiện kết nối với Database
            Connection cn = DriverManager.getConnection(url, user, password);
             //Tạo container chứa câu truy vấn
            PreparedStatement pstmt;
            //Check xem nó là Câu lệnh thường hay là câu gọi PROC
            //trim(): Để xóa khoảng trắng đầu và cuối chuỗi. 
            //StartsWith(String prefix , int offset) kiểm tra xem chuỗi dó có bắt đầu bằng 'prefix' và từ vị trí 'offset' không.
            if(sql.trim().startsWith("{") ){ 
                pstmt = cn.prepareCall(sql);
/*              
Tạo ra đối tượng CallableStatement thông qua phương thức prepareCall của lớp Connection. 
Lớp CallableStatement là 1 lớp con kế thừa từ lớp cha PreparedStatement
--> nó có tất cả thuộc tính và phương thức của lớp PreparedStatement--1 lớp thực thi câu lệnh SQL thông thường.
--> Bn đag ép kiểu từ kiểu con sang kiểu cha --> Bn có thể dụng thuộc tính/phương thức của lớp PreparedStatement trên biến pstmt.
*/
            }else{
                pstmt = cn.prepareStatement(sql); //SQL
            }
            //Trường hợp có tham số. Thì nó sẽ thiết lập giá trị của tham số truyền vào 1 cách tương ứng.
            for(int i = 0; i < args.length ; i++){
                pstmt.setObject(i + 1, args[i]);
            }
            /*VD
                 String sql = "INSERT INTO students ( id , name , age ) Values ( ? , ? , ? ) ;
                 Object[] params = {101 , "Mèo yêu" , 26};
                 PreparedStatement pstmt = JDBCHelper.getStmt(sql,params ; 
            */
        return pstmt  ; //trả về đối tượng để chứa câu lệnh SQL hơp lý.
    }
    
    
    
    //Thực hiện câu lệnh SQL truy vấn ( Select ) hoặc thủ tục lưu trữ truy vân dữ liệu
            //String sql : câu lệnh select có thể chứa tham số. Có thể là 1 lời gọi thủ tục lưu trữ.
            //@args : Danh sách các giá trị cung cấp cho các tham số trog câu lệnh sql.
    public static  ResultSet query(String sql , Object... args) throws SQLException{
        PreparedStatement pstmt = JDBCHelper.getStmt(sql, args);
//C1:    ResultSet rs = pstmt.executeQuery();
//        return rs;
          return pstmt.executeQuery(); //C2
    }
/*
String sql = "Select * from NhanVien WHERE MaNV = ?";
    ResultSet rs = JDBCHelper.query(sql , "YenTP");

String sql = "{Call sp_BangDiem(?)}";
    ResultSet rs = JDBCHelper.query(sql,1000):
*/
    
    //Thực hiện truy vấn và trả về một giá trị từ kq truy vấn.
    public static Object value(String sql , Object...args) throws SQLException{
        ResultSet rs = JDBCHelper.query(sql, args);
        Object result = null; //khai báo biến có lưu giá trị trả về.
        if(rs.next()){
            return rs.getObject(1); 
            //Vì chỉ trả về 1 kq nên lấy là 1 thôi.
            //Và gán giá trị cho biến result.
        }
        rs.getStatement().getConnection().close(); // đóng kết nối
        return result; //trả về biến result. 
        //Dù có trả về là gì (Null/1 giá trị) thì nó đều đóng kết nối.
    }
/*
String sql = "Select HoTen FROM NhanVien WHERE MaNV = ? ";
    String name = (String) JDBCHelper.value(sql,"TeoNV");
    
String sql ="Select COUNT(*) from NhanVien";
    int count = (Integer) JDBCHelper.value(sql);
    
*/
    //
    public static int  update(String sql , Object...args) {
        try {
            PreparedStatement stmt = JDBCHelper.getStmt(sql, args);
            try{
                return stmt.executeUpdate();
            }finally{
                stmt.getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException();
//Lệnh throw cx là 1 kiểu kết thúc pt. và truyền ngoại lệ cho phương thức gọi là gì.
//Nên ko cần return ở cuối nx. Mà chỉ càn throw để ném ra ngoại lệ.
        }
    }
/*
String sql = "INSERT...?,?,?..." ; 
String sql = "UPDATE...?,?,?..." ;
String sql = "DELETE...?,?,?..." ;
    jdbcHelper.update(sql,a1,a2,a3);
*/
   
}
