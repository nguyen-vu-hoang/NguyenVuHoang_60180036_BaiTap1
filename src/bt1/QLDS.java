package bt1;

import java.util.ArrayList;

public class QLDS implements IQLDS {

    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    public ArrayList<CaNhan> getDsCaNhan() {
		return dsCaNhan;
	}

	public void setDsCaNhan(ArrayList<CaNhan> dsCaNhan) {
		this.dsCaNhan = dsCaNhan;
	}

	public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.setDsCaNhan(dsCaNhan);
    }

    // them ca nhan
    @Override
    public int them(CaNhan caNhan) {
      dsCaNhan.add(caNhan);
      return 1;
    }

    // xoa ca nhan
    @Override
    public int xoa(String ten) {
      if (dsCaNhan.removeIf(caNhan -> caNhan.hoTen.equals(ten))) {
        return 1;
      }
      return 0;
    }

    // in ds ca nhan
    @Override
    public void inDS() {
      for (CaNhan caNhan : dsCaNhan) {
    	  System.out.println(caNhan.hienThiTT());
	}
    }
}
