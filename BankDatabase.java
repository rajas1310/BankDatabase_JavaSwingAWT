
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

class Person extends BankDatabase {
    String name = new String("x");
    int ACno;
    int balance = 0;
    String typeOfAC;
    int interestRate;

    int transactions = -1;
    int[] amount = new int[50];
    String[] description = new String[50];

}

public class BankDatabase {
    static int num = -1;

    public static void main(String[] args) {
        Person[] objarray = new Person[20];
        int[] account_num = new int[20];

//_____________________________using SWINGS____________________________

        JFrame frame = new JFrame("Rajas's GUI window");
        try {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
        frame.setSize(500, 500);
        frame.setOpacity(1.0f);
        frame.getContentPane().setBackground(new Color(255,217,200));

            JButton b1 = new JButton("Add account");
            JButton b2 = new JButton("Display Account");
            JButton b3 = new JButton("Deposit Money");
            JButton b4 = new JButton("Withdraw Money");
            JButton b5 = new JButton("Transfer Money");
            JButton b6 = new JButton("Close");
            JButton b7 = new JButton("Submit");
            JButton b8 = new JButton("Display History");
            JButton b9 = new JButton("Submit1");
            b1.setBounds(100, 250, 130, 40);
            b2.setBounds(270, 250, 130, 40);
            b3.setBounds(40, 300, 140, 40);
            b4.setBounds(180, 300, 140, 40);
            b5.setBounds(320, 300, 140, 40);
            b6.setBounds(215, 400, 70, 40);
            b7.setBounds(350, 100, 80, 20);
            b8.setBounds(180, 350, 140, 40);
            b9.setBounds(350, 100, 80, 20);
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);
            frame.add(b4);
            frame.add(b5);
            frame.add(b6);
            frame.add(b7);
            frame.add(b8);

            String str1 = new String("Holder's name: ");
            String str2 = new String("A/c number: ");
            String str3 = new String("A/c Type: ");
            String str4 = new String("Interest Rate: ");
            String str5 = new String("Balance: Rs. ");
            String str6 = new String("Invalid A/c no.!");

            JLabel naam = new JLabel(str1);
            JLabel acno = new JLabel(str2);
            JLabel ToAC = new JLabel(str3);
            JLabel RoI = new JLabel(str4);
            naam.setBounds(50, 50, 100, 30);
            acno.setBounds(50, 100, 100, 30);
            ToAC.setBounds(50, 150, 100, 30);
            RoI.setBounds(50, 200, 100, 30);
            frame.add(naam);
            frame.add(acno);
            frame.add(ToAC);
            frame.add(RoI);

            JLabel heading = new JLabel("RAJAS C. BANK");
            heading.setBounds(175, -10, 200, 50);
            heading.setFont(new Font("Monaco",Font.BOLD,20));
            frame.add(heading);

            JLabel footer1 = new JLabel("Select an option and press Submit after filling the fields.");
            footer1.setBounds(90, 25, 400, 20);
            frame.add(footer1); 
            
            JLabel l1,l2,l3,l4;
                            
            l1 = new JLabel();
            l2 = new JLabel();
            l3 = new JLabel();
            l4 = new JLabel();

            JLabel depo, wthdr;                                              //NOT FINISHED
            depo = new JLabel("Amount to be deposited");
            wthdr = new JLabel("Amount to be withdrawn");
            depo.setBounds(50, 150, 100, 30);
            wthdr.setBounds(50, 150, 100, 30);
            
            JTextField tf1 = new JTextField();
            JTextField tf2 = new JTextField();
            JTextField tf3 = new JTextField();
            JTextField tf4 = new JTextField();
            JTextField tf5 = new JTextField();    // for deposit
            JTextField tf6 = new JTextField();    // for withdraw
            tf1.setBounds(150, 50, 100, 30);
            tf2.setBounds(150, 100, 120, 30);
            tf3.setBounds(150, 150, 100, 30);
            tf4.setBounds(150, 200, 100, 30);
            tf5.setBounds(200, 150, 100, 30);
            tf6.setBounds(200, 150, 100, 30);
            frame.add(tf1);
            frame.add(tf2);
            frame.add(tf3);
            frame.add(tf4);

                naam.setVisible(false);
                acno.setVisible(false);
                ToAC.setVisible(false);
                RoI.setVisible(false);
                tf1.setVisible(false);
                tf2.setVisible(false);
                tf3.setVisible(false); 
                tf4.setVisible(false);
        

        b1.addActionListener(new ActionListener() {                     //ADD Account button
            public void actionPerformed(ActionEvent e) {
                naam.setVisible(true);
                acno.setVisible(true);
                ToAC.setVisible(true);
                RoI.setVisible(true);
                tf1.setVisible(true);
                tf2.setVisible(true);
                tf3.setVisible(true);
                tf4.setVisible(true);
                l1.setVisible(false);                                                               //*** */
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                

                
                b7.addActionListener(new ActionListener(){               //submit button
                    public void actionPerformed(ActionEvent e2){
                        num++;
                        objarray[num] = new Person();
                        objarray[num].name = tf1.getText();
                        String s2 = tf2.getText();
                        objarray[num].ACno = Integer.parseInt(s2);
                        objarray[num].balance = 0;
                        objarray[num].typeOfAC = tf3.getText();
                        String s3 = tf4.getText();
                        objarray[num].interestRate = Integer.parseInt(s3);
                        account_num[num] = objarray[num].ACno;
                    
                        /*
                        String str9 = new String("--text--");
                        if(e2.getSource() == b7){
                            tf1.setText(str9);
                            tf2.setText(str9);
                            tf3.setText(str9);
                            tf4.setText(str9);
                        }*/

                        naam.setVisible(false);
                        acno.setVisible(false);
                        ToAC.setVisible(false);
                        RoI.setVisible(false);
                        tf1.setVisible(false);
                        tf2.setVisible(false);
                        tf3.setVisible(false); 
                        tf4.setVisible(false);
                    }
                });


            }
        });

        b2.addActionListener(new ActionListener(){                    //Display button
            public void actionPerformed(ActionEvent e){
                naam.setVisible(false);
                acno.setVisible(true);              
                ToAC.setVisible(false);
                RoI.setVisible(false);
                tf1.setVisible(false);
                tf2.setVisible(true);
                tf3.setVisible(false);
                tf4.setVisible(false);
               

                b7.addActionListener(new ActionListener(){          //submit
                    public void actionPerformed(ActionEvent e2){
                        String s3 = tf2.getText();
                        int u = Integer.parseInt(s3);

                        int i;
                        boolean found = false;
                        
                        for (i = 0; i <= num; i++) {
                            if (account_num[i] == u) {
                                found = true;
                                break;
                            }
                        } 
                        if(found){                   
                            l1.setText(str1 + objarray[i].name);
                            l2.setText(str3 + objarray[i].typeOfAC);
                            l3.setText(str5 + objarray[i].balance);
                            l4.setText(str4 + objarray[i].interestRate);

                            l1.setBounds(150, 130, 150, 30);
                            l2.setBounds(150, 150, 120, 30);
                            l3.setBounds(150, 170, 120, 30);
                            l4.setBounds(150, 190, 120, 30);
                            frame.add(l1); frame.add(l2); frame.add(l3); frame.add(l4);
                            l1.setVisible(true);
                            l2.setVisible(true);
                            l3.setVisible(true);
                            l4.setVisible(true);
                        }  
                        else{
                            tf2.setText(str6);
                        }  
                    }
                });
            }
        });

        b3.addActionListener(new ActionListener() {               //Deposit button
            public void actionPerformed(ActionEvent e) {
                frame.add(depo);
                frame.add(tf5);

                naam.setVisible(false);
                acno.setVisible(true);              
                ToAC.setVisible(false);
                RoI.setVisible(false);
                depo.setVisible(true);
                tf1.setVisible(false);
                tf2.setVisible(true);
                tf3.setVisible(false);
                tf4.setVisible(false);
                tf5.setVisible(true);
                tf6.setVisible(false);
                l1.setVisible(false);                                                               
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                

                b7.addActionListener(new ActionListener(){          //submit
                    public void actionPerformed(ActionEvent e2){
                        String s5 = tf2.getText();
                        int u = Integer.parseInt(s5);
                        String s4 = tf5.getText();
                        int dep = Integer.parseInt(s4);
                        tf5.setText("0");

                        int i;
                        boolean found = false;
                        
                        for (i = 0; i <= num; i++) {
                            if (account_num[i] == u) {
                                found = true;
                                break;
                            }
                        } 
                        if(found){
                            objarray[i].balance += dep; 

                            objarray[i].transactions++;
                            objarray[i].description[objarray[i].transactions] = "Deposited     + Rs.";
                            objarray[i].amount[objarray[i].transactions] = dep;
                            
                            l1.setText(str1 + objarray[i].name);
                            l2.setText(str3 + objarray[i].typeOfAC);
                            l3.setText(str5+ objarray[i].balance);
                            l4.setText(str4 + objarray[i].interestRate);

                            l1.setBounds(150, 130, 150, 30);
                            l2.setBounds(150, 150, 120, 30);
                            l3.setBounds(150, 170, 120, 30);
                            l4.setBounds(150, 190, 120, 30);
                            frame.add(l1); frame.add(l2); frame.add(l3); frame.add(l4);
                            depo.setVisible(false);
                            tf5.setVisible(false);
                            l1.setVisible(true);
                            l2.setVisible(true);
                            l3.setVisible(true);
                            l4.setVisible(true);
                        }  
                        else{
                            tf2.setText(str6);
                        }  
                    }
                });
            }
        });

        b4.addActionListener(new ActionListener() {               //Withdraw button
            public void actionPerformed(ActionEvent e) {
                frame.add(wthdr);
                frame.add(tf6);

                naam.setVisible(false);
                acno.setVisible(true);              
                ToAC.setVisible(false);
                RoI.setVisible(false);
                depo.setVisible(false);
                wthdr.setVisible(true);
                tf1.setVisible(false);
                tf2.setVisible(true);
                tf3.setVisible(false);
                tf4.setVisible(false);
                tf5.setVisible(false);
                tf6.setVisible(true);
                l1.setVisible(false);                                                               
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);

                b7.addActionListener(new ActionListener(){          //submit
                    public void actionPerformed(ActionEvent e2){
                        String s5 = tf2.getText();
                        int u = Integer.parseInt(s5);
                        String s4 = tf6.getText();
                        int withd = Integer.parseInt(s4);
                        tf6.setText("0");

                        int i;
                        boolean found = false;
                        
                        for (i = 0; i <= num; i++) {
                            if (account_num[i] == u) {
                                found = true;
                                break;
                            }
                        } 
                        if(found){
                            if(objarray[i].balance > withd){
                                objarray[i].balance -= withd; 
                                objarray[i].transactions++;
                                objarray[i].description[objarray[i].transactions] = "Withdrew      - Rs.";
                                objarray[i].amount[objarray[i].transactions] = withd;
                            }
                            
                            l1.setText(str1 + objarray[i].name);
                            l2.setText(str3 + objarray[i].typeOfAC);
                            l3.setText(str5 + objarray[i].balance);
                            l4.setText(str4 + objarray[i].interestRate);

                            l1.setBounds(150, 130, 150, 30);
                            l2.setBounds(150, 150, 120, 30);
                            l3.setBounds(150, 170, 120, 30);
                            l4.setBounds(150, 190, 120, 30);
                            frame.add(l1); frame.add(l2); frame.add(l3); frame.add(l4);
                            wthdr.setVisible(false);
                            tf6.setVisible(false);
                            l1.setVisible(true);
                            l2.setVisible(true);
                            l3.setVisible(true);
                            l4.setVisible(true);
                        }  
                        else{
                            tf2.setText(str6);
                        }  
                    }
                });
            }
        });
    
