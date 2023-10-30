package com.edusys.ui_view;

import com.edusys.DAO.FNhanVienDao;
import com.edusys.model_entity.NhanVien;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.MsgBox;
import com.edusys.utility_helper.Ximage;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TT_DangNhapJDialog extends javax.swing.JDialog {

    public TT_DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    FNhanVienDao nvd = new FNhanVienDao();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_tenDangNhap = new javax.swing.JLabel();
        lbl_matKhau = new javax.swing.JLabel();
        txt_tenDangNhap = new javax.swing.JTextField();
        txt_matKhau = new javax.swing.JPasswordField();
        btn_dangNhap = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        chk_hienMatKhau = new javax.swing.JCheckBox();
        lbl_iconDangNhap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys Đăng Nhập");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("ĐĂNG NHẬP");

        lbl_tenDangNhap.setText("Tên Đăng Nhập");

        lbl_matKhau.setText("Mật Khẩu");

        txt_tenDangNhap.setText("NV02");

        txt_matKhau.setText("yennthph31906");

        btn_dangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Key.png"))); // NOI18N
        btn_dangNhap.setText("Đăng Nhập");
        btn_dangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dangNhap.setIconTextGap(5);
        btn_dangNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangNhapActionPerformed(evt);
            }
        });

        btn_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/Log out.png"))); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_thoat.setIconTextGap(5);
        btn_thoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        chk_hienMatKhau.setText("Hiện mật khẩu");
        chk_hienMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_hienMatKhauMouseClicked(evt);
            }
        });
        chk_hienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_hienMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tenDangNhap)
                    .addComponent(txt_matKhau)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_dangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chk_hienMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_tenDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_matKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chk_hienMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dangNhap)
                    .addComponent(btn_thoat))
                .addGap(21, 21, 21))
        );

        lbl_iconDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/security.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_iconDangNhap)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iconDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        //this.dispose(); chỉ thoát màn hình nhưng ko dừng hẳn mà đag chạy ngầm.
        Boolean result = MsgBox.confirm(this, "Thoát khỏi đăng nhập!");
        if (result) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangNhapActionPerformed
        //Đăng nhập thành công : Thoát giao diện đăng nhập + ra giao diện chính
        //Đăng nhập thất bại : TB lỗi và ở lại giao diện này.
        if (checkLogin()) {
            this.dispose(); //Mục đích là sau khi đăng nhập thành công thì sẽ đóng giao diện hiện tại mở ra giao diện trang chủ.
        }
    }//GEN-LAST:event_btn_dangNhapActionPerformed

    private void chk_hienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_hienMatKhauActionPerformed

    }//GEN-LAST:event_chk_hienMatKhauActionPerformed

    private void chk_hienMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_hienMatKhauMouseClicked
        hienThiMatKhau();
    }//GEN-LAST:event_chk_hienMatKhauMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MsgBox.alter(this, "Đã đóng giao diện đăng nhập");
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TT_DangNhapJDialog dialog = new TT_DangNhapJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_dangNhap;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JCheckBox chk_hienMatKhau;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_iconDangNhap;
    private javax.swing.JLabel lbl_matKhau;
    private javax.swing.JLabel lbl_tenDangNhap;
    private javax.swing.JPasswordField txt_matKhau;
    private javax.swing.JTextField txt_tenDangNhap;
    // End of variables declaration//GEN-END:variables

    //thiết lập phần icon và tiêu đề của C.trình
    void init() {
        setLocationRelativeTo(null);
        setTitle("Hệ Thống Đăng Nhập"); //Thiết tiêu đề cho cửa sổ của C.trình.
        //C2: Chỉ cần truyền tham số vào. Ngắn hơn phải khum nào.Đấy là tại sao cần gói tiện ích.
        setIconImage(Ximage.getImage("Image", "fpt.png"));
        txt_matKhau.setEchoChar('*'); //Thiết lập kiểu hiện thị cho mật khẩu.
    }

    //Kiểm tra tài khoản.
    boolean checkLogin() {
        /*
        B1: Sau khi nhập TenĐN , MK và nhấn vào nút đăng nhập
        B2: Thì nó sẽ chek xem trog DB có TenĐN này ko. Nếu có thì trả về đối tượng Nhân Viên đó 
        B3: Từ Nhân Viên đó lấy thông tin là mật khẩu có trùng không.Nếu trùng thi thực hiện các bước khác.
        B4: Nếu ko trùng thì hiện thông báo lỗi MK và trỏ chuột vào mật khẩu  + Hightlight đỏ mật khẩu.        
         */
        String MaNV = txt_tenDangNhap.getText();
        String MatKhau = String.valueOf(txt_matKhau.getPassword());

        NhanVien checkMaNV = nvd.selectById(MaNV);
        //TH sai tên đăng nhập
        if (checkMaNV == null) {
            MsgBox.alter(this, "Nhập sai tên đăng nhập!!");
            txt_tenDangNhap.requestFocus(); //P.t gọi con trỏ chuột đến một thành phần nào đó.
            txt_tenDangNhap.setBackground(Color.YELLOW);
            return false;
        }
        //TH đúng tên đăng nhập sai mk
        txt_tenDangNhap.setBackground(null);
        if (MatKhau.equals(checkMaNV.getMatKhau())) {
            MsgBox.alter(this, "Đăng nhập thành công");
            Auth.user = checkMaNV; //Gán user cho đối tượng NV đã đăng nhập vào.
//            System.out.println("Staff : " + Auth.user.getMaNV() + " saved ( 250 - JFrameDangNhap )  ");
            return true;
        } else {
            MsgBox.alter(this, "Sai Mật Khẩu!! ");
            txt_matKhau.requestFocus();
//            System.out.println("Mật Khẩu : " + MatKhau);
            return false;
        }
    }

    private void hienThiMatKhau() {
        txt_matKhau.setEchoChar(chk_hienMatKhau.isSelected() ? (char) 0 : '*');
    }

}//End
