package com.edusys.ui_view;

import com.edusys.DAO.CKhoaHocDao;
import com.edusys.DAO.GThongKeDao;
import com.edusys.model_entity.KhoaHoc;
import com.edusys.model_entity.NguoiHoc;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.MsgBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ThongKeJDiaLog extends javax.swing.JDialog {

    public ThongKeJDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dsNguoiHoc = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        tab2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cbb_khoaHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dsBangDiemTheoKhoaHoc = new javax.swing.JTable();
        tab3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_dsBangDiemTheoCD = new javax.swing.JTable();
        tab4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbb_nam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_dsDoanhThu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        tbl_dsNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NĂM", "SỐ NGƯỜI HỌC", "Ngày ĐK ĐẦU TIÊN", "Ngày ĐK SAU CÙNG"
            }
        ));
        jScrollPane2.setViewportView(tbl_dsNguoiHoc);

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tabs.addTab("Người Học", tab1);

        jLabel2.setText("KHÓA HỌC : ");

        cbb_khoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAV04(2018-02-11)", " " }));
        cbb_khoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_khoaHocActionPerformed(evt);
            }
        });

        tbl_dsBangDiemTheoKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NH", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ));
        jScrollPane1.setViewportView(tbl_dsBangDiemTheoKhoaHoc);

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_khoaHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbb_khoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        tabs.addTab("Bảng Điểm Theo Khóa Học", tab2);

        tbl_dsBangDiemTheoCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên Chuyên Đề", "Tổng Số HV", "Điểm Thấp Nhất", "Điểm Cao Nhất", "Điểm TB"
            }
        ));
        jScrollPane3.setViewportView(tbl_dsBangDiemTheoCD);

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        tabs.addTab("Bảng Điểm  Theo CĐ", tab3);

        jLabel3.setText("Năm : ");

        cbb_nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", " " }));
        cbb_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_namActionPerformed(evt);
            }
        });

        tbl_dsDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên Chuyên Đề", "Số Khóa", "Số HV", "Doanh Thu", "HP Cao Nhất", "HP Thấp Nhất", "HP Trung Bình"
            }
        ));
        jScrollPane4.setViewportView(tbl_dsDoanhThu);

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(tab4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_nam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbb_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        tabs.addTab("Doanh Thu", tab4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbb_khoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_khoaHocActionPerformed
        if (dcbbMaKH.getSize() > 0) {
            fillBangDiemTheoKhoa();
        }
    }//GEN-LAST:event_cbb_khoaHocActionPerformed

    private void cbb_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_namActionPerformed
        if (dcbbYear.getSize() > 0) {
            fillDoanhThuTheoNam();
        }
    }//GEN-LAST:event_cbb_namActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       MsgBox.alter(this, "Đã thoát khỏi giao diện thống kê."); //Nó sẽ ko TB khi đóng chính giao diện của nó.
       new TT1_EdusysJFrame().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeJDiaLog dialog = new ThongKeJDiaLog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbb_khoaHoc;
    private javax.swing.JComboBox<String> cbb_nam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_dsBangDiemTheoCD;
    private javax.swing.JTable tbl_dsBangDiemTheoKhoaHoc;
    private javax.swing.JTable tbl_dsDoanhThu;
    private javax.swing.JTable tbl_dsNguoiHoc;
    // End of variables declaration//GEN-END:variables
    CKhoaHocDao khd = new CKhoaHocDao(); //dựa vào đấy fill các KH lên Cbb_khoaHoc.
    GThongKeDao tkd = new GThongKeDao();
    DefaultComboBoxModel dcbbMaKH;
    DefaultComboBoxModel dcbbYear;

    public String getXepLoai(double diem) {
        if (diem < 5) {
            return "Chưa đạt";
        }
        if (diem < 6.5) {
            return "Trung bình";
        }
        if (diem < 7.5) {
            return "Khá";
        }
        if (diem < 9) {
            return "Giỏi";
        }
        return "Xuất xắc";
    }

    private void init() {
        this.setLocationRelativeTo(null);
        //Fill KH cho Cbb_KH của tab Bảng Điểm theoKH
        fillCbbMaKH();
        //Fill Năm cho Cbb_year của tab Doanh_Thu.
        fillCbbYear();

        //Fill tất cả các bảng lên gồm bảng : 
        //Người Học 
        fillNHToTable();
        //Bảng điểm theo khóa học
        fillBangDiemTheoKhoa();
        //Bảng điểm theo CD 
        fillBangDiemTheoCD();
        //Doanh Thu  theo năm.
        fillDoanhThuTheoNam();
        //Dựa vào MenuItem thì hiện thị tab tương ứng.
        //Nếu là nhân viên thì xóa MenuItem doanh thu
        if (!Auth.isManager()) {
            tabs.remove(3); //Vị trí của tab trogn JTabbedPane thì bắt đầu bằng vị trí 0.
        }
    }

    //Fill tất cả khóa học lên dựa vào bảng khóa học.
    public void fillCbbMaKH() {
        dcbbMaKH = (DefaultComboBoxModel) cbb_khoaHoc.getModel();  //Lấy modun.
        dcbbMaKH.removeAllElements();//Xóa hết đi cbb.
        List<KhoaHoc> listKH = khd.selectAll();
        for (KhoaHoc kh : listKH) {
            dcbbMaKH.addElement(kh.getMaKH() + "---NgàyTạo" + " (" + kh.getNgayTao() + ")");
        }
    }

    //Fill tất cả Year--ko trùng nhau ( Dựa vào bảng Khóa Học ).
    public void fillCbbYear() {
        dcbbYear = (DefaultComboBoxModel) cbb_nam.getModel(); //lấy modun 
        dcbbYear.removeAllElements(); //xóa tất cả
        List<Integer> list = khd.selectYear();
        for (Integer listYear : list) {
            dcbbYear.addElement(listYear);
        }
//        dcbbYear.setSelectedItem(0);
    }

    //fill danh sách người học theo năm
    private void fillNHToTable() {
        DefaultTableModel dtmDSNH = (DefaultTableModel) this.tbl_dsNguoiHoc.getModel();
        dtmDSNH.setRowCount(0);
        List<Object[]> listNH = tkd.getSoLuongNguoiHoc();//lấy dữ liệu vào danh sách
        //dùng for duyện dữ liệu lên bảng
        for (Object[] row : listNH) {
            dtmDSNH.addRow(row);
        }
    }

    //fill danh sách bảng điểm theo khóa học.
    private void fillBangDiemTheoKhoa() {
        DefaultTableModel dtmBDTKH = (DefaultTableModel) this.tbl_dsBangDiemTheoKhoaHoc.getModel();
        dtmBDTKH.setRowCount(0);
        String MaKH = cbb_khoaHoc.getSelectedItem().toString().split("---")[0].trim();
        KhoaHoc kh = new KhoaHoc();
        kh.setMaKH(Integer.valueOf(MaKH));
        List<Object[]> listBDTKH = tkd.getBangDiemTheoMaKH(kh.getMaKH());
        for (Object[] row : listBDTKH) {
            Object[] rowXepLoai = new Object[]{
                row[0],
                row[1],
                row[2],
                getXepLoai(Double.parseDouble(row[2].toString()))
            };
            dtmBDTKH.addRow(rowXepLoai); //row + thêm đánh giá xếp loại.
        }
    }

    //fill bảng điểm theo Chuyên đề
    private void fillBangDiemTheoCD() {
        DefaultTableModel dtmBDTCD = (DefaultTableModel) this.tbl_dsBangDiemTheoCD.getModel();
        dtmBDTCD.setRowCount(0);
        List<Object[]> listBDTCD = tkd.getDiemTheoMaCD();
        for (Object[] row : listBDTCD) {
            dtmBDTCD.addRow(row);
        }
    } //Cần đặt giới hạn sau dấu chấm của điểm TB.

    private void fillDoanhThuTheoNam() {
        DefaultTableModel dtmDT = (DefaultTableModel) this.tbl_dsDoanhThu.getModel();
        dtmDT.setRowCount(0);
        int year = (int) dcbbYear.getSelectedItem();
        //truy vấn dữ liệu theo năm
        List<Object[]> listDT = tkd.getDoanhThuTheoNam(year);
        //duyệt
        for (Object[] row : listDT) {
            dtmDT.addRow(row);
        }
    }
    
    public void selectedTabs(int index){
        tabs.setSelectedIndex(index);
    }

}//end
