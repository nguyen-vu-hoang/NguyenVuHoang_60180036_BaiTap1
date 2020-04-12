package bt1;

public class HocSinh extends CaNhan {
    String lop;
    String nangKhieu;


    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
      super(hoTen, tuoi, diaChi, sdt);
      this.lop = lop;
      this.nangKhieu = nangKhieu;
    }

    // getter, setter
    public void setLop(String lop) { this.lop = lop; }
    public void setNangKhieu(String nangKhieu) { this.nangKhieu = nangKhieu; }
    public String getLop() { return this.lop; }
    public String getNangKhieu() { return this.nangKhieu; }

    @Override
    public String hienThiTT() {
    	String thongTin = "";
        thongTin = "ho ten: " + this.getHoTen() + ", tuoi: " + this.getTuoi() + ", dia chi: " + this.getDiaChi()
          + ", sdt: " + this.getSdt() + ", lop: " + this.getLop() + ", nang khieu: " + this.getNangKhieu();
        return thongTin;
    }
}
