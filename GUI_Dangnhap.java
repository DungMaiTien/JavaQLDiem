package Quanlydiem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;

public class GUI_Dangnhap extends JFrame {
	private JTextField text_tk;
	private JPasswordField pwf_mk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Dangnhap frame = new GUI_Dangnhap();
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
	public GUI_Dangnhap() {
		setResizable(false);
		setTitle("Đăng nhập quản trị");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 236);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(29, 21, 135, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setForeground(new Color(255, 255, 255));
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMtKhu.setBounds(29, 69, 135, 25);
		contentPane.add(lblMtKhu);
		
		text_tk = new JTextField();
		text_tk.setBounds(174, 25, 187, 25);
		contentPane.add(text_tk);
		text_tk.setColumns(10);
		
		JButton btn_dangnhap = new JButton("Đăng nhập");
		btn_dangnhap.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_dangnhap.setBounds(133, 121, 187, 42);
		contentPane.add(btn_dangnhap);
		
		final JButton btn_dongy = new JButton("Đồng ý!");
		btn_dongy.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		final JButton btn_dongy1 = new JButton("Đồng ý!");
		btn_dongy1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		pwf_mk = new JPasswordField(15);
		pwf_mk.setBounds(174, 73, 187, 25);
		contentPane.add(pwf_mk);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\LTJava\\JavaQLDiem-DungMaiTien-GUI-1\\Anh.jpg"));
		lblNewLabel_1.setBounds(0, 0, 422, 199);
		contentPane.add(lblNewLabel_1);
		
		
		btn_dangnhap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				GUI_QUANLY f = null;
				String use = text_tk.getText();
				String pass = pwf_mk.getText();
				if(use.equals("demo@gmail.com") && pass.equals("1234"))
				{
						f = new GUI_QUANLY();
						f.show();
				}
				else if(use.equals(null) && pass.equals(null))
				{
					JOptionPane.showMessageDialog(btn_dongy, "Bạn chưa nhập tài khoản hoặc mật khẩu");
				}
				else
				{
					JOptionPane.showMessageDialog(btn_dongy1, "Bạn đã nhập sai tài khoản hoặc mật khẩu!");
				}	
			}
		});
		
	}
	

}