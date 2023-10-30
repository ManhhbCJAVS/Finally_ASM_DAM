package com.edusys.ui_view;

import com.edusys.DAO.BChuyenDeDao;
import com.edusys.DAO.CKhoaHocDao;
import com.edusys.model_entity.ChuyenDe;
import com.edusys.model_entity.KhoaHoc;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.JDBCHelper;
import com.edusys.utility_helper.MsgBox;
import com.edusys.utility_helper.Ximage;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class QL_ChuyenDeJDialog extends javax.swing.JDialog {

    BChuyenDeDao cdd = new BChuyenDeDao();
    ChuyenDe cd = new ChuyenDe();
    DefaultTableModel dtm;

    CKhoaHocDao khd = new CKhoaHocDao();

    public QL_ChuyenDeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbl_avatar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_maChuyenDe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_tenChuyenDe = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_thoiLuong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_hocPhi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_moTa = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_end = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_danhSachChuyenDe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys QLCD");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        jLabel7.setText("Hình logo");

        lbl_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/logos/Subject.png"))); // NOI18N
        lbl_avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_avatarMouseClicked(evt);
            }
        });

        jLabel9.setText("Mã Chuyên Đề");

        txt_maChuyenDe.setText("PRO02");

        jLabel10.setText("Tên Chuyên Đề");

        txt_tenChuyenDe.setText("Dự án với công nghệ Spring MVC");

        jLabel11.setText("Thời Lượng ( Giờ ) ");

        txt_thoiLuong.setText("90");

        jLabel12.setText("Học Phí");

        txt_hocPhi.setText("300.0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_maChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tenChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_hocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Mô tả chuyên đề");

        ta_moTa.setColumns(20);
        ta_moTa.setRows(5);
        ta_moTa.setText("PRO02-Dự án với công nghệ Spring MVC\n");
        jScrollPane1.setViewportView(ta_moTa);

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
        btn_prev.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_prev.setPreferredSize(new java.awt.Dimension(60, 23));
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        btn_first.setText("<<");
        btn_first.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_first.setPreferredSize(new java.awt.Dimension(60, 23));
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        btn_end.setText(">>");
        btn_end.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_end.setPreferredSize(new java.awt.Dimension(60, 23));
        btn_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_endActionPerformed(evt);
            }
        });

        btn_next.setText(">|");
        btn_next.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_next.setPreferredSize(new java.awt.Dimension(60, 23));
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap(337, Short.MAX_VALUE)
                    .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(66, 66, 66)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_sua)
                        .addComponent(btn_xoa)
                        .addComponent(btn_moi))
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_avatar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Cập Nhật", tab1);

        tbl_danhSachChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MãCĐ", "TênCĐ", "Học Phí", "Thời Lượng", "Hình"
            }
        ));
        tbl_danhSachChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_danhSachChuyenDeMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_danhSachChuyenDe);
        if (tbl_danhSachChuyenDe.getColumnModel().getColumnCount() > 0) {
            tbl_danhSachChuyenDe.getColumnModel().getColumn(5).setHeaderValue("Hình");
        }

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Danh Sách", tab2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_danhSachChuyenDeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_danhSachChuyenDeMousePressed
        if (evt.getClickCount() == 2) {
            this.tabbedPane.setSelectedComponent(tab1); //bắt đầu từ 0
            int selectedRow = this.tbl_danhSachChuyenDe.getSelectedRow();
            fillFormWithSelectedRow(selectedRow);
            lbl_avatar.setText(null);
            btn_them.setEnabled(false);
            btn_sua.setEnabled(true);
            btn_xoa.setEnabled(true);
        }
    }//GEN-LAST:event_tbl_danhSachChuyenDeMousePressed
    //Dùng xóa form + Thêm Chuyên đề mới
    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        Clear();
    }//GEN-LAST:event_btn_moiActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        String maCD = txt_maChuyenDe.getText();
        if (checkValidate() && MaTonTaiTrongBangCD(maCD)) {
            update();
            filltoTable();
        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if (Auth.isManager()) { //Chỉ có trường phòng mới đc xóa
            if (checkValidate() && checkRangBuoc()) {
                delete();
                filltoTable();
                displayFirstItemDate();//hiện thị đối tượng đầu trog bảng lên Form
            }
        } else {
            MsgBox.alter(this, "Chỉ có trưởng phòng được thực hiện chức năng xóa(385)");
        }
    }//GEN-LAST:event_btn_xoaActionPerformed
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        String maCD = txt_maChuyenDe.getText();
        if (checkValidate() && !MaTonTaiTrongBangCD(maCD)) {
            themChuyenDe();
            filltoTable();
            Clear();
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void lbl_avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_avatarMouseClicked
        ThietLapAvatar();
    }//GEN-LAST:event_lbl_avatarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MsgBox.alter(this, "Cửa số QLCD đã đc đóng");
    }//GEN-LAST:event_formWindowClosed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        lbl_avatar.setText(null);
        setButtonsEnabled(true);
        prev();
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        lbl_avatar.setText(null);
        setButtonsEnabled(true);
        next();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        lbl_avatar.setText(null);
        setButtonsEnabled(true);
        first();
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_endActionPerformed
        lbl_avatar.setText(null);
        setButtonsEnabled(true);
        end();
    }//GEN-LAST:event_btn_endActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QL_ChuyenDeJDialog dialog = new QL_ChuyenDeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_end;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_avatar;
    private javax.swing.JTextArea ta_moTa;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tbl_danhSachChuyenDe;
    private javax.swing.JTextField txt_hocPhi;
    private javax.swing.JTextField txt_maChuyenDe;
    private javax.swing.JTextField txt_tenChuyenDe;
    private javax.swing.JTextField txt_thoiLuong;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        filltoTable(); //load dữ liệu lên bảng  
        displayFirstItemDate();//load dữ liệu đầu bảng lên Form

    }

    //Load tất cả chuyên đề lên danh sách. 
    public void filltoTable() {
        dtm = (DefaultTableModel) this.tbl_danhSachChuyenDe.getModel();
        dtm.setRowCount(0);
        List<ChuyenDe> listcd = cdd.selectAll();
        //dùng vòng lặp for-each để duyệt danh sách chuyên đề lên bảng
        int i = 1;
        for (ChuyenDe cd : listcd) {
            Object[] row = new Object[]{
                i++,
                cd.getMaCD(),
                cd.getTenCD(),
                cd.getHocPhi(),
                cd.getThoiLuong(),
                cd.getHinh()
            };
            System.out.println(cd.getHinh());
            dtm.addRow(row);
        }
    }

    //hiện thị lên Form với đối tượng chọn bên danh sách
    public void fillFormWithSelectedRow(int SelectedRow) {
        //lấy danh sách chuyên đề từ clde 
        List<ChuyenDe> listcd = cdd.selectAll();
        ChuyenDe cd1 = listcd.get(SelectedRow);
        //Fill dữ liệu vào Form
        txt_maChuyenDe.setText(cd1.getMaCD());
        txt_tenChuyenDe.setText(cd1.getTenCD());
        txt_thoiLuong.setText(String.valueOf(cd1.getThoiLuong()));
        txt_hocPhi.setText(String.valueOf(cd1.getHocPhi()));
        ta_moTa.setText(cd1.getMoTa());

//        System.out.println("1 : "+cd1.getHinh());
//        System.out.println("---------------------");
        Icon iconAvatar = Ximage.getImageIcon("logos", cd1.getHinh());
        lbl_avatar.setIcon(iconAvatar);
//        System.out.println("-----------------------");
    }

    //Hiện thị dữ liệu đầu tiên trong danh sách lên Form khi khởi chạy giao diện này.
    public void displayFirstItemDate() {
        List<ChuyenDe> listcd = cdd.selectAll();
        if (!listcd.isEmpty()) {
            ChuyenDe cd1 = listcd.get(0);
            txt_maChuyenDe.setText(cd1.getMaCD());
            txt_tenChuyenDe.setText(cd1.getTenCD());
            txt_thoiLuong.setText(String.valueOf(cd1.getThoiLuong()));
            txt_hocPhi.setText(String.valueOf(cd1.getHocPhi()));
            lbl_avatar.setIcon(Ximage.getImageIcon("logos", cd1.getHinh()));
            ta_moTa.setText(cd1.getMoTa());
        } else {
            MsgBox.alter(this, "Nhân viên bỏ đi chơi hết rồi!!");
        }
    }

    //Fill đối tượng lên form dựa vào các nút next/prev/...
    public void fillObjectToFormByNext_Prev(int selectedRow) {
        boolean isEmpty = this.tbl_danhSachChuyenDe.getRowCount() == 0;
        btn_prev.setEnabled(!isEmpty);
        btn_next.setEnabled(!isEmpty);
        btn_first.setEnabled(!isEmpty);
        btn_end.setEnabled(!isEmpty);
        //dựa vào vị trí selectedRow();
        List<ChuyenDe> listcd = cdd.selectAll();
        if (!listcd.isEmpty()) {
            ChuyenDe cd1 = listcd.get(selectedRow);
            txt_maChuyenDe.setText(cd1.getMaCD());
            txt_tenChuyenDe.setText(cd1.getTenCD());
            txt_thoiLuong.setText(String.valueOf(cd1.getThoiLuong()));
            txt_hocPhi.setText(String.valueOf(cd1.getHocPhi()));
            ta_moTa.setText(cd1.getMoTa());
            //Chek trường hợp nó lấy ảnh ở nguồn nào.
            try {
                lbl_avatar.setIcon(Ximage.getImageIcon("logos", cd1.getHinh()));
            } catch (Exception e) {
                System.out.println("ko tìm thấy ảnh ở Folder Logos. Chắc ở Image r =))");
                lbl_avatar.setIcon(Ximage.getImageIcon("Image", cd1.getHinh()));
            }
        } else {
            MsgBox.alter(this, "Nhân viên bỏ đi chơi hết rồi!!");
        }
    }

    public void next() {
        int rowSelected = tbl_danhSachChuyenDe.getSelectedRow();
        int rowCount = tbl_danhSachChuyenDe.getRowCount();

        rowSelected = (rowSelected == -1) ? 0 : (rowSelected == rowCount - 1) ? 0 : rowSelected + 1;
        this.tbl_danhSachChuyenDe.setRowSelectionInterval(rowSelected, rowSelected);
        fillObjectToFormByNext_Prev(rowSelected);
    }

    public void prev() {
        int rowSelected = tbl_danhSachChuyenDe.getSelectedRow(); //0
        int rowCount = tbl_danhSachChuyenDe.getRowCount(); //4
        System.out.println(rowSelected);
        rowSelected = (rowSelected == -1) ? 0 : (rowSelected == 0) ? rowCount - 1 : rowSelected - 1;
        this.tbl_danhSachChuyenDe.setRowSelectionInterval(rowSelected, rowSelected);
        fillObjectToFormByNext_Prev(rowSelected);
    }

    public void first() {
        int rowSelected = tbl_danhSachChuyenDe.getSelectedRow();
        int rowCount = tbl_danhSachChuyenDe.getRowCount();
        rowSelected = (rowSelected == -1) ? 0 : 0; // Đặt dòng được chọn thành dòng đầu tiên
        tbl_danhSachChuyenDe.setRowSelectionInterval(rowSelected, rowSelected);
        fillObjectToFormByNext_Prev(rowSelected);
    }

    public void end() {
        int rowSelected = tbl_danhSachChuyenDe.getSelectedRow();
        int rowCount = tbl_danhSachChuyenDe.getRowCount();
        rowSelected = (rowSelected == -1) ? rowCount - 1 : rowCount - 1; // Đặt dòng được chọn thành dòng cuối cùng
        tbl_danhSachChuyenDe.setRowSelectionInterval(rowSelected, rowSelected);
        fillObjectToFormByNext_Prev(rowSelected);
    }

    private void Clear() {
        //vô hiệu hóa trạng thái hoạt động nút Sửa/Xóa
        //thiết lập trạng thái hoạt động cho nút Thêm
        setButtonsEnabled(false);
        //
        txt_maChuyenDe.setText("");
        txt_maChuyenDe.setBackground(null);
        //
        txt_tenChuyenDe.setText("");
        txt_tenChuyenDe.setBackground(null);
        //
        txt_thoiLuong.setText("");
        txt_thoiLuong.setBackground(null);
        //
        txt_hocPhi.setText("");
        txt_hocPhi.setBackground(null);
        //
        lbl_avatar.setIcon(null);
        lbl_avatar.setText("Vui lòng chọn ảnh!!");
        ta_moTa.setText("");
    }

    public void setButtonsEnabled(boolean enable) {
        btn_sua.setEnabled(enable);
        btn_xoa.setEnabled(enable);
        btn_them.setEnabled(!enable);
    }

    //Update theo MaCD ở Form nếu thỏa mãn hết đk Validate
    private void update() {
        ChuyenDe cdUpdate = new ChuyenDe();
        cdUpdate.setMaCD(txt_maChuyenDe.getText());
        cdUpdate.setTenCD(txt_tenChuyenDe.getText());
        cdUpdate.setThoiLuong(Integer.parseInt(txt_thoiLuong.getText()));
        cdUpdate.setHocPhi(Double.parseDouble(txt_hocPhi.getText()));
        cdUpdate.setMoTa(ta_moTa.getText());

        //Cần lấy cái đoạn cuối .png/.jpg của nó.
        Icon icon = lbl_avatar.getIcon();
        String url = String.valueOf(icon);
        File file = new File(url);
        cdUpdate.setHinh(file.getName());
        //Thực hiện update
        cdd.update(cdUpdate);
        MsgBox.alter(this, "Update CD : " + txt_maChuyenDe.getText() + " thành công!!");
    }

    //Nếu sai gì là false còn đúng hết r là true
