/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_controle_menus_norte;

import br.com.jmary.home.Home;
import br.com.jmary.utilidades.JOPM;
import java.awt.BorderLayout;
import java.awt.Component;
import menu_01_jm.Menu_1_JM_Perguntas_e_Respostas;
import menu_01_jm.Submenu_1_JM_ADS_Adicao_Leitura_e_Aprendizagem;

/**
 *
 * @author pc
 */
public class Controle_de_Alterar_Menu_Norte {
    
    Home Home;
    
    public Controle_de_Alterar_Menu_Norte(Home Home2) {
        
        Home = Home2;
        inicio();
    }
    
    private void inicio() {
        try{
            
            Menu_1_JM_Perguntas_e_Respostas Menu_1_JM = new Menu_1_JM_Perguntas_e_Respostas( Home, this );
            adicionarSubmenu(new Submenu_1_JM_ADS_Adicao_Leitura_e_Aprendizagem( Home, this ) );
        } catch( Exception e ){ e.printStackTrace(); JOPM JOptionPaneMod = new JOPM( 2, "adicionarSubmenu( Component c ), \n"
                + e.getMessage() + "\n", "Classe: " + "Controle_de_Alterar_Menu_Norte" ); }
    }
    
    public void adicionarSubmenu( Component c ) {
        try{
            
            // Adicionar Submenu Fonema e letra
            Home.Home_JPanel_Norte.removeAll();
            Home.Home_JPanel_Norte.add( c, BorderLayout.NORTH );
            c.setVisible( true );
            Home.validate();
            
            Home.Menu_Atual = c;
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "adicionarSubmenu( Component c ), \n"
                + e.getMessage() + "\n", "Classe: " + "Controle_de_Alterar_Menu_Norte" ); }
    }
    
    public void retirarSubmenu() {
        try{
            
            // Adicionar Submenu Fonema e letra
            Home.Home_JPanel_Norte.removeAll();
            Home.validate();
        } catch( Exception e ){ JOPM JOptionPaneMod = new JOPM( 2, "adicionarSubmenu( Component c ), \n"
                + e.getMessage() + "\n", "Controle_de_Alterar_Menu_Norte" ); }
    }
    
}