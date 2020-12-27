package mainapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainApp {

	private JFrame frmJcalculator;
	private JTextField textField;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPercent;
	private JButton btnPlus;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnPlusSub;
	private JButton btnClear;
	private JButton btnBackSpace;
	private JButton btnDot;
	private JButton btnEqual;

	double firstNumber;
	double secondNumber;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frmJcalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJcalculator = new JFrame();
		frmJcalculator.setTitle("JCalculator 1.0");
		frmJcalculator.setBounds(100, 100, 364, 432);
		frmJcalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJcalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(22, 23, 302, 26);
		frmJcalculator.getContentPane().add(textField);
		textField.setColumns(10);

		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setBounds(22, 73, 69, 50);
		frmJcalculator.getContentPane().add(btnPercent);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(22, 134, 69, 50);
		frmJcalculator.getContentPane().add(btn7);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(22, 196, 69, 50);
		frmJcalculator.getContentPane().add(btn4);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(22, 257, 69, 50);
		frmJcalculator.getContentPane().add(btn1);

		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(101, 73, 69, 50);
		frmJcalculator.getContentPane().add(btnClear);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(101, 135, 69, 49);
		frmJcalculator.getContentPane().add(btn8);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(101, 196, 69, 50);
		frmJcalculator.getContentPane().add(btn5);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(101, 257, 69, 50);
		frmJcalculator.getContentPane().add(btn2);

		btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;

				if (textField.getText().length() > 0) {
					StringBuilder sB = new StringBuilder(textField.getText());
					sB.deleteCharAt(textField.getText().length() - 1);
					backspace = sB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBackSpace.setBounds(182, 73, 69, 50);
		frmJcalculator.getContentPane().add(btnBackSpace);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(180, 134, 69, 50);
		frmJcalculator.getContentPane().add(btn9);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(180, 197, 69, 49);
		frmJcalculator.getContentPane().add(btn6);

		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(180, 257, 69, 50);
		frmJcalculator.getContentPane().add(btn3);

		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(261, 73, 69, 50);
		frmJcalculator.getContentPane().add(btnDiv);

		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(259, 134, 69, 50);
		frmJcalculator.getContentPane().add(btnMult);

		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(259, 196, 71, 50);
		frmJcalculator.getContentPane().add(btnSub);

		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(259, 257, 69, 50);
		frmJcalculator.getContentPane().add(btnPlus);

		btnPlusSub = new JButton("\u00B1");
		btnPlusSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));

			}
		});
		btnPlusSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlusSub.setBounds(22, 321, 69, 50);
		frmJcalculator.getContentPane().add(btnPlusSub);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(101, 321, 69, 50);
		frmJcalculator.getContentPane().add(btn0);

		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btnDot.getText());
		          }
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(182, 321, 69, 50);
		frmJcalculator.getContentPane().add(btnDot);

		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(textField.getText());

				if (operation == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
				else if (operation == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
				else if (operation == "*") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
				else if (operation == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
				else if (operation == "%") {
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(261, 321, 69, 50);
		frmJcalculator.getContentPane().add(btnEqual);
	}
}
