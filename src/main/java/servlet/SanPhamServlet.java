package servlet;

import model.SanPham;
import service.SanphamService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {""})
public class SanPhamServlet extends HttpServlet {
    SanphamService sanphamService=new SanphamService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        String action=req.getParameter("action");
        if (action==null){
            action="";

        }
        switch (action){
            case "create":
                resp.sendRedirect("/");
                break;
            case "delete":
                int index = Integer.parseInt(req.getParameter("index"));
                sanphamService.deleteSp(index);
                resp.sendRedirect("/");
                break;
            case "edit":
                int indexedit= Integer.parseInt(req.getParameter("index"));
                req.setAttribute("ahi",sanphamService.list.get(indexedit));
                requestDispatcher=req.getRequestDispatcher("view/edit.jsp");
                requestDispatcher.forward(req,resp);
                break;
            default:
                sanphamService.showSp();
                req.setAttribute("ahihi",sanphamService.list);
                requestDispatcher=req.getRequestDispatcher("index.jsp");
                requestDispatcher.forward(req,resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "create":
                int id = Integer.parseInt(req.getParameter("id"));
                String tensp = req.getParameter("tensp");
                int gia = Integer.parseInt(req.getParameter("gia"));
                int soluong = Integer.parseInt(req.getParameter("soluong"));
                String mausac = req.getParameter("mausac");
                String mota = req.getParameter("mota");
                int iddanhmuc = Integer.parseInt(req.getParameter("iddanhmuc"));
                SanPham sanPham = new SanPham(id, tensp, gia, soluong, mausac, mota, iddanhmuc);
                sanphamService.saveSp(sanPham);
                resp.sendRedirect("/");
                break;

            case "edit":
                int idedit = Integer.parseInt(req.getParameter("id"));
                String tenspedit = req.getParameter("tensp");
                int giaedit = Integer.parseInt(req.getParameter("gia"));
                int soluongedit = Integer.parseInt(req.getParameter("soluong"));
                String mausacedit = req.getParameter("mausac");
                String motaedit = req.getParameter("mota");
                int iddanhmucedit = Integer.parseInt(req.getParameter("iddanhmuc"));
                SanPham sanPhamedit = new SanPham(idedit, tenspedit, giaedit, soluongedit, mausacedit, motaedit, iddanhmucedit);
                sanphamService.editSp(sanPhamedit);
                resp.sendRedirect("/");
                break;

        }
    }
}
