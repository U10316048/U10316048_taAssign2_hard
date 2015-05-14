import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreBoard extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel scoreLabel = new JLabel("得分:");
	JButton ok,reset;
	JTextField scoreBoard;
	boolean stop = false;
	
	public ScoreBoard(int newScore){
		this.setLocationRelativeTo(null);
		this.setSize(400,80);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		add(scoreLabel);
		
		scoreBoard = new JTextField(5);
		scoreBoard.setEditable(false);
		scoreBoard.setText(Integer.toString(newScore));
		
		
		add(scoreBoard);
		
		reset = new JButton("重玩");
		ok = new JButton("結束");
		
		add(reset);
		add(ok);
		
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new Login();
				close();
			}
		});
		
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		this.setVisible(true);
	}
	
	public void close(){
		this.setVisible(false);
	}
}
