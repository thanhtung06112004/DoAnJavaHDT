package project;

import project.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVat {
    private static List<VuKhi> dsVK = new ArrayList<>();
    private static NhanVat nhanVat;

    public static void main(String[] args) {
        // Thêm một số vũ khí mẫu vào danh sách
        dsVK.add(new CungTen("Cung dài", 5, 20, "Cung", "Cổ điển", 30));

        // Khởi tạo nhân vật mẫu
        nhanVat = new KyBinh(100.0, "Anh Hùng", dsVK, (byte)1, "ID001", "Lửa", true);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("||---------- MENU CHÍNH --------||");
            System.out.println("||     1. Quản lý nhân vật      ||");
            System.out.println("||     2. Quản lý vũ khí        ||");
            System.out.println("||     3. Thoát                 ||");
            System.out.println("||------------------------------||");
            System.out.print("Nhập Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    menuQuanLyNhanVat(scanner);
                    break;
                case 2:
                    menuQuanLyVuKhi(scanner);
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 3);
    }

    private static void menuQuanLyNhanVat(Scanner scanner) {
        int choice;
        do {
            System.out.println("||----- MENU QUẢN LÝ NHÂN VẬT --------||");
            System.out.println("||   1. Xem thông tin nhân vật        ||");
            System.out.println("||   2. Cập nhật thông tin nhân vật   ||");
            System.out.println("||   3. Thêm thông tin nhân vật       ||");
            System.out.println("||   4. Tính sức mạnh nhân vật        ||");
            System.out.println("||   5. Quay lại menu chính           ||");
            System.out.println("||------------------------------------||");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    xemThongTinNhanVat();
                    break;
                case 2:
                    capNhatThongTinNhanVat(scanner);
                    break;
                case 3:
                    themThongTinNhanVat(scanner);
                    break;
                case 4:
                    if (nhanVat != null) {
                        nhanVat.sucManh();
                    } else {
                        System.out.println("Chưa có thông tin nhân vật nào.");
                    }
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 5);
    }

    private static void menuQuanLyVuKhi(Scanner scanner) {
        int choice;
        do {
            System.out.println("||----- MENU QUẢN LÝ VŨ KHÍ ----------||");
            System.out.println("||     1. Thêm vũ khí mới             ||");
            System.out.println("||     2. Xóa vũ khí                  ||");
            System.out.println("||     3. Hiển thị danh sách vũ khí   ||");
            System.out.println("||     4. Quay lại menu chính         ||");
            System.out.println("||------------------------------------||");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    themVuKhi(scanner);
                    break;
                case 2:
                    xoaVuKhi(scanner);
                    break;
                case 3:
                    hienThiDanhSachVuKhi();
                    break;
                case 4:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 4);
    }

    private static void themVuKhi(Scanner scanner) {
        System.out.print("Nhập tên vũ khí: ");
        String tenVK = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        int soluong = scanner.nextInt();
        System.out.print("Nhập sát thương: ");
        int satThuong = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Nhập loại vũ khí: ");
        String loaiVuKhi = scanner.nextLine();
        System.out.print("Nhập mẫu mã: ");
        String mauMa = scanner.nextLine();
        System.out.print("Nhập tầm bắn (cho CungTen) hoặc tầm đánh (cho Choi): ");
        int tam = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Giả sử thêm vũ khí là CungTen, nếu cần thêm loại khác thì xử lý thêm
        dsVK.add(new CungTen(tenVK, soluong, satThuong, loaiVuKhi, mauMa, tam));
        System.out.println("Đã thêm vũ khí mới: " + tenVK);

        // Hiển thị lại danh sách vũ khí sau khi thêm
        hienThiDanhSachVuKhi();
    }

    private static void xoaVuKhi(Scanner scanner) {
        System.out.print("Nhập tên vũ khí cần xóa: ");
        String tenVK = scanner.nextLine();
        
        boolean xoaThanhCong = dsVK.removeIf(vuKhi -> vuKhi.getTenVK().equals(tenVK));
        
        if (xoaThanhCong) {
            System.out.println("Đã xóa vũ khí: " + tenVK);
        } else {
            System.out.println("Không tìm thấy vũ khí có tên: " + tenVK);
        }

        // Hiển thị lại danh sách vũ khí sau khi xóa
        hienThiDanhSachVuKhi();
    }

    private static void xemThongTinNhanVat() {
        if (nhanVat == null) {
            System.out.println("Chưa có thông tin nhân vật nào.");
            return;
        }
        
        System.out.println("Tên: " + nhanVat.getTen());
        System.out.println("Năng lượng: " + nhanVat.getNangLuong());
        System.out.println("Giới tính: " + (nhanVat.getGioiTinh() == 1 ? "Nam" : "Nữ"));
        System.out.println("ID: " + nhanVat.getId());
        System.out.println("Danh sách vũ khí:");
        for (VuKhi vk : nhanVat.getDsVK()) {
            System.out.println(" - " + vk.toString());
        }
    }

    private static void capNhatThongTinNhanVat(Scanner scanner) {
        if (nhanVat == null) {
            System.out.println("Chưa có thông tin nhân vật nào. Vui lòng thêm thông tin nhân vật trước.");
            return;
        }
        
        System.out.println("----- CẬP NHẬT THÔNG TIN NHÂN VẬT -----");
        System.out.print("Nhập tên nhân vật mới: ");
        String tenMoi = scanner.nextLine();
        System.out.print("Nhập năng lượng mới: ");
        double nangLuongMoi = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Nhập giới tính (1: Nam, 2: Nữ): ");
        byte gioiTinhMoi = scanner.nextByte();
        scanner.nextLine();  // Consume newline
        System.out.print("Nhập ID mới: ");
        String idMoi = scanner.nextLine();

        nhanVat.setTen(tenMoi);
        nhanVat.setNangLuong(nangLuongMoi);
        nhanVat.setGioiTinh(gioiTinhMoi);
        nhanVat.setId(idMoi);

        System.out.println("Thông tin nhân vật đã được cập nhật.");
    }

    private static void themThongTinNhanVat(Scanner scanner) {
        System.out.println("----- THÊM THÔNG TIN NHÂN VẬT -----");
        System.out.print("Nhập tên nhân vật mới: ");
        String tenMoi = scanner.nextLine();
        System.out.print("Nhập năng lượng mới: ");
        double nangLuongMoi = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Nhập giới tính (1: Nam, 2: Nữ): ");
        byte gioiTinhMoi = scanner.nextByte();
        scanner.nextLine();  // Consume newline
        System.out.print("Nhập ID mới: ");
        String idMoi = scanner.nextLine();
        System.out.print("Nhập kỹ thuật sử dụng: ");
        String kyThuat = scanner.nextLine();
        System.out.print("Nhập có giới tính (true/false): ");
        boolean coGioiTinh = scanner.nextBoolean();
        scanner.nextLine();  // Consume newline

        nhanVat = new KyBinh(nangLuongMoi, tenMoi, dsVK, gioiTinhMoi, idMoi, kyThuat, coGioiTinh);

        System.out.println("Thông tin nhân vật đã được thêm.");
    }

    private static void hienThiDanhSachVuKhi() {
        System.out.println("Danh sách vũ khí:");
        for (VuKhi vk : dsVK) {
            System.out.println(" - " + vk.toString());
        }
    }
}
