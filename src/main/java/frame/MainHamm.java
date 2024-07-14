package frame;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class MainHamm extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public MainHamm() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
       //rsscalelabel.RSScaleLabel.setScaleLabel(jLabel9,"src/images/a.png");
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imageL = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        protegerB = new javax.swing.JButton();
        desprotegerB = new javax.swing.JButton();
        extension1 = new javax.swing.JLabel();
        extension2 = new javax.swing.JLabel();
        tituloHamming = new javax.swing.JLabel();
        aux0 = new javax.swing.JPanel();
        exitB = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        fondo4 = new javax.swing.JLabel();
        fondo0 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(28, 40, 61));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 26, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1026, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jPanel2.setBackground(new java.awt.Color(18, 26, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sec.png"))); // NOI18N
        imageL.setText("jLabel1");
        jPanel2.add(imageL, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 580, 440));

        menuPanel.setBackground(new java.awt.Color(28, 40, 61));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        protegerB.setBackground(new java.awt.Color(18, 26, 51));
        protegerB.setFont(new java.awt.Font("Roboto Cn", 0, 24)); // NOI18N
        protegerB.setForeground(new java.awt.Color(43, 183, 246));
        protegerB.setText("PROTEGER UN ARCHIVO");
        protegerB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        protegerB.setMaximumSize(new java.awt.Dimension(336, 36));
        protegerB.setMinimumSize(new java.awt.Dimension(336, 36));
        protegerB.setPreferredSize(new java.awt.Dimension(336, 36));
        protegerB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                protegerBMouseClicked(evt);
            }
        });
        protegerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protegerBActionPerformed(evt);
            }
        });

        desprotegerB.setBackground(new java.awt.Color(18, 26, 51));
        desprotegerB.setFont(new java.awt.Font("Roboto Cn", 0, 24)); // NOI18N
        desprotegerB.setForeground(new java.awt.Color(43, 183, 246));
        desprotegerB.setText("DESPROTEGER UN ARCHIVO");
        desprotegerB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        desprotegerB.setMaximumSize(new java.awt.Dimension(336, 36));
        desprotegerB.setMinimumSize(new java.awt.Dimension(336, 36));
        desprotegerB.setPreferredSize(new java.awt.Dimension(336, 36));
        desprotegerB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desprotegerBMouseClicked(evt);
            }
        });
        desprotegerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desprotegerBActionPerformed(evt);
            }
        });

        extension1.setBackground(new java.awt.Color(51, 51, 51));
        extension1.setForeground(new java.awt.Color(102, 102, 102));
        extension1.setText(".txt, .huf");

        extension2.setBackground(new java.awt.Color(153, 153, 153));
        extension2.setForeground(new java.awt.Color(102, 102, 102));
        extension2.setText(".HAx .HEx");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(extension1)
                    .addComponent(extension2)
                    .addComponent(desprotegerB, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(protegerB, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(protegerB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extension1)
                .addGap(42, 42, 42)
                .addComponent(desprotegerB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extension2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 460, 300));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1030, 410));

        tituloHamming.setFont(new java.awt.Font("Roboto", 1, 52)); // NOI18N
        tituloHamming.setForeground(new java.awt.Color(218, 236, 255));
        tituloHamming.setText("HAMMING CODE");
        tituloHamming.setToolTipText("");
        background.add(tituloHamming, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 440, 50));

        aux0.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout aux0Layout = new javax.swing.GroupLayout(aux0);
        aux0.setLayout(aux0Layout);
        aux0Layout.setHorizontalGroup(
            aux0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        aux0Layout.setVerticalGroup(
            aux0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        background.add(aux0, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 390, 50));

        exitB.setBackground(new java.awt.Color(18, 26, 51));
        exitB.setFont(new java.awt.Font("Roboto Slab", 0, 16)); // NOI18N
        exitB.setForeground(new java.awt.Color(255, 255, 255));
        exitB.setText("SALIR");
        exitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBActionPerformed(evt);
            }
        });
        background.add(exitB, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 90, 30));

        volver.setBackground(new java.awt.Color(18, 26, 51));
        volver.setFont(new java.awt.Font("Roboto Slab", 0, 15)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("VOLVER");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        background.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.gif"))); // NOI18N
        fondo2.setText("jLabel6");
        background.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 650, 320));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.gif"))); // NOI18N
        fondo3.setText("jLabel6");
        background.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 600, 80));

        fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.gif"))); // NOI18N
        fondo4.setText("jLabel6");
        background.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 580, 70));

        fondo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.gif"))); // NOI18N
        fondo0.setText("jLabel6");
        background.add(fondo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 580, 70));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.gif"))); // NOI18N
        fondo1.setText("jLabel6");
        background.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 20, 580, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void protegerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protegerBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_protegerBActionPerformed

    private void desprotegerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desprotegerBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desprotegerBActionPerformed

    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBActionPerformed

    private void protegerBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_protegerBMouseClicked
            // TODO add your handling code here:
        ProtegerFrame p = new ProtegerFrame();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_protegerBMouseClicked

    private void desprotegerBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desprotegerBMouseClicked
        // TODO add your handling code here:
        DesprotegerFrame d = new DesprotegerFrame();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_desprotegerBMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        // TODO add your handling code here:
        mainMenu m = new mainMenu(); //crea ventana principal
        this.dispose(); //cierra la ventana actual
        m.setVisible(true);//hace visible la nueva ventana
    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(MainHamm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHamm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHamm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHamm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new MainHamm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aux0;
    private javax.swing.JPanel background;
    private javax.swing.JButton desprotegerB;
    private javax.swing.JButton exitB;
    private javax.swing.JLabel extension1;
    private javax.swing.JLabel extension2;
    private javax.swing.JLabel fondo0;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel fondo4;
    private javax.swing.JLabel imageL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton protegerB;
    private javax.swing.JLabel tituloHamming;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
