package org.example.Objects;

public class NhanVatLichSu {
    public String tenThat;
    public String tenGoi;
    public String namSinh;
    public String namMat;
    public String chucVu;
    public String thoiGianGiuChuc;
    public String danhHieu;

    public NhanVatLichSu(String tenThat, String tenGoi, String namSinh, String namMat, String chucVu, String thoiGianGiuChuc, String danhHieu) {
        this.tenThat = tenThat;
        this.tenGoi = tenGoi;
        this.namSinh = namSinh;
        this.namMat = namMat;
        this.chucVu = chucVu;
        this.thoiGianGiuChuc = thoiGianGiuChuc;
        this.danhHieu = danhHieu;
    }

    public String getTenThat() {
        return tenThat;
    }

    public void setTenThat(String tenThat) {
        this.tenThat = tenThat;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getNamMat() {
        return namMat;
    }

    public void setNamMat(String namMat) {
        this.namMat = namMat;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getThoiGianGiuChuc() {
        return thoiGianGiuChuc;
    }

    public void setThoiGianGiuChuc(String thoiGianGiuChuc) {
        this.thoiGianGiuChuc = thoiGianGiuChuc;
    }

    public String getDanhHieu() {
        return danhHieu;
    }

    public void setDanhHieu(String danhHieu) {
        this.danhHieu = danhHieu;
    }
}
