
package vn.viettuts.qlsv.view;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import vn.viettuts.qlsv.dao.DoanvienDao;
import vn.viettuts.qlsv.entity.Doanvien;



public class AddFrame extends javax.swing.JFrame {
    DoanvienDao nhanviendao;
   
    
    public AddFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        addid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        adddiachi = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        addrenluyen = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        addgpa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        addten = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        addnam = new javax.swing.JCheckBox();
        addnu = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Buttonhuybo = new javax.swing.JButton();
        Buttonluu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addifdangvien = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addchibo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addchidoan = new javax.swing.JComboBox<>();
        addngaysinh = new com.toedter.calendar.JDateChooser();
        addnvd = new com.toedter.calendar.JDateChooser();
        adddoanphi = new javax.swing.JComboBox<>();
        adddangphi = new javax.swing.JComboBox<>();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addid.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        addid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addidActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Số thẻ Đảng");

        adddiachi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        adddiachi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adddiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddiachiActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Địa chỉ");

        addrenluyen.setFont(addrenluyen.getFont().deriveFont(addrenluyen.getFont().getSize()+2f));
        addrenluyen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addrenluyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrenluyenActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Điểm Rèn luyện");

        addgpa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        addgpa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgpaActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Điểm GPA");

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Họ Tên");

        addten.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        addten.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtenActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Giới tính");

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Ngày sinh");

