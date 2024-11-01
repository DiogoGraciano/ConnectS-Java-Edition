/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

/**
 *
 * @author diogo
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCidade = new javax.swing.JMenu();
        menuConexao = new javax.swing.JMenu();
        menuEmpresa = new javax.swing.JMenu();
        menuPrograma = new javax.swing.JMenu();
        menuSistemasOperacional = new javax.swing.JMenu();
        menuTerminal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ConnectS");

        menuCidade.setText("Cidades");
        menuCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCidadeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuCidade);

        menuConexao.setText("Conexão");
        menuConexao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConexaoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuConexao);

        menuEmpresa.setText("Empresa");
        menuEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmpresaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuEmpresa);

        menuPrograma.setText("Programas");
        menuPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProgramaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPrograma);

        menuSistemasOperacional.setText("Sistemas Operacionais");
        menuSistemasOperacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSistemasOperacionalMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSistemasOperacional);

        menuTerminal.setText("Terminais");
        menuTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTerminalMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuTerminal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCidadeMouseClicked
        new dialogCidade(this, true).setVisible(true);
    }//GEN-LAST:event_menuCidadeMouseClicked

    private void menuProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProgramaMouseClicked
        new dialogPrograma(this, true).setVisible(true);
    }//GEN-LAST:event_menuProgramaMouseClicked

    private void menuSistemasOperacionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSistemasOperacionalMouseClicked
        new dialogSistemasOperacional(this, true).setVisible(true);
    }//GEN-LAST:event_menuSistemasOperacionalMouseClicked

    private void menuTerminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTerminalMouseClicked
        new dialogTerminal(this, true).setVisible(true);
    }//GEN-LAST:event_menuTerminalMouseClicked

    private void menuEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmpresaMouseClicked
        new dialogEmpresa(this, true).setVisible(true);
    }//GEN-LAST:event_menuEmpresaMouseClicked

    private void menuConexaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConexaoMouseClicked
        new dialogConexao(this, true).setVisible(true);
    }//GEN-LAST:event_menuConexaoMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainMenu dialog = new MainMenu();
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCidade;
    private javax.swing.JMenu menuConexao;
    private javax.swing.JMenu menuEmpresa;
    private javax.swing.JMenu menuPrograma;
    private javax.swing.JMenu menuSistemasOperacional;
    private javax.swing.JMenu menuTerminal;
    // End of variables declaration//GEN-END:variables
}
