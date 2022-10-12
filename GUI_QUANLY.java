package Quanlydiem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class GUI_QUANLY extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_QUANLY frame = new GUI_QUANLY();
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
	public GUI_QUANLY() {
		setResizable(false);
		setTitle("CHƯƠNG TRÌNH QUẢN LÝ ĐIỂM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 10, 355, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblThngTin = new JLabel("THÔNG TIN HỌC SINH");
		lblThngTin.setBounds(0, 0, 355, 36);
		lblThngTin.setBackground(new Color(0, 0, 0));
		lblThngTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblThngTin);
		
		JLabel lblNewLabel = new JLabel("khối :");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 46, 54, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblNewLabel);
		
		JComboBox cb_khoi = new JComboBox();
		cb_khoi.setBounds(132, 53, 208, 21);
		panel.add(cb_khoi);
		
		JLabel lblLp = new JLabel("Lớp :");
		lblLp.setBounds(10, 96, 54, 30);
		lblLp.setHorizontalAlignment(SwingConstants.LEFT);
		lblLp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblLp);
		
		textField = new JTextField();
		textField.setBounds(133, 102, 207, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblHTn = new JLabel("Mã Học Sinh:");
		lblHTn.setBounds(10, 155, 100, 21);
		lblHTn.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 156, 207, 24);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblHTn_3 = new JLabel("Họ Tên :");
		lblHTn_3.setBounds(10, 199, 100, 21);
		lblHTn_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 200, 207, 24);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JLabel lblHTn_1_1 = new JLabel("Điểm trung bình");
		lblHTn_1_1.setBounds(10, 244, 110, 24);
		lblHTn_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(133, 247, 207, 24);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblHTn_1_1_1 = new JLabel("Xếp loại:");
		lblHTn_1_1_1.setBounds(10, 298, 110, 21);
		lblHTn_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(132, 299, 207, 24);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JLabel lblHTn_1_1_1_1 = new JLabel("Hạnh Kiểm:");
		lblHTn_1_1_1_1.setBounds(10, 344, 110, 21);
		lblHTn_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(133, 347, 207, 24);
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		JButton btnNewButton = new JButton("Tìm Kiếm");
		btnNewButton.setBounds(20, 392, 100, 41);
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnNewButton);
		
		JButton btnThm = new JButton("Hiển Thị");
		btnThm.setBounds(132, 392, 100, 41);
		btnThm.setForeground(Color.RED);
		btnThm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThm.setBackground(Color.YELLOW);
		panel.add(btnThm);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setBounds(245, 392, 100, 41);
		btnSa.setForeground(Color.RED);
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSa.setBackground(Color.YELLOW);
		panel.add(btnSa);
		
		JButton btnSpXp = new JButton("Sắp xếp");
		btnSpXp.setBounds(20, 443, 100, 41);
		btnSpXp.setForeground(Color.RED);
		btnSpXp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSpXp.setBackground(Color.YELLOW);
		panel.add(btnSpXp);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setBounds(132, 443, 100, 41);
		btnXa.setForeground(Color.RED);
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXa.setBackground(Color.YELLOW);
		panel.add(btnXa);
		
		JButton btnThm_1 = new JButton("Thêm");
		btnThm_1.setBounds(245, 443, 100, 41);
		btnThm_1.setForeground(Color.RED);
		btnThm_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThm_1.setBackground(Color.YELLOW);
		panel.add(btnThm_1);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setBounds(371, 10, 668, 519);
		contentPane.add(table);
	}
}
