package dao;

import model.SanPham;

import java.sql.*;
import java.util.ArrayList;

public class CrudSanPham {
    ConnectionCsdl connectionCsdl;
    Connection connection = connectionCsdl.getConnection();

    public ArrayList<SanPham> showSp() throws SQLException {
        String sqlselect = "select *from sanpham";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlselect);
        ArrayList<SanPham> list = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String tensp = resultSet.getString("tensp");
            int gia = resultSet.getInt("gia");
            int soluong = resultSet.getInt("soluong");
            String mausac = resultSet.getString("mausac");
            String mota = resultSet.getString("mota");
            int iddanhmuc = resultSet.getInt("iddanhmuc");
            list.add(new SanPham(id, tensp, gia, soluong, mausac, mota, iddanhmuc));
        }
        return list;
    }

    public void add(SanPham sanPham) throws SQLException {
        String sqlsave = "insert into sanpham value(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlsave);
        preparedStatement.setInt(1, sanPham.getId());
        preparedStatement.setString(2, sanPham.getTensp());
        preparedStatement.setInt(3, sanPham.getGia());
        preparedStatement.setInt(4, sanPham.getSoluong());
        preparedStatement.setString(5, sanPham.getMausac());
        preparedStatement.setString(6, sanPham.getMota());
        preparedStatement.setInt(7, sanPham.getIddanhmuc());
        preparedStatement.execute();

    }

    public void editSp(SanPham sanPham) throws SQLException {
        String sqledit = "update sanpham set tensp=? , gia=? , soluong=? , mausac=?,mota=?,iddanhmuc=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqledit);
        preparedStatement.setInt(7, sanPham.getId());
        preparedStatement.setString(1, sanPham.getTensp());
        preparedStatement.setInt(2, sanPham.getGia());
        preparedStatement.setInt(3, sanPham.getSoluong());
        preparedStatement.setString(4, sanPham.getMausac());
        preparedStatement.setString(5, sanPham.getMota());
        preparedStatement.setInt(6, sanPham.getIddanhmuc());
        preparedStatement.execute();

    }
    public void deleteSp(int id) throws SQLException {
        String sqldelete = "delete from sanpham where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqldelete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();

    }


}
