package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class ViewCalc extends JFrame {

	String operator;
	
	private JPanel contentPane;
	private JTextField textField_01;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCalc frame = new ViewCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewCalc() {
		
		Calculo conta = new Calculo();
		conta.termo_01 = 0;
		conta.termo_02 = 0;
		conta.result = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField_01 = new JTextFieldSomenteNumeros(10);
		textField_01.setBounds(37, 11, 375, 37);
		textField_01.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		textField_01.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_01.setColumns(10);
		textField_01.setVisible(true);
		contentPane.setLayout(null);
		contentPane.add(textField_01);
		
		JButton btn_00 = new JButton("0");
		btn_00.setMnemonic(KeyEvent.VK_0);		// Habilita entrada a partir do teclado.
		btn_00.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_00.setBounds(37, 207, 75, 50);
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "0");		// getText() pega o texto anterior e adiciona.
			}
		});
		contentPane.add(btn_00);
		
		JButton btn_01 = new JButton("1");
		btn_01.setMnemonic(KeyEvent.VK_1);
		btn_01.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_01.setBounds(37, 158, 75, 50);
		btn_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "1");
			}
		});
		contentPane.add(btn_01);
		
		JButton btn_02 = new JButton("2");
		btn_02.setMnemonic(KeyEvent.VK_2);
		btn_02.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_02.setBounds(112, 158, 75, 50);
		btn_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "2");
			}
		});
		contentPane.add(btn_02);
		
		JButton btn_03 = new JButton("3");
		btn_03.setMnemonic(KeyEvent.VK_3);
		btn_03.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_03.setBounds(187, 158, 75, 50);
		btn_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "3");
			}
		});
		contentPane.add(btn_03);
		
		JButton btn_04 = new JButton("4");
		btn_04.setMnemonic(KeyEvent.VK_4);
		btn_04.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_04.setBounds(37, 109, 75, 50);
		btn_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "4");
			}
		});
		contentPane.add(btn_04);
		
		JButton btn_05 = new JButton("5");
		btn_05.setMnemonic(KeyEvent.VK_5);		// Habilita entrada a partir do teclado.
		btn_05.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_05.setBounds(112, 109, 75, 50);
		btn_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "5");
			}
		});
		contentPane.add(btn_05);
		
		JButton btn_06 = new JButton("6");
		btn_06.setMnemonic(KeyEvent.VK_6);		// Habilita entrada a partir do teclado.
		btn_06.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_06.setBounds(187, 109, 75, 50);
		btn_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "6");
			}
		});
		contentPane.add(btn_06);
		
		JButton btn_07 = new JButton("7");
		btn_07.setMnemonic(KeyEvent.VK_7);		// Habilita entrada a partir do teclado.
		btn_07.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_07.setBounds(37, 60, 75, 50);
		btn_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "7");
			}
		});
		contentPane.add(btn_07);
				
		JButton btn_08 = new JButton("8");
		btn_08.setMnemonic(KeyEvent.VK_8);		// Habilita entrada a partir do teclado.
		btn_08.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_08.setBounds(112, 60, 75, 50);
		btn_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "8");
			}
		});
		contentPane.add(btn_08);
		
		JButton btn_09 = new JButton("9");
		btn_09.setMnemonic(KeyEvent.VK_9);		// Habilita entrada a partir do teclado.
		btn_09.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_09.setBounds(187, 60, 75, 50);
		btn_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + "9");
			}
		});
		contentPane.add(btn_09);
		
		JButton btn_10 = new JButton("+");
		btn_10.setMnemonic('+');
		btn_10.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_10.setBounds(262, 109, 75, 50);
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "plus";
				conta.termo_01 = Double.parseDouble(textField_01.getText());	// transforma String em Float.
				textField_01.setText("");
				textField_01.requestFocus();
			}
		});
		contentPane.add(btn_10);
		
		JButton btn_11 = new JButton("-");
		btn_11.setMnemonic('-');
		btn_11.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_11.setBounds(337, 109, 75, 50);
		btn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "less";
				conta.termo_01 = Double.parseDouble(textField_01.getText());	// transforma String em Float.
				textField_01.setText("");
				textField_01.requestFocus();
			}
		});
		contentPane.add(btn_11);
		
		JButton btn_12 = new JButton("x");
		btn_12.setMnemonic('*');
		btn_12.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_12.setBounds(262, 158, 75, 50);
		btn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "multiply";
				conta.termo_01 = Double.parseDouble(textField_01.getText());	// transforma String em Float.
				textField_01.setText("");
				textField_01.requestFocus();
			}
		});
		contentPane.add(btn_12);
		
		JButton btn_13 = new JButton("÷");
		btn_13.setMnemonic('/');
		btn_13.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_13.setBounds(337, 158, 75, 50);
		btn_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "divide";
				conta.termo_01 = Double.parseDouble(textField_01.getText());	// transforma String em Float.
				textField_01.setText("");
				textField_01.requestFocus();
			}
		});
		contentPane.add(btn_13);
		
		JButton btn_14 = new JButton("=");
		btn_14.setMnemonic(KeyEvent.VK_ENTER);
		btn_14.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_14.setBounds(262, 207, 150, 50);
		btn_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conta.termo_02 = Double.parseDouble(textField_01.getText());	// transforma String em Float.
				if (operator == "plus"){					
					conta.soma(conta.termo_01, conta.termo_02);
					textField_01.setText(""+conta.result);
				} else if (operator == "less"){
					conta.sub(conta.termo_01, conta.termo_02);
					textField_01.setText(""+conta.result);
				} else if (operator == "multiply"){
					conta.mult(conta.termo_01, conta.termo_02);
					textField_01.setText(""+conta.result);
				} else if (operator == "divide"){
					conta.div(conta.termo_01, conta.termo_02);
					textField_01.setText(""+conta.result);
				} else if (operator == "percent"){
					conta.percent(conta.termo_01, conta.termo_02);
					textField_01.setText(""+conta.result);
				}
			}
		});
		contentPane.add(btn_14);
		
		JButton btn_15 = new JButton("C");
		btn_15.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_15.setBounds(187, 207, 75, 50);
		btn_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conta.termo_01 = 0;
				conta.termo_02 = 0;
				textField_01.setText("");
				textField_01.requestFocus();
			}
		});
		contentPane.add(btn_15);

		JButton btn_16 = new JButton(".");
		btn_16.setMnemonic('.');
		btn_16.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_16.setBounds(112, 207, 75, 50);		
		btn_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_01.setText(textField_01.getText() + ".");
			}
		});
		contentPane.add(btn_16);
		
		JButton btn_17 = new JButton("<<");
		btn_17.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_17.setBounds(262, 60, 75, 50);
		contentPane.add(btn_17);
		
		JButton btn_18 = new JButton("%");
		btn_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "percent";
				conta.termo_01 = Double.parseDouble(textField_01.getText());	// transforma String em Float.
				textField_01.setText("");
				textField_01.requestFocus();
			}
		});
		btn_18.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btn_18.setBounds(337, 60, 75, 50);
		contentPane.add(btn_18);
																						
	}
}