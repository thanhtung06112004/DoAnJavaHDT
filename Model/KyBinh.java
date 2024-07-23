package project.Model;

import java.util.List;

// Giả sử NhanVat là một lớp trừu tượng
public class KyBinh extends NhanVat {
    private String kyThuat;
    private boolean coGioiTinh;

    public KyBinh(double nangLuong, String ten, List<VuKhi> dsVK, byte gioiTinh, String id, String kyThuat, boolean coGioiTinh) {
        super(nangLuong, ten, dsVK, gioiTinh, id);
        this.kyThuat = kyThuat;
        this.coGioiTinh = coGioiTinh;
    }

    // Phương thức tính sức mạnh nhân vật
    @Override
    public void sucManh() {
        int sucManh = (int) getNangLuong() + getDsVK().size() * 10;
        System.out.println(getTen() + " có sức mạnh là: " + sucManh);
    }

    // Getter và Setter cho các thuộc tính
    public String getKyThuat() {
        return kyThuat;
    }

    public void setKyThuat(String kyThuat) {
        this.kyThuat = kyThuat;
    }

    public boolean isCoGioiTinh() {
        return coGioiTinh;
    }

    public void setCoGioiTinh(boolean coGioiTinh) {
        this.coGioiTinh = coGioiTinh;
    }

    @Override
    public String toString() {
        return "KyBinh{" +
                "ten='" + getTen() + '\'' +
                ", nangLuong=" + getNangLuong() +
                ", kyThuat='" + kyThuat + '\'' +
                ", coGioiTinh=" + coGioiTinh +
                ", dsVK=" + getDsVK() +
                '}';
    }
}
