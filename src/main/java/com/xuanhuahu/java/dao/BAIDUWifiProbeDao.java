package com.xuanhuahu.java.dao;

import com.xuanhuahu.java.util.JDBCUtils2;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by win7 on 2017/5/16.
 */
@Component
public class BAIDUWifiProbeDao extends JDBCUtils2 {
    public String insertb(String line,String busno,String company) {
    String lineId = null;
        try {
            con = this.getConnection();
            String sql = "INSERT INTO buslinetest(line,busno,company)VALUES(?,?,?)";
            pre = con.prepareStatement(sql);
            pre.setString(1, line);
            pre.setString(2, busno);
            pre.setString(3, company);
            pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                closeconnection();

        }
        return lineId;
    }
    public int selectb(String line,String busno,String company) {
        String lineId = null;
        int count = 0;
        try {
            con = this.getConnection();
            String sql = " SELECT count(1) AS num FROM `buslinetest` WHERE line=? AND busno=? AND company=?";
            pre = con.prepareStatement(sql);
            pre.setString(1, line);
            pre.setString(2, busno);
            pre.setString(3, company);
            ResultSet rs = pre.executeQuery();

             while (rs.next()){
                 count = rs.getInt("num");
             }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeconnection();

        }
        return count;
    }
    public String insert(String line,String busno,String company) {
        String lineId = null;
        try {
            con = this.getConnection();
            String sql = "INSERT INTO buslinetest_copy(line,busno,company)VALUES(?,?,?)";
            pre = con.prepareStatement(sql);
            pre.setString(1, line);
            pre.setString(2, busno);
            pre.setString(3, company);
            pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeconnection();

        }
        return lineId;
    }
    public int select(String line,String busno,String company) {
        String lineId = null;
        int count = 0;
        try {
            con = this.getConnection();
            String sql = " SELECT count(1) AS num FROM `buslinetest_copy` WHERE line=? AND busno=? AND company=?";
            pre = con.prepareStatement(sql);
            pre.setString(1, line);
            pre.setString(2, busno);
            pre.setString(3, company);
            ResultSet rs = pre.executeQuery();

            while (rs.next()){
                count = rs.getInt("num");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeconnection();

        }
        return count;
    }
}
