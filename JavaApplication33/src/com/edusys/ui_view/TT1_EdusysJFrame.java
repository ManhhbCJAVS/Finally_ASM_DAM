package com.edusys.ui_view;

import com.edusys.model_entity.HocVien;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.MsgBox;
import com.edusys.utility_helper.Ximage;
import java.util.Calendar;
import javax.swing.JFrame;

public class TT1_EdusysJFrame extends javax.swing.JFrame implements Runnable {

    public TT1_EdusysJFrame() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator8 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btn_dangXuat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_ketThuc = new javax.swing.JButton();
        btn_chuyenDe = new javax.swing.JButton();
        btn_nguoiHoc = new javax.swing.JButton();
        btn_khoaHoc = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_huongDan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_qldt = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_mainIcon = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_heThong = new javax.swing.JMenu();
        mni_dangNhap = new javax.swing.JMenuItem();
        mni_dangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mni_doiMatKhau = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mni_ketThuc = new javax.swing.JMenuItem();
        mnu_quanLy = new javax.swing.JMenu();
        mni_chuyenDe = new javax.swing.JMenuItem();
        mni_khoaHoc = new javax.swing.JMenuItem();
        mni_nguoiHoc = new javax.swing.JMenuItem();
        mni_hocVien = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mni_nhanVien = new javax.swing.JMenuItem();
        mnu_thongKe = new javax.swing.JMenu();
        mni_nguoiHocTungNam = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mni_bangDiemKhoaHoc = new javax.swing.JMenuItem();
        mni_diemTungKhoaHoc = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mni_doanhThuTungChuyenDe = new javax.swing.JMenuItem();
        mnu_troGiup = new javax.swing.JMenu();
        mni_huongDanSuDung = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mni_gioiThieuSanPham = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setRequestFocusEnabled(false);

