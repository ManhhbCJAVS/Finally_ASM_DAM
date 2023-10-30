package com.edusys.ui_view;

public class TT_GioiThieuJDialog extends javax.swing.JDialog {

    public TT_GioiThieuJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_chao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lbl_chao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Image/logo-small.png"))); // NOI18N
        lbl_chao.setIconTextGap(10);
        lbl_chao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_chaoMouseClicked(evt);
            }
        });

        jTextPane1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextPane1.setText("Polypro là dự án mẫu. Mục tiêu chính là huấn luyện sinh viên quy trình thực hiện dự án\n\nMục tiêu của dự án này là để rèn luyện kỹ năng IO ( CDIO ) tức không yêu cầu sinh viên phải \nthu thập phân tích mà chỉ thực hiện và vẫn hành một phần chuẩn bị cho các dự án sau này.\ncác ký năng CD ( trong CDIO ) sẽ được huấn luyện ở dự án 1 và dự án 2.\n\nYêu cầu môi trường : \n1. Hệ điều hành bất kỳ \n2. JDK phù hợp \n3. SQL Server 2016 trở lên.\n");
        jTextPane1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPane1.setEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(lbl_chao, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_chao, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(224, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_chaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_chaoMouseClicked
        dispose();
    }//GEN-LAST:event_lbl_chaoMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TT_GioiThieuJDialog dialog = new TT_GioiThieuJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbl_chao;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);        
    }
}