        b5.addActionListener(new ActionListener(){                      //Transfer button
            public void actionPerformed(ActionEvent e){
                tf1.setText("0"); 
                tf2.setText("0");
                tf3.setText("0");
                l1.setText("From A/c no ");
                l2.setText("To ");
                l3.setText("Money to be transferred ");
                l1.setBounds(50,50,100,30);
                l2.setBounds(10, 100, 40, 30);
                l3.setBounds(50, 150, 140, 30);

                naam.setVisible(false);
                acno.setVisible(true);              
                ToAC.setVisible(false);
                RoI.setVisible(false);
                depo.setVisible(false);
                wthdr.setVisible(false);
                tf1.setVisible(true);
                tf2.setVisible(true);
                tf3.setVisible(true);
                tf4.setVisible(false);
                tf5.setVisible(false);
                tf6.setVisible(false);
                l1.setVisible(true);                                                               
                l2.setVisible(true);
                l3.setVisible(true);
                l4.setVisible(false);
                
                
                b7.addActionListener(new ActionListener(){          //submit
                    public void actionPerformed(ActionEvent e2){
                        String s5 = tf1.getText();
                        int u = Integer.parseInt(s5);
                        String s4 = tf2.getText();
                        int t = Integer.parseInt(s4);
                        String s6 = tf3.getText();
                        int transf = Integer.parseInt(s6);
                        tf3.setText("0");

                        int i,j;
                        boolean found = false,found2 = false;
                        for (i = 0; i <= num; i++) {                  //search A/c FROM which amt is transferred
                            if (account_num[i] == u) {
                                found = true;
                                break;
                            }
                        }

                        for (j = 0; j <= num; j++) {                 //search A/c TO which amt is transferred
                            if (account_num[j] == t) {
                                found2 = true;
                                break;
                            }
                        }

                        if(found && found2){
                            if(objarray[i].balance > transf){
                                objarray[i].balance -= transf;
                                objarray[j].balance += transf;

                                objarray[i].transactions++;
                                objarray[i].description[objarray[i].transactions] = "Transferred      - Rs.";
                                objarray[i].amount[objarray[i].transactions] = transf;

                                objarray[j].transactions++;
                                objarray[j].description[objarray[j].transactions] = "Deposited     + Rs.";
                                objarray[j].amount[objarray[j].transactions] = transf;
                            }
                            l4.setText("Rs. " + transf + "have been transferred!");
                            l4.setBounds(100, 200, 300, 30);
                            l4.setVisible(true);
                        }  
                        else{
                            if(!found){
                                tf1.setText(str6);
                            }
                            else if(!found2){
                                tf2.setText(str6);
                            }
                        }  
                    }
                });
            }
        });

