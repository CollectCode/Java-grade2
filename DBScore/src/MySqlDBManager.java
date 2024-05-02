/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author sshj1
 */
public class MySqlDBManager extends DBManager {
    public static DBManager getInstance()   {
        // DBManager.getInstance();
        if (instance == null)   {
            instance = new MySqlDBManager();
        }
        return instance; 
    }
    
    public MySqlDBManager() {
        super();
        System.out.println("MySqlDBmanager 생성자 호출");
    }
    
    @Override
    public void loadDriver()   {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void openConnection()   {
        try {
            System.out.println("커넥션 열림시도중...");
            String url = "jdbc:mysql://localhost:3306/projectA";
            String dbuser = "sshj1215";
            String dbpasswd = "dkdlDol100%^";
            conn = DriverManager.getConnection
                                (url, dbuser, dbpasswd);
            System.out.println("커넥션 열림");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
