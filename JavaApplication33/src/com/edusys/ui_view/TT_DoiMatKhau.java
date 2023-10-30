package com.edusys.ui_view;

import com.edusys.DAO.FNhanVienDao;
import com.edusys.model_entity.NhanVien;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.MsgBox;
import com.edusys.utility_helper.Ximage;
import java.awt.Color;

public class TT_DoiMatKhau extends javax.swing.JFrame {

    FNhanVienDao nvd = new FNhanVienDao();
    //Lấy ra một đối tượng NV dựa vào tài khoản đăng nhập vào
    NhanVien nv = nvd.selectById(Auth.user.getMaNV());

    public TT_DoiMatKhau() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_tenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_matKhauHienTai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_dongY = new javax.swing.JButton();
        btn_huyBo = new javax.swing.JButton();
        txt_matKhauMoi = new javax.swing.JPasswordField();
        txt_xacNhanMatKhauMoi = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys Đổi Mật Khẩu");

        jLabel2.setText("Tên Đăng Nhập");

        txt_tenDangNhap.setEnabled(false);

        jLabel3.setText("Mật Khẩu Hiện Tại");

        jLabel4.setText("Mật Khẩu Mới");

        jLabel5.setText("Xác Nhận Mật Khẩu Mới");

        btn_dongY.setText("Đồng ý");
        btn_dongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dongYActionPerformed(evt);
            }
        });

        btn_huyBo.setText("Hủy bỏ");
        btn_huyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyBoActionPerformed(evt);
            }
        });

        txt_xacNhanMatKhauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_xacNhanMatKhauMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_dongY, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_huyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_matKhauMoi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tenDangNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_matKhauHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_xacNhanMatKhauMoi))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_matKhauHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_matKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_xacNhanMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dongY, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btn_huyBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("ĐỔI MẬT KHÂU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dongYActionPerformed
        if (checkValidate() && checkMKmoi()) {
            //TH mật khẩu trùng nhau và đúng mật khẩu
            if (checkTrungMKMoi() && checkMKHienTai() ) {
                //Thiết lập lại mk mới cho nv thêm vào và giữ nguyên các thông tin khác.
                nv.setMatKhau(String.valueOf(txt_xacNhanMatKhauMoi.getPassword()));
                nvd.update(nv);
                MsgBox.alter(this, "Thay đổi mật khẩu thành công =>>");
                txt_matKhauHienTai.setText("");
                txt_matKhauMoi.setText("");
                txt_xacNhanMatKhauMoi.setText("");
                MsgBox.alter(this, "Thoát giao diện!");
                this.dispose();//sau khi đổi mật khẩu thoát thì đóng giao diện
            }
        }
    }//GEN-LAST:event_btn_dongYActionPerformed

    private void txt_xacNhanMatKhauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_xacNhanMatKhauMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_xacNhanMatKhauMoiActionPerformed

    private void btn_huyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyBoActionPerformed
        if (MsgBox.confirm(this, "Bạn muốn hủy bỏ đổi mật khẩu")) {
            this.dispose();
        }

    }//GEN-LAST:event_btn_huyBoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TT_DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dongY;
    private javax.swing.JButton btn_huyBo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_matKhauHienTai;
    private javax.swing.JPasswordField txt_matKhauMoi;
    private javax.swing.JTextField txt_tenDangNhap;
    private javax.swing.JPasswordField txt_xacNhanMatKhauMoi;
    // End of variables declaration//GEN-END:variables

    void init() {
        setLocationRelativeTo(null);
        //Thiết lập icon giao diện
        setIconImage(Ximage.getImage("Image", "fpt.png"));
        setTitle("Cửa sổ đổi mật khẩu");
        //Thiết lập tên đăng nhập là User đăng nhập vào
        txt_tenDangNhap.setText(Auth.user.getMaNV());
    }
    
    
    public boolean checkTrungMKMoi() {
        String matKhauMoi = String.valueOf(txt_matKhauMoi.getPassword());
        String xacNhanMatKhauMoi = String.valueOf(txt_xacNhanMatKhauMoi.getPassword());
        if (matKhauMoi.equals(xacNhanMatKhauMoi)) {
//            System.out.println("Mật khẩu trùng nhau.");
            return true;
        }
        MsgBox.alter(this, "Yêu cầu nhập mật khẩu mới trùng nhau!!");
        return false;
    }

    public boolean checkMKHienTai() {
//        System.out.println("MatKhauHienTai : " + txt_matKhauHienTai.getText() + " 216FDoiMatKhau");
        
        if (txt_matKhauHienTai.getText().equals(this.nv.getMatKhau())) {
//            System.out.println("MK nhập đúng : " + this.nv.getMatKhau() + " (181_JFrameDoiMatKhau) ");
            return true;
        }
        MsgBox.alter(this, "Sai Mật Khẩu");
        return false;
    }

    //Check validate. Nếu mà trống là False còn ko là đúng r là True
    public boolean checkValidate() {
        String matKhauHienTai = txt_matKhauHienTai.getText();
        String matKhauMoi = String.valueOf(txt_matKhauMoi.getPassword());
        String xacNhanMatKhauMoi = String.valueOf(txt_xacNhanMatKhauMoi.getPassword());
        
        //check ko nhập gì cả
        if (matKhauHienTai.isEmpty() || matKhauMoi.isEmpty() || xacNhanMatKhauMoi.isEmpty()) {
            MsgBox.alter(this, "Yêu cầu nhập đầy đủ thông tin!!");
            if (matKhauHienTai.isEmpty()) {
                txt_matKhauHienTai.requestFocus();
                txt_matKhauHienTai.setBackground(Color.YELLOW);
            } else if (matKhauMoi.isEmpty()) {
                txt_matKhauHienTai.setBackground(null);
                txt_matKhauMoi.requestFocus();
                txt_matKhauMoi.setBackground(Color.YELLOW);
            } else if (xacNhanMatKhauMoi.isEmpty()) {
                txt_matKhauMoi.setBackground(null);
                txt_xacNhanMatKhauMoi.requestFocus();
                txt_xacNhanMatKhauMoi.setBackground(Color.YELLOW);
            }
            return false;
        }
        txt_xacNhanMatKhauMoi.setBackground(null);
        return true;
    }
    
    //CheckMK mới không được trùng với MK hiện tại.
    //nếu trùng thì là False , còn ko là true
    public boolean checkMKmoi(){
        String matKhauHienTai = txt_matKhauHienTai.getText();
        String matKhauMoi = String.valueOf(txt_matKhauMoi.getPassword());
        if(matKhauHienTai.equals(matKhauMoi)){
            MsgBox.alter(this, "Mật khẩu mới không được trùng với mật khẩu hiện tại =))");
            txt_matKhauMoi.requestFocus();
            txt_matKhauMoi.requestFocus();
            return false;
        }        
        return true;
    }
}
