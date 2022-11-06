package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import model.*;

public class UserDao {

	private String dburl = "jdbc:mysql://localhost:3306/java_sample";
	private String dbuname = "root";
	private String dbpassword = "";
	private String dbdriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver( String dbDriver){
		try{
			Class.forName(dbDriver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		Connection con = null;
		
		try{
			con = DriverManager.getConnection(dburl,dbuname,dbpassword);
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		
		return con;
	}
	
	public String register(User user){
		loadDriver(dbdriver);
		Connection con = getConnection();
		String query = "insert into userdata values (?,?,?,?)";
		String result = "registered successfully!!";
		
		
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getConfirmpass());
			ps.executeUpdate();
			
		}catch(SQLException e){
			result = "registration unsuccessful!!";
			e.printStackTrace();
		}
		
		
		
		
		return result;
	}
	
	public User login(String uname,String pass){
		String res="";
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql ="select * from userdata where username=? && password=?";
		
		User userx = new User("null","nulx","nulx","null");
		
		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uname);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();

		if(rs.next()){
			res = "Login Successfull!!";
			System.out.print(rs.getString(1));
			User user = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			System.out.print(user.toString());
			userx=user;
			
		}else{
			res = "no user found!!";
			
		}
		}catch(SQLException e){
			res="something went wrong!!";
			e.printStackTrace();
			
		}
		
		
		return userx;
	}
	
	public String updatex(String uname,String pass){
		String res="";
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "update userdata set password=? where username=?";
		 try{
			 PreparedStatement ps = con.prepareStatement("update userdata set password=? where username=?");
			 ps.setString(1, pass);
			 ps.setString(2, uname);
			 System.out.print(uname + pass);
			 ps.executeUpdate();
			 res="updated!!!";
			 
			 
		 }catch(SQLException e){
			 e.printStackTrace();
			 res="some error occured!!";
		 }
		
		
		
		
		return res;
	}

}
