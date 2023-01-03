import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_DBConnection {
	
	
	public static void main(String[] args) throws InterruptedException, SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
	
	
	
	//  jdbc:mysql://" + host + ":" + port + "/databasename","username","pword" ;
	//  jdbc:mysql://" + localhost + ":" + 3030 + "/QADataBase","root","root" ;
	// SInce its local machine, its local host. port is 3030 when yu login yu can see. DB name is QADataBase
		
		//Make the database connection
		 String dbClass = "com.mysql.jdbc.Driver";
         Class.forName(dbClass).newInstance();
		
		String host = "localhost";
		String port = "3306";
		String dbName = "qadatabase";
		
		//Step 1 : Establish a JDBC connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadatabase","root","root" ); 
		
		//"jdbc:mysql://localhost:3306/qadatabaase","root","root"
		
		//Step 2 : Create statement object to send the queries
		Statement s = con.createStatement();
		
		//Step 3 : Send the query to database using execute query and store the results in the ResultSet object.
		ResultSet rs = s.executeQuery("select * from Employeeinfo");
		
		//If yu dont give .next, it will point to base
		//Step 5 : Extract data from the result set
		while(rs.next()) {
			
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
		}
		
//		SQL TABLE
		
//		Name id location age
//		Sam	1	India	21
//		Ram	2	India	22
//		Bam	3	India	23
//		Tam	4	India	24
		
		
		
		
		
	}
}
