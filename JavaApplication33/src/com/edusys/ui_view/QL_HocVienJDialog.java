package com.edusys.ui_view;

import com.edusys.DAO.BChuyenDeDao;
import com.edusys.DAO.CKhoaHocDao;
import com.edusys.DAO.DHocVienDao;
import com.edusys.DAO.ENguoiHocDao;
import com.edusys.model_entity.ChuyenDe;
import com.edusys.model_entity.HocVien;
import com.edusys.model_entity.KhoaHoc;
import com.edusys.model_entity.NguoiHoc;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.JDBCHelper;
import com.edusys.utility_helper.MsgBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class QL_HocVienJDialog extends javax.swing.JDialog {

    public QL_HocVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btn_xoaKhoiKhoaHoc = new javax.swing.JButton();
        btn_capNhatDiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DSHV = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_DSNH = new javax.swing.JTable();
        btn_themVaoKhoaHoc = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cbo_maCD = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        cbo_maKH = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys QLHV");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btn_xoaKhoiKhoaHoc.setText("Xóa khỏi khóa học");
        btn_xoaKhoiKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaKhoiKhoaHocActionPerformed(evt);
            }
        });

        btn_capNhatDiem.setText("Cập nhật điểm");
        btn_capNhatDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_xoaKhoiKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_capNhatDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoaKhoiKhoaHoc)
                    .addComponent(btn_capNhatDiem))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbl_DSHV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HV", "Mã NH", "HỌ TÊN", "ĐIỂM CUỐI MÔN"
            }
        ));
        tbl_DSHV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DSHVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DSHV);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HỌC VIÊN", jPanel2);

        tbl_DSNH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH ", "ĐIỆN THOẠI", "EMAIL"
            }
        ));
        jScrollPane2.setViewportView(tbl_DSNH);

        btn_themVaoKhoaHoc.setText("Thêm Vào Khóa Học");
        btn_themVaoKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themVaoKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_themVaoKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_themVaoKhoaHoc)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("NGƯỜI HỌC", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "MÃ CHUYÊN ĐỀ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        cbo_maCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_maCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_maCD, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cbo_maCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "MÃ KHÓA HỌC", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        cbo_maKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_maKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cbo_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themVaoKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themVaoKhoaHocActionPerformed
        //Khi clik vào thêm vào khóa học. Thì nên chek là chick vào người học để thêm chưa
        //Tiếp đến thì dựa vào MaKH ở ComboBox , MaNH ở bảng thì tạo lên 1 học viên mới.
        int selectedRow = this.tbl_DSNH.getSelectedRow();
        if (dtmNH.getRowCount() != 0) {
            if (selectedRow != -1) {
                int MaKH = Integer.valueOf(dCbBMaKH.getSelectedItem().toString().split(":")[1].trim());
                String MaNH = this.tbl_DSNH.getValueAt(selectedRow, 1).toString().trim();
                HocVien hvNew = new HocVien();
                hvNew.setMaKH(MaKH);
                hvNew.setMaNH(MaNH);
                hvd.insert(hvNew);
                MsgBox.alter(this, "Thêm Người Học " + MaNH + " vào " + MaKH + " thành công!!");
                fillNguoiHocToTableByMaKH();
                fillHocVienToTableByMaKH();
            } else {
                MsgBox.alter(this, "Yêu cầu chọn người học thêm vào khóa học trên bảng.");
            }
        } else {
            MsgBox.alter(this, "Có người học mà thêm vào khóa học =)) ");
        }
    }//GEN-LAST:event_btn_themVaoKhoaHocActionPerformed

    private void cbo_maCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_maCDActionPerformed
        dCbBMaKH.removeAllElements();//1 //Khi click vào event --> Xóa hết Item bên maKH. 
        //Lấy tham số MaCD --> Để từ MaCD fill ra tất cả MaKH thuộc chuyên đề đó.
        String CbbMaCD = cbo_maCD.getSelectedItem().toString().split(":")[0].trim();
        fillDateToMaKH(CbbMaCD);//2 //--> Từ MaKH Fill ra bảng Người Học.
    }//GEN-LAST:event_cbo_maCDActionPerformed

    private void cbo_maKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_maKHActionPerformed
        if (dCbBMaKH.getSize() > 0) {
            fillNguoiHocToTableByMaKH();
            fillHocVienToTableByMaKH();
        } else if (dCbBMaKH.getSize() == 0) {
            dtmNH.setRowCount(0);
            dtmHV.setRowCount(0);
        }
    }//GEN-LAST:event_cbo_maKHActionPerformed

    private void btn_xoaKhoiKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaKhoiKhoaHocActionPerformed
        //Để xóa chỉ có quản lý mới được xóa. 
        //Khi xóa sẽ dựa vào MaHV để xóa
        if (!Auth.isManager()) { //chek quản lý
            MsgBox.alter(this, "Bn ko có quyền xóa. Chỉ có quản lý mới đc xóa");
        } else {
            int selectedRow = this.tbl_DSHV.getSelectedRow();
            if (selectedRow != -1) {
                String MaHV = this.tbl_DSHV.getValueAt(selectedRow, 1).toString();
                hvd.delete(MaHV);
                MsgBox.alter(this, "Xóa học viên " + MaHV + " khỏi " + dCbBMaKH.getSelectedItem() + " Thành công");
                fillHocVienToTableByMaKH();
                fillNguoiHocToTableByMaKH();
            } else if (dtmHV.getRowCount() == 0) {
                MsgBox.alter(this, "Ko có học viên trog khóa học này để xóa");
            } else {
                MsgBox.alter(this, "Yêu cầu chọn học viên trên bảng để xóa");
            }
        }//chek quản lý
    }//GEN-LAST:event_btn_xoaKhoiKhoaHocActionPerformed

    private void btn_capNhatDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatDiemActionPerformed
