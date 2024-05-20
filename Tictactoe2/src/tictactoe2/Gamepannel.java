/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Gamepannel implements ActionListener{
    int count = 0;
    String str ="" ,title_str="";
    JFrame jf;
    JButton jb,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8;
    boolean win = false;
    Color color1;
    String player1;
     String player;
    String player2;
    boolean first_turn=true;
   Gamepannel(String player1, String player2)
   {
     this.player1 = player1;
     this.player2 = player2;
       
      
   }
   void openGamepannel()
   {
       jf = new JFrame("TicTacToe game by Singyy");
       jf.setSize(500,500);
       jf.setTitle(player1 +"'s turn");
       jf.setDefaultCloseOperation(3);
       jf.setLayout(new GridLayout(3,3));
       
       
       jf.setVisible(true);
       
       jb = new JButton();
       jf.add(jb);
       jb.addActionListener(this);
       
       jb1 = new JButton();
       jf.add(jb1);
       jb1.addActionListener(this);
       
       jb2 = new JButton();
       jf.add(jb2);
       jb2.addActionListener(this);
       
       jb3 = new JButton();
       jf.add(jb3);
       jb3.addActionListener(this);
       
       jb4 = new JButton();
       jf.add(jb4);
       jb4.addActionListener(this);
       
       jb5 = new JButton();
       jf.add(jb5);
       jb5.addActionListener(this);
       
       jb6 = new JButton();
       jf.add(jb6);
       jb6.addActionListener(this);
       
       jb7 = new JButton();
       jf.add(jb7);
       jb7.addActionListener(this);
       
       jb8 = new JButton();
       jf.add(jb8);
       jb8.addActionListener(this);
   
   }



    @Override
    public void actionPerformed(ActionEvent e) {
        
        count=count+1;
        if(first_turn==true)
        {
            str = "X";
            color1=Color.PINK;
            title_str = "0";
            jf.setTitle(player2+"'s turn" +" ("+title_str +")" );
           
            first_turn = false;
        }
        else{
            str = "0";
            color1=Color.WHITE;
            title_str = "X";
            jf.setTitle(player1+"'s turn" +" ("+title_str +")");
            first_turn = true;
        }
      
        if(e.getSource()==jb){
            jb.setText(str);
            jb.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb.setFont(f);
            jb.setEnabled(false);
        }
         if(e.getSource()==jb1){
            jb1.setText(str);
            jb1.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb1.setFont(f);
             jb1.setEnabled(false);
        }
          if(e.getSource()==jb2){
            jb2.setText(str);
            jb2.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb2.setFont(f);
             jb2.setEnabled(false);
        }
             if(e.getSource()==jb3){
            jb3.setText(str);
            jb3.setBackground(color1);
            jb.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb3.setFont(f);
             jb3.setEnabled(false);
        }
             if(e.getSource()==jb4){
            jb4.setText(str);
            jb4.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb4.setFont(f);
             jb4.setEnabled(false);
        }
              if(e.getSource()==jb5){
            jb5.setText(str);
            jb5.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb5.setFont(f);
             jb5.setEnabled(false);
        }
               if(e.getSource()==jb6){
            jb6.setText(str);
            jb6.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb6.setFont(f);
             jb6.setEnabled(false);
        }
              if(e.getSource()==jb7){
            jb7.setText(str);
            jb7.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb7.setFont(f);
             jb7.setEnabled(false);
        }
            if(e.getSource()==jb8){
            jb8.setText(str);
            jb8.setBackground(color1);
            Font f = new Font("Arial", 1, 50);
            jb8.setFont(f);
             jb8.setEnabled(false);
        }
        WinningPossibilities();
        whowins();
    }
    
    void WinningPossibilities()
    {
        if(jb.getText()==jb1.getText() && jb1.getText()==jb2.getText() && jb.getText() != "")
        {
           win = true;
        }
        else if(jb3.getText()==jb4.getText() && jb4.getText()==jb5.getText() && jb3.getText() != "")
        {
            win = true;
        }
          else if(jb6.getText()==jb7.getText() && jb7.getText()==jb8.getText() && jb6.getText() != "")
          {
              win = true;
            }
      else if(jb.getText()==jb3.getText() && jb3.getText()==jb6.getText() && jb.getText() != "")
      {
          win = true;
      }
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText() != "")
        {
            win = true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb2.getText() != "")
        {
            win = true;
         }
        else if(jb.getText()==jb4.getText() && jb4.getText()==jb8.getText() && jb.getText() != "")
        {
             win = true;
         } 
        else if(jb2.getText()==jb4.getText() && jb4.getText()==jb6.getText() && jb2.getText() != "")
        {
            win = true;
          }  
          }
    void whowins(){
        if(win==true)
        {
           
            if(str.equals("O"))
            {
              player = player2;  
            
        }
            else{
                player = player1;
            }
            
          String  win_title = player + " " + "is the WINNER!" ;
             JOptionPane.showMessageDialog(jf,  win_title );
             restartgame();
        }
        else if(count == 9 && win==false){
             JOptionPane.showMessageDialog(jf,  "Match Draw");
             restartgame();
        }
    }
    void restartgame()
    {
        int i = JOptionPane.showConfirmDialog(jf, "Do you want to restart the game?");//yes=1 , no =2 , cancel=-1..(this is inbuilt)
       if( i==0)
       {
       jb.setText("");
       jb1.setText("");
       jb2.setText("");
       jb3.setText("");
       jb4.setText("");
       jb5.setText("");
       jb6.setText("");
       jb7.setText("");
       jb8.setText("");
       
       jb1.setBackground(null);
       jb1.setBackground(null);
       jb2.setBackground(null);
       jb3.setBackground(null);
       jb4.setBackground(null);
       jb5.setBackground(null);
       jb6.setBackground(null);
       jb7.setBackground(null);
       jb8.setBackground(null);
       
      buttonsetting(true);
               
        
       if(player.equals(player1))
       {
           count=0;
       }
       else {
       player2 = player1;
       player1= player;
       
       count = 1;
       win = false;
       }
       }
       else if(i==1)
       {
           System.exit(0);
       }
       else{
           
             buttonsetting(false);
          
       }
       
       }

    void buttonsetting(boolean b)
    {
      jb.setEnabled(b);
      jb1.setEnabled(b);
      jb2.setEnabled(b);
      jb3.setEnabled(b);
      jb4.setEnabled(b);
      jb5.setEnabled(b);
      jb6.setEnabled(b);
      jb7.setEnabled(b);
      jb8.setEnabled(b);
      
      jb.setBackground(null);
      jb1.setBackground(null);
      jb2.setBackground(null);
      jb3.setBackground(null);
      jb4.setBackground(null);
      jb5.setBackground(null);
      jb6.setBackground(null);
      jb7.setBackground(null);
      jb8.setBackground(null);
    }
    
}
