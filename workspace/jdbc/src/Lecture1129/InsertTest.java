package Lecture1129;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
 public static void main(String[] args) {
   // pet ���̺��� �̸�/������/��/����/����� Į���� �ֽ��ϴ�.
   insert("chunhyang", "ch", "1");
 }
//sql ������ tinyint�������� �ڹٿ��¾��⋚���� short or int�� �־�����Ѵ�
 public static void insert(String id, String pwd,String gender){ 
   Connection conn = null;
   PreparedStatement pstmt = null;
    
   try{
     // 1. ����̹� �ε�
     Class.forName("com.mysql.jdbc.Driver");
      
     // 2. �����ϱ�
     String url = "jdbc:mysql://localhost/test?useSSL=false";
     conn = DriverManager.getConnection(url, "root", "jang4562");
      
      
     // 3. SQL ���� �غ�
     // �߰��Ϸ��� �������� ���� ���޵� ���ڸ� ���� �������� �Ҵ�Ǵ� ���̴�.
     // �� � ���� ���޵��� �𸣹Ƿ� Select �� ���� �޸�
     // stmt = conn.createStatement(); �� �ۼ����� �ʰ�
     // pstmt = conn.prepareStatement(sql); �� �ۼ��Ͽ� �����͸� �߰��� ������ �˸��ϴ�.
     // ���� sql ���� ������ + �����ڷ� �� �ٷ� �ۼ��� �� ������ �������� �ʹ� �������� �ǹǷ�
     // �� ����� ���մϴ�.
     String sql = "INSERT INTO signup VALUES (default,?,?,?)";
     // prepareStatement Ŭ���� Ÿ�Կ� �޼ҵ�
     pstmt = conn.prepareStatement(sql);
      
      
     // 4. ������ binding
//     pstmt.setString(1, );
     pstmt.setString(1, id);
     pstmt.setString(2, pwd);
     pstmt.setString(3, gender);
      
      
     // 5. ���� ���� �� ��� ó��
     // SELECT�� �޸� INSERT�� ��ȯ�Ǵ� �����͵��� �����Ƿ�
     // ResultSet ��ü�� �ʿ� ����, �ٷ� pstmt.executeUpdate()�޼��带 ȣ���ϸ� �˴ϴ�.
     // INSERT, UPDATE, DELETE ������ �̿� ���� �޼��带 ȣ���ϸ�
     // SELECT������ stmt.executeQuery(sql); �޼��带 ����߾����ϴ�.
     // @return  int - �� ���� row�� ������ ���ƴ����� ��ȯ
     //* executeUpdate�� �����ؼ� ������Ʈ
     int count = pstmt.executeUpdate();
     if( count == 0 ){
       System.out.println("������ �Է� ����");
     }
     else{
       System.out.println("������ �Է� ����");
     }
   }
   catch( ClassNotFoundException e){
     System.out.println("����̹� �ε� ����");
   }
   catch( SQLException e){
     System.out.println("���� " + e);
   }
   finally{
     try{
       if( conn != null && !conn.isClosed()){
         conn.close();
       }
       if( pstmt != null && !pstmt.isClosed()){
         pstmt.close();
       }
     }
     catch( SQLException e){
       e.printStackTrace();
     }
   }
 }
}