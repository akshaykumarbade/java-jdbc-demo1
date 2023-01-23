import java.sql.*;


public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "root";
		String password = "akshaykumarbade";
		String query = "select * from smart_phone";
		String url = "jdbc:mysql://localhost:3306/smartphones_db";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				String SmartPhoneGallery="";
				for(int i=1; i<=7;i++) {
					SmartPhoneGallery += result.getString(i)+" :";
				}
				System.out.println(SmartPhoneGallery);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		

	}

}
