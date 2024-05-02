/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sshj1
 */
public abstract class DBManager {
    public static DBManager instance = null;
    Connection conn;
    
    public static DBManager getInstance()   {
        return instance;
    }
        
    public DBManager()  {
        System.out.println("DBManager 생성자 호출");
        loadDriver();
        openConnection();
    }
    
    public abstract void loadDriver();
    public abstract void openConnection();
    
    public ArrayList<String[]> executeQuery(String sql)   {
        System.out.println(sql);
        ArrayList<String[]> list 
                = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            // sql = "SELECT * FROM student"
            rs = stmt.executeQuery(sql);
            int count = rs.getMetaData().getColumnCount();
            
            while(rs.next())    {
                String[] values = new String[count];
                for (int i = 0; i < count; i++) {
                    values[i] = rs.getString(i+1);
                }
                list.add(values);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); }catch (Exception e) {}
        }
        return list;
    }
    
    public void executeQuery(String sql, JComboBox cmb, int viewIndex, int keyIndex)   {
        System.out.println(sql);
        Statement stmt = null;
        ResultSet rs = null;
        cmb.removeAllItems();
        
        try {
            stmt = conn.createStatement();
            // sql = "SELECT * FROM student"
            rs = stmt.executeQuery(sql);
            int count = rs.getMetaData().getColumnCount();
            
            while(rs.next())    {
                String[] values = new String[count];
                for (int i = 0; i < count; i++) {
                    values[i] = rs.getString(i+1);
                }
                KeyValues kv = new KeyValues(values, viewIndex, keyIndex);
                cmb.addItem(kv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); }catch (Exception e) {}
        }
    }
    
    public void executeQuery(String sql, JTable table)   {
        System.out.println(sql);
        Statement stmt = null;
        ResultSet rs = null;
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        try {
            stmt = conn.createStatement();
            // sql = "SELECT * FROM student"
            rs = stmt.executeQuery(sql);
            int count = rs.getMetaData().getColumnCount();
            
            while(rs.next())    {
                String[] values = new String[count];
                for (int i = 0; i < count; i++) {
                    values[i] = rs.getString(i+1);
                }
                model.addRow(values);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); }catch (Exception e) {}
        }
    }
    
    public boolean execute(String sql)   {
        System.out.println(sql);
        boolean ret = false;
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ret = stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                try { stmt.close();}
                catch (Exception e) {}
        }
        return ret;
    }
    
    public int executeUpdate(String sql)   {
        System.out.println(sql);
        int ret = 0;
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ret = stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { stmt.close(); }   catch (Exception e) {}
        }
        return ret;
    }
    
    public void closeConnection()   {
        try {
            conn.close();
            System.out.println("커넥션 닫힘");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
