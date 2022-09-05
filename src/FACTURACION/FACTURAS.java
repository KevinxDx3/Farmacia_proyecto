/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FACTURACION;

public class FACTURAS extends javax.swing.JPanel {
  

    public FACTURAS() {
        initComponents();
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RUCLABEL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CANTIDADTXT = new javax.swing.JTextField();
        Producostxt = new javax.swing.JTextField();
        Preciotxt = new javax.swing.JTextField();
        precioFinalTxt = new javax.swing.JTextField();
        Producostxt1 = new javax.swing.JTextField();
        Preciotxt1 = new javax.swing.JTextField();
        precioFinalTxt1 = new javax.swing.JTextField();
        CANTIDADTXT1 = new javax.swing.JTextField();
        Producostxt2 = new javax.swing.JTextField();
        Preciotxt2 = new javax.swing.JTextField();
        precioFinalTxt2 = new javax.swing.JTextField();
        Producostxt3 = new javax.swing.JTextField();
        Preciotxt3 = new javax.swing.JTextField();
        precioFinalTxt3 = new javax.swing.JTextField();
        CANTIDADTXT2 = new javax.swing.JTextField();
        CANTIDADTXT3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Subtotaltxt = new javax.swing.JTextField();
        IVAtxt = new javax.swing.JTextField();
        TotalTxt = new javax.swing.JTextField();
        EjecutarBT = new javax.swing.JButton();
        RucLabel = new javax.swing.JLabel();

        jLabel1.setText("FACTURA FARMACIA ");

        jLabel2.setText("RUC:");

        jLabel3.setText("CANTIDAD");

        jLabel4.setText("PRODUCTOS");

        jLabel5.setText("PRECIO");

        jLabel6.setText("PRECIO TOTAL");

        CANTIDADTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADTXTActionPerformed(evt);
            }
        });

        Producostxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProducostxtActionPerformed(evt);
            }
        });

        Preciotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreciotxtActionPerformed(evt);
            }
        });

        Producostxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producostxt1ActionPerformed(evt);
            }
        });

        Preciotxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Preciotxt1ActionPerformed(evt);
            }
        });

        precioFinalTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFinalTxt1ActionPerformed(evt);
            }
        });

        CANTIDADTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADTXT1ActionPerformed(evt);
            }
        });

        Producostxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producostxt2ActionPerformed(evt);
            }
        });

        Preciotxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Preciotxt2ActionPerformed(evt);
            }
        });

        Producostxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producostxt3ActionPerformed(evt);
            }
        });

        Preciotxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Preciotxt3ActionPerformed(evt);
            }
        });

        precioFinalTxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFinalTxt3ActionPerformed(evt);
            }
        });

        CANTIDADTXT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADTXT2ActionPerformed(evt);
            }
        });

        CANTIDADTXT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADTXT3ActionPerformed(evt);
            }
        });

        jLabel7.setText("SUBTOTAL");

        jLabel8.setText("IVA");

        jLabel9.setText("TOTAL");

        EjecutarBT.setText("Ejecutar");
        EjecutarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(RucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RUCLABEL)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EjecutarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Subtotaltxt)
                                    .addComponent(IVAtxt)
                                    .addComponent(TotalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                            .addComponent(precioFinalTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CANTIDADTXT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Producostxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CANTIDADTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Producostxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Preciotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Preciotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(precioFinalTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CANTIDADTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Producostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CANTIDADTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Producostxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Preciotxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(precioFinalTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(precioFinalTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(RUCLABEL)
                    .addComponent(RucLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANTIDADTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioFinalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANTIDADTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producostxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preciotxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioFinalTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANTIDADTXT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producostxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preciotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioFinalTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANTIDADTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producostxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preciotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioFinalTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Subtotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(IVAtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EjecutarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String [] args){
     
        FACTURAS fack=new FACTURAS();
        fack.setVisible(true);
    }
   
    private void CANTIDADTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDADTXTActionPerformed

    private void PreciotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreciotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreciotxtActionPerformed

    private void ProducostxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProducostxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProducostxtActionPerformed

    private void Producostxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producostxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producostxt1ActionPerformed

    private void Preciotxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Preciotxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Preciotxt1ActionPerformed

    private void CANTIDADTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDADTXT1ActionPerformed

    private void precioFinalTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFinalTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFinalTxt1ActionPerformed

    private void Producostxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producostxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producostxt2ActionPerformed

    private void Preciotxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Preciotxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Preciotxt2ActionPerformed

    private void Producostxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producostxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producostxt3ActionPerformed

    private void Preciotxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Preciotxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Preciotxt3ActionPerformed

    private void precioFinalTxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFinalTxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFinalTxt3ActionPerformed

    private void CANTIDADTXT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADTXT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDADTXT2ActionPerformed

    private void CANTIDADTXT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADTXT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDADTXT3ActionPerformed

    private void EjecutarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarBTActionPerformed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_EjecutarBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CANTIDADTXT;
    private javax.swing.JTextField CANTIDADTXT1;
    private javax.swing.JTextField CANTIDADTXT2;
    private javax.swing.JTextField CANTIDADTXT3;
    private javax.swing.JButton EjecutarBT;
    private javax.swing.JTextField IVAtxt;
    private javax.swing.JTextField Preciotxt;
    private javax.swing.JTextField Preciotxt1;
    private javax.swing.JTextField Preciotxt2;
    private javax.swing.JTextField Preciotxt3;
    private javax.swing.JTextField Producostxt;
    private javax.swing.JTextField Producostxt1;
    private javax.swing.JTextField Producostxt2;
    private javax.swing.JTextField Producostxt3;
    private javax.swing.JLabel RUCLABEL;
    private javax.swing.JLabel RucLabel;
    private javax.swing.JTextField Subtotaltxt;
    private javax.swing.JTextField TotalTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField precioFinalTxt;
    private javax.swing.JTextField precioFinalTxt1;
    private javax.swing.JTextField precioFinalTxt2;
    private javax.swing.JTextField precioFinalTxt3;
    // End of variables declaration//GEN-END:variables
}