//Khi thực hiện cập nhật.Thì sẽ dựa vào dòng của cột điểm đã đc Click để thay đổi điểm.
        if (dtmHV.getRowCount() > 0) {//chek nếu ko có đối tượng sao cập nhập
            if (this.selectedRow != -1) { //TH có chọn cột điểm để điền giá trị r.
                //Giá trị điểm có r.
                //Dòng có rồi. 
                //dựa vào dòng mà có cột đã click sửa điểm.
                int MaHV = Integer.valueOf(this.dtmHV.getValueAt(this.selectedRow, 1).toString());
                HocVien hvUpHocVien = new HocVien();
                hvUpHocVien.setMaHV(MaHV);
                hvUpHocVien.setDiem(this.diemUpdate);
                hvd.update(hvUpHocVien);
                MsgBox.alter(this, "Cập nhật điểm thành công =))");
                this.dtmHV.setValueAt(diemUpdate, selectedRow, 4);
            } else {
                MsgBox.alter(this, "Đã chọn điểm/thay đổi điểm của đối tượng nào đâu mà cập nhât ***");
            }
        } else {
            MsgBox.alter(this, "Ko còn đối tượng cập nhật cái gì =))**");
        }

    }//GEN-LAST:event_btn_capNhatDiemActionPerformed
//Biến toàn cục để thiết lập giá trị ko đc xóa. Lỗi lòi :v
    Double diemUpdate;
    int selectedRow = -1;
