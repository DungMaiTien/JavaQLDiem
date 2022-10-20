// JavaScript source code
package Quanlydiem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
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
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;

public class GUI_QUANLY extends JFrame {

	private JPanel contentPane;
	private JTextField text_lop;
	private JTextField text_ten;
	private JTextField text_diem;
	private JTextField text_xeploai;
	private JTextField text_hk;
	private JTable table_hienthi;
	private DefaultTableModel dtm = new DefaultTableModel();
	private Process_Student ps = new Process_Student();
	private ArrayList<Student> lst;
	private Vector<String> columns = new Vector<String>();
	private Vector<Vector<Object>> rows = new Vector<>();
	private JComboBox<String> cb_khoi = new JComboBox<>();
	private JTextField text_mhs = new JTextField();
	private JOptionPane jOP_Check = new javax.swing.JOptionPane();
	private JOptionPane jOP_Message = new JOptionPane();
	JOptionPane jOP_kq = new javax.swing.JOptionPane();
	JOptionPane kq = new javax.swing.JOptionPane();
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
		setBounds(100, 100, 1218, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 10, 355, 513);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblThngTin = new JLabel("THÔNG TIN HỌC SINH");
		lblThngTin.setBounds(0, 0, 355, 36);
		lblThngTin.setBackground(new Color(0, 0, 0));
		lblThngTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblThngTin);
		
		JLabel lblNewLabel = new JLabel("Khối :");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 46, 54, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblNewLabel);
		cb_khoi.setModel(new DefaultComboBoxModel(new String[] {"null"}));
		

		cb_khoi.setBounds(132, 53, 208, 21);
		panel.add(cb_khoi);
		
		JLabel lblLp = new JLabel("Lớp :");
		lblLp.setBounds(10, 96, 54, 30);
		lblLp.setHorizontalAlignment(SwingConstants.LEFT);
		lblLp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblLp);
		text_lop = new JTextField();
		text_lop.setBounds(133, 102, 207, 24);
		panel.add(text_lop);
		text_lop.setColumns(10);
		
		JLabel lblHTn = new JLabel("Mã Học Sinh:");
		lblHTn.setBounds(10, 155, 100, 21);
		lblHTn.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn);
		
		
		text_mhs.setBounds(133, 156, 207, 24);
		text_mhs.setColumns(10);
		panel.add(text_mhs);
		
		JLabel lblHTn_3 = new JLabel("Họ Tên :");
		lblHTn_3.setBounds(10, 199, 100, 21);
		lblHTn_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_3);
		
		text_ten = new JTextField();
		text_ten.setBounds(132, 200, 207, 24);
		text_ten.setColumns(10);
		panel.add(text_ten);
		
		JLabel lblHTn_1_1 = new JLabel("Điểm trung bình");
		lblHTn_1_1.setBounds(10, 244, 110, 24);
		lblHTn_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_1_1);
		
		text_diem = new JTextField();
		text_diem.setBounds(133, 247, 207, 24);
		text_diem.setColumns(10);
		panel.add(text_diem);
		
		JLabel lblHTn_1_1_1 = new JLabel("Xếp loại:");
		lblHTn_1_1_1.setBounds(10, 298, 110, 21);
		lblHTn_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_1_1_1);
		
		text_xeploai = new JTextField();
		text_xeploai.setBounds(132, 299, 207, 24);
		text_xeploai.setColumns(10);
		panel.add(text_xeploai);
		
		JLabel lblHTn_1_1_1_1 = new JLabel("Hạnh Kiểm:");
		lblHTn_1_1_1_1.setBounds(10, 344, 110, 21);
		lblHTn_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHTn_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblHTn_1_1_1_1);
		
		text_hk = new JTextField();
		text_hk.setBounds(133, 347, 207, 24);
		text_hk.setColumns(10);
		panel.add(text_hk);
		
		JButton btn_timkiem = new JButton("Tìm Kiếm");
		btn_timkiem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(text_mhs.getText().toString().equals("")&&text_ten.getText().toString().equals("")&&text_lop.getText().toString().equals("")&&text_diem.getText().toString().equals(""))
				{
					getListStudentbykhoi(cb_khoi.getSelectedItem()+"");
				}
				else if(text_mhs.getText().toString().equals("")&&text_ten.getText().toString().equals("")&&text_diem.getText().toString().equals(""))
				{
					getListStudentbyClassID(text_lop.getText());
				}
				else if(text_ten.getText().toString().equals("")&&text_lop.getText().toString().equals("")&&text_diem.getText().toString().equals(""))
				{
					getListStudentbyID(text_mhs.getText());
				}
				else if(text_mhs.getText().toString().equals("")&&text_lop.getText().toString().equals("")&&text_diem.getText().toString().equals(""))
				{
					getListStudentbyName(text_ten.getText());
				}
				else if(text_mhs.getText().toString().equals("")&&text_lop.getText().toString().equals("")&&text_ten.getText().toString().equals(""))
				{
					getListStudentbydtb(text_diem.getText());
				}
				
			}
		});
		btn_timkiem.setBounds(20, 392, 100, 41);
		btn_timkiem.setBackground(new Color(255, 255, 0));
		btn_timkiem.setForeground(new Color(255, 0, 0));
		btn_timkiem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btn_timkiem);
		
		JButton btn_clear = new JButton("Clear");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Clear();
			}
		});
		btn_clear.setBounds(132, 392, 100, 41);
		btn_clear.setForeground(Color.RED);
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_clear.setBackground(Color.YELLOW);
		panel.add(btn_clear);
		
		final JButton btn_dongy1 = new JButton("Ðồng ý");
		JButton btn_sua = new JButton("Sửa");
		btn_sua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdategetlistStudent();
				JOptionPane.showMessageDialog(btn_dongy1,"Bạn đã sửa thành công");
			}
		});
		btn_sua.setBounds(245, 392, 100, 41);
		btn_sua.setForeground(Color.RED);
		btn_sua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_sua.setBackground(Color.YELLOW);
		panel.add(btn_sua);
		
		JButton btn_sapxep = new JButton("Sắp xếp");
