/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

public class LopHoc {
    // giao vien chu nhiem
    GiaoVien giaoVienCN;
    // danh sach hoc sinh trong lop
    ArrayList<CaNhan> dsHocSinh;
    // danh sach giao vien giang day cua lop
    ArrayList<CaNhan> dsGVGD;
    
    // quan ly danh sach giao vien giang day
    QLDS qlDsGVGD;
    // quan ly danh sách học sinh
    IQLDS qlDsHS;

    public LopHoc(GiaoVien gvChuNhiem) {
        this.giaoVienCN = gvChuNhiem;
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new QLDS(dsHocSinh);
        this.qlDsGVGD = new QLDS(dsGVGD);
    }
    
    
    // methods
    // them hoc sinh
    public int themHocSinh(HocSinh hs) {
      if (qlDsHS.them(hs) == 1) {
        return 1;
      }
      return 0;
    }
    // them giao vien giang day
    public int themGVGD(GiaoVien gv) {
      if (qlDsGVGD.them(gv) == 1) {
        return 1;
      }
      return 0;
    }
    // in danh sach hoc sinh
    public int inDSHS() {
        System.out.println("Danh sach hoc sinh:");
        qlDsHS.inDS();
        return 1;
    }
    // in danh sach giao vien giang day
    public int inDSGVGD() {
        System.out.println("Danh sach giao vien giang day:");
        qlDsGVGD.inDS();

        return 1;
    }
    // xoa sinh vien
    public int xoaHS(String ten) {
        if (qlDsHS.xoa(ten) == 1) {
          return 1;
        }
        return 0;
    }
    // xoa giao vien
    public int xoaGVGD(String ten) {
        if (qlDsGVGD.xoa(ten) == 1) {
          return 1;
        }
        return 0;
    }
}
