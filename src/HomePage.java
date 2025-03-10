/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Julianna Boado test
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        setTitle("Home Page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        North_HomePage = new javax.swing.JPanel();
        HomePageBtn1 = new javax.swing.JButton();
        MoviesPageBtn1 = new javax.swing.JButton();
        ResPageBtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Center_HomePage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        North_HomePage.setBackground(new java.awt.Color(176, 52, 60));

        HomePageBtn1.setBackground(new java.awt.Color(176, 52, 60));
        HomePageBtn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        HomePageBtn1.setForeground(new java.awt.Color(255, 255, 255));
        HomePageBtn1.setText("HOME");
        HomePageBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageBtn1ActionPerformed(evt);
            }
        });

        MoviesPageBtn1.setBackground(new java.awt.Color(176, 52, 60));
        MoviesPageBtn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        MoviesPageBtn1.setForeground(new java.awt.Color(255, 255, 255));
        MoviesPageBtn1.setText("MOVIES");
        MoviesPageBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoviesPageBtn1ActionPerformed(evt);
            }
        });

        ResPageBtn1.setBackground(new java.awt.Color(176, 52, 60));
        ResPageBtn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ResPageBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ResPageBtn1.setText("RESERVATION");
        ResPageBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResPageBtn1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout North_HomePageLayout = new javax.swing.GroupLayout(North_HomePage);
        North_HomePage.setLayout(North_HomePageLayout);
        North_HomePageLayout.setHorizontalGroup(
            North_HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(North_HomePageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(HomePageBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MoviesPageBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResPageBtn1)
                .addGap(30, 30, 30))
        );
        North_HomePageLayout.setVerticalGroup(
            North_HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(North_HomePageLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(North_HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, North_HomePageLayout.createSequentialGroup()
                        .addGroup(North_HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResPageBtn1)
                            .addComponent(MoviesPageBtn1)
                            .addComponent(HomePageBtn1))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, North_HomePageLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        getContentPane().add(North_HomePage, java.awt.BorderLayout.NORTH);

        Center_HomePage.setBackground(new java.awt.Color(0, 0, 0));
        Center_HomePage.setPreferredSize(new java.awt.Dimension(900, 570));
        Center_HomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Popcorns Ready, Are You?");
        Center_HomePage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 850, -1));

        jButton1.setBackground(new java.awt.Color(176, 52, 60));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reserve Your Seat!");
        jButton1.setBorder(null);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Center_HomePage.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 250, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomePage.png"))); // NOI18N
        Center_HomePage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Center_HomePage, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MoviesPage Movies = new MoviesPage();
        Movies.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MoviesPageBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoviesPageBtn1ActionPerformed
        // movie button from menu
        MoviesPage Movies = new MoviesPage();
        Movies.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_MoviesPageBtn1ActionPerformed

    private void ResPageBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResPageBtn1ActionPerformed
        // reservation button from menu
        ReservationPage Reservation = new ReservationPage();
        Reservation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ResPageBtn1ActionPerformed

    private void HomePageBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomePageBtn1ActionPerformed
        // TODO add your handling code here:
        HomePage Home = new HomePage();
        Home.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_HomePageBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Center_HomePage;
    private javax.swing.JButton HomePageBtn1;
    private javax.swing.JButton MoviesPageBtn1;
    private javax.swing.JPanel North_HomePage;
    private javax.swing.JButton ResPageBtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