/*Check
    1.Điền đủ form
    2.ThoiLuong/HocPhi phải là số.
    3.MaCD Phải có trog dữ liệu
     */
    public boolean checkValidate() {
        //Bắt buộc điền đầy đủ Form
        String maCD = txt_maChuyenDe.getText();
        String tenCD = txt_tenChuyenDe.getText();
        String thoiLuongStr = String.valueOf(txt_thoiLuong.getText());
        String hocPhiStr = String.valueOf(txt_hocPhi.getText());
        Icon iconAvatar = lbl_avatar.getIcon();
        //Check trống.      
        if (maCD.isEmpty() || tenCD.isEmpty() || thoiLuongStr.isEmpty() || hocPhiStr.isEmpty() || iconAvatar == null) {
            if (maCD.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu điền MaCD");
                txt_maChuyenDe.requestFocus();
                txt_maChuyenDe.setBackground(Color.YELLOW);
            } else if (tenCD.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu điền tenCD");
                txt_maChuyenDe.setBackground(null);
                txt_tenChuyenDe.requestFocus();
                txt_tenChuyenDe.setBackground(Color.YELLOW);
            } else if (thoiLuongStr.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu điền thoiLuong");
                txt_tenChuyenDe.setBackground(null);
                txt_thoiLuong.requestFocus();
                txt_thoiLuong.setBackground(Color.YELLOW);
            } else if (hocPhiStr.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu điền hocPhi");
                txt_thoiLuong.setBackground(null);
                txt_hocPhi.requestFocus();
                txt_hocPhi.setBackground(Color.YELLOW);
            } else if (iconAvatar == null) {
                MsgBox.alter(this, "Yêu cầu chọn logo chuyên đề");
                txt_hocPhi.setBackground(null);
            }
            return false;
        }
        //Đúng thời lượng là int và học phí là Double. Và cả 2 không thể < 0.
        try {
            int thoiLuongInt = Integer.parseInt(txt_thoiLuong.getText());
            Double hocPhiDou = Double.parseDouble(txt_hocPhi.getText());
            //Check nhỏ hơn 0
            if (thoiLuongInt < 0 || hocPhiDou < 0) {
                MsgBox.alter(this, "Thời lượng và học phí không được âm");
                return false;
            }
        } catch (NumberFormatException e) {
            MsgBox.alter(this, "Thời lượng và học phí phải là số nhé =))");
            return false;
        }

//        if (!checkMaTonTai(maCD)){
//            MsgBox.alter(this, "MaCD : " + maCD + " không tồn tại.Yêu cầu nhập lại");
//            MsgBox.alter(this, "Thao tác thất bại");
//            return false;
//        }
        return true;
    }

    //Dựa vào tham số MaCD mà xem chuyên đề này đã tồn tại hay chưa
    //Nếu tồn tại r là true. Còn chưa là false.
    public boolean MaTonTaiTrongBangCD(String maCD) {
        ChuyenDe cd1 = cdd.selectById(maCD);
        if (cd1 == null) {
            MsgBox.alter(this, "Mã CD : " + maCD + " không tồn tại");
            return false; //False là trường hợp dành cho Thêm CD
        }
        MsgBox.alter(this, "Mã CD : " + maCD + " tồn tại");
        return true; //Trường hơp dành cho sửa và xóa.
    }

    //Thiết lập avatar cho Chuyên đề.
    private void ThietLapAvatar() {
        JFileChooser jfc = new JFileChooser("D:\\FPT_Semester_4_Block1\\DAM(SOF204)_SD18323\\FilesJavaASM\\JavaApplication33\\src\\com\\edusys\\icon\\");
        int result = jfc.showOpenDialog(null);
        switch (result) {
            case JFileChooser.APPROVE_OPTION -> {
                File file = jfc.getSelectedFile();
                String filePath = file.getAbsolutePath();
                ImageIcon imgIcon = null;
//contains dùng chek trog chuỗi cha ( filePath ) có chuỗi con đó ko ( logos ).
//Để xác định thư mục đc chọn.
                if (filePath.contains("logos")) {
                    imgIcon = Ximage.getImageIcon("logos", String.valueOf(file.getName()));
                } else if (filePath.contains("Image")) {
                    imgIcon = Ximage.getImageIcon("Image", String.valueOf(file.getName()));
                } else {
                    MsgBox.alter(this, "Thư mục ko hợp lệ");
                    return;
                }
                lbl_avatar.setText(null);
                lbl_avatar.setIcon(imgIcon);
                MsgBox.alter(this, "Thiết lập Icon hoàn thành");
            }
            case JFileChooser.CANCEL_OPTION ->
                MsgBox.alter(this, "Hủy thiết lập ảnh");
            default ->
                MsgBox.alter(this, "Lỗi lấy imgIcon");
        }
    }

    //Xóa chuyên đề
    private void delete() {
        cdd.delete(txt_maChuyenDe.getText());
        MsgBox.alter(this, "Xóa thành công");
    }

    //B1: check nó có tồn tại ko để xóa
    //B2: sau khi tồn tại chek xem có trang bảng Khóa học ko
    //Nếu tồn tại thì xóa là sai r. Còn ko thì là đúng và xóa thành công.
    public boolean checkRangBuoc() {
        String maCD = txt_maChuyenDe.getText();
        //chek mã tồn tại trog bảng CD ko.Tồn tại trả về là true
        if (MaTonTaiTrongBangCD(maCD)) {
            //chek MaCD tồn tại trog bảng Khóa.Học
            KhoaHoc kh = khd.select_MaCD_By_Id(maCD);
            if (kh != null) {
                MsgBox.alter(this, "Xóa thất bại do " + maCD + " đang triển khai khóa học!");
                return false;
            }
        } else {
            MsgBox.alter(this, "Mã CD : " + maCD + "không tồn tại trog bảng CD. Xóa thất bại =))");
            return false;
        }
        return true;
    }

    private void themChuyenDe() {
        ChuyenDe cdInsert = new ChuyenDe();
        cdInsert.setMaCD(txt_maChuyenDe.getText());
        cdInsert.setTenCD(txt_tenChuyenDe.getText());
        cdInsert.setThoiLuong(Integer.valueOf(txt_thoiLuong.getText()));
        cdInsert.setHocPhi(Double.parseDouble(txt_hocPhi.getText()));
        cdInsert.setMoTa(ta_moTa.getText());

        //Cần lấy cái đoạn cuối .png/.jpg của nó.
        Icon icon = lbl_avatar.getIcon();
        String url = String.valueOf(icon); //Ép kiểu đoạn icon ra chuỗi
        File file = new File(url);  //Từ chuổi làm tham số tạo ra File
        //--> Mục đích là tạo File từ Icon xog dùng p.thưc getName() của File để lấy đoạn cuối.
        cdInsert.setHinh(file.getName());

        cdd.insert(cdInsert);
        MsgBox.alter(this, "Thêm thành công!");

    }

}//end
