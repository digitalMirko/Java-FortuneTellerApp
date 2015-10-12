/////////////////////////////////////////////////////////////////////////////////
/* Coded by Mirko L. Cukich, 03/22/2013, 
 * Java SE 1.6, Images used are located in the images folder
 * This is a Java Fortune Teller app where the player puts in their name
 * Then chooses their guide, who goes and introduces themselves to the player
 * Afterwards the player chooses their 'Fortune' and/or 'Lucky Numbers' by 
 * clicking the button, their answer is show below with their name and results.*/
/////////////////////////////////////////////////////////////////////////////////

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FortuneTeller extends javax.swing.JFrame  {
	
    private javax.swing.JButton buttonFortune;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonLuckyNumbers;
    private javax.swing.JLabel jBackground;
    private javax.swing.JRadioButton jRbMadameOlga;
    private javax.swing.JRadioButton jRbTheBrain;
    private javax.swing.JRadioButton jRbTheKing;
    private javax.swing.JRadioButton jRbZoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField nameBox;	
	
    public FortuneTeller() {
        initComponents();
        setSize(648,514); // fits the background perfectly
    }
    @SuppressWarnings("unchecked")
    private void initComponents() { 	
        	
    	buttonGroup1 = new javax.swing.ButtonGroup();
        buttonFortune = new javax.swing.JButton();
        nameBox = new javax.swing.JTextField();
        buttonLuckyNumbers = new javax.swing.JButton();
        jRbZoltar = new javax.swing.JRadioButton();
        jRbTheKing = new javax.swing.JRadioButton();
        jRbTheBrain = new javax.swing.JRadioButton();
        jRbMadameOlga = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        
        jBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(null);

        buttonFortune.setBackground(new java.awt.Color(0, 0, 0));
        buttonFortune.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/fortuneButtonLeft.png"))); 
        buttonFortune.setContentAreaFilled(false);
        buttonFortune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFortuneActionPerformed(evt);
            }
        });
        getContentPane().add(buttonFortune);
        buttonFortune.setBounds(80, 290, 120, 60);

        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });
        // top box where user types in name
        getContentPane().add(nameBox);
        nameBox.setBounds(200, 100, 120, 30);   
        
        buttonLuckyNumbers.setBackground(new java.awt.Color(0, 0, 0));
        buttonLuckyNumbers.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/luckyNumberButtonRight.png")));
        buttonLuckyNumbers.setContentAreaFilled(false);
        buttonLuckyNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuckyNumbersActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLuckyNumbers);
        buttonLuckyNumbers.setBounds(200, 290, 120, 60);
        
        /////////////////////// Start of Zoltar //////////////////////////
        
        buttonGroup1.add(jRbZoltar);
        jRbZoltar.setContentAreaFilled(false);
        jRbZoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbZoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jRbZoltar);
        jRbZoltar.setBounds(160, 170, 21, 21);
        
        //////////////////////// End of Zoltar ///////////////////////////
        
        ///////////////////// Start of The King //////////////////////////

        buttonGroup1.add(jRbTheKing);
        jRbTheKing.setContentAreaFilled(false);
        jRbTheKing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbTheKingActionPerformed(evt);
            }
        });
        
        buttonGroup1.add(jRbTheKing);
        jRbTheKing.setContentAreaFilled(false);
        getContentPane().add(jRbTheKing);
        jRbTheKing.setBounds(260, 170, 21, 21);
        
        ///////////////////// End of The King ////////////////////////////
        
        ///////////////////// Start of The Brain /////////////////////////
               
        buttonGroup1.add(jRbTheBrain);
        jRbTheBrain.setContentAreaFilled(false);
        jRbTheBrain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRbTheBrain.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jRbTheBrain.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jRbTheBrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbTheBrainActionPerformed(evt);
            }
        });
        getContentPane().add(jRbTheBrain);
        jRbTheBrain.setBounds(160, 220, 20, 21);
        
        ///////////////////// End of The Brain ////////////////////////////        
        
        //////////////////// Start of Madame Olga /////////////////////////
        
        buttonGroup1.add(jRbMadameOlga);
        jRbMadameOlga.setContentAreaFilled(false);
        jRbMadameOlga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jRbMadameOlgaActionPerformed(evt);
            }
        });
        
        buttonGroup1.add(jRbMadameOlga);
        jRbMadameOlga.setContentAreaFilled(false);
        getContentPane().add(jRbMadameOlga);
        jRbMadameOlga.setBounds(260, 220, 21, 21);

        //////////////////// End of Madame Olga ///////////////////////////                
                    
        ////////////// Start of Answer Box Text Area Panels /////////////////    

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(201, 167, 45));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 370, 230, 20);

        jScrollPane2.setBackground(new java.awt.Color(201, 167, 45));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(201, 167, 45));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jTextArea2.setHighlighter(null);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 390, 230, 20);

        jScrollPane3.setBackground(new java.awt.Color(201, 167, 45));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(201, 167, 45));
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setAutoscrolls(false);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(90, 410, 230, 40);

        jScrollPane4.setBackground(new java.awt.Color(201, 167, 45));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(201, 167, 45));
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setAutoscrolls(false);
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(90, 450, 230, 20);

        ////////////// End of Answer Box Text Area Panels /////////////////
        
        // Pops up the plain Fortune Teller background 
        jBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/blank.png"))); 
        getContentPane().add(jBackground);
        jBackground.setBounds(0, 0, 640, 480);
        pack();
        
    }    
    
    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
         	
    }                                           
    
    //////////////////// Start of Fortune - Button /////////////////////
    
    private void buttonFortuneActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Gets the information person typed in
    	String t = nameBox.getText();
    	
    	Random fTeller = new Random();
        int fortuneIndex;
        String day;
        String[]fortunes = {
        	"A Rainbow will appear and if you follow  it to the end, riches galore for you",
        	"It will be not a good day for shopping,    save your money till the next day",
            "You should consider a road trip, its a    good day to  just get away to relax",
            "If you are feeling lucky, buy a lottery         ticket, who knows you might just win",
            "As you walk along outside you just        might find a lucky coin, keep it",
            "You will run into someone special          remember to have fresh breath",
            "When you least expect it, you will get a  hug and a kiss from someone special",
            "A the clock strikes 12 look down and      around you might find a treasure"
        };
        fortuneIndex = fTeller.nextInt(fortunes.length);
        
        switch(fTeller.nextInt(7) % 7) {
        case 0:
            day = "Sunday";
            break;
        case 1:
            day = "Monday";
            break;
        case 2:
            day = "Tuesday";
            break;
        case 3:
            day = "Wednesday";
            break;
        case 4:
            day = "Thursday";
            break;
        case 5:
            day = "Friday";
            break;
        case 6:
            day = "Saturday";
            break;
        default:
            day = "Tomorrow";        
    }
        jTextArea1.setText(t);
        jTextArea2.setText("I see that on " + day);
        jTextArea3.setText(fortunes[fortuneIndex]);       
      	
    }
    
    ////////////////////// End of Fortune - Button /////////////////////
    
    //////////////// Start of Lucky Numbers - Button ///////////////////

    private void buttonLuckyNumbersActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Gets the User name input
    	String t = nameBox.getText();
    	
    	Random luckyNum = new Random();
		int number1, number2, number3, number4, number5, number6;
		
			number1 = 1+luckyNum.nextInt(56);
			number2 = 1+luckyNum.nextInt(56);
			number3 = 1+luckyNum.nextInt(56);
			number4 = 1+luckyNum.nextInt(56);
			number5 = 1+luckyNum.nextInt(56);
			number6 = 1+luckyNum.nextInt(56);
			
			// Prints out the users name they put in
			jTextArea1.setText(t);
			// Prints out the persons 6 sets of lucky numbers 
			jTextArea4.setText(number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " + number6);		
    }
    
    ///////////////// End of Lucky Numbers - Button ///////////////////
    
    /////////// Start of Fortune Tellers - Radio Button ////////////////
    
    private void jRbTheBrainActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // Radio button Clicked for The Brain, changes background to The Brain
    	 jBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/tellerTheBrainChosen.png"))); 
         getContentPane().add(jBackground);
         jBackground.setBounds(0, 0, 640, 480);
    }                                             

    private void jRbTheKingActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // Radio button Clicked for The King, changes background to The King
    	 jBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/tellerTheKingChosen.png"))); 
         getContentPane().add(jBackground);
         jBackground.setBounds(0, 0, 640, 480);
    }
    
    private void jRbMadameOlgaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // Radio button Clicked for Madame Olga, changes background to Madame Olga
    	 jBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/tellerMadameOlgaChosen.png"))); 
         getContentPane().add(jBackground);
         jBackground.setBounds(0, 0, 640, 480);
    }
    
    private void jRbZoltarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // Radio button Clicked for Zoltar, changes background to Zoltar
    	 jBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/tellerZoltarChosen.png"))); 
         getContentPane().add(jBackground);
         jBackground.setBounds(0, 0, 640, 480);    	
    }                                             
    
    ///////////// End of Fortune Tellers - Radio Button ////////////////
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FortuneTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FortuneTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FortuneTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FortuneTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }     

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FortuneTeller().setVisible(true);
            }
        });
    }      
}
