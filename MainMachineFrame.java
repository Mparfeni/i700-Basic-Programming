package Main;

import availability.CoffeeType;
import statistics.PopularCoffee;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**This class will draw our GUI.
 * @author ASUS
 */
public class MainMachineFrame extends javax.swing.JFrame {

    /**Initialize ButtonHandler variable */
    public ButtonHandler pullButton; 

    /**Initialize PopularCoffee variable*/
    public static PopularCoffee pc;
    
    public CoffeeType ct;
    
    /**This method will draw all the elements and check,
     * if we have file with statistics
     */
    public MainMachineFrame() {
        initComponents();
        try{
            pc = new PopularCoffee();
            pc.initializeStatistics();
        }catch (Exception e){
            System.out.println("Something went wrong: " + e);
        }
        pullButton = new ButtonHandler(pc);
        ct = new CoffeeType();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee machine by Mark Parfeniuk(C11)");

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 270, 60, 20));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 300, 60, 20));

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 330, 60, 20));

        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 60, 20));

        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 60, 20));

        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 60, 20));

        jButton7.setToolTipText("");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 60, 20));

        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 60, 30));

        jButton9.setText("Get Stats");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 100, 20));

        jTextPane1.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 130, 140));

        jTextPane2.setEditable(false);
        jScrollPane3.setViewportView(jTextPane2);

        jLayeredPane1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, 140));

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("images/myimage.png"));
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 620, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Espresso");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/myimage.png"));
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Lungo Entkoff");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/Latte.png"));
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Cappuccino");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/myimage.png"));
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Cappuccino Vanilla");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/KakaoCappuccino.png"));
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Lungo");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/Latte.png"));
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Latte Macchiato");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/Latte.png"));
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Kakao");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/KakaoCappuccino.png"));
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pullButton.buttonPressed(evt, "Tee mit Mich");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMachineFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setIcon(new javax.swing.ImageIcon("images/myimage.png"));
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pc.sorting();
        StringBuilder output = new StringBuilder();
        Iterator nextValue = pc.coffeeStatistics.entrySet().iterator();
        while (nextValue.hasNext()){
            output.append(nextValue.next() + "\n");
        }
        jTextPane1.setText(output.toString());
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String output = "";
        for(int i = 0; i<CoffeeType.allCoffies.size(); i++){
            String coffeeamount = Integer.toString(CoffeeType.allCoffies.get(i).amount);
            String coffeename = CoffeeType.allCoffies.get(i).getName();
            output += coffeename + " - " + coffeeamount + "\n";
            jTextPane2.setText(output);
        }
    }                                         

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMachineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMachineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMachineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMachineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration                   
}
