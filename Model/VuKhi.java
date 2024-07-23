package project.Model;

public abstract class VuKhi {
    protected String tenVK;
    protected int soluong;
    protected int satThuong;
    protected String loaiVuKhi;
    protected String mauMa;

    public VuKhi(String tenVK, int soluong, int satThuong, String loaiVuKhi, String mauMa) {
        this.tenVK = tenVK;
        this.soluong = soluong;
        this.satThuong = satThuong;
        this.loaiVuKhi = loaiVuKhi;
        this.mauMa = mauMa;
    }

    public String getTenVK() {
        return tenVK;
    }

    public void setTenVK(String tenVK) {
        this.tenVK = tenVK;
    }

    public int getSoLuong() {
        return soluong;
    }

    public void setSoLuong(int soluong) {
        this.soluong = soluong;
    }

    public int getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(int satThuong) {
        this.satThuong = satThuong;
    }

    public String getLoaiVuKhi() {
        return loaiVuKhi;
    }

    public void setLoaiVuKhi(String loaiVuKhi) {
        this.loaiVuKhi = loaiVuKhi;
    }

    public String getMauMa() {
        return mauMa;
    }

    public void setMauMa(String mauMa) {
        this.mauMa = mauMa;
    }

    public abstract void sucManh();
    public abstract void hanhDong();

    @Override
    public String toString() {
        return tenVK + ": Số lượng = " + soluong + ", Sát thương = " + satThuong +
               ", Loại vũ khí = " + loaiVuKhi + ", Mẫu mã = " + mauMa;
    }
}
