/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_cramer;

import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class frmlrCramer extends javax.swing.JFrame {
    double trans1,trans2,trans3,trans4,trans5,trans6,trans7,trans8,trans9;
    double adjT1,adjT2,adjT3,adjT4,adjT5,adjT6,adjT7,adjT8,adjT9;
    double div;
    double mDiv1,mDiv2,mDiv3,mDiv4,mDiv5,mDiv6,mDiv7,mDiv8,mDiv9;
    double cs2,cs4,cs6,cs8;//variables que guardan "n" numero y le cambia de signo 
                          //(si es positivo lo cambia a negativo o viceversa)
    
    /**
     * Creates new form Invesrsa_de_una_Matriz
     */
    public frmlrCramer() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        lbR1.setText("");
        lbR2.setText("");
        lbR3.setText("");
        lbR4.setText("");
        lbR5.setText("");
        lbR6.setText("");
        lbR7.setText("");
        lbR8.setText("");
        lbR9.setText("");
    }
    
    //redondear a dos decimales
     private Double redo(Double N){
        return (Math.rint(N*100)/100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCamp2 = new javax.swing.JTextField();
        txtCamp3 = new javax.swing.JTextField();
        txtCamp4 = new javax.swing.JTextField();
        txtCamp1 = new javax.swing.JTextField();
        txtCamp5 = new javax.swing.JTextField();
        txtCamp6 = new javax.swing.JTextField();
        txtCamp7 = new javax.swing.JTextField();
        txtCamp8 = new javax.swing.JTextField();
        txtCamp9 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbR2 = new javax.swing.JLabel();
        lbR3 = new javax.swing.JLabel();
        lbR4 = new javax.swing.JLabel();
        lbR1 = new javax.swing.JLabel();
        lbR5 = new javax.swing.JLabel();
        lbR6 = new javax.swing.JLabel();
        lbR8 = new javax.swing.JLabel();
        lbR9 = new javax.swing.JLabel();
        lbR7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtConst2 = new javax.swing.JTextField();
        txtConst3 = new javax.swing.JTextField();
        txtConst1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_y = new javax.swing.JTextField();
        txt_z = new javax.swing.JTextField();
        txt_x = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        txtCamp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp2ActionPerformed(evt);
            }
        });

        txtCamp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp3ActionPerformed(evt);
            }
        });

        txtCamp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp4ActionPerformed(evt);
            }
        });

        txtCamp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp1ActionPerformed(evt);
            }
        });

        txtCamp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp5ActionPerformed(evt);
            }
        });

        txtCamp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp6ActionPerformed(evt);
            }
        });

        txtCamp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp7ActionPerformed(evt);
            }
        });

        txtCamp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp8ActionPerformed(evt);
            }
        });

        txtCamp9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamp9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Z");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("X");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCamp7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(txtCamp4)
                    .addComponent(txtCamp1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCamp2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCamp5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(txtCamp8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCamp6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCamp3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCamp5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCamp7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamp9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbR2.setText("Resultado");

        lbR3.setText("Resultado");

        lbR4.setText("Resultado");

        lbR1.setText("Resultado");

        lbR5.setText("Resultado");

        lbR6.setText("Resultado");

        lbR8.setText("Resultado");

        lbR9.setText("Resultado");

        lbR7.setText("Resultado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbR4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbR8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbR5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbR2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbR3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbR2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbR4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbR8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbR7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Ingrese los datos de la matriz:");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Resultado de la matriz inversa: ");

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Determinate:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("REGLA DE CRAMER");

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConst1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConst3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConst2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtConst1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(txtConst2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtConst3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Ingresar constantes: ");

        txt_y.setEditable(false);
        txt_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yActionPerformed(evt);
            }
        });

        txt_z.setEditable(false);
        txt_z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_zActionPerformed(evt);
            }
        });

        txt_x.setEditable(false);
        txt_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_xActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Determinantes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(txt_x, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_y, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(txt_z, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_x, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_y, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_z, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCamp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp2ActionPerformed

    private void txtCamp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp3ActionPerformed

    private void txtCamp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp4ActionPerformed

    private void txtCamp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp1ActionPerformed

    private void txtCamp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp5ActionPerformed

    private void txtCamp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp6ActionPerformed

    private void txtCamp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp7ActionPerformed

    private void txtCamp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp8ActionPerformed

    private void txtCamp9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamp9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamp9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            double posic1=Double.parseDouble(txtCamp1.getText());
            double posic2=Double.parseDouble(txtCamp2.getText());
            double posic3=Double.parseDouble(txtCamp3.getText());
            double posic4=Double.parseDouble(txtCamp4.getText());
            double posic5=Double.parseDouble(txtCamp5.getText());
            double posic6=Double.parseDouble(txtCamp6.getText());
            double posic7=Double.parseDouble(txtCamp7.getText());
            double posic8=Double.parseDouble(txtCamp8.getText());
            double posic9=Double.parseDouble(txtCamp9.getText());
            
            //Determinate por el metodo de Sarrus
            double p1 = posic1*posic5*posic9;
            double p2 = posic4*posic8*posic3;
            double p3 = posic7*posic2*posic6;
            
            double resultado1 = p1+p2+p3;
            
            double n1 = posic3*posic5*posic7;
            double n2 = posic6*posic8*posic1;
            double n3 = posic9*posic2*posic4;
            
            double resultado2 = n1+n2+n3;
            double determinante = resultado1-resultado2;
            jTextField1.setText(""+redo(determinante));
            
            //REGLA CRAMER
            double constante1=Double.parseDouble(txtConst1.getText());
            double constante2=Double.parseDouble(txtConst2.getText());
            double constante3=Double.parseDouble(txtConst3.getText());
            
            //Encontrar det X
            double x1 =constante1*posic5*posic9;
            double x2 =posic2*posic6*constante3;
            double x3 =posic3*constante2*posic8;
            double resultadoX1 = x1+x2+x3;
            
            double x4 =posic3*posic5*constante3;
            double x5 =constante1*posic6*posic8;
            double x6 =posic2*constante2*posic9;
            double resultadoX2 = x4+x5+x6;
            double determinanteX = (resultadoX1-resultadoX2)/determinante;
            txt_x.setText("X= "+redo(determinanteX));
            
            //Encontrar det Y
            double y1 =posic1*constante2*posic9;
            double y2 =posic4*constante3*posic3;
            double y3 =posic7*constante1*posic6;
            double resultadoY1 = y1+y2+y3;
            
            double y4 =posic3*constante2*posic7;
            double y5 =posic6*constante3*posic1;
            double y6 =posic9*constante1*posic4;
            double resultadoY2 = y4+y5+y6;
            double determinanteY = (resultadoY1 - resultadoY2)/determinante;
            txt_y.setText("Y= "+redo(determinanteY));
          
            //Encontrar det Z
            double z1 =posic1*posic5*constante3;
            double z2 =posic2*constante2*posic7;
            double z3 =constante1*posic4*posic8;
            double resultadoZ1 = z1+z2+z3;
            
            double z4 =constante1*posic5*posic7;
            double z5 =posic1*constante2*posic8;
            double z6 =posic2*posic4*constante3;
            double resultadoZ2 = z4+z5+z6;
            double determinanteZ = (resultadoZ1-resultadoZ2)/determinante;
            txt_z.setText("Z= "+redo(determinanteZ));
            
    
            //Transpuesta = convertimos filas a columnas
            trans1=posic1;
            trans2=posic4;
            trans3=posic7;
            trans4=posic2;
            trans5=posic5;
            trans6=posic8;
            trans7=posic3;
            trans8=posic6;
            trans9=posic9;
            
            //Adjunta
            adjT1=(trans5*trans9)-(trans6*trans8);
            adjT2=(trans4*trans9)-(trans6*trans7);
            adjT3=(trans4*trans8)-(trans5*trans7);
            adjT4=(trans2*trans9)-(trans3*trans8);
            adjT5=(trans1*trans9)-(trans3*trans7);
            adjT6=(trans1*trans8)-(trans2*trans7);
            adjT7=(trans2*trans6)-(trans3*trans5);
            adjT8=(trans1*trans6)-(trans3*trans4);
            adjT9=(trans1*trans5)-(trans2*trans4);
            
            //inversa
            
            div=1/determinante;
            
            mDiv1=div*adjT1;
            mDiv2=div*adjT2;
            mDiv3=div*adjT3;
            mDiv4=div*adjT4;
            mDiv5=div*adjT5;
            mDiv6=div*adjT6;
            mDiv7=div*adjT7;
            mDiv8=div*adjT8;
            mDiv9=div*adjT9;
            //multiplicacion para el cambio de signo
            cs2=mDiv2*-1;
            cs4=mDiv4*-1;
            cs6=mDiv6*-1;
            cs8=mDiv8*-1;
            
            lbR1.setText(""+redo(mDiv1));
            lbR2.setText(""+redo(cs2));//cambia de signo
            lbR3.setText(""+redo(mDiv3));
            lbR4.setText(""+redo(cs4));//cambia de signo
            lbR5.setText(""+redo(mDiv5));
            lbR6.setText(""+redo(cs6));//cambia de signo
            lbR7.setText(""+redo(mDiv7));
            lbR8.setText(""+redo(cs8));//cambia de signo
            lbR9.setText(""+redo(mDiv9));
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al encontrar los determinates e inversa, revise que los campos esten llenos (matriz y constantes)");
            lbR1.setText("");
            lbR2.setText("");
            lbR3.setText("");
            lbR4.setText("");
            lbR5.setText("");
            lbR6.setText("");
            lbR7.setText("");
            lbR8.setText("");
            lbR9.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(this,"??Seguro que desea salir?")>0) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yActionPerformed

    private void txt_zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_zActionPerformed

    private void txt_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_xActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmlrCramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlrCramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlrCramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlrCramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlrCramer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbR1;
    private javax.swing.JLabel lbR2;
    private javax.swing.JLabel lbR3;
    private javax.swing.JLabel lbR4;
    private javax.swing.JLabel lbR5;
    private javax.swing.JLabel lbR6;
    private javax.swing.JLabel lbR7;
    private javax.swing.JLabel lbR8;
    private javax.swing.JLabel lbR9;
    private javax.swing.JTextField txtCamp1;
    private javax.swing.JTextField txtCamp2;
    private javax.swing.JTextField txtCamp3;
    private javax.swing.JTextField txtCamp4;
    private javax.swing.JTextField txtCamp5;
    private javax.swing.JTextField txtCamp6;
    private javax.swing.JTextField txtCamp7;
    private javax.swing.JTextField txtCamp8;
    private javax.swing.JTextField txtCamp9;
    private javax.swing.JTextField txtConst1;
    private javax.swing.JTextField txtConst2;
    private javax.swing.JTextField txtConst3;
    private javax.swing.JTextField txt_x;
    private javax.swing.JTextField txt_y;
    private javax.swing.JTextField txt_z;
    // End of variables declaration//GEN-END:variables
}
