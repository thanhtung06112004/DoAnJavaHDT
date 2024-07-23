package project.Model;

import java.util.List;

public abstract class NhanVat {
    protected double nangluong;
    protected String ten;
    protected List<VuKhi> dsVK;
    protected byte gioiTinh;
    protected String id;

    // Constructor
    public NhanVat(double nangluong, String ten, List<VuKhi> dsVK, byte gioiTinh, String id) {
        this.nangluong = nangluong;
        this.ten = ten;
        this.dsVK = dsVK;
        this.gioiTinh = gioiTinh;
        this.id = id;
    }

    // Các phương thức getter và setter
    public double getNangLuong() {
        return nangluong;
    }

    public void setNangLuong(double nangluong) {
        this.nangluong = nangluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<VuKhi> getDsVK() {
        return dsVK;
    }

    public void setDsVK(List<VuKhi> dsVK) {
        this.dsVK = dsVK;
    }

    public byte getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(byte gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void sucManh();
}
