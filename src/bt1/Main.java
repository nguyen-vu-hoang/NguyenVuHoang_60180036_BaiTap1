package bt1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LopHoc lopHoc = new LopHoc(new GiaoVien("Nguyễn Thị Lan", 30, "Cam Lâm", "0987654321", "OOP", "Công nghệ thông tin"));

        // them danh sach hoc hinh vao lop
        lopHoc.themHocSinh(new HocSinh("Nguyễn Vũ Khương", 20, "Nha Trang", "0985764321", "59CNTT1", "Đá banh"));
        lopHoc.themHocSinh(new HocSinh("Nguyễn Thị Hồng", 20, "Nha Trang", "0985764321", "59CNTT1", "Bóng chuyền"));
        lopHoc.themHocSinh(new HocSinh("Nguyễn Vũ Hưng", 20, "Nha Trang", "0985764321", "59CNTT1", "Đánh cờ"));



        // them giao vien giang day vao lop hoc
        lopHoc.themGVGD(new GiaoVien("Nguyễn Thị Bình", 31, "Nha Trang", "0983647621", "Nhập môn Lập Trình", "Công nghệ thông tin"));
        lopHoc.themGVGD(new GiaoVien("Nguyễn Thị Hương", 32, "Nha Trang", "0983657621", "Toán rời rạc", "Toán"));
        lopHoc.themGVGD(new GiaoVien("Nguyễn Văn Hải", 33, "Nha Trang", "0983647132", "Xử lý ảnh", "Công nghệ thông tin"));


        // in danh sach hos sinh trong lop
        lopHoc.inDSHS();

        // in danh sach giao vien giang day
        lopHoc.inDSGVGD();

//        // xoa sinh vien co ten x khoi lop hoc
//        lopHoc.xoaHS("Nguyễn Vũ Hưng");
//
//        // xoa giao vien co ten x khoi lop hoc
//        lopHoc.xoaGVGD("Nguyễn Thị Bình");

	}

}
