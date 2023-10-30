package com.edusys.ui_view;

import com.edusys.utility_helper.Ximage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class TT_ChaoJDialog extends javax.swing.JDialog {

    //init == initialize : Khởi tạo/chạy , khởi đầu của c.trình
    void init() {
        setSize(700, 500);
        setLocationRelativeTo(null);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        setIconImage(Ximage.getImage("Image", "fpt.png"));
        //Hãy học về lớp Timer từ đó hiểu về đối tượng Timer này nhé.
        //Thực hiện lặp lại 1 hành động trong 20ms. Và sau khi 100% sẽ thoát màn hình
        new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = pgb_tienTrinh.getValue(); //thiết lập giá trị ban đầu
                if(value < 100){
                    pgb_tienTrinh.setValue(value + 2); //Nhỏ hơn 100 thì +1
                }else{
                    TT_ChaoJDialog.this.dispose(); //Đóng màn hình khi chạy tới 100%
                }
            }
        }).start();
    }

    public TT_ChaoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_chao = new javax.swing.JLabel();
        pgb_tienTrinh = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(524, 343));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_chao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/logo-small.png"))); // NOI18N
        jPanel1.add(lbl_chao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, -1));

        pgb_tienTrinh.setBackground(new java.awt.Color(204, 204, 204));
        pgb_tienTrinh.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pgb_tienTrinh.setForeground(new java.awt.Color(255, 102, 0));
        pgb_tienTrinh.setToolTipText("Tiến trình");
        pgb_tienTrinh.setValue(20);
        pgb_tienTrinh.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(pgb_tienTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgb_tienTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TT_ChaoJDialog dialog = new TT_ChaoJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_chao;
    private javax.swing.JProgressBar pgb_tienTrinh;
    // End of variables declaration//GEN-END:variables
}
