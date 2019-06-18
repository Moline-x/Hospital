package Hospital.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
	//¼ÓÔØÇý¶¯
		static {
			try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		public static Connection getConnection(){
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="system";
			String password="123456";
			Connection con=null;
			try{
				con=DriverManager.getConnection(url, user, password);
			}catch (SQLException e){
				e.printStackTrace();
			}
			return con;
		}
		
		public static void main(String[] args){
			DbUtil.getConnection();
			
		}
}
