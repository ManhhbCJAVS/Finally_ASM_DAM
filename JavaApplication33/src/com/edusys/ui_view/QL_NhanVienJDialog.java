package com.edusys.ui_view;

import com.edusys.DAO.CKhoaHocDao;
import com.edusys.DAO.ENguoiHocDao;
import com.edusys.DAO.FNhanVienDao;
import com.edusys.model_entity.KhoaHoc;
import com.edusys.model_entity.NguoiHoc;
import com.edusys.model_entity.NhanVien;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.MsgBox;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class QL_NhanVienJDialog extends javax.swing.JDialog {

    FNhanVienDao nvd = new FNhanVienDao();
    ENguoiHocDao nhd = new ENguoiHocDao();
    CKhoaHocDao khd = new CKhoaHocDao();

    DefaultTableModel dtm;

    public QL_NhanVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dtm = (DefaultTableModel) this.tbl_danhSachNV.getModel();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_timKiemMaNV = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        TabbedPane = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_maNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_matKhau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_xacNhanMatKhau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_hoVaTen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        rdo_truongPhong = new javax.swing.JRadioButton();
        rdo_nhanVien = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_end = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_danhSachNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys QLNV");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Mã Nhân Viên"));

        btn_timKiem.setText("Tìm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_timKiemMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timKiemMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Mật Khẩu");

        jLabel4.setText("Xác nhận mật khẩu ");

        jLabel5.setText("Họ và tên");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_maNV)
                    .addComponent(txt_matKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_xacNhanMatKhau)
                    .addComponent(txt_hoVaTen)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_xacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_hoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Vai trò");

        buttonGroup1.add(rdo_truongPhong);
        rdo_truongPhong.setText("Trường Phòng");

        buttonGroup1.add(rdo_nhanVien);
        rdo_nhanVien.setText("Nhân Viên");
        rdo_nhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_nhanVienActionPerformed(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.setEnabled(false);
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_moi.setText("Mới");
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });

        btn_prev.setText("|<");
        btn_prev.setEnabled(false);
        btn_prev.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_prev.setPreferredSize(new java.awt.Dimension(60, 23));

        btn_first.setText("<<");
        btn_first.setEnabled(false);
        btn_first.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_first.setPreferredSize(new java.awt.Dimension(60, 23));

        btn_end.setText(">>");
        btn_end.setEnabled(false);
        btn_end.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_end.setPreferredSize(new java.awt.Dimension(60, 23));

        btn_next.setText(">|");
        btn_next.setEnabled(false);
        btn_next.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_next.setPreferredSize(new java.awt.Dimension(60, 23));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(btn_moi)
                    .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(rdo_truongPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdo_nhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_truongPhong)
                    .addComponent(rdo_nhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Cập Nhật", tab1);

        tbl_danhSachNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NV", "Mật Khẩu", "Họ Và Tên", "Vai Trò"
            }
        ));
        tbl_danhSachNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_danhSachNVMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_danhSachNV);

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Danh Sách", tab2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TabbedPane, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdo_nhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_nhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_nhanVienActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (checkValidateChung() && checkValidateThem() && !checkTonTai()) {
            add_Staff();
            MsgBox.alter(this, "(361) thêm thành công");
            fillToTable();
            clear();
        } else {
            MsgBox.alter(this, "(363) Thêm thất bại");
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if (Auth.isManager()) {
            deleteStaffByMaNV();
        }else{
            MsgBox.alter(this, "Chỉ có trường phòng mới có thể xóa");
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tbl_danhSachNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_danhSachNVMousePressed
        if (evt.getClickCount() == 2) {
            this.TabbedPane.setSelectedComponent(tab1);
            int selectedRow = this.tbl_danhSachNV.getSelectedRow();
            fillFormWithSelectedRow(selectedRow);

            //Thiết lập hành vi cho các nút/text
            btn_them.setEnabled(false);
            btn_sua.setEnabled(true);
            btn_xoa.setEnabled(true);
            txt_xacNhanMatKhau.setEnabled(false);
            txt_xacNhanMatKhau.setText("Yêu cầu nhấn 'Mới' để dùng");
        }
    }//GEN-LAST:event_tbl_danhSachNVMousePressed

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        clear();
    }//GEN-LAST:event_btn_moiActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        Edit_NhanVien();
        fillToTable();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        String timKiem = txt_timKiemMaNV.getText();
        if (!timKiem.isEmpty()) {
            findEmployeesByID(timKiem);
        } else {
            MsgBox.alter(this, "Yêu cầu nhập MaNV cần tìm kiếm");
        }
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
                MsgBox.alter(this, "Cửa số QLNV đã đc đóng");
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QL_NhanVienJDialog dialog = new QL_NhanVienJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton btn_end;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdo_nhanVien;
    private javax.swing.JRadioButton rdo_truongPhong;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JTable tbl_danhSachNV;
    private javax.swing.JTextField txt_hoVaTen;
    private javax.swing.JTextField txt_maNV;
    private javax.swing.JTextField txt_matKhau;
    private javax.swing.JTextField txt_timKiemMaNV;
    private javax.swing.JTextField txt_xacNhanMatKhau;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        //B1: Cần fill thông tin nhân viên lên bảng.
        fillToTable();
        //B2: Cần fill thông tin nhân viên đầu tiên lên Form
        fillFormWithSelectedRow(0);
        txt_xacNhanMatKhau.setEnabled(false); //vô hiệu hóa nút thêm.
        //B3: Cần bắt sự kiện khi double-click 2 lần lên bảng. ( Đã bắt ) 
    }

    //load dữ liệu lên bảng
    public void fillToTable() {
        dtm.setRowCount(0);
        List<NhanVien> listNV = nvd.selectAll();
        int i = 1;
        for (NhanVien nv : listNV) {
            Object[] row = new Object[]{
                i++,
                nv.getMaNV(),
                nv.getMatKhau(),
                nv.getHoTen(),
                nv.getVaiTro() ? "Trường phòng" : "Nhân viên"
            //trường phòng là 1 ( True ) / Nhân Viên là 0 ( False ).
            };
            dtm.addRow(row);
        }
    }

    //hiện thị lên Form với đối tượng chọn bên danh sách
    public void fillFormWithSelectedRow(int selectedRow) {
        List<NhanVien> listNV = nvd.selectAll();
        NhanVien nv1 = listNV.get(selectedRow);

        txt_maNV.setText(nv1.getMaNV());
        txt_matKhau.setText(nv1.getMatKhau());
        txt_hoVaTen.setText(nv1.getHoTen());
        rdo_truongPhong.setSelected(nv1.getVaiTro());
        rdo_nhanVien.setSelected(!nv1.getVaiTro());
    }

    private void clear() {
        //Clear trống Form
        txt_maNV.setText("");
        txt_maNV.setBackground(null);

        txt_matKhau.setText("");

        txt_matKhau.setBackground(null);

        txt_hoVaTen.setText("");
        txt_hoVaTen.setBackground(null);

        txt_xacNhanMatKhau.setText(null);
        //Vô hiệu hóa nút Sửa/Xóa
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
        btn_them.setEnabled(true);
        //kích hoạt nút thêm
        txt_xacNhanMatKhau.setEnabled(true);
        //focus vào MaNV
        txt_maNV.requestFocus();

    }

    //Cả thêm và sửa đều chek trống. ( MaNV / MK / HoTen ) 
    //Nếu ko trống là true. Còn lại là false
    public boolean checkValidateChung() {
        String maNV = txt_maNV.getText();
        String matKhau = txt_matKhau.getText();
        String hoVaTen = txt_hoVaTen.getText();
        if (maNV.isEmpty() || matKhau.isEmpty() || hoVaTen.isEmpty()) {
            if (maNV.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu điền MaNV");
                txt_maNV.requestFocus();
                txt_maNV.setBackground(Color.YELLOW);
            } else if (matKhau.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu điền Mật Khẩu");
                txt_matKhau.requestFocus();
                txt_matKhau.setBackground(Color.YELLOW);
                txt_maNV.setBackground(null);
            } else if (hoVaTen.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu điền họ và tên");
                txt_hoVaTen.requestFocus();
                txt_hoVaTen.setBackground(Color.YELLOW);
                txt_xacNhanMatKhau.setBackground(null);
            }
            return false;
        }
        return true;
    }

    //riêng khi thêm phải chek trống phần xác thực mật khẩu.
    //Chek phần trùng mật khẩu khi thêm
    //Nếu mà trùng là true còn ko trùng là False.
    public boolean checkValidateThem() {
        String matKhau = txt_matKhau.getText();
        String xacNhanMK = txt_xacNhanMatKhau.getText();
        if (xacNhanMK.isEmpty()) {
            MsgBox.alter(this, "Yêu cầu điền Xác nhận mật khẩu");
            txt_xacNhanMatKhau.requestFocus();
            txt_xacNhanMatKhau.setBackground(Color.YELLOW);
            txt_matKhau.setBackground(null);
            return false;
        } else if (!matKhau.equals(xacNhanMK)) {
            MsgBox.alter(this, "Yêu cầu xác nhận mật khẩu trùng nhau!");
            return false;
        }
        MsgBox.alter(this, "(553) Form thêm hợp lệ =))");
        return true;
    }

    public NhanVien getNhanVienWithForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txt_maNV.getText());
        nv.setMatKhau(txt_matKhau.getText());
        nv.setHoTen(txt_hoVaTen.getText());
        nv.setVaiTro(rdo_truongPhong.isSelected());
        //nếu là true ( 1 ) --> là trường phòng 
        //Nếu là false( 0 ) --> Là nhân viên
        MsgBox.alter(this, "Lấy thông tin nhân viên thành công!!");
        return nv;
    }

    //Nếu maNV tồn tại trog bảng nhân viên là true. Còn ko có là false
    public boolean checkTonTai() {
        String maNV = txt_maNV.getText();
        NhanVien nv = nvd.selectById(maNV);
        if (nv == null) {
            MsgBox.alter(this, "(571) Không tồn tại MaNV" + maNV + " trong bảng NV");
            return false;
        }
        MsgBox.alter(this, "(574) Mã nhân viên " + maNV + " đã tồn tại trong bảng nhân viên");
        return true;
    }

    //Cần kiểm tra Form điền hợp lý chưa  ( checkValidateChung() ) 
    //Kiếm tra xem nhân viên sửa đó tồn tại hay ko. ( checkTonTai() )
    //Từ đó lấy nv mới tạo từ Form thay cho nv càn sửa ( getNhanVienWithForm() )
    public void Edit_NhanVien() {
        if (checkValidateChung() && checkTonTai()) {
            NhanVien nv = getNhanVienWithForm();
            nvd.update(nv);
            MsgBox.alter(this, "Sửa thành công =))");
        }
    }

    //Xóa nhân viên theo MaNV
    //B1: Chek xem nhân viên đó tồn tại trog bảng NV không ( checkTonTai() )
    //B2: chek xem nhân viên đó có trog bảng Khóa học và bảng Người học ko. Nếu có thì ko xóa đc ( checkRangBuoc() ) 
    //B3: Nếu ko có thì xóa thành công.
    public void deleteStaffByMaNV() {
        if (checkTonTai() && checkRangBuoc()) {
            nvd.delete(txt_maNV.getText());
            MsgBox.alter(this, "Xóa thành công");
        } else {
            MsgBox.alter(this, "Xóa thất bại");
        }

    }
    //Nếu NV xóa ko tồn tại trog 2 bảng khóa học và người học thì là true
    //Còn nếu tồn tại một trog 2 bảng là False
    public boolean checkRangBuoc() {
        String maNV = txt_maNV.getText();
        NguoiHoc nh = nhd.selectMaNVById(maNV);
        KhoaHoc kh = khd.select_MaNV_By_Id(maNV);
        //Nếu nó lấy ra đc kh và nh ko null. Là trog bảng khóa học hoặc người học nó có nhân viên đó.
        if (kh != null) {
            MsgBox.alter(this, "Nhân viên" + maNV + " đag triển khai khóa học ");
            return false;
        }
        if (nh != null) {
            MsgBox.alter(this, "Nhân viên" + maNV + " đã thêm người học rồi ");
            return false;
        }
        MsgBox.alter(this, "Nhân viên " + maNV + " không tổ chức khóa học và thêm người học nào=))");
        return true;
    }

    //Sau khi chek hết đk hợp lý r
    //Thì lấy dữ liệu trừ trên Form tạo thành một đối tượng 
    //Thêm vào bảng nhân viên
    private void add_Staff() {
        NhanVien nv = getNhanVienWithForm();
        nvd.insert(nv);
    }

    //Chek NV tìm kiếm có tồn tại hay ko. 
    //Nếu có fill thông tin lên Form
    //Chỉ mục của bảng hướng tới đối tượng có ID là như vậy.
    private void findEmployeesByID(String timKiem) {
        NhanVien nv = nvd.selectById(timKiem);
        if (nv == null) {
            MsgBox.alter(this, "Nhân viên tìm kiếm " + timKiem + " không tồn tại");
        } else {
            txt_maNV.setText(nv.getMaNV());
            txt_matKhau.setText(nv.getMatKhau());
            txt_hoVaTen.setText(nv.getHoTen());
            rdo_truongPhong.setSelected(nv.getVaiTro()); //Trường phòng là 1 ( true ) 
            rdo_nhanVien.setSelected(!nv.getVaiTro()); // Nhân viên là 0  ( False ) 
            MsgBox.alter(this, "Nhân viên " + timKiem + " tồn tại. Fill Form thành công");
        }

    }

}//end
