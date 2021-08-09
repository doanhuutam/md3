package model;

public class SanPham {
    private int id;
    private String tensp;
    private int gia;
    private int soluong;
    private String mausac;
    private String mota;
    private int iddanhmuc;

    public SanPham() {
    }

    public SanPham(int id, String tensp, int gia, int soluong, String mausac, String mota, int iddanhmuc) {
        this.id = id;
        this.tensp = tensp;
        this.gia = gia;
        this.soluong = soluong;
        this.mausac = mausac;
        this.mota = mota;
        this.iddanhmuc = iddanhmuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getIddanhmuc() {
        return iddanhmuc;
    }

    public void setIddanhmuc(int iddanhmuc) {
        this.iddanhmuc = iddanhmuc;
    }
}
