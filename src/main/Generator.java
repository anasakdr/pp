/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.management.openmbean.InvalidKeyException;
import javax.swing.JOptionPane;
import static main.Gruppe.ps;
import static main.Gruppe.rs;

/**
 *Die Klasse Generator represntiert eine grphicher benutzeroberfläche
 * in der sich der anwender ein konfigurierbares Passwort erstellen.
 * Das ersellte Passwort kann mit hilfe der Gruppenverwaltung verwaltet werden
 * 
 * @author AAlakdr
 * @version 0.1
 */
public class Generator extends javax.swing.JPanel {
 int gruppenId;
    String s;
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";
    /**
     * Creates new form Generator
     */
    public Generator() {
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

        kleinZ = new javax.swing.JRadioButton();
        grossZ = new javax.swing.JRadioButton();
        zahlZ = new javax.swing.JRadioButton();
        sonderZ = new javax.swing.JRadioButton();
        alleZeichen = new javax.swing.JCheckBox();
        verwendungFeld = new javax.swing.JTextField();
        passF = new javax.swing.JTextField();
        generierenB = new javax.swing.JButton();
        boxLänge = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        zurückB = new javax.swing.JButton();
        privateB = new javax.swing.JButton();
        gruppenB = new javax.swing.JButton();
        gruppenBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 102, 122));

        kleinZ.setText("Klein");

        grossZ.setText("Groß");

        zahlZ.setText("Zahl");

        sonderZ.setText("Sonderzeichen");

        alleZeichen.setText("Alle Zeichen");
        alleZeichen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alleZeichenActionPerformed(evt);
            }
        });

        passF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passFKeyTyped(evt);
            }
        });

        generierenB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        generierenB.setForeground(new java.awt.Color(60, 15, 108));
        generierenB.setText("Generieren");
        generierenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generierenBActionPerformed(evt);
            }
        });

        boxLänge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boxLänge.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "12", "16", "20" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Länge des Passworts");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Passwort");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("Verwendungs-");

        zurückB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        zurückB.setForeground(new java.awt.Color(60, 15, 108));
        zurückB.setText("Zurück");
        zurückB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zurückBActionPerformed(evt);
            }
        });

        privateB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        privateB.setForeground(new java.awt.Color(60, 15, 108));
        privateB.setText("Privat");
        privateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateBActionPerformed(evt);
            }
        });

        gruppenB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gruppenB.setForeground(new java.awt.Color(60, 15, 108));
        gruppenB.setText("Gruppe ");
        gruppenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruppenBActionPerformed(evt);
            }
        });

        gruppenBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gruppenBox.setForeground(new java.awt.Color(60, 15, 108));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 204));
        jLabel4.setText("zweck");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alleZeichen)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zahlZ)
                    .addComponent(sonderZ)
                    .addComponent(grossZ)
                    .addComponent(kleinZ))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passF, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(jLabel3)
                                            .addGap(28, 28, 28)
                                            .addComponent(boxLänge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(zurückB))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(75, 75, 75)
                                            .addComponent(generierenB))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(privateB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(gruppenB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(gruppenBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10))))
                                .addComponent(verwendungFeld))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(kleinZ)
                .addGap(18, 18, 18)
                .addComponent(grossZ)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zahlZ)
                    .addComponent(alleZeichen))
                .addGap(18, 18, 18)
                .addComponent(sonderZ)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generierenB)
                    .addComponent(boxLänge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verwendungFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(privateB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gruppenBox)
                            .addComponent(gruppenB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(zurückB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alleZeichenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alleZeichenActionPerformed
        if (alleZeichen.isSelected()) {
            zahlZ.setSelected(false);
            kleinZ.setSelected(false);
            grossZ.setSelected(false);
            sonderZ.setSelected(false);
        }
    }//GEN-LAST:event_alleZeichenActionPerformed

    private void passFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFKeyTyped
        char c = evt.getKeyChar();
        if (!((c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_passFKeyTyped

     /**
     * Die Method liste zeigt dem Anwender alle Gruppen in den er mitglied ist.
     *
     */
    public static void liste() {
        gruppenBox.removeAllItems();
        try {
            String ss = "SELECT gruppen.Name FROM gruppen,gruppenxmitglieder,users WHERE gruppenxmitglieder.gruppenid=gruppen.ID AND gruppenxmitglieder.userid=users.ID AND users.ID=?";
            ps = Utils.getConnection().prepareStatement(ss);
            ps.setInt(1, Main.userId);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Name");
                gruppenBox.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     /**
     * Die Method generate erstellt auf grundlage der konfiguration des anwenders das Passwort 
     *
     * @param length Enthält die länge des Passworts
     * @return gibt das generierte Passwort zurück
     */
  public String generate(int length) {
        // Argument Validation.
        if(kleinZ.isSelected()||grossZ.isSelected()||sonderZ.isSelected()||zahlZ.isSelected()||alleZeichen.isSelected()){
           
        // Variables.
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        // Collect the categories to use.
        List<String> charCategories = new ArrayList<>(4);
        if (kleinZ.isSelected()) {
            charCategories.add(LOWER);
        }
        if (grossZ.isSelected()) {
            charCategories.add(UPPER);
        }
        if (zahlZ.isSelected()) {
            charCategories.add(DIGITS);
        }
        if (sonderZ.isSelected()) {
            charCategories.add(PUNCTUATION);
        }
        if (alleZeichen.isSelected()) {
            charCategories.add(LOWER + UPPER + DIGITS + PUNCTUATION);
        }

        // Build the password.
        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
            return new String(password);
        }  
        return new String("");
    }
    private void generierenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generierenBActionPerformed
        passF.setText(generate(Integer.valueOf((String) boxLänge.getSelectedItem())));

    }//GEN-LAST:event_generierenBActionPerformed

    private void zurückBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zurückBActionPerformed
        Main.cl.show(Main.cardPanel, "UserMenue");
        passF.setText("");
        verwendungFeld.setText("");
        alleZeichen.setSelected(false);
        zahlZ.setSelected(false);
        sonderZ.setSelected(false);
        grossZ.setSelected(false);
        kleinZ.setSelected(false);

    }//GEN-LAST:event_zurückBActionPerformed

    private void privateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateBActionPerformed

        String s = "INSERT INTO private(userid,Passwort,Verwendung)VALUES(?,?,?)";
        PreparedStatement ps = null;

        if (!Utils.isEmpty(passF.getText(), verwendungFeld.getText())) {
            String ss = "SELECT * FROM private WHERE Verwendung =? and userid=?";
            try {
                ps = Utils.getConnection().prepareStatement(ss);
                ps.setString(1, verwendungFeld.getText());
                ps.setInt(2, Main.userId);
                rs = ps.executeQuery();
                while (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Sie haben diese Verwendung schon benutzt");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ps = Utils.getConnection().prepareStatement(s);
                ps.setInt(1, Main.userId);
                ps.setString(2, Utils.aesEncryption(passF.getText()));
                ps.setString(3, verwendungFeld.getText());
                ps.executeUpdate();
                passF.setText("");
                verwendungFeld.setText("");
                JOptionPane.showMessageDialog(null, "Passwort erfolgreich angelegt");
            } catch (SQLException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (java.security.InvalidKeyException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Es sind nicht alle Felder ausgefüllt");
        }
    }//GEN-LAST:event_privateBActionPerformed

    private void gruppenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruppenBActionPerformed
        if(gruppenBox.getSelectedItem()!=null){
            try {
                s = "SELECT ID FROM gruppen WHERE Name=? ";
                ps = Utils.getConnection().prepareStatement(s);
                ps.setString(1, gruppenBox.getSelectedItem().toString());
                rs = ps.executeQuery();
                while (rs.next()) {
                    gruppenId = rs.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
            }
            String ss = "SELECT * FROM offentlich WHERE Verwendung =? AND gruppenid=?";
            try {
                ps = Utils.getConnection().prepareStatement(ss);
                ps.setString(1, verwendungFeld.getText());
                ps.setInt(2, gruppenId);
                rs = ps.executeQuery();
                while (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Sie haben diesen Verwendungszweck schon benutzt");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            }
            s = "INSERT INTO offentlich(passwort,gruppenid,Verwendung)VALUES(?,?,?)";
            PreparedStatement ps = null;
            if (!Utils.isEmpty(passF.getText(), verwendungFeld.getText())) {
                try {
                    ps = Utils.getConnection().prepareStatement(s);
                    ps.setString(1, Utils.aesEncryption(passF.getText()));
                    ps.setInt(2, gruppenId);
                    ps.setString(3, verwendungFeld.getText());
                    ps.executeUpdate();
                    passF.setText("");
                    verwendungFeld.setText("");
                    JOptionPane.showMessageDialog(null, "Passwort erfolgreich angelegt");
                } catch (SQLException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchPaddingException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeyException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalBlockSizeException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (BadPaddingException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (java.security.InvalidKeyException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Es sind nicht alle Felder ausgefüllt");
            }}else{
                JOptionPane.showMessageDialog(null, "Sie haben keine Gruppe");
                return;
            }
    }//GEN-LAST:event_gruppenBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alleZeichen;
    public static javax.swing.JComboBox boxLänge;
    private javax.swing.JButton generierenB;
    private javax.swing.JRadioButton grossZ;
    private javax.swing.JButton gruppenB;
    private static javax.swing.JComboBox gruppenBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton kleinZ;
    private static javax.swing.JTextField passF;
    private javax.swing.JButton privateB;
    private javax.swing.JRadioButton sonderZ;
    private javax.swing.JTextField verwendungFeld;
    private javax.swing.JRadioButton zahlZ;
    private javax.swing.JButton zurückB;
    // End of variables declaration//GEN-END:variables
}
