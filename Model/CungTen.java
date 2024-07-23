package project.Model;

public class CungTen extends VuKhi {
    private int tamBan;

    public CungTen(String tenVK, int soluong, int satThuong, String loaiVuKhi, String mauMa, int tamBan) {
        super(tenVK, soluong, satThuong, loaiVuKhi, mauMa);
        this.tamBan = tamBan;
    }

    public int getTamBan() {
        return tamBan;
    }

    public void setTamBan(int tamBan) {
        this.tamBan = tamBan;
    }

    @Override
    public void sucManh() {
        // Cài đặt tính sức mạnh của CungTen
        System.out.println("Sức mạnh của CungTen " + tenVK + " là: " + (satThuong * soluong + tamBan));
    }

    @Override
    public void hanhDong() {
        // Cài đặt hành động của CungTen
        System.out.println("CungTen " + tenVK + " đang thực hiện hành động với tầm bắn: " + tamBan);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tầm bắn = " + tamBan;
    }
}