        b6.addActionListener(new ActionListener() {               //Close button
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        b8.addActionListener(new ActionListener(){                //Display history button
            public void actionPerformed(ActionEvent e) {
                l1.setText("Display history of: ");
                l1.setBounds(50,50,100,30);
                tf1.setText("Enter A/c no");
                
                /*
                naam.setVisible(false);
                acno.setVisible(false);              
                ToAC.setVisible(false);
                RoI.setVisible(false);
                depo.setVisible(false);
                wthdr.setVisible(false);
                tf1.setVisible(true);        //
                tf2.setVisible(false);
                tf3.setVisible(false);
                tf4.setVisible(false);
                tf5.setVisible(false);
                tf6.setVisible(false);
                l1.setVisible(true);         //                                                      
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);     
                */           

                b7.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e2){
                        String s7 = tf1.getText();
                        int u = Integer.parseInt(s7);

                        int i;
                        boolean found = false;
                        for (i = 0; i <= num; i++) {                  
                            if (account_num[i] == u) {
                                found = true;
                                break;
                            }
                        }
                        if(found){
                            System.out.println("Transaction history for: "+objarray[i].name);
                            for(int j=0; j<=objarray[i].transactions; j++){
                                System.out.println(objarray[i].description[j] + objarray[i].amount[j]);
                            }
                            System.out.println("Reached here");
                        }
                        else{
                            tf1.setText(str6);
                        }

                    }
                });
            }
        });
        
        frame.setLayout(null);
        frame.setVisible(true); // very important otherwise frame won't be visible

        
    }
}
