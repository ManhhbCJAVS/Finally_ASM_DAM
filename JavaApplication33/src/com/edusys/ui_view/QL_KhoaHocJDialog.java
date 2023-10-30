package com.edusys.ui_view;

import com.edusys.DAO.BChuyenDeDao;
import com.edusys.DAO.CKhoaHocDao;
import com.edusys.model_entity.ChuyenDe;
import com.edusys.model_entity.KhoaHoc;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.MsgBox;
import com.edusys.utility_helper.XDate;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.print.PrintException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class QL_KhoaHocJDialog extends javax.swing.JDialog {

    CKhoaHocDao khd = new CKhoaHocDao();
    BChuyenDeDao cdd = new BChuyenDeDao();
    KhoaHoc kh = new KhoaHoc();
    DefaultTableModel dtm;
    DefaultComboBoxModel cbbMaCD_Str;
    DefaultComboBoxModel cbb_tenChuyenTen_Str;
    int selectedRow;

    public QL_KhoaHocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        //Dựa vào MaCD mà Fill danh sách khóa học tương ứng lên bảng.  ( fillToTable() )
        //Fill dữ liệu đầu lên Form ( fillFirstObjectToForm() )
        //Event : Double-Click vào bảng --> Đối tượng click đc hiện thị lên From. ( showDetailsOnDoubleClick() )
        //Check validation trông 
        //Check validation đúng kiểu dữ liệu 
//        System.out.println(tbl_danhSachKhoaHoc.getSelectedRow()); ( -1 ) -->  
        //Khi khởi tạo thì giá trị của chỉ selected là -1
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cbb_MaCD = new javax.swing.JComboBox<>();
        TabbedPane = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_hocPhi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nguoiTao = new javax.swing.JTextField();
        txt_ngayKhaiGiang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_thoiLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ngayTao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nham = new javax.swing.JScrollPane();
        ta_ghiChu = new javax.swing.JTextArea();
        cbb_tenChuyenDe = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_end = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_HocVienKhac = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_danhSachKhoaHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys QLKH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("QUẢN LÝ KHÓA HỌC");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mã Chuyên Đề", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        cbb_MaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_MaCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbb_MaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cbb_MaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setEnabled(false);

        jLabel2.setText("Tên Chuyên Đề");

        jLabel3.setText("Học Phí");

        txt_hocPhi.setEnabled(false);

        jLabel4.setText("Người Tạo");

        txt_nguoiTao.setEnabled(false);

        jLabel5.setText("Ngày Khai Giảng");

        jLabel6.setText("Thời Lượng  ( Giờ  )");

        txt_thoiLuong.setEnabled(false);

        jLabel7.setText("Ngày Tạo");

        txt_ngayTao.setEnabled(false);

        jLabel8.setText("Ghi Chú");

        ta_ghiChu.setColumns(20);
        ta_ghiChu.setRows(5);
        nham.setViewportView(ta_ghiChu);

        cbb_tenChuyenDe.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nham)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(174, 174, 174))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbb_tenChuyenDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_hocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_ngayKhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_tenChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_hocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ngayKhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nham, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

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

        btn_HocVienKhac.setText("Học Viên");
        btn_HocVienKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HocVienKhacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(btn_HocVienKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                    .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_HocVienKhac)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_them)
                        .addComponent(btn_sua)
                        .addComponent(btn_xoa)
                        .addComponent(btn_moi)
                        .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        TabbedPane.addTab("CẬP NHẬT", tab1);

        tbl_danhSachKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên CĐ", "MãNV", "Ngày Tạo", "Học Phí", "Thời Lượng", "Ghi Chú", "Ngày Khai Giảng"
            }
        ));
        tbl_danhSachKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_danhSachKhoaHocMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_danhSachKhoaHoc);

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        TabbedPane.addTab("DANH SÁCH", tab2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        clear();

    }//GEN-LAST:event_btn_moiActionPerformed

    private void btn_HocVienKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HocVienKhacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HocVienKhacActionPerformed
    //Bắt sự kiện khi người dùng chọn một chuyên đề nào đó thì nó sẽ fill khóa học của chuyên đề đó lên bảng
    private void cbb_MaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_MaCDActionPerformed
        fillToTable();
        fillFirstObjectToForm(0);

        if (tbl_danhSachKhoaHoc.getRowCount() == 0 || tbl_danhSachKhoaHoc.getRowCount() == 1) {
            btn_prev.setEnabled(false);
            btn_next.setEnabled(false);
            btn_end.setEnabled(false);
            btn_first.setEnabled(false);
        } else {
            btn_prev.setEnabled(true);
            btn_next.setEnabled(true);
            btn_first.setEnabled(true);
            btn_end.setEnabled(true);
        }

    }//GEN-LAST:event_cbb_MaCDActionPerformed

    private void tbl_danhSachKhoaHocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_danhSachKhoaHocMousePressed
        //Sự kiện khi double-click 2 lần vào Bảng sẽ ra tab1 và hiện thị thông tin đối tượng double-click vòa đó
        if (evt.getClickCount() == 1) {
            this.TabbedPane.setSelectedComponent(tab1); //thiết lập giao diện đc chọn của TabbedPane là tab1
            showDetailsOnDoubleClick();
        }
    }//GEN-LAST:event_tbl_danhSachKhoaHocMousePressed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        //yêu cầu chek trống / định dạng // chek thời gian ngày hợp lệ. Ko cần chek tồn tại MaKH vì nó tự tăng.
        if (MsgBox.confirm(this, "Bạn muốn them?")) {
            if (checkValidateNull() && checkValidateFormat() && checkThoiGianNgayNhapHopLe()) {
                //Sau khi chek xog lấy dữ liệu từ Form thành một đối tượng.
                KhoaHoc kh1 = getKHByForm();
                khd.insert(kh1);
                MsgBox.alter(this, "Thêm khóa học thành công ");
                fillToTable();
            }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        //Sửa thì chỉ có sửa ngày khai giảng và ghi chú.
        if (MsgBox.confirm(this, "Bạn muốn sửa?")) {
            if (checkValidateNull() && checkValidateFormat() && checkThoiGianNgayNhapHopLe()) {
                KhoaHoc kh1 = getKHByForm();
                khd.update(kh1);
                MsgBox.alter(this, "Sửa khóa học thành công");
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if (MsgBox.confirm(this, "Bạn muốn xóa")) {
            if (this.tbl_danhSachKhoaHoc.getRowCount() == 0) {
                MsgBox.alter(this, "Ko còn dòng nào để xóa");
            } else {
                Integer maKHInteger = getKHByForm().getMaKH();
                if (maKHInteger != null) {
                    khd.delete(maKHInteger.toString());
                    fillToTable();
                    MsgBox.alter(this, "Xóa thành công");
                }
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MsgBox.alter(this, "Cửa số QLKH đã đc đóng");
    }//GEN-LAST:event_formWindowClosed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        setButtonsEnabled(true);
        setTextFieldEnabled(false);
        selectedPrevRow();
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        setButtonsEnabled(true);
        setTextFieldEnabled(false);
        selectedNextRow();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        setButtonsEnabled(true);
        setTextFieldEnabled(false);
        selectedFirst();
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_endActionPerformed
        setButtonsEnabled(true);
        setTextFieldEnabled(false);
        selectedEnd();
    }//GEN-LAST:event_btn_endActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QL_KhoaHocJDialog dialog = new QL_KhoaHocJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_HocVienKhac;
    private javax.swing.JButton btn_end;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_MaCD;
    private javax.swing.JComboBox<String> cbb_tenChuyenDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane nham;
    private javax.swing.JTextArea ta_ghiChu;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JTable tbl_danhSachKhoaHoc;
    private javax.swing.JTextField txt_hocPhi;
    private javax.swing.JTextField txt_ngayKhaiGiang;
    private javax.swing.JTextField txt_ngayTao;
    private javax.swing.JTextField txt_nguoiTao;
    private javax.swing.JTextField txt_thoiLuong;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        cbbMaCD_Str = (DefaultComboBoxModel) cbb_MaCD.getModel();
        //Duyệt từng Mã CD trog bảng Chuyên Đề cho vào ComboBox Mã Chuyên Đề
        List<ChuyenDe> listCD = cdd.selectAll(); //Lấy tất cả đối tượng trong bảng CĐ.
        for (ChuyenDe cd : listCD) {
            //Với từng đối tượng CĐ lầy MaCD của nó thêm vào ComboBox cho đến hết.
            cbbMaCD_Str.addElement(String.valueOf(cd.getMaCD()));
        }
        //Duyệt từng tên chuyên đề trog bảng Chuyên Đề để cho vào ComboBox tên chuyên đề
        cbb_tenChuyenTen_Str = (DefaultComboBoxModel) cbb_tenChuyenDe.getModel();
        for (ChuyenDe cd : listCD) {
            cbb_tenChuyenTen_Str.addElement(String.valueOf(cd.getTenCD()));
        }
        fillToTable();
        fillFirstObjectToForm(0);
    }

    //Fill dữ liệu từ csdl lên bảng theo MaCD 
    private void fillToTable() {
        dtm = (DefaultTableModel) this.tbl_danhSachKhoaHoc.getModel();
        dtm.setRowCount(0); //Xóa tất cả dữ liệu trên bảng.
        String MaCD = (String) cbb_MaCD.getSelectedItem(); //Lấy MaCD đag chọn trên ComboBox.
        List<KhoaHoc> listKH = khd.selectAllByMaCD(MaCD); // Truy vấn danh sách khóa học theo MaCD
        ChuyenDe cd = cdd.selectById(MaCD); //truy vấn ra một đối tượng truyền đề dựa vào  MaCD
        //Từ đó lấy ra tên Chuyên đề để chèn giá trị vào cột trog bảng. Tại vì bảng khóa học ko có.
        String tenCD = cd.getTenCD();
        //chèn danh sách đó lên bảng
        for (KhoaHoc kh1 : listKH) {
            Object[] row = new Object[]{
                kh1.getMaKH(),
                tenCD,
                kh1.getMaNV(),
                kh1.getNgayTao(),
                String.format("%.1f", kh1.getHocPhi()), //Thiết lập lấy 1 giá trị sau dấu chấm.
                kh1.getThoiLuong(),
                kh1.getGhiChu(),
                kh1.getNgayKG()
            };
            dtm.addRow(row);
        }
    }

    //đổ dữ liệu đầu tiên trên bảng lên Form khi khởi chạy giao diện
    //Khi chọn chuyên đề khác để đổ dữ liệu trên bảng thì cx nên gọi p.t này để đổi dữ liệu fill lên Form
    public void fillFirstObjectToForm(int selectedRow) {
        //Bắt exception khi trên csdl ko còn đối tường nào thì ko fill nx.
        if (this.tbl_danhSachKhoaHoc.getRowCount() != 0) {
            cbb_tenChuyenDe.setSelectedItem(tbl_danhSachKhoaHoc.getValueAt(selectedRow, 1));
            txt_hocPhi.setText(String.valueOf(tbl_danhSachKhoaHoc.getValueAt(selectedRow, 4)));
            txt_nguoiTao.setText(String.valueOf(tbl_danhSachKhoaHoc.getValueAt(selectedRow, 2)));
            txt_ngayKhaiGiang.setText(String.valueOf(tbl_danhSachKhoaHoc.getValueAt(selectedRow, 7)));
            txt_thoiLuong.setText(String.valueOf(tbl_danhSachKhoaHoc.getValueAt(selectedRow, 5)));
            txt_ngayTao.setText(String.valueOf(tbl_danhSachKhoaHoc.getValueAt(selectedRow, 3)));
            ta_ghiChu.setText(String.valueOf(tbl_danhSachKhoaHoc.getValueAt(selectedRow, 6)));
        } else {
            txt_hocPhi.setText(null);
            txt_thoiLuong.setText(null);
            txt_ngayTao.setText(null);
            txt_nguoiTao.setText(null);
            txt_ngayKhaiGiang.setText(null);
            ta_ghiChu.setText(null);
        }
    }

    public void showDetailsOnDoubleClick() {
        this.selectedRow = this.tbl_danhSachKhoaHoc.getSelectedRow();
        fillFirstObjectToForm(selectedRow);
    }

    //Chek gồm chek trống Khi thêm : Chek trống tất cả ( học phí , thời lượng ) 
    //chek định dạng khi thêm và sửa ( thoi luong, học phí , ngaykg  )
    //Sau khi thỏa mãn đk thì lấy dối tượng từ Form. 
    public boolean checkValidateNull() {
        String hocPhi = txt_hocPhi.getText();
        String thoiLuong = txt_thoiLuong.getText();
        String ngayKGString = txt_ngayKhaiGiang.getText();
//        System.out.println(ngayKGString);
        if (hocPhi.isEmpty() || thoiLuong.isEmpty() || ngayKGString.isEmpty()) {
            if (hocPhi.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập học phí");
                txt_hocPhi.setBackground(Color.YELLOW);
                txt_hocPhi.requestFocus();
            } else if (thoiLuong.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập thời lượng");
                txt_thoiLuong.setBackground(Color.YELLOW);
                txt_thoiLuong.requestFocus();
            } else if (ngayKGString.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập ngày khai giảng");
                txt_ngayKhaiGiang.setBackground(Color.YELLOW);
                txt_ngayKhaiGiang.requestFocus();
            }
            return false;
        }
        return true;
    }

    //chek định dạng số , ngày khai giảng bằng cách ép kiểu sang số , ngày để bắt ngoại lệ
    //Xog chek định dạng hocPhi , thoiLuong > 0
    public boolean checkValidateFormat() {
        //Định dạng khuông mẫu chung để chuỗi chuyển theo. ( yyyy/MM/dd ) 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try { //ép kiểu số
            Double hocPhiDouble = Double.parseDouble(txt_hocPhi.getText());
            int thoiLuongInteger = Integer.parseInt(txt_thoiLuong.getText());
            if (hocPhiDouble < 0 || thoiLuongInteger < 0) {
                MsgBox.alter(this, "Yêu cầu học phí / thời lượng > 0 ");
                return false;
            }
        } catch (NumberFormatException e) {
            MsgBox.alter(this, "Học phí/thời lượng phải là số.Thêm thất bại ");
            return false;
        }
        try { //ép kiểu ngày 
            txt_hocPhi.setBackground(null);
            txt_thoiLuong.setBackground(null);
            //kiểm tra định dạnh ngày trước khi phân tích chuỗi thành đối tượng. 
            String ngayKG = txt_ngayKhaiGiang.getText();
            if (!ngayKG.matches("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$")) {
                MsgBox.alter(this, "Ngày khai giảng phải hợp lý và có định dạng là 'yyyy-MM-dd' ");
                return false;
            }
            //chuyển chuỗi thành định dạng Date
            Date date = dateFormat.parse(txt_ngayKhaiGiang.getText());

            /*
                In ra ngày với định dạng khác ( yyyy-MM-dd ) 
                SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = outputFormat.format(date);
             */
        } catch (ParseException e) {
            MsgBox.alter(this, "Lỗi ép kiểu ngày");
            return false;
        }
        txt_ngayKhaiGiang.setBackground(null);
        return true;
    }

    //Ngày khai giảng > ngày tạo : 5 ngày.
    public boolean checkThoiGianNgayNhapHopLe() {
        //ép kiểu String --> Date xog lấy thời gian của nó.
        long currentTime = XDate.toDate(txt_ngayKhaiGiang.getText(), "yyyy-MM-dd").getTime();
        //long timeNgayTao = XDate.toDate(txt_ngayTao.getText(), "yyyy-MM-dd").getTime() + ( 5 * 24 * 60 * 60 * 1000 );//5days
        Date DateNgayTaoThem5Days = XDate.addDays(XDate.toDate(txt_ngayTao.getText(), "yyyy-MM-dd"), 5);
        Long timeNgayTao = DateNgayTaoThem5Days.getTime();
        if (currentTime < timeNgayTao) {
            MsgBox.alter(this, "Ngày khai giảng phải cách ngày tạo tối đa 5days =)) ");
            return false;
        }
        return true;
    }

    public KhoaHoc getKHByForm() {
        KhoaHoc kh1 = new KhoaHoc();
        kh1.setMaKH(getKHCurrently());
        kh1.setMaCD(String.valueOf(cbbMaCD_Str.getElementAt(0)));
        kh1.setHocPhi(Double.parseDouble(txt_hocPhi.getText()));
        kh1.setThoiLuong(Integer.parseInt(txt_thoiLuong.getText()));
        kh1.setNgayKG(XDate.toDate(txt_ngayKhaiGiang.getText(), "yyyy-MM-dd"));
        kh1.setMaNV(Auth.user.getMaNV());
        kh1.setGhiChu(ta_ghiChu.getText());
        System.out.println(kh1.getMaCD());
        return kh1;
    }

    public int getKHCurrently() {
        int rowSelected = this.tbl_danhSachKhoaHoc.getSelectedRow();
        if (rowSelected == -1) {
            int maKH = Integer.valueOf(tbl_danhSachKhoaHoc.getValueAt(0, 0).toString());
            return maKH;
        } else {
            int maKH = Integer.valueOf(tbl_danhSachKhoaHoc.getValueAt(rowSelected, 0).toString());
            return maKH;
        }
        //if( rowSelected != -1 )
    }

    //Xóa sạch Form để thêm mới
    private void clear() {
        txt_hocPhi.setText(null);
        txt_thoiLuong.setText(null);
        txt_nguoiTao.setText(null);
        txt_ngayKhaiGiang.setText(null);
        //Vô hiệu hóa 2 nút sửa/xóa và mở hoạt động cho nút thêm
        setButtonsEnabled(false);
        //thiết lập hoạt động cho trường Học phí , thời lượng 
        txt_hocPhi.setEnabled(true);
        txt_thoiLuong.setEnabled(true);
        // thiết lập lại background cho các trường 
        txt_ngayKhaiGiang.setBackground(null);
        txt_thoiLuong.setBackground(null);
        txt_hocPhi.setBackground(null);
    }

    public void setButtonsEnabled(boolean enable) {
        btn_sua.setEnabled(enable);
        btn_xoa.setEnabled(enable);
        btn_them.setEnabled(!enable);
    }
    public void setTextFieldEnabled(boolean enable){
        //Khi nhấn mới thì txtField cần enabled bị hủy r cần thiết lập lại
        txt_hocPhi.setEnabled(enable);
        txt_thoiLuong.setEnabled(enable);
    }

    public void selectedNextRow() {
        int rowSelected = tbl_danhSachKhoaHoc.getSelectedRow();
        int rowCount = tbl_danhSachKhoaHoc.getRowCount();
        rowSelected = (rowSelected == -1) ? 0 : (rowSelected == rowCount - 1) ? 0 : rowSelected + 1;
        tbl_danhSachKhoaHoc.setRowSelectionInterval(rowSelected, rowSelected);
        fillFirstObjectToForm(rowSelected);
    }

    public void selectedPrevRow() {
        int rowSelected = tbl_danhSachKhoaHoc.getSelectedRow();
        int rowCount = tbl_danhSachKhoaHoc.getRowCount();
        rowSelected = (rowSelected == -1) ? 0 : (rowSelected == 0) ? rowCount - 1 : rowSelected - 1;
        tbl_danhSachKhoaHoc.setRowSelectionInterval(rowSelected, rowSelected);
        fillFirstObjectToForm(rowSelected);
    }

    public void selectedFirst() {
        int rowSelected = tbl_danhSachKhoaHoc.getSelectedRow();
        int rowCount = tbl_danhSachKhoaHoc.getRowCount();
        rowSelected = (rowSelected == -1) ? 0 : 0; // Đặt dòng được chọn thành dòng đầu tiên
        tbl_danhSachKhoaHoc.setRowSelectionInterval(rowSelected, rowSelected);
        fillFirstObjectToForm(rowSelected);
    }

    public void selectedEnd() {
        int rowSelected = tbl_danhSachKhoaHoc.getSelectedRow();
        int rowCount = tbl_danhSachKhoaHoc.getRowCount();
        rowSelected = (rowSelected == -1) ? rowCount - 1 : rowCount - 1; // Đặt dòng được chọn thành dòng cuối cùng
        tbl_danhSachKhoaHoc.setRowSelectionInterval(rowSelected, rowSelected);
        fillFirstObjectToForm(rowSelected);

    }

}//end