//----------------------------    
    private void tbl_DSHVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DSHVMouseClicked
        int selectedColumn = this.tbl_DSHV.getSelectedColumn();
        if (selectedColumn == 4) {
            this.selectedRow = this.tbl_DSHV.getSelectedRow();
            System.out.println(selectedRow);
            //chek xem nhấn ok hay cancel. 
            String inputValue = MsgBox.prompt(this, "Nhập điểm sửa/cập nhật vào.");
            if (inputValue == null) { //nhấn cancel.
                MsgBox.alter(this, "Hủy cập nhật điểm =))");
                MsgBox.alter(this, "Hủy dòng neo để cập nhật điểm. Trở về -1");
                selectedRow = -1;
            } else if (inputValue != null) { //nhấn oke.
                try { //chek nhấn oke có nhập vào giá trị là số ko.
                    this.diemUpdate = Double.valueOf(inputValue);
                    if (diemUpdate < 0 || diemUpdate > 10) { //chek sự hợp lý của điểm
//TH nó nhập điểm nhưng ko hợp lệ thì để nó vẫn là giá trị ban đầu của nó phòng TH nó nhấn cập nhật điểm                        
                        diemUpdate = Double.parseDouble(this.dtmHV.getValueAt(selectedRow, 4).toString());
                        MsgBox.alter(this, "Yêu cầu điểm nhập vào hợp lệ : 0 <= Diemupdate <= 10." + " DiemUpdate " + diemUpdate);
                        MsgBox.alter(this, "Hủy dòng neo để cập nhật điểm. Trở về -1");
                        selectedRow = -1;
                    } else { //khi điểm có định dạng đúng và hợp lý.
                        MsgBox.alter(this, "Mọi thứ hợp lệ. Điểm cập nhật là : " + diemUpdate);
                        MsgBox.alter(this, "Vui lòng nhấn 'Cập nhật điểm' để thực cập nhật điểm. ");
                    }
                } catch (NumberFormatException e) {
                    diemUpdate = Double.parseDouble(this.dtmHV.getValueAt(selectedRow, 4).toString());
//TH người dùng nhấn vào điểm nhưng và nhấn oke nhưng ko điền điểm cập nhật vào thì nó vẫn lấy giá trị của nó.
                    MsgBox.alter(this, "Yêu cầu cần nhập vào là số" + " DiemUpdate " + diemUpdate);
                    MsgBox.alter(this, "Hủy dòng neo để cập nhật điểm. Trở về -1");
                    selectedRow = -1;
                }
            }
        }
    }//GEN-LAST:event_tbl_DSHVMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MsgBox.alter(this, "Cửa số QLHV đã đc đóng");
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QL_HocVienJDialog dialog = new QL_HocVienJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btn_capNhatDiem;
    private javax.swing.JButton btn_themVaoKhoaHoc;
    private javax.swing.JButton btn_xoaKhoiKhoaHoc;
    private javax.swing.JComboBox<String> cbo_maCD;
    private javax.swing.JComboBox<String> cbo_maKH;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_DSHV;
    private javax.swing.JTable tbl_DSNH;
    // End of variables declaration//GEN-END:variables
    //Cầu thao tác với csdl
    CKhoaHocDao khd = new CKhoaHocDao();
    DHocVienDao hvd = new DHocVienDao();
    ENguoiHocDao nhd = new ENguoiHocDao();
    BChuyenDeDao cdd = new BChuyenDeDao();
    //Thao tác với ComboBox
    DefaultComboBoxModel dCbBMaCD;
    DefaultComboBoxModel dCbBMaKH;
    //Thao tác với Table
    DefaultTableModel dtmHV;
    DefaultTableModel dtmNH;

    private void init() {
        //Dựa vào MaCD fill lên MaKH
        //MaKH fill lên người học , học viên.

        //Xem nhưng người học nào ko thuộc vào MaKH này thì fill ra.
        setLocationRelativeTo(null); //thiết lập ra giữa
        dCbBMaCD = (DefaultComboBoxModel) cbo_maCD.getModel();
        dCbBMaKH = (DefaultComboBoxModel) cbo_maKH.getModel();
        dtmHV = (DefaultTableModel) this.tbl_DSHV.getModel();
        dtmNH = (DefaultTableModel) this.tbl_DSNH.getModel();
//      đổ tất cả MaCD lên ComboBox MaCD. ( Nó cx gọi tới evt của MaKH để đổ MaKH r.
        List<ChuyenDe> listCD = cdd.selectAll();
        for (ChuyenDe cd : listCD) {
            dCbBMaCD.addElement(cd.getMaCD().toString().trim() + " : " + cd.getTenCD());
        }
        //Sau khi fill xog 2 ComboBox r mời fill bảng.
        fillHocVienToTableByMaKH(); //Đổ tất cả đối tượng HV lên bảng.
        fillNguoiHocToTableByMaKH();//Đổ tất cả Người Học lên bảng theo Khóa Học
    }

    //Fill học viên lên bảng dựa theo MaKH học viên đó tham gia.
    private void fillHocVienToTableByMaKH() {
        dtmHV.setRowCount(0);
        int i = 0; //Làm STT trog bảng.
        if (dCbBMaKH.getSelectedItem() != null) {
            String MaKH = dCbBMaKH.getSelectedItem().toString().split(":")[1].trim();
            List<HocVien> listHV = hvd.selectHV_By_MaKH(MaKH);
            for (HocVien hv : listHV) {
                //Thông qua Học viên lấy người học từ đó thiết lập tên cho HV
                NguoiHoc nh = nhd.selectById(hv.getMaNH());
                Object[] rowHV = new Object[]{
                    i++,
                    hv.getMaHV(),
                    hv.getMaNH(),
                    nh.getHoTen(),
                    hv.getDiem()
                };
                dtmHV.addRow(rowHV);
            }
        }
    }

    //truy vấn tất cả khóa học theo MaCD để fill lên CboMaKH
    private void fillDateToMaKH(String MaCD) {
        List<KhoaHoc> listKH = khd.selectAllByMaCD(MaCD);
        for (KhoaHoc kh : listKH) {
            dCbBMaKH.addElement("Khóa Học : " + kh.getMaKH());
        }
    }

    //Dựa vào MaKH xem ai chưa tham gia khóa học này thì file lên.
    private void fillNguoiHocToTableByMaKH() {
        dtmNH.setRowCount(0); //Xóa sạch lại bảng Người Học.
        int i = 0;
        //Dựa theo MaKH đag chọn mà fill các học viên lên bảng.
        if (dCbBMaKH.getSelectedItem() != null) {
            String MaKH = dCbBMaKH.getSelectedItem().toString().split(":")[1].trim();
            List<NguoiHoc> listNH = nhd.select_All_NH_BY_MaKH_ID(Integer.valueOf(MaKH));
            //dùng phương thức trên để lấy ra MaCD
            for (NguoiHoc nh : listNH) {
                Object[] rowNH = new Object[]{
                    i++,
                    nh.getMaNH(),
                    nh.getHoTen(),
                    nh.getGioiTinh() ? "Nam" : "Nữ",
                    nh.getNgaySinh(),
                    nh.getDienThoai(),
                    nh.getEmail()
                };
                dtmNH.addRow(rowNH);
            }
        }
    }

}
