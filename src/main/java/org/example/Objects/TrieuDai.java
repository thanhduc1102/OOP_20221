package org.example.Objects;

public class TrieuDai {
    private String tenTrieuDai;
    private String thoGianTonTai;
    private String tenNuoc;

    public TrieuDai(String tenTrieuDai, String thoGianTonTai, String tenNuoc) {
        this.tenTrieuDai = tenTrieuDai;
        this.thoGianTonTai = thoGianTonTai;
        this.tenNuoc = tenNuoc;
    }

    public String getTenTrieuDai() {
        return tenTrieuDai;
    }

    public void setTenTrieuDai(String tenTrieuDai) {
        this.tenTrieuDai = tenTrieuDai;
    }

    public String getThoGianTonTai() {
        return thoGianTonTai;
    }

    public void setThoGianTonTai(String thoGianTonTai) {
        this.thoGianTonTai = thoGianTonTai;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }
}
