package org.example.Objects;

public class DiTichLichSu {
    private String tenDiTich;
    private String diaDiem;
    private String namCongNhan;
    private String suKienLienQuan;

    public DiTichLichSu(String tenDiTich, String diaDiem, String namCongNhan, String suKienLienQuan) {
        this.tenDiTich = tenDiTich;
        this.diaDiem = diaDiem;
        this.namCongNhan = namCongNhan;
        this.suKienLienQuan = suKienLienQuan;
    }

    public String getTenDiTich() {
        return tenDiTich;
    }

    public void setTenDiTich(String tenDiTich) {
        this.tenDiTich = tenDiTich;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getNamCongNhan() {
        return namCongNhan;
    }

    public void setNamCongNhan(String namCongNhan) {
        this.namCongNhan = namCongNhan;
    }

    public String getSuKienLienQuan() {
        return suKienLienQuan;
    }

    public void setSuKienLienQuan(String suKienLienQuan) {
        this.suKienLienQuan = suKienLienQuan;
    }
}
