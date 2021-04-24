package com.javalec.Restaurantenroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class RfoodEnroll {

	private JFrame frame;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JTextField tfRname;
	private JTextField tfRaddress;
	private JTextField tfRtelco;
	private JTextField tfEnrollnumber;
	private JButton btnEnroll;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	
	
	private final DefaultTableModel Outer_Table = new DefaultTableModel(); // ################

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RfoodEnroll window = new RfoodEnroll();
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
	public RfoodEnroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getComboBox());
		frame.getContentPane().add(getComboBox_1());
		frame.getContentPane().add(getComboBox_2());
		frame.getContentPane().add(getTfRname());
		frame.getContentPane().add(getTfRaddress());
		frame.getContentPane().add(getTfRtelco());
		frame.getContentPane().add(getTfEnrollnumber());
		frame.getContentPane().add(getBtnEnroll());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getLblNewLabel_6());
		frame.getContentPane().add(getLblNewLabel_7());
		frame.getContentPane().add(getLblNewLabel_8());
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBackground(Color.WHITE);
			comboBox.setBounds(133, 111, 261, 25);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1인", "2인", "3인", "4인", "5인이상"}));
			comboBox_1.setBackground(Color.WHITE);
			comboBox_1.setBounds(133, 146, 261, 25);
		}
		return comboBox_1;
	}
	private JComboBox getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox();
			comboBox_2.setBackground(Color.WHITE);
			comboBox_2.setBounds(133, 180, 261, 25);
		}
		return comboBox_2;
	}
	private JTextField getTfRname() {
		if (tfRname == null) {
			tfRname = new JTextField();
			tfRname.setBounds(81, 215, 313, 39);
			tfRname.setColumns(10);
		}
		return tfRname;
	}
	private JTextField getTfRaddress() {
		if (tfRaddress == null) {
			tfRaddress = new JTextField();
			tfRaddress.setColumns(10);
			tfRaddress.setBounds(81, 275, 313, 39);
		}
		return tfRaddress;
	}
	private JTextField getTfRtelco() {
		if (tfRtelco == null) {
			tfRtelco = new JTextField();
			tfRtelco.setColumns(10);
			tfRtelco.setBounds(151, 334, 243, 39);
		}
		return tfRtelco;
	}
	private JTextField getTfEnrollnumber() {
		if (tfEnrollnumber == null) {
			tfEnrollnumber = new JTextField();
			tfEnrollnumber.setColumns(10);
			tfEnrollnumber.setBounds(151, 391, 243, 39);
		}
		return tfEnrollnumber;
	}
	private JButton getBtnEnroll() {
		if (btnEnroll == null) {
			btnEnroll = new JButton("등록");
			btnEnroll.setFont(new Font("티머니 둥근바람 ExtraBold", Font.PLAIN, 24));
			btnEnroll.setBackground(new Color(153, 204, 255));
			btnEnroll.setBounds(81, 440, 313, 38);
		}
		return btnEnroll;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("이름");
			lblNewLabel.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			lblNewLabel.setBounds(19, 227, 50, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("주소");
			lblNewLabel_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(19, 287, 50, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(19, 346, 50, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("사업자등록번호");
			lblNewLabel_3.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(12, 403, 114, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("동네");
			lblNewLabel_4.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			lblNewLabel_4.setBounds(36, 116, 50, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("인원");
			lblNewLabel_5.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			lblNewLabel_5.setBounds(36, 151, 50, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("음식");
			lblNewLabel_6.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 12));
			lblNewLabel_6.setBounds(36, 187, 50, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("우리동네 맛집");
			lblNewLabel_7.setFont(new Font("티머니 둥근바람 ExtraBold", Font.PLAIN, 24));
			lblNewLabel_7.setBounds(12, 10, 146, 39);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("맛집 등록");
			lblNewLabel_8.setFont(new Font("티머니 둥근바람 ExtraBold", Font.PLAIN, 24));
			lblNewLabel_8.setBounds(151, 59, 195, 42);
		}
		return lblNewLabel_8;
	}
}