        addnam.setBackground(new java.awt.Color(255, 255, 255));
        addnam.setText("Nam");
        addnam.setBorder(null);
        addnam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addnamMouseClicked(evt);
            }
        });
        addnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnamActionPerformed(evt);
            }
        });

        addnu.setBackground(new java.awt.Color(255, 255, 255));
        addnu.setText("Nữ");
        addnu.setBorder(null);
        addnu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addnuMouseClicked(evt);
            }
        });
        addnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnuActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NHẬP THÔNG TIN SINH VIÊN");

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\quanlydoan\\src\\main\\resources\\img\\ANND.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jLabel1))))
                .addGap(16, 16, 16))
        );

        Buttonhuybo.setBackground(new java.awt.Color(0, 102, 255));
        Buttonhuybo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Buttonhuybo.setForeground(new java.awt.Color(255, 255, 255));
        Buttonhuybo.setText("Hủy bỏ");
        Buttonhuybo.setBorder(null);
        Buttonhuybo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonhuyboMouseClicked(evt);
            }
        });

        Buttonluu.setBackground(new java.awt.Color(0, 102, 255));
        Buttonluu.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Buttonluu.setForeground(new java.awt.Color(255, 255, 255));
        Buttonluu.setText("Lưu");
        Buttonluu.setBorder(null);
        Buttonluu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonluuMouseClicked(evt);
            }
        });
        Buttonluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonluuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Chi đoàn");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Đảng Viên");

        addifdangvien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đảng Viên", "Không" }));
        addifdangvien.setBorder(null);
        addifdangvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addifdangvienActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày vào Đảng");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Chi Bộ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Đảng Phí");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setText("*Nếu không phải Đảng viên thì bỏ qua bên dưới");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Đoàn Phí");

        addchidoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B1D54", "B2D54", "B3D54", "B4D54", "B5D54" }));

        adddoanphi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã đóng", "Chưa đóng" }));

        adddangphi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã đóng", "Chưa đóng"}));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel22))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addgpa)
                            .addComponent(adddiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addrenluyen)
                            .addComponent(addten)
                            .addComponent(addchidoan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(76, 76, 76)
                        .addComponent(addnam)
                        .addGap(18, 18, 18)
                        .addComponent(addnu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Buttonhuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buttonluu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addifdangvien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adddoanphi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addchibo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(addid)
                                    .addComponent(addnvd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adddangphi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(adddoanphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(addifdangvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addnam)
                            .addComponent(addnu))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adddiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addnvd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addgpa)
                    .addComponent(jLabel6)
                    .addComponent(addchibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addrenluyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adddangphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Buttonhuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonluu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addchidoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        setSize(new java.awt.Dimension(801, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void adddiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddiachiActionPerformed
     
    }//GEN-LAST:event_adddiachiActionPerformed

    private void addrenluyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrenluyenActionPerformed

    }//GEN-LAST:event_addrenluyenActionPerformed

    private void addgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgpaActionPerformed
      
    }//GEN-LAST:event_addgpaActionPerformed

    private void addtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtenActionPerformed
        
    }//GEN-LAST:event_addtenActionPerformed

    private void addnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnuActionPerformed
        
    }//GEN-LAST:event_addnuActionPerformed

    private void ButtonhuyboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonhuyboMouseClicked
        this.ClearBangthem();
        this.setVisible(false);
    }//GEN-LAST:event_ButtonhuyboMouseClicked

    private void ButtonluuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonluuMouseClicked
        this.ClearBangthem();
        this.setVisible(false);       
      
    }//GEN-LAST:event_ButtonluuMouseClicked

    private void addnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnamActionPerformed
       
    }//GEN-LAST:event_addnamActionPerformed

    private void addnamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnamMouseClicked
        addnu.setSelected(false);
    }//GEN-LAST:event_addnamMouseClicked

    private void addnuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnuMouseClicked
       addnam.setSelected(false);
    }//GEN-LAST:event_addnuMouseClicked

    private void ButtonluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonluuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonluuActionPerformed

    private void addifdangvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addifdangvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addifdangvienActionPerformed

    private void addidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addidActionPerformed

    }//GEN-LAST:event_addidActionPerformed
    // phuong thuc hien thong bao
     public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
   public Doanvien getNhanvienInfo(){
        if( !validateTen()|| !validateID()|| !validateNgaysinh()
            || !validateGioitinh()|| !validateDiachi()
            || !validateLuong()|| !validateChuyenmon() || !validateCB() || !validateNvd() ){
            return null;
        }
        try{
        Doanvien nhanvien = new Doanvien();
        nhanvien.setId(addid.getText());
        nhanvien.setName(addten.getText().trim());
       // nhanvien.setAge(addngaysinh.getText());
      //  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       // nhanvien.setAge(sdf.format(ngaysinh));
        Date ngaysinh = addngaysinh.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        nhanvien.setAge(sdf.format(ngaysinh));
       
                 String typ = addifdangvien.getSelectedItem().toString().trim();
        if (typ.equals("Đảng Viên")) {
            
          Date ngayvd = addnvd.getDate();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        nhanvien.setNvd(sd.format(ngayvd));
        } else if (typ.equals("Không")) {
               
        }
        nhanvien.setAddress(adddiachi.getText().trim());
        if (addnam.isSelected())
             nhanvien.setSex("Nam"); 
        else if(addnu.isSelected())
             nhanvien.setSex("Nữ");
        
        String type = addifdangvien.getSelectedItem().toString().trim();
        if (type.equals("Đảng Viên")) {
            nhanvien.setTinhtrang(type);
          
        } else if (type.equals("Không")) {
            nhanvien.setTinhtrang(type);    
        }
         
        String t = addchidoan.getSelectedItem().toString().trim();
        if (t.equals("B1D54")) {
            nhanvien.setLop(t);
          
        } else if (t.equals("B2D54")) {
            nhanvien.setLop(t);    
        }
        else if(t.equals("B3D54")) {
            nhanvien.setLop(t);
        }
          else if(t.equals("B4D54")) {
            nhanvien.setLop(t);
        }
          else if(t.equals("B5D54")) {
            nhanvien.setLop(t);
        }
      //  nhanvien.setSdt(addsdt.getText().trim());
       // nhanvien.setChucvu(addchucvu.getText().trim());
        nhanvien.setGpa(Double.parseDouble(addgpa.getText().trim()));
        nhanvien.setDrl(Double.parseDouble(addrenluyen.getText().trim()));
       // nhanvien.setLop(addchidoan.getText().trim());
         nhanvien.setChibo(addchibo.getText().trim());
          
         String doanphi = adddoanphi.getSelectedItem().toString().trim();
        if (doanphi.equals("Đã đóng")) {
            nhanvien.setDoanphi(doanphi);
          
        } else if (doanphi.equals("Chưa đóng")) {
            nhanvien.setDoanphi(doanphi);    
        }
        
        String dangphi = adddangphi.getSelectedItem().toString().trim();
        if (dangphi.equals("Đã đóng")) {
            nhanvien.setDangphi(dangphi);
          
        } else if (dangphi.equals("Chưa đóng")) {
            nhanvien.setDangphi(dangphi);    
        }
        return nhanvien;
        } catch(Exception e){
            showMessage(e.getMessage());
        }
        return null;       
    }
    
    private boolean validateTen() {
        String ten = addten.getText();
        if (ten == null || "".equals(ten.trim())) {
            addten.requestFocus();
            showMessage("Tên sinh viên không được trống!");
            return false;
        }
        return true;
    }
    
  private boolean validateID() {
    String bienso = addid.getText();
    String tinhtrang = addifdangvien.getSelectedItem().toString().trim();
    
    if ("Đảng Viên".equals(tinhtrang)) {
        if (bienso == null || bienso.trim().isEmpty()) {
            showMessage("Mã thẻ Đảng không được trống!");
            return false;
        }
    } else if ("Không".equals(tinhtrang)) {
        if (bienso != null && !bienso.trim().isEmpty()) {
            showMessage("Không là đảng viên, không thể nhập mã thẻ Đảng !");
            addid.setText(""); // Xóa giá trị của ID
            return false;
        }
    }
    
    return true; // Trả về true nếu ID hợp lệ
}
  private boolean validateCB() {
    String bienso = addchibo.getText();
    String tinhtrang = addifdangvien.getSelectedItem().toString().trim();
    
    if ("Đảng Viên".equals(tinhtrang)) {
        if (bienso == null || bienso.trim().isEmpty()) {
            showMessage("Chi bộ không được trống!");
            return false;
        }
    } else if ("Không".equals(tinhtrang)) {
        if (bienso != null && !bienso.trim().isEmpty()) {
            showMessage("Không là đảng viên, không thể chi bộ !");
            addchibo.setText(""); // Xóa giá trị của ID
            return false;
        }
    }
    
    return true; // Trả về true nếu ID hợp lệ
}
 
  private boolean validateNvd() {
    Date bienso = addnvd.getDate();
    String tinhtrang = addifdangvien.getSelectedItem().toString().trim();
    
    if ("Đảng Viên".equals(tinhtrang)) {
        if (bienso == null ) {
            showMessage("Ngày vào Đảng không được trống!");
            return false;
        }
    } else if ("Không".equals(tinhtrang)) {
        
        
    }
    
    return true; // Trả về true nếu ID hợp lệ
}
   private boolean validateNgaysinh() {
        try {
            java.util.Date today=new java.util.Date();
            Date date=addngaysinh.getDate();
            if (date.compareTo(today)==1) {
                addngaysinh.requestFocus();
                showMessage("Ngày nhập không tồn tại hoặc lớn hơn ngày hôm nay");
                return false;
            }
        } catch (Exception e) {
            addngaysinh.requestFocus();
            showMessage("Bạn đã nhập ngày sai định dạng");
            return false;
        }
        return true;
    }
  /*
     private boolean validateNgaysinh() {
        try {
            java.util.Date today=new java.util.Date();
            Date date=addngaysinh.getDate();
            if (date.compareTo(today)==1) {
                addngaysinh.requestFocus();
                showMessage("Ngày nhập không tồn tại hoặc lớn hơn ngày hôm nay");
                return false;
            }
        } catch (Exception e) {
            addngaysinh.requestFocus();
            showMessage("Bạn đã nhập ngày sai định dạng");
            return false;
        }
        return true;
    }
  */
     /*
     private boolean validateSdt() {
        String bienso = addsdt.getText();
        if (bienso == null || "".equals(bienso.trim())) {
            addsdt.requestFocus();
            showMessage("Số điện thoại không được trống!");
            return false;
        }
        return true;
    }*/
     
     private boolean validateGioitinh() {
        if (!addnam.isSelected() && !addnu.isSelected()) {
            showMessage("Bạn chưa chọn giới tính");
            return false;
        }
        return true;
    }
     private boolean validateDiachi() {
        String bienso = adddiachi.getText();
        if (bienso == null || "".equals(bienso.trim())) {
            adddiachi.requestFocus();
            showMessage("Quê quán không được trống!");
            return false;
        }
        return true;
     }
  
  
    
    private boolean validateLuong() {
        String bienso = addgpa.getText();
        if (bienso == null || "".equals(bienso.trim())) {
            addgpa.requestFocus();
            showMessage("Điểm GPA không được trống!");
            return false;
        }
        return true;
    }
    private boolean validateChuyenmon() {
        String bienso = addrenluyen.getText();
        if (bienso == null || "".equals(bienso.trim())) {
            addrenluyen.requestFocus();
            showMessage("Điểm rèn luyện không được trống!");
            return false;
        }
        return true;
    }
    /*
    private boolean validateTruong() {
        String bienso = addchidoan.getText();
        if (bienso == null || "".equals(bienso.trim())) {
            addchidoan.requestFocus();
            showMessage("Trường không được trống!");
            return false;
        }
        return true;
    }
    */
    
        public void ClearBangthem() {
        this.addid.setText("");
        this.addten.setText("");
        this.addnam.setSelected(false);
        this.addnu.setSelected(false);
        this.addngaysinh.setDate(null);
        this.adddiachi.setText("");
        this.addgpa.setText("");
     //   this.ad.setText("");
        this.addrenluyen.setText("");
       // this.addsdt.setText("");
       // this.addchidoan.setText("");
      //  this.adddoanphi.setText("");
        this.addchibo.setText("");
       //  this.adddangphi.setText("");
          this.addnvd.setDate(null);
    }
        
     public void addThemNhanvienListener(ActionListener listener) {
        Buttonluu.addActionListener(listener);
    }
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonhuybo;
    private javax.swing.JButton Buttonluu;
    private javax.swing.JTextField addchibo;
    private javax.swing.JComboBox<String> addchidoan;
    private javax.swing.JComboBox<String> adddangphi;
    private javax.swing.JTextField adddiachi;
    private javax.swing.JComboBox<String> adddoanphi;
    private javax.swing.JTextField addgpa;
    private javax.swing.JTextField addid;
    private javax.swing.JComboBox<String> addifdangvien;
    private javax.swing.JCheckBox addnam;
    private com.toedter.calendar.JDateChooser addngaysinh;
    private javax.swing.JCheckBox addnu;
    private com.toedter.calendar.JDateChooser addnvd;
    private javax.swing.JTextField addrenluyen;
    private javax.swing.JTextField addten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
