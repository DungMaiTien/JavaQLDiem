package Quanlydiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class Process_Student {

	Connection cn;
	
	public static Connection getCon()
	{
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/db_qlhs?useSSL=False", "root", "23122018az");
		}
		catch(ClassNotFoundException | SQLException e) {
		}
		return cn;
	}
	
	public ArrayList<Student> getListStudent(){
		Connection cn = getCon();
		String sql = "SELECT *  FROM db_qlhs.tb_student";
		ArrayList<Student> lsStudent = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student t = new Student();
				t.setID(rs.getString("ID"));
				t.setName(rs.getString("Name"));
				t.setClassID(rs.getString("ClassID"));
				t.setMark(rs.getDouble("Mark"));
				t.setKhoi(rs.getInt("Khoi"));
				lsStudent.add(t);
			}
		}
		catch(SQLException e) {
		}
		return lsStudent;
	}
	public ArrayList<Student> getListStudentbykhoi(String khoi) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE Khoi = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, khoi);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public ArrayList<Student> getListStudentbyClassID(String ClassID) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE ClassID = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, ClassID);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public ArrayList<Student> getListStudentbyID(String text_mhs) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE ID = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, text_mhs);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public ArrayList<Student> getListStudentbyName(String text_ten) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE Name = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, text_ten);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public ArrayList<Student> getListStudentbydtb(String text_diem) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE Mark = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, text_diem);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public static void main(String[] args) {
		System.out.println(getCon());
	}

	
	}
