/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.alloc;

/**
 *
 * @author Varuas
 */
import java.sql.*;  
class MysqlCon{
Connection con;    
MysqlCon(){
try{  
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/train","root","100rav");  
}catch(Exception e){ System.out.println(e);}
}
void runapp(){
try{
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from platform");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
}catch(Exception e){ System.out.println(e);}
}
protected void finalize(){
try{
con.close();
}catch(Exception e){ System.out.println(e);}
}
}
