package com.javalec.Rjoin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rjoin {

	private JFrame frame;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfRname;
	private JTextField tfRid;
	private JTextField tfEmail;
	private JButton btnJoin;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField tfEnrollnumber;
	private JLabel label_4_1;
	private JPasswordField pfRpw;
	private JPasswordField pfRpwright;
	private JButton btnOverlap;
	private JLabel lblNewLabel_2;
	
	private final DefaultTableModel Outer_Table = new DefaultTableModel(); // ################
	// private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
   //	private final String id_mysql = "root";
   //	private final String pw_mysql = "qwer1234";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rjoin window = new Rjoin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rjoin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 450, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfRname());
		frame.getContentPane().add(getTextField_1_1());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getBtnJoin());
		frame.getContentPane().add(getLabel());
		frame.getContentPane().add(getLabel_1());
		frame.getContentPane().add(getLabel_2());
		frame.getContentPane().add(getLabel_3());
		frame.getContentPane().add(getLabel_4());
		frame.getContentPane().add(getTfEnrollnumber());
		frame.getContentPane().add(getLabel_4_1());
		frame.getContentPane().add(getPfRpw());
		frame.getContentPane().add(getPfRpwright());
		frame.getContentPane().add(getBtnOverlap());
		frame.getContentPane().add(getLblNewLabel_2());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("우리동네 맛집");
			lblNewLabel.setFont(new Font("티머니 둥근바람 ExtraBold", Font.PLAIN, 24));
			lblNewLabel.setBounds(12, 10, 188, 51);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("회원가입");
			lblNewLabel_1.setFont(new Font("티머니 둥근바람 ExtraBold", Font.PLAIN, 24));
			lblNewLabel_1.setBounds(158, 67, 121, 46);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfRname() {
		if (tfRname == null) {
			tfRname = new JTextField();
			tfRname.setBounds(83, 138, 300, 28);
			tfRname.setColumns(10);
		}
		return tfRname;
	}
	private JTextField getTextField_1_1() {
		if (tfRid == null) {
			tfRid = new JTextField();
			tfRid.setColumns(10);
			tfRid.setBounds(83, 176, 165, 28);
		}
		return tfRid;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(83, 311, 300, 28);
		}
		return tfEmail;
	}
	private JButton getBtnJoin() {
		if (btnJoin == null) {
			btnJoin = new JButton("회원가입");
			btnJoin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnJoin.setBackground(new Color(153, 204, 255));
			btnJoin.setFont(new Font("티머니 둥근바람 ExtraBold", Font.PLAIN, 24));
			btnJoin.setBounds(83, 392, 300, 59);
		}
		return btnJoin;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("아이디");
			label.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			label.setBounds(12, 173, 106, 36);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("비밀번호");
			label_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			label_1.setBounds(12, 220, 106, 36);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("비밀번호 확인");
			label_2.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			label_2.setBounds(12, 257, 106, 36);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("식당 이름");
			label_3.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			label_3.setBounds(12, 135, 106, 36);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("이메일");
			label_4.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			label_4.setBounds(12, 308, 106, 36);
		}
		return label_4;
	}
	private JTextField getTfEnrollnumber() {
		if (tfEnrollnumber == null) {
			tfEnrollnumber = new JTextField();
			tfEnrollnumber.setColumns(10);
			tfEnrollnumber.setBounds(83, 349, 300, 28);
		}
		return tfEnrollnumber;
	}
	private JLabel getLabel_4_1() {
		if (label_4_1 == null) {
			label_4_1 = new JLabel("사업자 등록번호");
			label_4_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			label_4_1.setBounds(0, 346, 106, 36);
		}
		return label_4_1;
	}
	private JPasswordField getPfRpw() {
		if (pfRpw == null) {
			pfRpw = new JPasswordField();
			pfRpw.setBounds(83, 226, 165, 21);
		}
		return pfRpw;
	}
	private JPasswordField getPfRpwright() {
		if (pfRpwright == null) {
			pfRpwright = new JPasswordField();
			pfRpwright.setBounds(83, 257, 165, 21);
		}
		return pfRpwright;
	}
	private JButton getBtnOverlap() {
		if (btnOverlap == null) {
			btnOverlap = new JButton("중복확인");
			btnOverlap.setBackground(new Color(153, 204, 255));
			btnOverlap.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IdEnroll();
				}
			});
			btnOverlap.setFont(new Font("티머니 둥근바람 ExtraBold", Font.PLAIN, 12));
			btnOverlap.setBounds(283, 178, 91, 26);
		}
		return btnOverlap;
	}
	
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(83, 202, 165, 15);
		}
		return lblNewLabel_2;
	}
	
	public void IdEnroll() {
		
	}
}//-------------------------------
