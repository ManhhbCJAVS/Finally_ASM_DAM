package com.edusys.utility_helper;

import com.edusys.model_entity.NhanVien;

public class Auth {
//khai báo user =>Duy trì user đăng nhập vào hệ thống

    public static NhanVien user = null;
    //Xóa user khi người dùng đăng xuất

    public static void clear() {
        Auth.user = null;
    }
    //Kiểm tra đăng nhập hay chưa?

    public static boolean isLogIn() {
        return Auth.user != null;
    }
//khi đăng nhập r thì lúc đó user sẽ là nhân viên đăng nhập vào.
    //Kiểm tra vai trò trưởng phòng hay nhân viên 

    public static boolean isManager() {
        return Auth.isLogIn() && user.getVaiTro();
    }
    //Biến có kiểu là nv thuộc về đối tượng.
    public NhanVien nv;

    public static void main(String[] args) {
        Auth a = new Auth();
        a.nv = new NhanVien();
//Việc gán giá trị của biến nv là một đối tượng NhanVien mới có kiểu là NhanVien.
//Làm cho biến nv chứa thông tin của một Nhân Viên mới. 
//Tức nó chứa các thuộc tính , hành vi theo bản thiết kế nhân viên
//Vd: a.nv.ten = "Yến đáng yêu";
    }

}
