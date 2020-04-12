package bt1;

public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
      this.hoTen = hoTen;
      this.tuoi = tuoi;
      this.diaChi = diaChi;
      this.sdt = sdt;
    }


    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public void setSdt(String sdt) { this.sdt = sdt; }
    public String getHoTen() { return this.hoTen; }
    public int getTuoi() { return this.tuoi; }
    public String getDiaChi() { return this.diaChi; }
    public String getSdt() { return this.sdt; }


    public abstract String hienThiTT() ;
    	

}
