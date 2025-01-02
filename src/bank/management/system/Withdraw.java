package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdraw extends JFrame implements ActionListener {
	
	JButton withdraw,back;
	JTextField amount;
	int accountNumber;
	//long accountNumber = SignUpOne.rand;
	
	Withdraw(int accountNumber){
		this.accountNumber = accountNumber;
		
		setLayout(null);
		setSize(330,300);
		setLocation(700,200);
		setTitle("Wihtdraw Money");
		//setUndecorated(true);
		
		JLabel msg = new JLabel("Enter the amount below");
		msg.setBounds(40,30,250,50);
		msg.setFont(new Font("OSWALD",Font.BOLD,20));
		msg.setForeground(Color.black);
		add(msg);
		
		JLabel restriction = new JLabel("(Amount from $5 to $9999)");
		restriction.setBounds(40,50,250,50);
		restriction.setForeground(Color.black);
		add(restriction);
		
		amount = new JTextField();
		amount.setBounds(50,120,200,30);
		amount.setForeground(Color.black);
		add(amount);
		
		withdraw = new JButton("Withdraw");
		withdraw.setBounds(50,160,100,30);
		withdraw.setForeground(Color.black);
		withdraw.addActionListener(this);
		add(withdraw);
		
		back = new JButton("Go Back");
		back.setBounds(150,160,100,30);
		back.setForeground(Color.black);
		back.addActionListener(this);
		add(back);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String withdrawingAmount = "";
		
		if(e.getSource() == back) {
			setVisible(false);
			new bankingPage(0,0).setVisible(true);
		}
		
		if(e.getSource() == withdraw) {
			if(amount.getText().equals(""))
				JOptionPane.showMessageDialog(null, "Enter a number between 5 and 9999");
			else if(Integer.parseInt(amount.getText()) < 5 || Integer.parseInt(amount.getText()) > 9999) {
				JOptionPane.showMessageDialog(null, "Enter a number between 5 and 9999");
			}
			else {
				withdrawingAmount = amount.getText();
				try {
					
					ConnectionC conn = new ConnectionC();
					String query = "UPDATE balance SET ChequingBalance = ChequingBalance - '"+withdrawingAmount+"' WHERE AccountNumber ='"+this.accountNumber+"';";					
					conn.st.executeUpdate(query);
					
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.toString());
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		new Withdraw(0);
	}
	

}
