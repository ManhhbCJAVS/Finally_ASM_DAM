package com.edusys.DAO;

import java.util.List;

//Khuôn mẫu tạo ra các lớp DAO đại diện cho mỗi loại đối tượng (.) model.
public interface AEduSysDao<E, K> {

    /*
    1.phương thức này chèn một đối tượng kiểu E vào csdl
     */
    void insert(E entity);

    /*
    2.phương thức cập nhật một đối tượng E vào csdl.
     */
    void update(E entity);
    //3.Xóa một đối tượng trong bảng theo Primary key.
    void delete(K key);

    /*
    4.Lấy ra một danh sách các đối tượng kiểu E khỏi csdl.
     */
    List<E> selectAll();
    
    
      /*
    6.Lấy ra một đối tượng kiểu E dựa vào khóa biểu K cho trước. 
     */
    E selectById(K k);

    /*
    5.Lấy ra một danh sách các đối tượng kiểu E từ CSDL theo một câu lệnh 
    SQL cho trước và tham số truyền vào.
     */
    List<E> selectBySQL(String sql, Object... args);

  
    
}
