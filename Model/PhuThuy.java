package project.Model;

import java.util.List;

public class PhuThuy extends NhanVat {
    private String phepThuat;  // Loại phép thuật mà PhuThuy sử dụng
    private boolean choi;      // Có chơi đùa không
    private boolean gay;       // Có gây rối không

    // Constructor
    public PhuThuy(double nangluong, String ten, List<VuKhi> dsVK, byte gioiTinh, String id,
                   String phepThuat, boolean choi, boolean gay) {
        super(nangluong, ten, dsVK, gioiTinh, id);
        this.phepThuat = phepThuat;
        this.choi = choi;
        this.gay = gay;
    }

    @Override
    public void sucManh() {
        // Tính sức mạnh dựa trên năng lượng, số lượng vũ khí và phép thuật
        int sucManh = (int) (nangluong + dsVK.size() * 10);
        System.out.println(ten + " có sức mạnh là: " + sucManh);
    }

    public void phongCach() {
        // Hiển thị phong cách của PhuThuy dựa trên các thuộc tính
        System.out.println(ten + " có phong cách phép thuật là: " + phepThuat);

        if (choi) {
            System.out.println(ten + " thích chơi đùa.");
        }
        if (gay) {
            System.out.println(ten + " hay gây rối.");
        }
    }

    // Getter và Setter cho các thuộc tính mới nếu cần
    public String getPhepThuat() {
        return phepThuat;
    }

    public void setPhepThuat(String phepThuat) {
        this.phepThuat = phepThuat;
    }

    public boolean isChoi() {
        return choi;
    }

    public void setChoi(boolean choi) {
        this.choi = choi;
    }

    public boolean isGay() {
        return gay;
    }

    public void setGay(boolean gay) {
        this.gay = gay;
    }
}
