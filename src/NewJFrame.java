/*
Mouner Dabjan 
January 15 2019 
This program is created to rperesent the user about most paid players in the soccer fields
 */

/**
 *
 * @author modab5310
 */
public class NewJFrame extends javax.swing.JFrame {

    /*
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
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
        title = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        paul = new javax.swing.JButton();
        pic2 = new javax.swing.JLabel();
        gareth = new javax.swing.JButton();
        pic3 = new javax.swing.JLabel();
        neymar = new javax.swing.JButton();
        pic4 = new javax.swing.JLabel();
        cr7 = new javax.swing.JButton();
        pic5 = new javax.swing.JLabel();
        leo = new javax.swing.JButton();
        sub = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Most Paid Soccer Players  ($)");

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (6).jpg"))); // NOI18N

        paul.setText("Paul Pogba");
        paul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paulActionPerformed(evt);
            }
        });

        pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (7).jpg"))); // NOI18N

        gareth.setText("Gareth Bale");
        gareth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garethActionPerformed(evt);
            }
        });

        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (8).jpg"))); // NOI18N

        neymar.setText("Neymar Jr");
        neymar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neymarActionPerformed(evt);
            }
        });

        pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (9).jpg"))); // NOI18N

        cr7.setText("Cristiano Ronaldo");
        cr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr7ActionPerformed(evt);
            }
        });

        pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (11).jpg"))); // NOI18N

        leo.setText("Lionel Messi ");
        leo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leoActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sub.setText("Choose the player you want to know more about!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(paul))
                            .addComponent(pic1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gareth)
                            .addComponent(pic2))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pic3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pic4)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(neymar)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pic5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cr7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(leo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sub)
                    .addComponent(title))
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic2)
                    .addComponent(pic1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paul)
                    .addComponent(gareth))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic3)
                    .addComponent(pic4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neymar)
                    .addComponent(cr7)
                    .addComponent(pic5))
                .addGap(18, 18, 18)
                .addComponent(leo)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paulActionPerformed

        //Setting the current screen invisible and setting Paul Pogba's screen visible
        this.setVisible(false);
        new PaulFrame().setVisible(true); 
    }//GEN-LAST:event_paulActionPerformed

    private void garethActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garethActionPerformed
       //setting the current screen invisible and showing gareth bales' screen 
        this.setVisible(false);
        new Garethframe().setVisible(true); 
    }//GEN-LAST:event_garethActionPerformed

    private void neymarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neymarActionPerformed
       //setting the current screen invisible and showing neymar's screen 
        this.setVisible(false);
        new neymarframe().setVisible(true); 
    }//GEN-LAST:event_neymarActionPerformed

    private void cr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr7ActionPerformed
        //setting the current screen invisible and showing ronaldo's screen 
        this.setVisible(false);
        new cr7frame().setVisible(true); 
    }//GEN-LAST:event_cr7ActionPerformed

    private void leoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leoActionPerformed
       //setting the current screen invisible and showing messi's screen 
        this.setVisible(false);
        new MessiFrame().setVisible(true); 
    }//GEN-LAST:event_leoActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cr7;
    private javax.swing.JButton gareth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leo;
    private javax.swing.JButton neymar;
    private javax.swing.JButton paul;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel sub;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