        btn_dangXuat.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_dangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Exit.png"))); // NOI18N
        btn_dangXuat.setText("Đăng Xuất");
        btn_dangXuat.setFocusable(false);
        btn_dangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dangXuat.setMargin(new java.awt.Insets(2, 15, 3, 15));
        btn_dangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_dangXuat);
        jToolBar1.add(jSeparator1);

        btn_ketThuc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_ketThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Stop.png"))); // NOI18N
        btn_ketThuc.setText("Kết Thúc");
        btn_ketThuc.setFocusable(false);
        btn_ketThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ketThuc.setMargin(new java.awt.Insets(2, 15, 3, 15));
        btn_ketThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ketThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ketThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_ketThuc);

        btn_chuyenDe.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_chuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Lists.png"))); // NOI18N
        btn_chuyenDe.setText("Chuyên Đề");
        btn_chuyenDe.setFocusable(false);
        btn_chuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_chuyenDe.setMargin(new java.awt.Insets(2, 15, 3, 15));
        btn_chuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_chuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_chuyenDe);

        btn_nguoiHoc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_nguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Conference.png"))); // NOI18N
        btn_nguoiHoc.setText("Người Học");
        btn_nguoiHoc.setFocusable(false);
        btn_nguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nguoiHoc.setMargin(new java.awt.Insets(2, 15, 3, 15));
        btn_nguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nguoiHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_nguoiHoc);

        btn_khoaHoc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_khoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Certificate.png"))); // NOI18N
        btn_khoaHoc.setText("Khóa Học");
        btn_khoaHoc.setFocusable(false);
        btn_khoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_khoaHoc.setMargin(new java.awt.Insets(2, 15, 3, 15));
        btn_khoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_khoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_khoaHoc);
        jToolBar1.add(jSeparator2);

        btn_huongDan.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_huongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Globe.png"))); // NOI18N
        btn_huongDan.setText("Hướng Dẫn");
        btn_huongDan.setFocusable(false);
        btn_huongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_huongDan.setMargin(new java.awt.Insets(2, 15, 3, 15));
        btn_huongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_huongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_huongDan);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_qldt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_qldt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Info.png"))); // NOI18N
        lbl_qldt.setText("Hệ quản lý đào tạo");
        lbl_qldt.setIconTextGap(7);

        lbl_time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Alarm.png"))); // NOI18N
        lbl_time.setText("11:04:56 AM");
        lbl_time.setIconTextGap(7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_qldt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_qldt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_time))
                .addContainerGap())
        );

        lbl_mainIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/logo.png"))); // NOI18N

        mnu_heThong.setText("Hệ Thống");

        mni_dangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_dangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Key.png"))); // NOI18N
        mni_dangNhap.setText("Đăng Nhập");
        mni_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_dangNhapActionPerformed(evt);
            }
        });
        mnu_heThong.add(mni_dangNhap);

        mni_dangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_dangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Log out.png"))); // NOI18N
        mni_dangXuat.setText("Đăng Xuất");
        mni_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_dangXuatActionPerformed(evt);
            }
        });
        mnu_heThong.add(mni_dangXuat);
        mnu_heThong.add(jSeparator3);

        mni_doiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Refresh.png"))); // NOI18N
        mni_doiMatKhau.setText("Đổi mật khẩu");
        mni_doiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_doiMatKhauActionPerformed(evt);
            }
        });
        mnu_heThong.add(mni_doiMatKhau);
        mnu_heThong.add(jSeparator4);

        mni_ketThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mni_ketThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Stop.png"))); // NOI18N
        mni_ketThuc.setText("Kết thúc");
        mni_ketThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_ketThucActionPerformed(evt);
            }
        });
        mnu_heThong.add(mni_ketThuc);

        jMenuBar1.add(mnu_heThong);

        mnu_quanLy.setText("Quản Lý");

        mni_chuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_chuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/List.png"))); // NOI18N
        mni_chuyenDe.setText("Chuyên Đề");
        mni_chuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_chuyenDeActionPerformed(evt);
            }
        });
        mnu_quanLy.add(mni_chuyenDe);

        mni_khoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_khoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Certificate.png"))); // NOI18N
        mni_khoaHoc.setText("Khóa Học");
        mni_khoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_khoaHocActionPerformed(evt);
            }
        });
        mnu_quanLy.add(mni_khoaHoc);

        mni_nguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_nguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Conference.png"))); // NOI18N
        mni_nguoiHoc.setText("Người Học");
        mni_nguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_nguoiHocActionPerformed(evt);
            }
        });
        mnu_quanLy.add(mni_nguoiHoc);

        mni_hocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_hocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Boy.png"))); // NOI18N
        mni_hocVien.setText("Học Viên");
        mni_hocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_hocVienActionPerformed(evt);
            }
        });
        mnu_quanLy.add(mni_hocVien);
        mnu_quanLy.add(jSeparator9);

        mni_nhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_nhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/User group.png"))); // NOI18N
        mni_nhanVien.setText("Nhân Viên");
        mni_nhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_nhanVienActionPerformed(evt);
            }
        });
        mnu_quanLy.add(mni_nhanVien);

        jMenuBar1.add(mnu_quanLy);

        mnu_thongKe.setText("Thống Kê");

        mni_nguoiHocTungNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Card file.png"))); // NOI18N
        mni_nguoiHocTungNam.setText("Người học từng năm");
        mni_nguoiHocTungNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_nguoiHocTungNamActionPerformed(evt);
            }
        });
        mnu_thongKe.add(mni_nguoiHocTungNam);
        mnu_thongKe.add(jSeparator5);

        mni_bangDiemKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Clien list.png"))); // NOI18N
        mni_bangDiemKhoaHoc.setText("Bảng điểm khóa Học");
        mni_bangDiemKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_bangDiemKhoaHocActionPerformed(evt);
            }
        });
        mnu_thongKe.add(mni_bangDiemKhoaHoc);

        mni_diemTungKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Bar chart.png"))); // NOI18N
        mni_diemTungKhoaHoc.setText("Điểm từng khóa học");
        mni_diemTungKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_diemTungKhoaHocActionPerformed(evt);
            }
        });
        mnu_thongKe.add(mni_diemTungKhoaHoc);
        mnu_thongKe.add(jSeparator6);

        mni_doanhThuTungChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Dollar.png"))); // NOI18N
        mni_doanhThuTungChuyenDe.setText("Doanh thu từng chuyên đề");
        mni_doanhThuTungChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_doanhThuTungChuyenDeActionPerformed(evt);
            }
        });
        mnu_thongKe.add(mni_doanhThuTungChuyenDe);

        jMenuBar1.add(mnu_thongKe);

        mnu_troGiup.setText("Trợ Giúp");

        mni_huongDanSuDung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mni_huongDanSuDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Globe.png"))); // NOI18N
        mni_huongDanSuDung.setText("Hướng dẫn sử dụng");
        mni_huongDanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_huongDanSuDungActionPerformed(evt);
            }
        });
        mnu_troGiup.add(mni_huongDanSuDung);
        mnu_troGiup.add(jSeparator7);

        mni_gioiThieuSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Home.png"))); // NOI18N
        mni_gioiThieuSanPham.setText("Giới Thiệu Sản Phẩm");
        mni_gioiThieuSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_gioiThieuSanPhamActionPerformed(evt);
            }
        });
        mnu_troGiup.add(mni_gioiThieuSanPham);

        jMenuBar1.add(mnu_troGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lbl_mainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_mainIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_ketThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_ketThucActionPerformed
        exit();
    }//GEN-LAST:event_mni_ketThucActionPerformed

    private void mni_doiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_doiMatKhauActionPerformed
        if (Auth.isLogIn()) {
            interface_ChangePassWord();
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để thực hiện chức năng ( đổi mật khẩu ) !!");
        }
    }//GEN-LAST:event_mni_doiMatKhauActionPerformed

    private void mni_chuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_chuyenDeActionPerformed
        if (Auth.isLogIn()) {
            openChuyenDe();
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để thực hiện chức năng ( Chuyên đề ) !!");
        }
    }//GEN-LAST:event_mni_chuyenDeActionPerformed

    private void btn_chuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenDeActionPerformed
        if (Auth.isLogIn()) {
            openChuyenDe();
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để thực hiện chức năng ( Chuyên đề ) !!");
        }
    }//GEN-LAST:event_btn_chuyenDeActionPerformed

    private void mni_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_dangNhapActionPerformed
        openDangNhap();
    }//GEN-LAST:event_mni_dangNhapActionPerformed

    private void mni_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_dangXuatActionPerformed
        if (Auth.isLogIn()) {
            logoff();
        } else {
            MsgBox.alter(this, "Chưa đăng nhập");
        }
    }//GEN-LAST:event_mni_dangXuatActionPerformed

    private void btn_nguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nguoiHocActionPerformed
        if (Auth.isLogIn()) {
            openNguoiHoc(); //Người Học
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để sử dụng chức năng Người Học");
        }
    }//GEN-LAST:event_btn_nguoiHocActionPerformed

    private void btn_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangXuatActionPerformed
        if (Auth.isLogIn()) {
            logoff();
        } else {
            MsgBox.alter(this, "Chưa đăng nhập.");
        }
    }//GEN-LAST:event_btn_dangXuatActionPerformed

    private void mni_khoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_khoaHocActionPerformed
        if (Auth.isLogIn()) {
            openKhoaHoc(); //Khóa Học
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để sử chức năng Khóa Học");
        }
    }//GEN-LAST:event_mni_khoaHocActionPerformed

    private void mni_nguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_nguoiHocActionPerformed
        if (Auth.isLogIn()) {
            openNguoiHoc(); //Người Học
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để sử dụng chức năng Người Học");
        }
    }//GEN-LAST:event_mni_nguoiHocActionPerformed

    private void mni_hocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_hocVienActionPerformed
        if (Auth.isLogIn()) {
            openHocVien(); //Học Viên
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để sử dụng chức năng Học Viên");
        }
    }//GEN-LAST:event_mni_hocVienActionPerformed

    private void mni_nhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_nhanVienActionPerformed
        if (Auth.isLogIn()) {
            if (Auth.isManager()) {
                openNhanVien();
            } else {
                MsgBox.alter(this, "Bạn ko có quyền vào giao diện này.");
            }
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để sử dụng chức Nhân Viên");
        }
    }//GEN-LAST:event_mni_nhanVienActionPerformed

    private void btn_ketThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ketThucActionPerformed
        exit();
    }//GEN-LAST:event_btn_ketThucActionPerformed

    private void btn_khoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoaHocActionPerformed
        if (Auth.isLogIn()) {
            openKhoaHoc(); //Khóa Học
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để sử chức năng Khóa Học");
        }
    }//GEN-LAST:event_btn_khoaHocActionPerformed

    private void btn_huongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huongDanActionPerformed
        //Ko rõ. 
        MsgBox.alter(this, "Đang bảo trì");
    }//GEN-LAST:event_btn_huongDanActionPerformed

    private void mni_huongDanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_huongDanSuDungActionPerformed
        MsgBox.alter(this, "Đang bảo trì");
    }//GEN-LAST:event_mni_huongDanSuDungActionPerformed

    private void mni_nguoiHocTungNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_nguoiHocTungNamActionPerformed
        openThongKe(0); //Các Pane trong JPabbedPane thì Pane đầu có vị trí là 0.
    }//GEN-LAST:event_mni_nguoiHocTungNamActionPerformed

    private void mni_bangDiemKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_bangDiemKhoaHocActionPerformed
        openThongKe(1);
    }//GEN-LAST:event_mni_bangDiemKhoaHocActionPerformed

    private void mni_diemTungKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_diemTungKhoaHocActionPerformed
        openThongKe(2);
    }//GEN-LAST:event_mni_diemTungKhoaHocActionPerformed

    private void mni_doanhThuTungChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_doanhThuTungChuyenDeActionPerformed
        openThongKe(3);
    }//GEN-LAST:event_mni_doanhThuTungChuyenDeActionPerformed

    private void mni_gioiThieuSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_gioiThieuSanPhamActionPerformed
        MsgBox.alter(this, "Chưa có SP nào. Đang bảo trì");
    }//GEN-LAST:event_mni_gioiThieuSanPhamActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TT1_EdusysJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chuyenDe;
    private javax.swing.JButton btn_dangXuat;
    private javax.swing.JButton btn_huongDan;
    private javax.swing.JButton btn_ketThuc;
    private javax.swing.JButton btn_khoaHoc;
    private javax.swing.JButton btn_nguoiHoc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_mainIcon;
    private javax.swing.JLabel lbl_qldt;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JMenuItem mni_bangDiemKhoaHoc;
    private javax.swing.JMenuItem mni_chuyenDe;
    private javax.swing.JMenuItem mni_dangNhap;
    private javax.swing.JMenuItem mni_dangXuat;
    private javax.swing.JMenuItem mni_diemTungKhoaHoc;
    private javax.swing.JMenuItem mni_doanhThuTungChuyenDe;
    private javax.swing.JMenuItem mni_doiMatKhau;
    private javax.swing.JMenuItem mni_gioiThieuSanPham;
    private javax.swing.JMenuItem mni_hocVien;
    private javax.swing.JMenuItem mni_huongDanSuDung;
    private javax.swing.JMenuItem mni_ketThuc;
    private javax.swing.JMenuItem mni_khoaHoc;
    private javax.swing.JMenuItem mni_nguoiHoc;
    private javax.swing.JMenuItem mni_nguoiHocTungNam;
    private javax.swing.JMenuItem mni_nhanVien;
    private javax.swing.JMenu mnu_heThong;
    private javax.swing.JMenu mnu_quanLy;
    private javax.swing.JMenu mnu_thongKe;
    private javax.swing.JMenu mnu_troGiup;
    // End of variables declaration//GEN-END:variables
     static int i = 0;

    //Muốn biết C1 ra DangNhapJDialog nhé.
    private void init() {
        setLocationRelativeTo(null);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO "); //Thiết tiêu đề cho cửa sổ của C.trình.
        setIconImage(Ximage.getImage("Image", "fpt.png"));  //Thiết lập Icon dựa theo 2 tham số truyền vào.
        if (TT1_EdusysJFrame.i <= 0) {
//            openChao();
//            openGioiThieu();
            i++; //hehe cách làm này Oke phết.
        }
        clockRun(); //đồng hồ chạy
    }

    //Thiết lập đồng hồ chạy
    public void clockRun() {
        Thread t = new Thread(this);
        t.start();
    }

    //Tạo 1 đối tượng của lớp TT_ChaoJDialog và thực hiện hành động hiện lên giao 
    public void openChao() {
        new TT_ChaoJDialog(this, true).setVisible(true);
    }

    //Tạo 1 đối tượng của lớp TT_GioiThieuJDialog và thực hiện hành động hiện lên giao 
    public void openGioiThieu() {
        new TT_GioiThieuJDialog(this, true).setVisible(true);
    }

    //Đăng Nhập
    public void openDangNhap() {
        this.setVisible(false);
        new TT_DangNhapJDialog(this, true).setVisible(true);
        this.setVisible(true);
    }

    //Đăng Xuất
    public void logoff() {
        Boolean result = MsgBox.confirm(this, "Xác nhận đăng xuất tài khoản!");
        if (result) { //TH User nhập vào Yes
            Auth.clear(); //thiết lập user = null
            MsgBox.alter(this, "Đăng xuất thành công!");
        }else{//TH User nhập vào Yes
            MsgBox.alter(this, "Hủy đăng xuất MK");
        }
    }

    //Đổi mật Khẩu
    public void interface_ChangePassWord() {
        this.setVisible(false);
        new TT_DoiMatKhauJDiaLog(this, true).setVisible(true);
        this.setVisible(true);
    }

    //Kết Thúc
    public void exit() {
        Boolean result = MsgBox.confirm(this, "Bạn muốn thoát hệ thống!!");
        if (result) {
            System.exit(0);
        }
        MsgBox.alter(this, "Hủy thoát hệ thống");
    }

    //Chuyên Đề
    public void openChuyenDe() {
        this.setVisible(false);
        new QL_ChuyenDeJDialog(this, true).setVisible(true);
        this.setVisible(true);
    }

    public void openKhoaHoc() {
        this.setVisible(false);
        new QL_KhoaHocJDialog(this, true).setVisible(true);
        this.setVisible(true);
    }

    private void openNguoiHoc() {
        this.setVisible(false);
        new QL_NguoiHocJDialog(this, true).setVisible(true);
        this.setVisible(true);
    }

    public void openHocVien() {
        this.setVisible(false);
        new QL_HocVienJDialog(this, true).setVisible(true);
        this.setVisible(true);
    }

    public void openNhanVien() {
        this.setVisible(false);
        new QL_NhanVienJDialog(this, true).setVisible(true);
        this.setVisible(true);
    }

    //Dựa vào tham số truyền vào là tab nào thì nó sẽ mở ra giao diện đó.
    private void openThongKe(int i) {
        if (Auth.isLogIn()) {
            if (i == 3 && Auth.isManager()){
                ThongKeJDiaLog tkWindow = new ThongKeJDiaLog(this, false);
                this.setVisible(false); //dóng giao diện hiện tại
                tkWindow.setVisible(true);//Mở ra giao diện mới
                tkWindow.selectedTabs(i);//Tab sẽ được mở ra.
                return;
            } else if(i != 3 ) {
                ThongKeJDiaLog tkWindow = new ThongKeJDiaLog(this, false);
                this.setVisible(false); //dóng giao diện hiện tại
                tkWindow.setVisible(true);//Mở ra giao diện mới
                tkWindow.selectedTabs(i);//Tab sẽ được mở ra.
            }else{
                MsgBox.alter(this, "Bạn ko có quyền truy cập");
            }
        } else {
            MsgBox.alter(this, "Yêu cầu đăng nhập để thực hiện chức năng");
        }
    }

    //Chưa rõ.Để đấy tìm hiểu sau.
    public void openHuongDan() {
        this.setVisible(false);
        //new .... giao diện hướng dẫn
        this.setVisible(true);
    }

    @Override
    public void run() {
        //Sử dụng White(true) để thực hiện vòng lặp vô hạn. 
        //Để câu lệnh ở dưới luôn đc thực hiện 
        while (true)
            try {
//Tạo đối tượng của lớp Calendar là ca.
//Thông qua phương thức getInstance() của lớp Calendar( Calendar.getInstance() ).
//Để lấy thông tin giờ/phút/giây hiện tại. 
            Calendar ca = Calendar.getInstance();
            int gio = ca.get(Calendar.HOUR_OF_DAY); //Thông qua phương thức lấy giờ/phút/giây hiện tại
            int phut = ca.get(Calendar.MINUTE);// Gán giá trị cho từng biến tương ứng.
            int giay = ca.get(Calendar.SECOND);
            String time = gio + ":" + phut + ":" + giay; //thiết lập 1 chuỗi theo form sau.
            this.lbl_time.setText(time);
            Thread.sleep(1000); //Thông quá lớp Thread/
            //Phương thức sleep(millis) : Sử dụng để dừng thực thi luồng trong khoảng thời gian 1s.
            //Thao tác này cho phép đồng hồ đc cập nhật 1s một lần. Tạo hiệu ứng đồng hồ chạy liện tục.
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
    }

}
