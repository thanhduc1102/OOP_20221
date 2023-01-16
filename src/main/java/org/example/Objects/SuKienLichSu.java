package org.example.Objects;

public class SuKienLichSu {
    private String thoiGian;
    private String noiDungSuKien;
    private String diaDiem;


    public SuKienLichSu(String thoiGian, String noiDungSuKien, String diaDiem) {
        this.thoiGian = thoiGian;
        this.noiDungSuKien = noiDungSuKien;
        this.diaDiem = diaDiem;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getNoiDungSuKien() {
        return noiDungSuKien;
    }

    public void setNoiDungSuKien(String noiDungSuKien) {
        this.noiDungSuKien = noiDungSuKien;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
}
