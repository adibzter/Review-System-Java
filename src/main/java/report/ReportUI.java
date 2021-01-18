/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DecimalFormat;
import main.Main;
/**
 *
 * @author Optiplex980
 */
public class ReportUI extends javax.swing.JFrame {
    
    DecimalFormat numberFormat = new DecimalFormat("#.0");
    

    /**
     * Creates new form ReportUI
     */
    public ReportUI() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Car Rental");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hotel Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sea Activity");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Food");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Travelling");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Wifi");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CHOOSE REPORT");

        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Main obj = new Main();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CarRental obj = new CarRental();
        dispose();
        obj.setVisible(true);
        
        //path to file
        
        
        //declare size of array and total score for review
        int size=0;
        
        //declare five different type of input
        int type [] = new int [5];
        
        //calculate average
        int total = 0;
        
        String filepath = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\car_review.txt";
        
        //check num of line inside the file
        try {
            Scanner readFile = new Scanner(new File(filepath));
            while(readFile.hasNextLine())
            {
                size++;
                readFile.nextLine();
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //declare 5 type of input
        String type1[] = new String[size];
        String type2[] = new String[size];
        String type3[] = new String[size];
        String type4[] = new String[size];
        String type5[] = new String[size];
        //num of each type
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        //String of each number
        String num1="";
        String num2="";
        String num3="";
        String num4="";
        String num5="";
        
        //insert review score into String
        try {
            Scanner readFile = new Scanner(new File(filepath));
            int i=0;
            while(readFile.hasNextLine())
            {
                //initialize each class String is a number
                type1[i]="0";
                type2[i]="0";
                type3[i]="0";
                type4[i]="0";
                type5[i]="0";
                String[] line = readFile.nextLine().split(";;;");
                
                if(line[1].equals("1"))
                {
                    type1[i]=line[1];
                    count1++;
                }
                
                if(line[1].equals("2"))
                {
                    type2[i]=line[1];
                    count2++;
                }
                
                if(line[1].equals("3"))
                {
                    type3[i]=line[1];
                    count3++;
                }
                
                if(line[1].equals("4"))
                {
                    type4[i]=line[1];
                    count4++;
                }
                
                if(line[1].equals("5"))
                {
                    type5[i]=line[1];
                    count5++;
                }
              
                i++;
                
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //calculate the average score
        for(int i=0; i<type5.length; i++)
        {
            total += Integer.parseInt(type1[i]);
            total += Integer.parseInt(type2[i]);
            total += Integer.parseInt(type3[i]);
            total += Integer.parseInt(type4[i]);
            total += Integer.parseInt(type5[i]);
        }
        double score = Double.valueOf(total)/type5.length;
        
        //calculate the percentage of each class
        double star1 = Double.valueOf(count1)/total*100;
        double star2 = Double.valueOf(count2)/total*100;
        double star3 = Double.valueOf(count3)/total*100;
        double star4 = Double.valueOf(count4)/total*100;
        double star5 = Double.valueOf(count5)/total*100;
        
        //display the number
        for(int i=0; i<star1; i++)
        {
            num1+="*";
        }
        
        for(int i=0; i<star2; i++)
        {
            num2+="*";
        }
        
        for(int i=0; i<star3; i++)
        {
            num3+="*";
        }
        
        for(int i=0; i<star4; i++)
        {
            num4+="*";
        }
        
        for(int i=0; i<star5; i++)
        {
            num5+="*";
        }
        
        obj.Star1.setText(num1);
        obj.Star2.setText(num2);
        obj.Star3.setText(num3);
        obj.Star4.setText(num4);
        obj.Star5.setText(num5);
        
        //call the label which displays the value of scores
        obj.AverageScore.setText(String.valueOf(numberFormat.format(score)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        HotelBooking obj = new HotelBooking();
        dispose();
        obj.setVisible(true);
        
        //declare size of array and total score for review
        int size=0;
        
        //declare five different type of input
        int type [] = new int [5];
        
        //calculate average
        int total = 0;
        
        
        String filepath = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\hotel_review.txt";
        
        //check num of line inside the file
        try {
            Scanner readFile = new Scanner(new File(filepath));
            while(readFile.hasNextLine())
            {
                size++;
                readFile.nextLine();
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //declare 5 type of input
        String type1[] = new String[size];
        String type2[] = new String[size];
        String type3[] = new String[size];
        String type4[] = new String[size];
        String type5[] = new String[size];
        //num of each type
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        //String of each number
        String num1="";
        String num2="";
        String num3="";
        String num4="";
        String num5="";
        
        //insert review score into String
        try {
            Scanner readFile = new Scanner(new File(filepath));
            int i=0;
            while(readFile.hasNextLine())
            {
                //initialize each class String is a number
                type1[i]="0";
                type2[i]="0";
                type3[i]="0";
                type4[i]="0";
                type5[i]="0";
                String[] line = readFile.nextLine().split(";;;");
                
                if(line[1].equals("1"))
                {
                    type1[i]=line[1];
                    count1++;
                }
                
                if(line[1].equals("2"))
                {
                    type2[i]=line[1];
                    count2++;
                }
                
                if(line[1].equals("3"))
                {
                    type3[i]=line[1];
                    count3++;
                }
                
                if(line[1].equals("4"))
                {
                    type4[i]=line[1];
                    count4++;
                }
                
                if(line[1].equals("5"))
                {
                    type5[i]=line[1];
                    count5++;
                }
              
                i++;
                
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //calculate the average score
        for(int i=0; i<type5.length; i++)
        {
            total += Integer.parseInt(type1[i]);
            total += Integer.parseInt(type2[i]);
            total += Integer.parseInt(type3[i]);
            total += Integer.parseInt(type4[i]);
            total += Integer.parseInt(type5[i]);
        }
        double score = Double.valueOf(total)/type5.length;
        
        //calculate the percentage of each class
        double star1 = Double.valueOf(count1)/total*100;
        double star2 = Double.valueOf(count2)/total*100;
        double star3 = Double.valueOf(count3)/total*100;
        double star4 = Double.valueOf(count4)/total*100;
        double star5 = Double.valueOf(count5)/total*100;
        
        //display the number
        for(int i=0; i<star1; i++)
        {
            num1+="*";
        }
        
        for(int i=0; i<star2; i++)
        {
            num2+="*";
        }
        
        for(int i=0; i<star3; i++)
        {
            num3+="*";
        }
        
        for(int i=0; i<star4; i++)
        {
            num4+="*";
        }
        
        for(int i=0; i<star5; i++)
        {
            num5+="*";
        }
        
        obj.Star1.setText(num1);
        obj.Star2.setText(num2);
        obj.Star3.setText(num3);
        obj.Star4.setText(num4);
        obj.Star5.setText(num5);
        
        //call the label which displays the value of scores
        obj.AverageScore.setText(String.valueOf(numberFormat.format(score)));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SeaActivity obj = new SeaActivity();
        dispose();
        obj.setVisible(true);
        
        //declare size of array and total score for review
        int size=0;
        
        //declare five different type of input
        int type [] = new int [5];
        
        //calculate average
        int total = 0;
        
        String filepath = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\water_review.txt";
        
        
        //check num of line inside the file
        try {
            Scanner readFile = new Scanner(new File(filepath));
            while(readFile.hasNextLine())
            {
                size++;
                readFile.nextLine();
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //declare 5 type of input
        String type1[] = new String[size];
        String type2[] = new String[size];
        String type3[] = new String[size];
        String type4[] = new String[size];
        String type5[] = new String[size];
        //num of each type
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        //String of each number
        String num1="";
        String num2="";
        String num3="";
        String num4="";
        String num5="";
        
        //insert review score into String
        try {
            Scanner readFile = new Scanner(new File(filepath));
            int i=0;
            while(readFile.hasNextLine())
            {
                //initialize each class String is a number
                type1[i]="0";
                type2[i]="0";
                type3[i]="0";
                type4[i]="0";
                type5[i]="0";
                String[] line = readFile.nextLine().split(";;;");
                
                if(line[1].equals("1"))
                {
                    type1[i]=line[1];
                    count1++;
                }
                
                if(line[1].equals("2"))
                {
                    type2[i]=line[1];
                    count2++;
                }
                
                if(line[1].equals("3"))
                {
                    type3[i]=line[1];
                    count3++;
                }
                
                if(line[1].equals("4"))
                {
                    type4[i]=line[1];
                    count4++;
                }
                
                if(line[1].equals("5"))
                {
                    type5[i]=line[1];
                    count5++;
                }
              
                i++;
                
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //calculate the average score
        for(int i=0; i<type5.length; i++)
        {
            total += Integer.parseInt(type1[i]);
            total += Integer.parseInt(type2[i]);
            total += Integer.parseInt(type3[i]);
            total += Integer.parseInt(type4[i]);
            total += Integer.parseInt(type5[i]);
        }
        double score = Double.valueOf(total)/type5.length;
        
        //calculate the percentage of each class
        double star1 = Double.valueOf(count1)/total*100;
        double star2 = Double.valueOf(count2)/total*100;
        double star3 = Double.valueOf(count3)/total*100;
        double star4 = Double.valueOf(count4)/total*100;
        double star5 = Double.valueOf(count5)/total*100;
        
        //display the number
        for(int i=0; i<star1; i++)
        {
            num1+="*";
        }
        
        for(int i=0; i<star2; i++)
        {
            num2+="*";
        }
        
        for(int i=0; i<star3; i++)
        {
            num3+="*";
        }
        
        for(int i=0; i<star4; i++)
        {
            num4+="*";
        }
        
        for(int i=0; i<star5; i++)
        {
            num5+="*";
        }
        
        obj.Star1.setText(num1);
        obj.Star2.setText(num2);
        obj.Star3.setText(num3);
        obj.Star4.setText(num4);
        obj.Star5.setText(num5);
        
        //call the label which displays the value of scores
        obj.AverageScore.setText(String.valueOf(numberFormat.format(score)));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Food obj = new Food();
        dispose();
        obj.setVisible(true);
        
        //declare size of array and total score for review
        int size=0;
        
        //declare five different type of input
        int type [] = new int [5];
        
        //calculate average
        int total = 0;
        
        String filepath = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\food_review.txt";
        
        //check num of line inside the file
        try {
            Scanner readFile = new Scanner(new File(filepath));
            while(readFile.hasNextLine())
            {
                size++;
                readFile.nextLine();
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //declare 5 type of input
        String type1[] = new String[size];
        String type2[] = new String[size];
        String type3[] = new String[size];
        String type4[] = new String[size];
        String type5[] = new String[size];
        //num of each type
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        //String of each number
        String num1="";
        String num2="";
        String num3="";
        String num4="";
        String num5="";
        
        //insert review score into String
        try {
            Scanner readFile = new Scanner(new File(filepath));
            int i=0;
            while(readFile.hasNextLine())
            {
                //initialize each class String is a number
                type1[i]="0";
                type2[i]="0";
                type3[i]="0";
                type4[i]="0";
                type5[i]="0";
                String[] line = readFile.nextLine().split(";;;");
                
                if(line[1].equals("1"))
                {
                    type1[i]=line[1];
                    count1++;
                }
                
                if(line[1].equals("2"))
                {
                    type2[i]=line[1];
                    count2++;
                }
                
                if(line[1].equals("3"))
                {
                    type3[i]=line[1];
                    count3++;
                }
                
                if(line[1].equals("4"))
                {
                    type4[i]=line[1];
                    count4++;
                }
                
                if(line[1].equals("5"))
                {
                    type5[i]=line[1];
                    count5++;
                }
              
                i++;
                
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //calculate the average score
        for(int i=0; i<type5.length; i++)
        {
            total += Integer.parseInt(type1[i]);
            total += Integer.parseInt(type2[i]);
            total += Integer.parseInt(type3[i]);
            total += Integer.parseInt(type4[i]);
            total += Integer.parseInt(type5[i]);
        }
        double score = Double.valueOf(total)/type5.length;
        
        //calculate the percentage of each class
        double star1 = Double.valueOf(count1)/total*100;
        double star2 = Double.valueOf(count2)/total*100;
        double star3 = Double.valueOf(count3)/total*100;
        double star4 = Double.valueOf(count4)/total*100;
        double star5 = Double.valueOf(count5)/total*100;
        
        //display the number
        for(int i=0; i<star1; i++)
        {
            num1+="*";
        }
        
        for(int i=0; i<star2; i++)
        {
            num2+="*";
        }
        
        for(int i=0; i<star3; i++)
        {
            num3+="*";
        }
        
        for(int i=0; i<star4; i++)
        {
            num4+="*";
        }
        
        for(int i=0; i<star5; i++)
        {
            num5+="*";
        }
        
        obj.Star1.setText(num1);
        obj.Star2.setText(num2);
        obj.Star3.setText(num3);
        obj.Star4.setText(num4);
        obj.Star5.setText(num5);
        
        //call the label which displays the value of scores
        obj.AverageScore.setText(String.valueOf(numberFormat.format(score)));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Travelling obj = new Travelling();
        dispose();
        obj.setVisible(true);
        
        //declare size of array and total score for review
        int size=0;
        
        //declare five different type of input
        int type [] = new int [5];
        
        //calculate average
        int total = 0;
        
        String filepath = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\travel_review.txt";
        
        //check num of line inside the file
        try {
            Scanner readFile = new Scanner(new File(filepath));
            while(readFile.hasNextLine())
            {
                size++;
                readFile.nextLine();
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //declare 5 type of input
        String type1[] = new String[size];
        String type2[] = new String[size];
        String type3[] = new String[size];
        String type4[] = new String[size];
        String type5[] = new String[size];
        //num of each type
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        //String of each number
        String num1="";
        String num2="";
        String num3="";
        String num4="";
        String num5="";
        
        //insert review score into String
        try {
            Scanner readFile = new Scanner(new File(filepath));
            int i=0;
            while(readFile.hasNextLine())
            {
                //initialize each class String is a number
                type1[i]="0";
                type2[i]="0";
                type3[i]="0";
                type4[i]="0";
                type5[i]="0";
                String[] line = readFile.nextLine().split(";;;");
                
                if(line[1].equals("1"))
                {
                    type1[i]=line[1];
                    count1++;
                }
                
                if(line[1].equals("2"))
                {
                    type2[i]=line[1];
                    count2++;
                }
                
                if(line[1].equals("3"))
                {
                    type3[i]=line[1];
                    count3++;
                }
                
                if(line[1].equals("4"))
                {
                    type4[i]=line[1];
                    count4++;
                }
                
                if(line[1].equals("5"))
                {
                    type5[i]=line[1];
                    count5++;
                }
              
                i++;
                
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //calculate the average score
        for(int i=0; i<type5.length; i++)
        {
            total += Integer.parseInt(type1[i]);
            total += Integer.parseInt(type2[i]);
            total += Integer.parseInt(type3[i]);
            total += Integer.parseInt(type4[i]);
            total += Integer.parseInt(type5[i]);
        }
        double score = Double.valueOf(total)/type5.length;
        
        //calculate the percentage of each class
        double star1 = Double.valueOf(count1)/total*100;
        double star2 = Double.valueOf(count2)/total*100;
        double star3 = Double.valueOf(count3)/total*100;
        double star4 = Double.valueOf(count4)/total*100;
        double star5 = Double.valueOf(count5)/total*100;
        
        //display the number
        for(int i=0; i<star1; i++)
        {
            num1+="*";
        }
        
        for(int i=0; i<star2; i++)
        {
            num2+="*";
        }
        
        for(int i=0; i<star3; i++)
        {
            num3+="*";
        }
        
        for(int i=0; i<star4; i++)
        {
            num4+="*";
        }
        
        for(int i=0; i<star5; i++)
        {
            num5+="*";
        }
        
        obj.Star1.setText(num1);
        obj.Star2.setText(num2);
        obj.Star3.setText(num3);
        obj.Star4.setText(num4);
        obj.Star5.setText(num5);
        
        //call the label which displays the value of scores
        obj.AverageScore.setText(String.valueOf(numberFormat.format(score)));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Wifi obj = new Wifi();
        dispose();
        obj.setVisible(true);
        
        //declare size of array and total score for review
        int size=0;
        
        //declare five different type of input
        int type [] = new int [5];
        
        //calculate average
        int total = 0;
        
        String filepath = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\wifi_review.txt";
        
        //check num of line inside the file
        try {
            Scanner readFile = new Scanner(new File(filepath));
            while(readFile.hasNextLine())
            {
                size++;
                readFile.nextLine();
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //declare 5 type of input
        String type1[] = new String[size];
        String type2[] = new String[size];
        String type3[] = new String[size];
        String type4[] = new String[size];
        String type5[] = new String[size];
        //num of each type
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        //String of each number
        String num1="";
        String num2="";
        String num3="";
        String num4="";
        String num5="";
        
        //insert review score into String
        try {
            Scanner readFile = new Scanner(new File(filepath));
            int i=0;
            while(readFile.hasNextLine())
            {
                //initialize each class String is a number
                type1[i]="0";
                type2[i]="0";
                type3[i]="0";
                type4[i]="0";
                type5[i]="0";
                String[] line = readFile.nextLine().split(";;;");
                
                if(line[1].equals("1"))
                {
                    type1[i]=line[1];
                    count1++;
                }
                
                if(line[1].equals("2"))
                {
                    type2[i]=line[1];
                    count2++;
                }
                
                if(line[1].equals("3"))
                {
                    type3[i]=line[1];
                    count3++;
                }
                
                if(line[1].equals("4"))
                {
                    type4[i]=line[1];
                    count4++;
                }
                
                if(line[1].equals("5"))
                {
                    type5[i]=line[1];
                    count5++;
                }
              
                i++;
                
            }readFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //calculate the average score
        for(int i=0; i<type5.length; i++)
        {
            total += Integer.parseInt(type1[i]);
            total += Integer.parseInt(type2[i]);
            total += Integer.parseInt(type3[i]);
            total += Integer.parseInt(type4[i]);
            total += Integer.parseInt(type5[i]);
        }
        double score = Double.valueOf(total)/type5.length;
        
        //calculate the percentage of each class
        double star1 = Double.valueOf(count1)/total*100;
        double star2 = Double.valueOf(count2)/total*100;
        double star3 = Double.valueOf(count3)/total*100;
        double star4 = Double.valueOf(count4)/total*100;
        double star5 = Double.valueOf(count5)/total*100;
        
        //display the number
        for(int i=0; i<star1; i++)
        {
            num1+="*";
        }
        
        for(int i=0; i<star2; i++)
        {
            num2+="*";
        }
        
        for(int i=0; i<star3; i++)
        {
            num3+="*";
        }
        
        for(int i=0; i<star4; i++)
        {
            num4+="*";
        }
        
        for(int i=0; i<star5; i++)
        {
            num5+="*";
        }
        
        obj.Star1.setText(num1);
        obj.Star2.setText(num2);
        obj.Star3.setText(num3);
        obj.Star4.setText(num4);
        obj.Star5.setText(num5);
        
        //call the label which displays the value of scores
        obj.AverageScore.setText(String.valueOf(numberFormat.format(score)));
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
