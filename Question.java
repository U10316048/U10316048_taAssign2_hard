import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Question extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel qNumber,qLabel,A,B,C,D,content1,content2,correct,time;
	JTextArea jta;
	JScrollPane jsp1;
	JTextField jtf;
	JButton jbA,jbB,jbC,jbD,next;
	int num = 1;
	int score = 0;
	String sscore;
	String sa,sb,sc,sd;
	ActionListener aaa,bbb,ccc,ddd,aaap,bbbp,cccp,dddp;
	String name;
	Timer timer = new Timer();
	int sec = 61;
	
	public Question(String name){
		this.name = name;
		this.setTitle("u10316048_question  使用者: ["+this.name+"]");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(450, 700);
		this.setLayout(null);
		
		qNumber = new JLabel();
		qNumber.setBounds(10,10,150,30);
		
		qLabel = new JLabel("題目:");
		qLabel.setBounds(10,50,50,30);
		
		jta = new JTextArea();
		jta.setEditable(false);
		jsp1 = new JScrollPane(jta);
		jsp1.setBounds(10,80,425,150);
		
		A = new JLabel("A.");
		A.setBounds(20,250,30,30);
		B = new JLabel("B.");
		B.setBounds(20,300,30,30);
		C = new JLabel("C.");
		C.setBounds(20,350,30,30);
		D = new JLabel("D.");
		D.setBounds(20,400,30,30);
		
		content1 = new JLabel("你目前得分:");
		content1.setBounds(10,450,100,30);
		content2 = new JLabel("分");
		content2.setBounds(150,450,100,30);
		
		jtf = new JTextField(20);
		jtf.setEditable(false);
		jtf.setText("0");
		jtf.setBounds(90,455,50,20);
		
		jbA = new JButton();
		jbB = new JButton();
		jbC = new JButton();
		jbD = new JButton();
		
		jbA.setBounds(50,250,350,30);
		jbB.setBounds(50,300,350,30);
		jbC.setBounds(50,350,350,30);
		jbD.setBounds(50,400,350,30);
		
		next = new JButton("下一題");
		next.setBounds(300,450,100,30);
		
		correct = new JLabel();
		correct.setBounds(200,450,80,30);
		
		time = new JLabel();
		time.setBounds(330,20,100,50);
		
		this.add(qNumber);
		this.add(jbA);
		this.add(jbB);
		this.add(jbC);
		this.add(jbD);		
		this.add(qLabel);
		this.add(jsp1);
		this.add(A);
		this.add(B);
		this.add(C);
		this.add(D);
		this.add(content1);
		this.add(content2);
		this.add(jtf);
		this.add(next);
		this.add(correct);
		this.add(time);
		
		aaa = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				jbA.removeActionListener(this);	
				Incorrect();
			}
		};
		aaap = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				getPoint();
				jbA.removeActionListener(this);
				correct();
			}
		};
		bbb = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				jbB.removeActionListener(this);
				Incorrect();
			}
		};
		bbbp = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				getPoint();
				jbB.removeActionListener(this);
				correct();
			}
		};
		ccc = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				jbC.removeActionListener(this);
				Incorrect();
			}
		};
		cccp = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				getPoint();
				jbC.removeActionListener(this);
				correct();
			}
		};
		ddd = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				jbD.removeActionListener(this);
				Incorrect();
			}
		};
		dddp = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setButtonEnabledfalse();
				getPoint();
				jbD.removeActionListener(this);
				correct();
			}
		};
		
		timer.schedule(new SimpleTask(),500,1000);
		q1();
		
		this.setVisible(true);
	}

	public void q1(){
		qNumber.setText("第    1     /     10     題");
		jta.setText("A(n) _____ is a location in the computer's memory where a value can be stored for use by a program.");
		jbA.setText("unknown");
		jbB.setText("name");
		jbC.setText("variable");
		jbD.setText("declaration");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbb);
		jbC.addActionListener(cccp);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbb);
				jbC.removeActionListener(cccp);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q2();
			}
		});
	}
	
	public void q2(){
		qNumber.setText("第    2     /     10     題");
		jta.setText("The __________ sign is also known as the __________ operator.");
		jbA.setText("＋, assignment");
		jbB.setText("=, assignment");
		jbC.setText("*, stream manipulator");
		jbD.setText("&, stream insertion");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbbp);
		jbC.addActionListener(ccc);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbbp);
				jbC.removeActionListener(ccc);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q3();
			}
		});
	}
	
	public void q3(){
		qNumber.setText("第    3     /     10     題");
		jta.setText("The address operator is");
		jbA.setText("&&");
		jbB.setText("％");
		jbC.setText("&");
		jbD.setText("@");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbb);
		jbC.addActionListener(cccp);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbb);
				jbC.removeActionListener(cccp);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q4();
			}
		});
	}
	
	public void q4(){
		qNumber.setText("第    4     /     10     題");
		jta.setText("Evaluate the expression  3 * 4 % 6 ＋ 4 * 5");
		jbA.setText("20");
		jbB.setText("26");
		jbC.setText("12");
		jbD.setText("32");
		jbA.addActionListener(aaap);
		jbB.addActionListener(bbb);
		jbC.addActionListener(ccc);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaap);
				jbB.removeActionListener(bbb);
				jbC.removeActionListener(ccc);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q5();
			}
		});
	}
	
	public void q5(){
		qNumber.setText("第    5     /     10     題");
		jta.setText("Which of the following is not a keyword?");
		jbA.setText("int");
		jbB.setText("return");
		jbC.setText("if");
		jbD.setText("main");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbb);
		jbC.addActionListener(ccc);
		jbD.addActionListener(dddp);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbb);
				jbC.removeActionListener(ccc);
				jbD.removeActionListener(dddp);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q6();
			}
		});
	}
	
	public void q6(){
		qNumber.setText("第    6     /     10     題");
		jta.setText("The order in which statements are __________ is called flow of control.");
		jbA.setText("entered in a source file");
		jbB.setText("preprocessed");
		jbC.setText("compiled");
		jbD.setText("executed");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbbp);
		jbC.addActionListener(ccc);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbbp);
				jbC.removeActionListener(ccc);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q7();
			}
		});
	}
	
	public void q7(){
		qNumber.setText("第    7     /     10     題");
		jta.setText("A linked program is often called a(n) ______");
		jbA.setText("chain");
		jbB.setText("library");
		jbC.setText("object");
		jbD.setText("executable");
		jbA.addActionListener(aaap);
		jbB.addActionListener(bbb);
		jbC.addActionListener(ccc);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaap);
				jbB.removeActionListener(bbb);
				jbC.removeActionListener(ccc);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q8();
			}
		});
	}
	
	public void q8() {
		qNumber.setText("第    8     /     10     題");
		jta.setText("Every statement in C must end with a");
		jbA.setText("period (.)");
		jbB.setText("semicolon (；)");
		jbC.setText("colon (:)");
		jbD.setText("backslash (/)");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbbp);
		jbC.addActionListener(ccc);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbbp);
				jbC.removeActionListener(ccc);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q9();
			}
		});
	}
	
	public void q9(){
		qNumber.setText("第    9     /     10     題");
		jta.setText("Every variable has all the attributes below, except");
		jbA.setText("name");
		jbB.setText("value");
		jbC.setText("alias");
		jbD.setText("type");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbb);
		jbC.addActionListener(cccp);
		jbD.addActionListener(ddd);
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbb);
				jbC.removeActionListener(cccp);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				q10();
			}
		});
	}
	
	public void q10(){
		qNumber.setText("第    10     /     10     題");
		jta.setText("Which operation will find the remainder when 15 is divided by 6?");
		jbA.setText("15 / 6");
		jbB.setText("15 ％ 6");
		jbC.setText("15 ^ 6");
		jbD.setText("15 * 6");
		jbA.addActionListener(aaa);
		jbB.addActionListener(bbbp);
		jbC.addActionListener(ccc);
		jbD.addActionListener(ddd);
		next.setText("完成");
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				correct.setText("");
				jbA.removeActionListener(aaa);
				jbB.removeActionListener(bbbp);
				jbC.removeActionListener(ccc);
				jbD.removeActionListener(ddd);
				next.removeActionListener(this);
				setButtonEnabledtrue();
				new ScoreBoard(score);
				close();
			}
		});
	}
	
	public void Incorrect(){
		correct.setText("Incorrect.");
		correct.setForeground(Color.red);
		add(correct);
	}
	
	public void correct(){
		correct.setText("Correct.");
		correct.setForeground(Color.green);
		add(correct);
	}
	
	public void setButtonEnabledfalse(){
		jbA.setEnabled(false);
		jbB.setEnabled(false);
		jbC.setEnabled(false);
		jbD.setEnabled(false);
	}
	
	public void setButtonEnabledtrue(){
		jbA.setEnabled(true);
		jbB.setEnabled(true);
		jbC.setEnabled(true);
		jbD.setEnabled(true);
		sec = 61;
	}
	
	public void getPoint(){
		score+=10;
		sscore = Integer.toString(score);
		jtf.setText(sscore);
	}
	
	public void close(){
		this.setVisible(false);
	}
	
	private class SimpleTask extends TimerTask{
		public void run(){
			sec--;
			if(sec>10){
				time.setFont(new Font("Calibri",0,32));
				time.setText(Integer.toString(sec));
				time.setForeground(Color.blue);
				
			}else if(sec<=10&&sec>=0){
				time.setFont(new Font("Calibri",0,32));
				time.setText(Integer.toString(sec));
				time.setForeground(Color.red);
			}else{
				setButtonEnabledfalse();
				time.setFont(new Font("Calibri",0,20));
				time.setText("Time out!");
				time.setForeground(Color.red);
			}
		}
	}
}
