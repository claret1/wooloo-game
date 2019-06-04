/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namelessgame.UI;

import java.util.List;
import java.util.Map;
import namelessgame.Gameplay.Game;
import namelessgame.Gameplay.Item;
import namelessgame.Gameplay.Player;
import namelessgame.Gameplay.ShopItem;

/**
 *
 * @author Henrique Barcia Lang
 */
public class StashFrame extends javax.swing.JFrame {

    /**
     * Creates new form StashFRame
     */
    
    Player player = Game.getPlayer();
    
    public void stashSliderAction(Item item, int count)
    {
        // TODO
    }
    
    public void updatePlayerEquipment(int slot)
    {
        if(slot < 0 || slot > 5)
            return;
        
        String defaultPath = "/namelessgame/img/slots/head.png";
        javax.swing.JLabel equipRef = playerHead;
        
        switch(slot)
        {
            case Game.HEAD:
                defaultPath = "/namelessgame/img/slots/head.png";
                equipRef = playerHead;
                
                break;
                
            case Game.BODY:
                defaultPath = "/namelessgame/img/slots/body.png";
                equipRef = playerBody;
                
                break;
                
            case Game.WEAPON:
                defaultPath = "/namelessgame/img/slots/right-hand.png";
                equipRef = playerWeapon;
                
                break;
                
            case Game.SHIELD:
                defaultPath = "/namelessgame/img/slots/left-hand.png";
                equipRef = playerShield;
                
                break;
                
            case Game.LEGS:
                defaultPath = "/namelessgame/img/slots/legs.png";
                equipRef = playerLegs;
                
                break;
                
            case Game.BOOTS:
                defaultPath = "/namelessgame/img/slots/feet.png";
                equipRef = playerBoots;
                
                break;
                
        }
        
        String path = (player.getEquip()).get(slot) != null ? ((player.getEquip()).get(slot)).getIcon() : defaultPath;
        equipRef.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));  
    }
    
    public void updatePlayerInventory()
    {
        String path;
        List<Item> playerInv = player.getInventory();
        
        // TODO write inventory like stash
        
        /* path = playerInv.get(0) != null ? (playerInv.get(0)).getIcon() : "/namelessgame/img/slots/back.png";
        playerInv1.setIcon(new javax.swing.ImageIcon(getClass().getResource(path))); 
        
        path = playerInv.get(1) != null ? (playerInv.get(1)).getIcon() : "/namelessgame/img/slots/back.png";
        playerInv2.setIcon(new javax.swing.ImageIcon(getClass().getResource(path))); 
        
        path = playerInv.get(2) != null ? (playerInv.get(2)).getIcon() : "/namelessgame/img/slots/back.png";
        playerInv3.setIcon(new javax.swing.ImageIcon(getClass().getResource(path))); */
    }
    
    public void updatePlayerStash()
    {
        String path;
        List<Item> playerStash = player.getStash();
        javax.swing.JPanel stashPanel = new javax.swing.JPanel();
        
        /*int strDiff = player.getStr(item) - player.getStr();
        int agiDiff = player.getAgi(item) - player.getAgi();
        int conDiff = player.getCon(item) - player.getCon();

        String strFont = strDiff > 0 ? "\"green\"" : "\"red\"";
        String agiFont = agiDiff > 0 ? "\"green\"" : "\"red\"";
        String conFont = conDiff > 0 ? "\"green\"" : "\"red\"";

        String htmlTootip = "<html>" + 
                            (item.isStackable() ? ("<font color=\"red\">" + item.getCount() + "</font>x unit(s).<br><br>") : "") +
                            (item.isPotion() ? ("Heals for <font color=\"white\">" + item.getHeal() + "</font> health.") : ("" +
                            "Strenght: <font color=" + strFont + ">" + strDiff + "</font><br>" +
                            "Agility: <font color=" + agiFont + ">" + agiDiff + "</font><br>" +
                            "Constitution: <font color=" + conFont + ">" + conDiff + "</font><br>")) +
                            "</html>";*/
        
        /*for(Item item : playerStash)
        {
            javax.swing.JButton itemButton = new javax.swing.JButton();
            
            itemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(item.getIcon())));
            
            stashMap.put(itemButton, item);
            
            stashPanel.add(itemButton);
        }
        
        shopPanel.setLayout(new java.awt.GridLayout(shop.size() / 4, 4));
        shopPanel.setSize(300, 300);
        shopPanel.setVisible(true);
        
        add(shopPanel);
        
        shopScrollPane.getViewport().add(shopPanel, null);*/
        
        
    }
    
    public StashFrame() {
        initComponents();
        
        for(int i = Game.HEAD; i <= Game.BOOTS; i++)
            updatePlayerEquipment(i);
        
        updatePlayerInventory();

        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoLabel = new javax.swing.JLabel();
        stashScrollPane = new javax.swing.JScrollPane();
        playerWeapon = new javax.swing.JLabel();
        playerHead = new javax.swing.JLabel();
        playerBody = new javax.swing.JLabel();
        playerShield = new javax.swing.JLabel();
        playerLegs = new javax.swing.JLabel();
        playerBoots = new javax.swing.JLabel();
        playerInv1 = new javax.swing.JLabel();
        playerInv2 = new javax.swing.JLabel();
        playerInv3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        infoLabel.setBackground(new java.awt.Color(0, 0, 0));
        infoLabel.setFont(new java.awt.Font("OscineW04-Light", 0, 48)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(51, 51, 51));
        infoLabel.setText("Stash");
        getContentPane().add(infoLabel);
        infoLabel.setBounds(30, 10, 120, 70);
        getContentPane().add(stashScrollPane);
        stashScrollPane.setBounds(10, 90, 530, 460);

        playerWeapon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/left-hand.png"))); // NOI18N
        getContentPane().add(playerWeapon);
        playerWeapon.setBounds(630, 110, 50, 30);

        playerHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/head.png"))); // NOI18N
        getContentPane().add(playerHead);
        playerHead.setBounds(680, 60, 40, 40);

        playerBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/back.png"))); // NOI18N
        getContentPane().add(playerBody);
        playerBody.setBounds(650, 250, 40, 50);

        playerShield.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/right-hand.png"))); // NOI18N
        getContentPane().add(playerShield);
        playerShield.setBounds(730, 110, 40, 30);

        playerLegs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/legs.png"))); // NOI18N
        getContentPane().add(playerLegs);
        playerLegs.setBounds(680, 150, 40, 40);

        playerBoots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/feet.png"))); // NOI18N
        getContentPane().add(playerBoots);
        playerBoots.setBounds(680, 200, 50, 30);

        playerInv1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/back.png"))); // NOI18N
        getContentPane().add(playerInv1);
        playerInv1.setBounds(680, 250, 40, 50);

        playerInv2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/back.png"))); // NOI18N
        getContentPane().add(playerInv2);
        playerInv2.setBounds(710, 250, 40, 50);

        playerInv3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/slots/body.png"))); // NOI18N
        getContentPane().add(playerInv3);
        playerInv3.setBounds(680, 100, 40, 50);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(670, 510, 59, 32);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/namelessgame/img/PATTERN-BRANCO.png"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 820, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();

        GameFrame gameBack = new GameFrame();
        gameBack.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StashFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel playerBody;
    private javax.swing.JLabel playerBoots;
    private javax.swing.JLabel playerHead;
    private javax.swing.JLabel playerInv1;
    private javax.swing.JLabel playerInv2;
    private javax.swing.JLabel playerInv3;
    private javax.swing.JLabel playerLegs;
    private javax.swing.JLabel playerShield;
    private javax.swing.JLabel playerWeapon;
    private javax.swing.JScrollPane stashScrollPane;
    // End of variables declaration//GEN-END:variables
}
