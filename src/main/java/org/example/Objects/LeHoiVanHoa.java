package org.example.Objects;

public class LeHoiVanHoa {
    private String thoiGianToChuc;
    private String tenLeHoi;
    private String diaDiem;
    private String lanDauToChuc;
    private String ghiChu;

    public LeHoiVanHoa() {
    }

    public LeHoiVanHoa(String thoiGianToChuc, String tenLeHoi, String diaDiem, String lanDauToChuc, String ghiChu) {
        this.thoiGianToChuc = thoiGianToChuc;
        this.tenLeHoi = tenLeHoi;
        this.diaDiem = diaDiem;
        this.lanDauToChuc = lanDauToChuc;
        this.ghiChu = ghiChu;
    }

    public String getThoiGianToChuc() {
        return thoiGianToChuc;
    }

    public void setThoiGianToChuc(String thoiGianToChuc) {
        this.thoiGianToChuc = thoiGianToChuc;
    }

    public String getTenLeHoi() {
        return tenLeHoi;
    }

    public void setTenLeHoi(String tenLeHoi) {
        this.tenLeHoi = tenLeHoi;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getLanDauToChuc() {
        return lanDauToChuc;
    }

    public void setLanDauToChuc(String lanDauToChuc) {
        this.lanDauToChuc = lanDauToChuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
