/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menu_01_jm;

import br.com.jmary.home.Home;
import br.com.jmary.utilidades.Exportando;
import home_controle_menus_norte.Controle_de_Alterar_Menu_Norte;
import leitura_e_aprendizagem.Leitura_e_Aprendizagem_Indice;

/**
 *
 * @author ana 
 */
public class Submenu_1_JM_Criar_Leitura_e_Aprendizagem extends javax.swing.JPanel {

    Home Home;
    Controle_de_Alterar_Menu_Norte Controle_de_Alterar_Menu_Norte;
        
    public Submenu_1_JM_Criar_Leitura_e_Aprendizagem( Home Home2, Controle_de_Alterar_Menu_Norte Controle_de_Alterar_Menu_Norte2 ) {
        Home = Home2;
        Controle_de_Alterar_Menu_Norte = Controle_de_Alterar_Menu_Norte2;
        
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
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btExercicios8 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jToolBar2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.setPreferredSize(new java.awt.Dimension(658, 71));

        jSeparator7.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator7);

        btExercicios8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Estrtutura_de_Dados.png"))); // NOI18N
        btExercicios8.setText("Criar Leitura e Aprendizagem");
        btExercicios8.setFocusable(false);
        btExercicios8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExercicios8MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios8MousePressed(evt);
            }
        });
        btExercicios8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExercicios8ActionPerformed(evt);
            }
        });
        jToolBar2.add(btExercicios8);

        jSeparator10.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    Exportando Exportando;
    private void btExercicios8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios8MousePressed
        /*new Thread() {   @Override public void run() {*/ try { Thread.sleep( 1 );
            Exportando = new Exportando("ABRINDO...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );
            
            Home.ControleTabs.AddTabsAoHome("Índice - Leitura e Aprendizagem", "/imagens_internas/livroTp.gif", new Leitura_e_Aprendizagem_Indice(Home) ); 

            Exportando.fechar();
        } catch( Exception e ){ Exportando.fechar(); e.printStackTrace(); } //} }.start();
    }//GEN-LAST:event_btExercicios8MousePressed

    private void btExercicios8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios8MouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_btExercicios8MouseEntered

    private void btExercicios8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExercicios8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExercicios8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExercicios8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}