//		btn_sapxep.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Collection.sort(lst,(a,b)->(double)a.getMark()-b.getMark());
//				getAllStudent();
//			}
//		});
		
		
		btn_sapxep.setBounds(20, 443, 100, 41);
		btn_sapxep.setForeground(Color.RED);
		btn_sapxep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_sapxep.setBackground(Color.YELLOW);
panel.add(btn_sapxep);
		
		JButton btn_xoa = new JButton("Xóa");		
			btn_xoa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// xoa
					delStudent();
				}
			});
		
		btn_xoa.setBounds(132, 443, 100, 41);
		btn_xoa.setForeground(Color.RED);
		btn_xoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_xoa.setBackground(Color.YELLOW);
		panel.add(btn_xoa);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Khoi = cb_khoi.getSelectedItem().toString();
				String ClassID = text_lop.getText();
				String ID = text_mhs.getText();
				String Name = text_ten.getText();
				double Mark = Double.parseDouble(text_diem.getText());
				String HanhKiem = text_hk.getText();
				if(ID.equals("")||Name.equals("")||ClassID.equals("")||HanhKiem.equals(""))
					kq.showConfirmDialog(null, "Vui lòng điền đầy đủ thông tin","Thông báo", kq.OK_CANCEL_OPTION);
				
				else {
					kq.showConfirmDialog(null, "Bạn có muốn thêm ","Thông báo", kq.OK_CANCEL_OPTION);
					
					ps.Insert_getlistStudent(ID, Name, ClassID,Mark,Khoi, HanhKiem);
					text_mhs.setText("");
					text_ten.setText("");
					text_lop.setText("");
					text_hk.setText("");
					text_xeploai.setText("");
					
					dtm.setNumRows(0);
					getAllStudent();
			}
				
			}



		});
		btn_them.setBounds(245, 443, 100, 41);
		btn_them.setForeground(Color.RED);
		btn_them.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_them.setBackground(Color.YELLOW);
		panel.add(btn_them);
		
		table_hienthi = new JTable();
		table_hienthi.setBackground(new Color(128, 255, 255));
		table_hienthi.setBounds(371, 10, 823, 513);
		contentPane.add(table_hienthi);
		
		table_hienthi.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				int selectRow = table_hienthi.getSelectedRow();
				if(selectRow != -1)
				{
					Vector<Object> row = rows.get(selectRow);
					text_mhs.setText(row.get(0).toString());
					text_ten.setText(row.get(1).toString());
					text_lop.setText(row.get(2).toString());
					text_diem.setText(row.get(3).toString());
					text_hk.setText(row.get(5).toString());
					text_xeploai.setText(row.get(6).toString());
				}
			}
		}
		);
		
		columns.add("Mã Học Sinh");
		columns.add("Họ Và Tên");
		columns.add("Lớp");
		columns.add("Điểm Trung Bình");
		columns.add("Khối");
		columns.add("Hạnh Kiểm");
		columns.add("Xếp Loại");
		lst = ps.getListStudent();
		getAllStudent();

		lst = ps.getListStudent();
		for(int i = 0; i < lst.size(); i++) {
			int countKhoi = 0;
			for(int j = i + 1; j < lst.size(); j++) {
				
				if(lst.get(i).getKhoi() == lst.get(j).getKhoi())
					countKhoi++;
			}
			
			if(countKhoi == 0)
				cb_khoi.addItem(lst.get(i).getKhoi() + "");
		}
			
		getAllStudent();
	}
	
	private void getListStudentbykhoi(String Khoi) {
		dtm.setNumRows(0);
		lst = ps.getListStudentbykhoi(Khoi);
		for(int i = 0; i < lst.size(); i++) {
			Student t = (Student)lst.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(t.getID());
			tbRow.add(t.getName());
			tbRow.add(t.getClassID());
			tbRow.add(t.getMark());
			tbRow.add(t.getKhoi());
			tbRow.add(t.getHanhKiem());
			tbRow.add(t.Xeploai());
			rows.add(tbRow);
		}
		dtm.setDataVector(rows, columns);
		dtm.insertRow(0, columns);
		table_hienthi.setModel(dtm);
	}
	private void getListStudentbyClassID(String ClassID) {
		dtm.setNumRows(0);
		lst = ps.getListStudentbyClassID(ClassID);
		for(int i = 0; i < lst.size(); i++) {
			Student t = (Student)lst.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(t.getID());
			tbRow.add(t.getName());
			tbRow.add(t.getClassID());
			tbRow.add(t.getMark());
			tbRow.add(t.getKhoi());
			tbRow.add(t.getHanhKiem());
			tbRow.add(t.Xeploai());
			rows.add(tbRow);
		}
		dtm.setDataVector(rows, columns);
		dtm.insertRow(0, columns);
		table_hienthi.setModel(dtm);
	}
	
	private void getListStudentbyName(String text_ten) {
		dtm.setNumRows(0);
		lst = ps.getListStudentbyName(text_ten);
		for(int i = 0; i < lst.size(); i++) {
			Student t = (Student)lst.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(t.getID());
			tbRow.add(t.getName());
			tbRow.add(t.getClassID());
			tbRow.add(t.getMark());
			tbRow.add(t.getKhoi());
			tbRow.add(t.getHanhKiem());
			tbRow.add(t.Xeploai());
			rows.add(tbRow);
		}
		dtm.setDataVector(rows, columns);
		dtm.insertRow(0, columns);
		table_hienthi.setModel(dtm);
	}
	
	private void getListStudentbydtb(String text_diem) {
		dtm.setNumRows(0);
		lst = ps.getListStudentbydtb(text_diem);
		for(int i = 0; i < lst.size(); i++) {
			Student t = (Student)lst.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(t.getID());
			tbRow.add(t.getName());
			tbRow.add(t.getClassID());
			tbRow.add(t.getMark());
			tbRow.add(t.getKhoi());
			tbRow.add(t.getHanhKiem());
			tbRow.add(t.Xeploai());
			rows.add(tbRow);
		}
		dtm.setDataVector(rows, columns);
		dtm.insertRow(0, columns);
		table_hienthi.setModel(dtm);
	}
	
	private void getListStudentbyID(String text_mhs) {
		dtm.setNumRows(0);
		lst = ps.getListStudentbyID(text_mhs);
		for(int i = 0; i < lst.size(); i++) {
			Student t = (Student)lst.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(t.getID());
			tbRow.add(t.getName());
			tbRow.add(t.getClassID());
			tbRow.add(t.getMark());
			tbRow.add(t.getKhoi());
			tbRow.add(t.getHanhKiem());
			tbRow.add(t.Xeploai());
			rows.add(tbRow);
		}
		dtm.setDataVector(rows, columns);
		dtm.insertRow(0, columns);
		table_hienthi.setModel(dtm);
	}
	private void UpdategetlistStudent() {
		String Khoi = cb_khoi.getSelectedItem().toString() ;
		String ClassID = text_lop.getText();
		String ID = text_mhs.getText();
		String Name = text_ten.getText();
		double Mark = Double.parseDouble(text_diem.getText());
		String HanhKiem = text_hk.getText();
		ps.Update_getlistStudent(ID, Name, ClassID, Mark,Khoi, HanhKiem);
		dtm.setNumRows(0);
		getAllStudent();
	}
	
	private void getAllStudent() {
		dtm.setNumRows(0);
		lst = ps.getListStudent();
		for(int i = 0; i < lst.size(); i++) {
			Student t = (Student)lst.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(t.getID());
			tbRow.add(t.getName());
			tbRow.add(t.getClassID());
			tbRow.add(t.getMark());
			tbRow.add(t.getKhoi());
			tbRow.add(t.getHanhKiem());
			tbRow.add(t.Xeploai());
			rows.add(tbRow);
		}
		dtm.setDataVector(rows, columns);
		dtm.insertRow(0, columns);
		table_hienthi.setModel(dtm);
	}
	private void Clear()
	{
		text_lop.setText(null);
		text_mhs.setText(null);
		text_ten.setText(null);
		text_diem.setText(null);
		text_xeploai.setText(null);
		text_hk.setText(null);
	}

public void delStudent() {
	dtm.setNumRows(0);
	String id = text_mhs.getText();
	if(jOP_Check.showConfirmDialog(null, "Bạn có muốn xóa thông tin sinh viên này?", "Xóa sinh viên", jOP_Check.YES_NO_CANCEL_OPTION) == 0)
	{
		if(ps.delStudent(id) == true) {
			getAllStudent();
			jOP_Message.showMessageDialog(null, "Sinh viên đã được xóa khỏi danh sách!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}
	}
		else {
			jOP_Message.showMessageDialog(null, "Xóa sinh viên không thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			getAllStudent();
	}
}
}