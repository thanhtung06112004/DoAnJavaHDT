package project.Model;

public class Choi extends VuKhi {
    private double tamDanh;

    public Choi(String tenVK, int soluong, int satThuong, String loaiVuKhi, String mauMa, double tamDanh) {
        super(tenVK, soluong, satThuong, loaiVuKhi, mauMa);
        this.tamDanh = tamDanh;
    }

    public double getTamDanh() {
        return tamDanh;
    }

    public void setTamDanh(double tamDanh) {
        this.tamDanh = tamDanh;
    }

    @Override
    public void sucManh() {
        // Cài đặt tính sức mạnh của Choi
        double sucManh = satThuong * soluong + tamDanh;
        System.out.println("Sức mạnh của Choi " + tenVK + " là: " + sucManh);
    }

    @Override
    public void hanhDong() {
        // Cài đặt hành động của Choi
        System.out.println("Choi " + tenVK + " đang thực hiện hành động với tầm đánh: " + tamDanh);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tầm đánh = " + tamDanh;
    }
}
