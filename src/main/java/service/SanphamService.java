package service;

import dao.CrudSanPham;
import model.SanPham;

import java.sql.SQLException;
import java.util.ArrayList;

public class SanphamService {
    CrudSanPham crudSanPham=new CrudSanPham();
    public ArrayList<SanPham> list=new ArrayList<>();
    public void showSp(){
        try {
            list= crudSanPham.showSp();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void saveSp(SanPham sanPham){
        try {
            crudSanPham.add(sanPham);
            list= crudSanPham.showSp();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void editSp(SanPham sanPham){
        try {

        crudSanPham.editSp(sanPham);
        list= crudSanPham.showSp();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void deleteSp(int index){
        try {

        crudSanPham.deleteSp(list.get(index).getId());
        list=crudSanPham.showSp();
    } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
