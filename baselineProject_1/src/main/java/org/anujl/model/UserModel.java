package org.anujl.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import org.anujl.config.DatabaseConfig;
import org.anujl.entity.User;

public class UserModel {
  public List<User> listusers(){
	 List<User> data=new ArrayList<>();
	 Connection con=DatabaseConfig.getConnection();
	 Statement stmt=null;
	 ResultSet rset=null;
	 String query="Select * from user";
	 try {
		 stmt=con.createStatement();
		 rset=stmt.executeQuery(query);
		 while(rset.next()) {
			 data.add(new User(rset.getInt(1),rset.getString(2),rset.getString(3)));
		 }
	 }
	 catch(Exception e){
		 e.getStackTrace()
		 ;
	 }
	 return data;
 }
  public boolean addUser(User user) {
      String query = "INSERT INTO user(username, password) VALUES(?, ?)";
      try (
          Connection con = DatabaseConfig.getConnection();
          PreparedStatement stmt = con.prepareStatement(query);
      ) {
          stmt.setString(1, user.getUsername());
          stmt.setString(2, user.getPassword());
          return stmt.executeUpdate() > 0;
      } catch (Exception e) {
          e.printStackTrace();
      }
      return false;
  }

  public  void updateUser(User user) {
      String query = "UPDATE user SET username = ?, password = ? WHERE u_id = ?";
      try {
          Connection con = DatabaseConfig.getConnection();
          PreparedStatement stmt = con.prepareStatement(query);
          stmt.setString(1, user.getUsername());
          stmt.setString(2, user.getPassword());
          stmt.setInt(3, user.getU_id());
          stmt.executeUpdate();
      } catch (Exception e) {
          e.printStackTrace();
      }

  }

  public boolean deleteUser(int id) {
      String query = "DELETE FROM user WHERE u_id = ?";
      try (
          Connection con = DatabaseConfig.getConnection();
          PreparedStatement stmt = con.prepareStatement(query);
      ) {
          stmt.setInt(1, id);
          return stmt.executeUpdate() > 0;
      } catch (Exception e) {
          e.printStackTrace();
      }
      return false;
  }
}
