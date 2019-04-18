import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MainFrame1 extends JFrame implements Runnable, ActionListener, ItemListener {
	
	public String liczba1 = " ";
	public double liczba11;
	public String liczba2 = " ";
	public double liczba22;
	public String akcja=" ";
	public double wynik1;
	protected int action;
	private JTextField tResult;
	
	private JButton bAC;
	private JButton bSqrt;
	private JButton bPercent;
	private JButton bSplit;
	
	private JButton bSeven;
	private JButton bEight;
	private JButton bNine; 
	private JButton bMulti;
	
	private JButton bFour;
	private JButton bFive;
	private JButton bSix;
	private JButton bMinus;
	
	
	private JButton bOne;
	private JButton bTwo;
	private JButton bThree;
	private JButton bPlus;
	
	private JButton bZero;
	private JButton bDot;
	private JButton bResult;
	
	private JPanel contentPanel;
	
	public MainFrame1() {
		

		super("Calculator");
		setSize(240, 380);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		//int akcja1 = Integer.valueOf(akcja);
		contentPanel = new JPanel();
		setContentPane(contentPanel);

		tResult = new JTextField();
		tResult.setPreferredSize(new Dimension(240, 50));
		add(tResult);
		
		bAC = new JButton("AC");
		add(bAC);
		bAC.setPreferredSize(new Dimension(55, 55));
		
		bSqrt = new JButton("S");
		add(bSqrt);
		bSqrt.setPreferredSize(new Dimension(55, 55));
		
		bPercent = new JButton("%");
		add(bPercent);
		bPercent.setPreferredSize(new Dimension(55, 55));
		
		bSplit = new JButton("/");
		add(bSplit);
		bSplit.setPreferredSize(new Dimension(55, 55));
		
		
		bSeven = new JButton("7");
		add(bSeven);
		bSeven.setPreferredSize(new Dimension(55, 55));
		
		bEight = new JButton("8");
		add(bEight);
		bEight.setPreferredSize(new Dimension(55, 55));
		
		bNine = new JButton("9");
		add(bNine);
		bNine.setPreferredSize(new Dimension(55, 55));
		
		bMulti = new JButton("*");
		add(bMulti);
		bMulti.setPreferredSize(new Dimension(55, 55));
		
		
		bFour = new JButton("4");
		add(bFour);
		bFour.setPreferredSize(new Dimension(55, 55));
		
		bFive = new JButton("5");
		add(bFive);
		bFive.setPreferredSize(new Dimension(55, 55));
		
		bSix = new JButton("6");
		add(bSix);
		bSix.setPreferredSize(new Dimension(55, 55));
		
		bMinus = new JButton("-");
		add(bMinus);
		bMinus.setPreferredSize(new Dimension(55, 55));
		
		
		bOne = new JButton("1");
		add(bOne);
		bOne.setPreferredSize(new Dimension(55, 55));
		
		bTwo = new JButton("2");
		add(bTwo);
		bTwo.setPreferredSize(new Dimension(55, 55));
		
		bThree = new JButton("3");
		add(bThree);
		bThree.setPreferredSize(new Dimension(55, 55));
		
		bPlus = new JButton("+");
		add(bPlus);
		bPlus.setPreferredSize(new Dimension(55, 55));
		
		
		bZero = new JButton("0");
		add(bZero);
		bZero.setPreferredSize(new Dimension(115, 55));
		
		bDot = new JButton(",");
		add(bDot);
		bDot.setPreferredSize(new Dimension(55, 55));
		
		bResult = new JButton("=");
		add(bResult);
		bResult.setPreferredSize(new Dimension(55, 55));
		
		
		
		
		bAC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				   tResult.setText(" ");
				   
			}
		});
		
		bSqrt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				 liczba1=tResult.getText();

				 liczba11=Double.parseDouble(liczba1);
				// JOptionPane.showMessageDialog(bSqrt, liczba11);
			    	wynik1 = Math.sqrt(liczba11);
			    	tResult.setText(String.valueOf(wynik1));				 
			}

		});
		
		bDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				 liczba1=tResult.getText();
				 if(!(liczba1.contains("."))){
				 liczba1=liczba1+".";
				 tResult.setText(liczba1);
				 }
			}

		});
		
		
		bPercent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
 				 liczba1=tResult.getText();
				 liczba11=Double.parseDouble(liczba1);
				 wynik1=liczba11*0.01;
				 tResult.setText(String.valueOf(wynik1));
			}
		});
		
		bSplit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				liczba1=tResult.getText();
				tResult.setText(" ");
				action=1;
			}
		});
		
		
		bMulti.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				liczba1=tResult.getText();
				tResult.setText(" ");	
				action=2;
				}
		});
		
		bMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				liczba1=tResult.getText();
				tResult.setText(" ");
				action=3;
				}
		});
		
		bPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				liczba1=tResult.getText();
				tResult.setText(" ");
				action=4;
				}
		});
		
		
		
		
		
		
		
		bSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"7");
			}
		});
		
		bEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"8");
			}
		});
		
		bNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"9");
			}
		});
		
		bFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"4");
			}
		});
		
		bFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"5");
			}
		});
		
		bSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"6");
			}
		});

		bOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"1");
			}
		});
		
		bTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"2");
			}
		});
		
		bThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"3");
			}
		});
		
		bZero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	      
				tResult.setText(tResult.getText()+"0");
			}
		});
		
		
		bResult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				liczba2 = String.valueOf(tResult.getText());
				liczba11=Double.valueOf(liczba1);
				liczba22=Double.valueOf(liczba2);
				
				switch(action) {
				case 1:
					wynik1=liczba11/liczba22;
					tResult.setText(Double.toString(wynik1));
					break;
					
				case 2:
					wynik1=liczba11*liczba22;
					
					tResult.setText(Double.toString(wynik1));
					break;
				case 3:
					wynik1=liczba11-liczba22;
					tResult.setText(Double.toString(wynik1));
					break;
				case 4:
					wynik1=liczba11+liczba22;
					tResult.setText(Double.toString(wynik1));
					break;

				}
			
			}
			
		});
	}
	
	class ButtonClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {


		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		setVisible(true);
	}

}
