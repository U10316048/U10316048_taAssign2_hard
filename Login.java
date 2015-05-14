import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel loginLabel;
	JButton loginButton;
	JTextField loginTextField;
	
	public Login(){
		this.setTitle("登入");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,80);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		loginLabel = new JLabel("學號:");
		loginButton = new JButton("登入");
		loginTextField = new JTextField(20);
		
		add(loginLabel);
		add(loginTextField);
		add(loginButton);
		
		loginButton.addActionListener(this);
		loginTextField.addKeyListener(new enter());
		
		this.setVisible(true);
	}
	
	public void close(){
		this.setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e){
		String name = loginTextField.getText();
		if(name==null || name.equals("")){
			JOptionPane.showMessageDialog(null,"User name is invalid!","Note",JOptionPane.WARNING_MESSAGE);
			return;
		}
		new Question(name);
		close();
	}
	
	private class enter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				String name = loginTextField.getText();
				if(name==null || name.equals("")){
					JOptionPane.showMessageDialog(null,"User name is invalid!","Note",JOptionPane.WARNING_MESSAGE);
					return;
				}
				new Question(name);
				close();
			}
		}
	}
	
	public static void main(String[] args){
		new Login();
	}
}
