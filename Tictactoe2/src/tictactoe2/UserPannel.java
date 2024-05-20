/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Snigdha Ghosh
 */
public class UserPannel implements ActionListener{
    JFrame jf;
    JTextField jt1,jt2;
    JLabel jl,jl1;
    JButton jb;
     UserPannel(){
          jf=new JFrame();
         
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
        
        
        
         jl= new JLabel("Enter name Player1: (X)");
        jl.setBounds(50, 50, 120, 30);
        jf.add(jl);
         jl= new JLabel("Enter name Player2: (O)");
        jl.setBounds(50, 50, 120, 30);
        jf.add(jl);
         jt1=new JTextField();
        jt1.setBounds(200, 50, 250, 40);
        jf.add(jt1);
        
        jl1= new JLabel("Enter name Player2:");
        jl1.setBounds(50, 100, 120, 30);
        jf.add(jl1);
        
        jt2=new JTextField();
        jt2.setBounds(200, 100, 250, 40);
        jf.add(jt2);
        
                
       jb= new JButton("Start Game");
       jb.setBounds(200, 280, 150, 50);
       jb.addActionListener(this); 
       jf.add(jb);
      
         jf.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb)
        {
            String player1 = jt1.getText();
            String player2 = jt2.getText();
            
          Gamepannel gp = new Gamepannel(player1,player2);
          gp.openGamepannel();
          jb.setVisible(false);

    }
    }
    
}
