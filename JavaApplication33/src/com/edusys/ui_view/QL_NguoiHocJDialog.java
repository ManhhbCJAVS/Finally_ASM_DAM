package com.edusys.ui_view;

import com.edusys.DAO.DHocVienDao;
import com.edusys.DAO.ENguoiHocDao;
import com.edusys.model_entity.HocVien;
import com.edusys.model_entity.NguoiHoc;
import com.edusys.utility_helper.Auth;
import com.edusys.utility_helper.MsgBox;
import com.edusys.utility_helper.XDate;
import com.edusys.utility_helper.Ximage;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class QL_NguoiHocJDialog extends javax.swing.JDialog {

    //Cầu nối lấy dữ liệu của Người học bên database
    ENguoiHocDao nhd = new ENguoiHocDao();
    DHocVienDao hvd = new DHocVienDao();
    DefaultTableModel dtm;
    DefaultComboBoxModel<String> dcbbmd;
    NguoiHoc nh;
    static String urlImage;
    static int countVariable;

    public QL_NguoiHocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dtm = (DefaultTableModel) this.tbl_nguoiHoc.getModel();
        dcbbmd = (DefaultComboBoxModel<String>) this.cbb_gioiTinh.getModel();
        dcbbmd.addElement("Nam");
        dcbbmd.addElement("Nữ");
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_maNguoiHoc = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_hoVaTen = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_dienThoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbb_gioiTinh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_ngaySinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_ghiChu = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_end = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lbl_avatar = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_maNHSearch = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_nguoiHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EdySys QLNH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("QUẢN LÝ NGƯỜI HỌC");

        jLabel2.setText("Mã người học : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_maNguoiHoc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_maNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setText("Họ và Tên : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_hoVaTen)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_hoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jLabel4.setText("Giới Tính");

        jLabel5.setText("Điện Thoại");

        jLabel6.setText("Ngày Sinh ");

        jLabel7.setText("Địa Chỉ email");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txt_email)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        ta_ghiChu.setColumns(20);
        ta_ghiChu.setRows(5);
        jScrollPane1.setViewportView(ta_ghiChu);

        jLabel8.setText("Ghi Chú");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
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

        btn_moi.setText("Mới");
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });

        btn_prev.setText("|<");
        btn_prev.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_prev.setPreferredSize(new java.awt.Dimension(60, 23));

        btn_first.setText("<<");
        btn_first.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_first.setPreferredSize(new java.awt.Dimension(60, 23));

        btn_end.setText(">>");
        btn_end.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_end.setPreferredSize(new java.awt.Dimension(60, 23));

        btn_next.setText(">|");
        btn_next.setMinimumSize(new java.awt.Dimension(60, 23));
        btn_next.setPreferredSize(new java.awt.Dimension(60, 23));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_them)
                        .addComponent(btn_sua)
                        .addComponent(btn_xoa)
                        .addComponent(btn_moi)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lbl_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/logos/gg.png"))); // NOI18N
        lbl_avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_avatarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_avatar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_avatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        TabbedPane.addTab("CẬP NHẬT", tab1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM THEO MaNH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 102, 0))); // NOI18N

        btn_search.setText("Tìm");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt_maNHSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maNHSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tbl_nguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "Email", "MA NV", "NGÀY ĐK"
            }
        ));
        tbl_nguoiHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nguoiHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_nguoiHoc);

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab2Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );

        TabbedPane.addTab("DANH SÁCH", tab2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_nguoiHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nguoiHocMouseClicked
        if (evt.getClickCount() == 1) {
            TabbedPane.setSelectedComponent(tab1);
            int rowSelected = this.tbl_nguoiHoc.getSelectedRow();
            fillFirstObjectToFormByRowSelected(rowSelected);
            setEnbledButton(true);
            lbl_avatar.setText(null);
        }
        this.countVariable = 0;
    }//GEN-LAST:event_tbl_nguoiHocMouseClicked

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        //Xóa trống hết trường dữ liệu + vô hiệu hóa/khởi động một số nút
        clear();
        setEnbledButton(false);
        this.countVariable = 0;
    }//GEN-LAST:event_btn_moiActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        //chek form đúng và người học đó chưa tồn tại. Thì thêm thành công.
        System.out.println("vòa thêm");
        if (checkFormat() && checkNull() && !checkTonTai()) {
            nhd.insert(getObjectByFormForThem());
            fillObjectToTable();
            MsgBox.alter(this, "Thêm thành công");
        } else {
            MsgBox.alter(this, "Thêm thất bại");
        }
        this.countVariable = 0;
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        //chek tồn tại trong bảng Ngượi học hay chưa. 
        //Nếu đã tồn tại thì sửa các thông tin ( Hình , họ tên , ngày sinh , đt , email , ghi chú ) 
        if (checkFormat() && checkNull() && checkTonTai()) {
            if (this.countVariable == 0) {//là TH nó sửa nhưng ko sửa ảnh.
                NguoiHoc nhUpdate = getObjectByFormForUpdate();
                nhd.update(nhUpdate);
                fillObjectToTable();
            } else { //Là Th nó sửa có sửa ảnh.
                NguoiHoc nhUpdate = getObjectByFormForThem();
                nhd.update(nhUpdate);
                fillObjectToTable();
            }
            MsgBox.alter(this, "Sửa  thành công");
        } else {
            MsgBox.alter(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        //chek tồn tại trong bảng : Người Học / Học Viên.  ( checkTonTai() / checkRangBuoc()
        //Nếu tồn tại thì chek xem người học đó đang tham gia khóa học nào ko. Là học viên. Nếu có thì ko xóa đc do đang tham gia khóa học
        if (checkTonTai() && !checkRangBuoc()) {
            nhd.delete(txt_maNguoiHoc.getText());
            fillObjectToTable();
            clear();
            lbl_avatar.setText(null);
            MsgBox.alter(this, "Xóa thành công!!");
        }
        this.countVariable = 1;
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void lbl_avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_avatarMouseClicked
        SetIconImage();
    }//GEN-LAST:event_lbl_avatarMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        //Chức năng tìm kiếm. Thì nên kiếm theo cái gì đây ? 
        //Khi thực hiện tìm kiếm. Nó sẽ kiểm tra MaNH đó tồn tại ko
        //Nếu có tồn tại thì trong bảng dòng có người học đó sẽ được hightLight và chỉ mục sẽ chỉ tới nó. 
        //Bằng phương thức : 
        //Còn nếu ko tìm thấy thì tb là ko có.
        String maNHSearch = txt_maNHSearch.getText(); //Lấy mã ngươi dùng điền trên bảng
        //Thực hiện duyệt nó so với cột thứ 0 của bảng. Nếu có kq nào trùng thì hiện là có.
        int rowIndex = -1;
        //Đếm từng dòng trog bảng
        for (int row = 0; row < this.tbl_nguoiHoc.getRowCount(); row++) {
            String valueInFirstColumn = this.tbl_nguoiHoc.getValueAt(row, 0).toString().trim();
            if (maNHSearch.equals(valueInFirstColumn)) {
                rowIndex = row;
                MsgBox.alter(this, "MaNH " + maNHSearch + " có tồn tại ở dòng " + row);
                break; //dừng lại khi thấy dòng trùng
            }
        }
        //thực hiện hành vi khi có/ko tìm thấy.
        if (rowIndex != -1) {
            this.tbl_nguoiHoc.setRowSelectionInterval(rowIndex, rowIndex);
            this.tbl_nguoiHoc.scrollRectToVisible(this.tbl_nguoiHoc.getCellRect(rowIndex, 0, true));
        } else {
            MsgBox.alter(this, "MaNH ko tồn tại");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MsgBox.alter(this, "Cửa số QLNH đã đc đóng");
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QL_NguoiHocJDialog dialog = new QL_NguoiHocJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_gioiTinh;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_avatar;
    private javax.swing.JTextArea ta_ghiChu;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JTable tbl_nguoiHoc;
    private javax.swing.JTextField txt_dienThoai;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_hoVaTen;
    private javax.swing.JTextField txt_maNHSearch;
    private javax.swing.JTextField txt_maNguoiHoc;
    private javax.swing.JTextField txt_ngaySinh;
    // End of variables declaration//GEN-END:variables
/*
Bao gồm các thuộc tính : 
MaNH , hoten , gioiTinh ,  ngaySinh , 
Email , DT , GhiChu , MaNV , ngayDK , hinh    */
    private void init() {
        //Bắt sự kiện MouseClickOnTable. ( fillFirstObjectToFormByRowSelected() )
        setLocationRelativeTo(null);
        fillObjectToTable(); //Load dữ liệu lên bảng.
        //Hiện dữ liệu đầu tiên lên Form
        fillFirstObjectToFormByRowSelected(0);
    }

    public void fillObjectToTable() {
        dtm.setRowCount(0);
        List<NguoiHoc> listNH = nhd.selectAll();
        for (NguoiHoc nh1 : listNH) {
            Object[] row = new Object[]{
                nh1.getMaNH(),
                nh1.getHoTen(),
                nh1.getGioiTinh() ? "Nam" : "Nữ",
                nh1.getNgaySinh(),
                nh1.getDienThoai(),
                nh1.getEmail(),
                nh1.getMaNV(),
                nh1.getNgayDK(),};
            dtm.addRow(row);
        }
    }

    //Hiện lên đối tượng chọn trên bảng lên Form dựa vào row đã chọn
    private void fillFirstObjectToFormByRowSelected(int selectedRow) {
        if (this.tbl_nguoiHoc.getRowCount() != 0) {
            txt_maNguoiHoc.setText(this.tbl_nguoiHoc.getValueAt(selectedRow, 0).toString());
            txt_hoVaTen.setText(this.tbl_nguoiHoc.getValueAt(selectedRow, 1).toString());
            txt_ngaySinh.setText(this.tbl_nguoiHoc.getValueAt(selectedRow, 3).toString());
            txt_dienThoai.setText(this.tbl_nguoiHoc.getValueAt(selectedRow, 4).toString());
            txt_email.setText(this.tbl_nguoiHoc.getValueAt(selectedRow, 5).toString());
            String gioiTinh = (this.tbl_nguoiHoc.getValueAt(selectedRow, 2).equals("Nam")) ? "Nam" : "Nữ";
            cbb_gioiTinh.setSelectedItem(gioiTinh);
//            System.out.println(selectedRow);
            NguoiHoc nh1 = nhd.selectById(this.tbl_nguoiHoc.getValueAt(selectedRow, 0).toString());
            ta_ghiChu.setText(nh1.getGhiChu());
            try { //Xét ngoại để nếu dựa theo tệp ảnh mà ko thấy  ảnh ở folder này thì nó sẽ setlblAvatar ở folder kia.
                    ImageIcon iconLogos = Ximage.getImageIcon("logos", nh1.getHinh());
                    Image img = iconLogos.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    lbl_avatar.setIcon(new ImageIcon(img));
            } catch (Exception e) {
                System.out.println("ko tìm thấy ảnh ở Folder Logos. Chắc ở Image r =))");
                ImageIcon iconImage = Ximage.getImageIcon("Image", nh1.getHinh());
                Image img = iconImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                lbl_avatar.setIcon(new ImageIcon(img));
            }
        } else {
            MsgBox.alter(this, "Ko còn đối tượng để hiện thị");
        }
    }

    private void clear() {
        txt_hoVaTen.setText(null);
        txt_maNguoiHoc.setText(null);
        txt_ngaySinh.setText(null);
        txt_dienThoai.setText(null);
        txt_email.setText(null);
        ta_ghiChu.setText(null);
        lbl_avatar.setIcon(null);
        lbl_avatar.setText("Vui lòng chọn ảnh!!");
    }

    private void setEnbledButton(boolean xacNhan) {
        btn_sua.setEnabled(xacNhan);
        btn_xoa.setEnabled(xacNhan);
        btn_them.setEnabled(!xacNhan);
    }

    private boolean checkNull() {
        String MaNHString = txt_maNguoiHoc.getText();
        String hoVaTenString = txt_hoVaTen.getText();
        String ngaySinhString = txt_ngaySinh.getText();
        String dienThoaiString = txt_dienThoai.getText();
        String emailString = txt_email.getText();
        String ghiChuString = ta_ghiChu.getText();
        ImageIcon hinhString = (ImageIcon) lbl_avatar.getIcon();

        if (MaNHString.isEmpty() || hoVaTenString.isEmpty()
                || ngaySinhString.isEmpty() || dienThoaiString.isEmpty()
                || emailString.isEmpty() || ghiChuString.isEmpty() || hinhString == null) {
            if (MaNHString.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập MaNH");
            } else if (hoVaTenString.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập tên");
            } else if (ngaySinhString.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập ngày sinh");
            } else if (dienThoaiString.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập số điện thoại");
            } else if (emailString.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập địa chỉ Email");
            } else if (ghiChuString.isEmpty()) {
                MsgBox.alter(this, "Yêu cầu nhập Ghi chú cho xịn =))");
            } else if (hinhString == null) {
                MsgBox.alter(this, "Yêu cầu chọn ảnh cho người dùng. =))");
            }
            return false;
        }
        return true;
    }

    //chek tổng
    public boolean checkFormat() {
        String emailString = txt_email.getText();
        String dienThoaiString = txt_dienThoai.getText();
        String ngaySinhString = txt_ngaySinh.getText();
        if (!isValidEmail(emailString)) {
            MsgBox.alter(this, "Yêu cầu nhập Email có định dạng sau : bắt đầu bằng số/ký tự + đuôi là @fpt.edu.vn ( manhhbph40818@pft.edu.vn ) ");
            return false;
        } else if (!isValidPhoneNumber(dienThoaiString)) {
            MsgBox.alter(this, "Yêu cầu nhập số đt có định dạng sau : 0 + 9 số bất ");
            return false;
        } else if (!isValidDate(ngaySinhString)) {
            MsgBox.alter(this, "Yêu cầu nhập ngày sinh có định dạng sau : 'yyyy-MM-dd' và hợp lý");
            return false;
        }
        return true;
    }

    //chek định dạng email
    private boolean isValidEmail(String email) {
        String regexEmail = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@fpt\\.edu\\.vn$";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEMatcher = patternEmail.matcher(email);
        return matcherEMatcher.matches();
    }

    //chek định dạng số đt
    private boolean isValidPhoneNumber(String phoneNumber) {
        String regexPhoneNumber = "0[0-9]{9}";
        Pattern patternPhoneNumber = Pattern.compile(regexPhoneNumber);
        Matcher matcherPhoneNumber = patternPhoneNumber.matcher(phoneNumber);
        return matcherPhoneNumber.matches();
    }

    //chek định dạng Date 
    private boolean isValidDate(String date) {
        String regexDate = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
        Pattern patternDate = Pattern.compile(regexDate);
        Matcher matcherDate = patternDate.matcher(date);
        return matcherDate.matches();
    }

    //dựa vào maNH trên form mà kiểm tra có tồn tại hay ko.Nếu có là true ko là false.
    private boolean checkTonTai() {
        String MaNHString = txt_maNguoiHoc.getText();
        if (nhd.selectById(MaNHString) == null) {
            MsgBox.alter(this, "Người học " + MaNHString + " không tồn tại");
            return false;
        }
        MsgBox.alter(this, "Người học " + MaNHString + " đã tồn tại");
        return true;
    }

    //chek ràng buộc : Xem người học đang tham gia khóa học ko.Có là true ko là false
    private boolean checkRangBuoc() {
        String maNHString = txt_maNguoiHoc.getText();
        HocVien hvCheck = hvd.selectHV_By_MaNH(maNHString); //ktr xem có người học nào đag học khóa học ko.
        if (hvCheck != null) {
            MsgBox.alter(this, "Người học đang tham gia một khóa học ( giờ là học viên ) không thể xóa ");
            return true;
        }
        MsgBox.alter(this, "Người học ko tham gia khóa học nào");
        return false;
    }

    //Thiết lập Icon khi click vào ảnh.
    private void SetIconImage() {
        ImageIcon imgIcon = getUrlImage();
//         System.out.println("đường dẫn : "+imgIcon);
        if (imgIcon != null) {
            lbl_avatar.setIcon(new ImageIcon(imgIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
//            System.out.println("kiểu dữ liệu ảnh : "+ new ImageIcon(imgIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
            lbl_avatar.setText(null);
            MsgBox.alter(this, "Thiết lập Icon hoàn thành");
            this.countVariable = 1; //Nó click vào ảnh và có chọn ảnh =1
        } else {
            this.countVariable = 0; //Nó click vào ảnh nhưng ko chọn ảnh và nhấn cancel là = 0.
            MsgBox.alter(this, "Thiết lập Avatar thất bại");
        }
    }

    //Phương thức bổ trợ trả về đối tượng ImageIcon khi vẫn là đường dẫn.
    public ImageIcon getUrlImage() {
        JFileChooser jfc = new JFileChooser("D:\\FPT_Semester_4_Block1\\DAM(SOF204)_SD18323\\FilesJavaASM\\JavaApplication33\\src\\com\\edusys\\icon\\");
        int result = jfc.showOpenDialog(null); //Kq thao tác của người dùng khi mở hộp thoại theo đường dẫn truyền vào.
        ImageIcon imgIcon = null;
        switch (result) {
            case JFileChooser.APPROVE_OPTION -> {
                File file = jfc.getSelectedFile();
                String filePath = file.getAbsolutePath();
                if (filePath.contains("logos")) {
                    imgIcon = Ximage.getImageIcon("logos", String.valueOf(file.getName()));
                    QL_NguoiHocJDialog.urlImage = String.valueOf(imgIcon); //Đặt biến toàn bộ để kiểm tra ở phương thức getUrlImage để xét trường hợp.
                    System.out.println(QL_NguoiHocJDialog.urlImage);
                } else if (filePath.contains("Image")) {
                    System.out.println(file.getName());
                    imgIcon = Ximage.getImageIcon("Image", String.valueOf(file.getName()));
                    QL_NguoiHocJDialog.urlImage = String.valueOf(imgIcon); //Đặt biến toàn bộ để kiểm tra ở phương thức getUrlImage để xét trường hợp.
                    System.out.println(QL_NguoiHocJDialog.urlImage);
                } else {
                    MsgBox.alter(this, "Thư mục ko hợp lệ.Thiết lập thất bại");
                }
                this.countVariable = 1; //Trường hợp chọn ảnh có chọn hình thì là 1.
            }
            //Trả về imgIcon ngày cả khi ko tìm thấy ảnh hợp lệ.
        }
        return imgIcon;
    }

    private NguoiHoc getObjectByFormForThem() {
        NguoiHoc nh1 = new NguoiHoc();
        nh1.setMaNH(txt_maNguoiHoc.getText());
        nh1.setHoTen(txt_hoVaTen.getText());
        nh1.setNgaySinh(XDate.toDate(txt_ngaySinh.getText(), "yyyy-MM-dd"));
        nh1.setDienThoai(txt_dienThoai.getText());
        nh1.setEmail(txt_email.getText());
        nh1.setGhiChu(ta_ghiChu.getText());
        boolean gioiTinh = cbb_gioiTinh.getSelectedItem().equals("Nam");
        nh1.setGioiTinh(gioiTinh);
        //Lấy đuôi của ảnh đang được thiết lập.
        ImageIcon icon = new ImageIcon(QL_NguoiHocJDialog.urlImage);
        System.out.println(icon);
        File file = new File(String.valueOf(icon));
        nh1.setHinh(file.getName());
        nh1.setMaNV("NV01");
        return nh1;
    }

    //Tường hợp đầu nó sửa mà ko thao tác với ảnh thì địa chỉ ảnh sẽ là đoàn kiểu mã hóa
    //Trường hợp nó mà click vào chọn ảnh thì nó sẽ dùng JFileChoooser. --> thì đag ko bắt đc ảnh nó thay đổi.
    //Thế nên mih cần bắt sự kiện là trước khi sửa nó có click vào thay đổi ảnh hay ko 
    //để biết biết nên dùng phương thức nào. 
    //Giá sử trường hợp có Click thì sẽ là 1 = dùng phương thức getObjectByFormForThem
    //Còn nếu ko click vào thì là 0 = getObjectByFormForUpdate. 
    //Thì nên đặt một biến toàn cục để bắt điều đó.
    //Có biến toàn cục để bắt sự kiện đó r. Giờ cần xét nhưng trường hợp ảnh bị Click 
    //Để khi nếu nó click vào ko phải với mục đích update thì nó vẫn là 0. Còn nếu là với mục đích update thì nó sẽ là 1.
    //Thì gồm các trường hợp nó sẽ là 0 khi : Nó nhấn vào ảnh r sau đó nhấn vào 
    private NguoiHoc getObjectByFormForUpdate() {
        NguoiHoc nh1 = new NguoiHoc();
        nh1.setMaNH(txt_maNguoiHoc.getText());
        nh1.setHoTen(txt_hoVaTen.getText());
        nh1.setNgaySinh(XDate.toDate(txt_ngaySinh.getText(), "yyyy-MM-dd"));
        nh1.setDienThoai(txt_dienThoai.getText());
        nh1.setEmail(txt_email.getText());
        nh1.setGhiChu(ta_ghiChu.getText());
        boolean gioiTinh = cbb_gioiTinh.getSelectedItem().equals("Nam");
        nh1.setGioiTinh(gioiTinh);
        //thiết lập tên ảnh
        NguoiHoc nh2 = nhd.selectById(txt_maNguoiHoc.getText());
        nh1.setHinh(nh2.getHinh());
        System.out.println(nh2.getHinh());
        nh1.setMaNV("NV01");
        return nh1;
    }
//Khi update nó sẽ có 2 kiểu hình thức đối với ảnh.
//Một là có sửa ảnh --> Thì nó sẽ lấy ảnh khi nó chọn qua JFileChooser. Là lấy ảnh mới.    
//Hai là ko sửa ảnh --> Thì ko sửa ảnh thì nó sẽ lấy đuôi ảnh theo đối tượng đc sửa    
//TH1: Nó nhấn vào click ảnh nhưng nó nhấn cancel --> nên để là 0 ( có nhấn update ) 
//TH2: Nó nhấn vào ảnh nó chọn --> Để là 1. ( Có nhấn update ) 
//TH3: Nó Click vào ảnh nó chọn cancel   --> là 0.
//Từ 2 TH trên mih xét đến trường hợp sau đó nó nhấn gì.
//TH nó có chọn ảnh mà nó nhấn vào mới thì   = 0
//TH có chọn ảnh  nhấn vaò xóa = 0 
//TH có chọn ảnh nhấn vào mới  = 0 
//TH có chọn ảnh nhấn vào thêm = 0 
//Nói chung dù TH nào mà nhấn khác ngoài update đều là 0;
//TH click lên bảng thì = 0    

}//end
