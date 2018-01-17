/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonbattlesimulator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import static pokemonbattlesimulator.Battle.makeMove;
import static pokemonbattlesimulator.Battle.round;

/**
 *
 * @author ASUS1
 */
public class PokemonBattleGUI extends javax.swing.JFrame {
   public static int cnt = 0;
    Pokemon MyPokemon = new Pokemon();
    Pokemon ePokemon = new Pokemon();
    int myAttack = 0;
    int foeAttack= 0;  
    String tNameString;
    public static float h1;
    public static float h2;
    int inputButton = 0;
 
    /**
     * Creates new form PokemonBattleGUI
     */
    public PokemonBattleGUI() {
        initComponents();
        jTextPane1.setEditable(false);
        
        openFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMyPokemon = new javax.swing.JLabel();
        jLabelePokemon = new javax.swing.JLabel();
        jPanelSysout = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PokemonBattleSimulator");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));

        jLabelMyPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemonbattlesimulator/imagepackage/Trainer.png"))); // NOI18N
        jLabelMyPokemon.setText("jLabel1");

        jLabelePokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemonbattlesimulator/imagepackage/background.png"))); // NOI18N
        jLabelePokemon.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jTextPane1);

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSysoutLayout = new javax.swing.GroupLayout(jPanelSysout);
        jPanelSysout.setLayout(jPanelSysoutLayout);
        jPanelSysoutLayout.setHorizontalGroup(
            jPanelSysoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSysoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSysoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSysoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanelSysoutLayout.setVerticalGroup(
            jPanelSysoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSysoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSysoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSysoutLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabelMyPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelSysout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMyPokemon)
                    .addComponent(jLabelePokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSysout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           if(cnt == 0)
        {
            tNameString = jTextArea1.getText();
            cnt++;
            
            jTextArea1.setText("");
            jTextPane1.setText(jTextPane1.getText() + "\n" + "Get ready for battle Trainer " + tNameString + "\nChoose a Pokemon : \n" +"1) Chimcar\n" +
                "2) Piplup\n" +"3) Turtwig");
            
            
        }
        
        
        else if(cnt == 1){
            int typePokemon= Integer.parseInt(jTextArea1.getText());
            cnt++;
            
            switch (typePokemon) {
             case 1:
             {
                     MyPokemon.setPokeName("Chimcar"); 
                     MyPokemon.setLevel(5);
                     MyPokemon.setHealth(20);
                     MyPokemon.setAttack(10);
                     MyPokemon.setDefense(10);
                     MyPokemon.setBaseAttack(10);
                     MyPokemon.setBaseDefense(10);
                     MyPokemon.setSpeed(12);
                     MyPokemon.setAttackStage(6);
                     MyPokemon.setDefenseStage(6);
                     MyPokemon.setMove1(new Moves("Scratch",40,0));
                     MyPokemon.setMove2(new Moves("Leer",0,1));
                     jButton2.setText("Scratch");
                     jButton3.setText("Leer");
                     //Listen for actions on buttons 1 and 2.
                     jLabelMyPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemonbattlesimulator/imagepackage/ChimcarIcon.png")));
                     break;
             }
                 
             case 2:
             {
                     MyPokemon.setPokeName("Piplup");
                     MyPokemon.setLevel(5);
                     MyPokemon.setHealth(21);
                     MyPokemon.setAttack(11);
                     MyPokemon.setDefense(11);
                     MyPokemon.setBaseAttack(11);
                     MyPokemon.setBaseDefense(11);
                     MyPokemon.setSpeed(10);
                     MyPokemon.setAttackStage(6);
                     MyPokemon.setDefenseStage(6);
                     MyPokemon.setMove1(new Moves("Pound",40,0));
                     MyPokemon.setMove2(new Moves("Growl",0,2));
                     jButton2.setText("Pound");
                     jButton3.setText("Growl");
                     
                      jLabelMyPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemonbattlesimulator/imagepackage/PiplupIcon.png")));
                  break;
             }
                     
                     
             case 3:
             {
                     MyPokemon.setPokeName("Turtwig");
                     MyPokemon.setLevel(5);
                     MyPokemon.setHealth(220);
                     MyPokemon.setAttack(130);
                     MyPokemon.setDefense(120);
                     MyPokemon.setBaseAttack(11);
                     MyPokemon.setBaseDefense(12);
                     MyPokemon.setSpeed(9);
                     MyPokemon.setAttackStage(6);
                     MyPokemon.setDefenseStage(6);
                     MyPokemon.setMove1(new Moves("Scratch",40,0));
                     MyPokemon.setMove2(new Moves("Withdraw",0,3));
                     jButton2.setText("Scratch");
                     jButton3.setText("Withdraw");
                     jLabelMyPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemonbattlesimulator/imagepackage/TurtwigIcon.png")));
                     break;
             }
             default:
                 break;
            }
    
    //randomize enemy pokemon
    Random random = new Random();
    int randomNumberEnemy = random.nextInt(2);
    if(randomNumberEnemy==0){
                     ePokemon.setPokeName("Starly"); 
                     ePokemon.setLevel(5);
                     ePokemon.setHealth(14);
                     ePokemon.setAttack(7);
                     ePokemon.setDefense(6);
                     ePokemon.setBaseAttack(7);
                     ePokemon.setBaseDefense(6);
                     ePokemon.setSpeed(8);
                     ePokemon.setAttackStage(6);
                     ePokemon.setDefenseStage(6);
                     ePokemon.setMove1(new Moves("Tackle",40,0));
                     
                     jLabelePokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemonbattlesimulator/imagepackage/StarlyIcon.png")));
                  
                    
    }else{
                     ePokemon.setPokeName("TrashDove");
                     ePokemon.setLevel(6);
                     ePokemon.setHealth(25);
                     ePokemon.setAttack(3);
                     ePokemon.setDefense(15);
                     ePokemon.setBaseAttack(3);
                     ePokemon.setBaseDefense(15);
                     ePokemon.setSpeed(14);
                     ePokemon.setAttackStage(6);
                     ePokemon.setDefenseStage(6);
                     ePokemon.setMove1(new Moves("Peck",40,0));
                     ePokemon.setMove2(new Moves("Head Banging",0,4));
                     
                     jLabelePokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemonbattlesimulator/imagepackage/TrashdoveIcon.png")));
                    
                     
            }
    
            
            //jTextArea1.setVisible(false);
            //dialogue
            jTextPane1.setText(jTextPane1.getText() + "\n" + "Walking around.......\nWhoa! a wild "+ePokemon.getPokeName()+
                    " appeared!\nI choose you! "+MyPokemon.getPokeName());
                      
        }
        else if(cnt == 2){
             //make button2 and button3 event listener
            
            jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                   inputButton = 1;              
            }} 
            );
            
            jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                   inputButton = 2;
                
            }} 
            );
            
            
            myAttack = 0;
            foeAttack = 0;
            
            
        // if for which pokemon moves first
            if(MyPokemon.getSpeed()>ePokemon.getSpeed()){
                      
//             Scanner MyMove = new Scanner(System.in);
             jTextPane1.setText(jTextPane1.getText() + "\n" + MyPokemon.getPokeName()+" attacks first, "+
                     "Choose your move : \n" +"1) "
                     + MyPokemon.move1.getMoveName()+"\n"+"2) "+
                     MyPokemon.move2.getMoveName());
             
             int moveChoice = Integer.parseInt(jTextArea1.getText());
             if (moveChoice == 1){
                makeMove(MyPokemon.move1, MyPokemon, ePokemon);}
             else if(moveChoice == 2){
                makeMove(MyPokemon.move2, MyPokemon, ePokemon);
                     }
        myAttack=1;
        }
        else{
           
             jTextPane1.setText(jTextPane1.getText() + "\n" + ePokemon.getPokeName()+" attacks first");
             Random randomEnemyMove = new Random();
             int randomMove = randomEnemyMove.nextInt(5);
             
             if(ePokemon.getPokeName()== "Starly")
                 makeMove(ePokemon.move1, ePokemon, MyPokemon);
             
             else if(randomMove==0 || randomMove==1 || randomMove==2){
                makeMove(ePokemon.move1, ePokemon, MyPokemon);}
             else 
                makeMove(ePokemon.move2, ePokemon, MyPokemon);
        foeAttack=1;       
             }
            cnt++;
        }
            else if(cnt == 3){
         //to keep the battle going until health=0
        while(true)
        {if(MyPokemon.getHealth() <= 0 || ePokemon.getHealth() <= 0){
            break;}
            if(myAttack==0){
             Scanner MyMove = new Scanner(System.in);
             System.out.println(MyPokemon.getPokeName()+" turn to attack"+
                     ", Choose your move : \n" +"1) "
                     + MyPokemon.move1.getMoveName()+"\n"+"2) "+
                     MyPokemon.move2.getMoveName());
             
             int moveChoice = Integer.parseInt(jTextArea1.getText());
        if (moveChoice == 1){
                makeMove(MyPokemon.move1, MyPokemon, ePokemon);}
        else if(moveChoice == 2){
                makeMove(MyPokemon.move2, MyPokemon, ePokemon);
                     }
        myAttack=1; 
        foeAttack=0;
             }
        else{
           
             System.out.println(ePokemon.getPokeName()+" turn to attack");
             Random randomEnemyMove = new Random();
             int randomMove = randomEnemyMove.nextInt(5);
             
             if(ePokemon.getPokeName()== "Starly")
                 makeMove(ePokemon.move1, ePokemon, MyPokemon);
             
             else if(randomMove==0 || randomMove==1 || randomMove==2){
                makeMove(ePokemon.move1, ePokemon, MyPokemon);}
             else 
                makeMove(ePokemon.move2, ePokemon, MyPokemon);
         foeAttack=1;
         myAttack=0;
             }            
     }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PokemonBattleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokemonBattleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokemonBattleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokemonBattleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokemonBattleGUI().setVisible(true);
            }
        });
    }
        public void dead(){
        //Winning/Losing dialogue
        if(MyPokemon.getHealth()==0){
            jTextPane1.setText(jTextPane1.getText() + "\n" + MyPokemon.getPokeName()+" fainted,"+
                    " Trainer "+tNameString+" lost the battle!");
        }
        else 
            jTextPane1.setText(jTextPane1.getText() + "\n" + ePokemon.getPokeName()+" fainted,"+
                    " Trainer "+tNameString+" wins the battle");
    }
    
    public void openFrame(){
        jTextPane1.setText("What is your name, Trainer?");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabelMyPokemon;
    private javax.swing.JLabel jLabelePokemon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelSysout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

