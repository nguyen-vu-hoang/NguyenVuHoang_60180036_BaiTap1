package bt1;
import bt1.CaNhan;

public class GiaoVien extends CaNhan {
    String monDay;
    String toBoMon;
  

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
      super(hoTen, tuoi, diaChi, sdt);
      this.monDay = monDay;
      this.toBoMon = toBoMon;
    }
  
    // getter, setter
    public void setMonDay(String monDay) { this.monDay = monDay; }
    public void setToBoMon(String toBoMon) { this.toBoMon = toBoMon; }
    public String getMonDay() { return this.monDay; }
    public String getToBoMon() { return this.toBoMon; }

    @Override
    public String hienThiTT() {
      String thongTin = "";
      thongTin = "ho ten: " + this.getHoTen() + ", tuoi: " + this.getTuoi() + ", dia chi: " + this.getDiaChi()
        + ", sdt: " + this.getSdt() + ", mon day: " + this.getMonDay() + ", to bo mon: " + this.getToBoMon();
      return thongTin;
    }
}
