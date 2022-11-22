package com.bagus.gui;

public class Karyawan {
    private String Nama;
    private String NIK;

    public Karyawan() {
    }

    public Karyawan(String nama, String NIK) {
        Nama = nama;
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIK(){
        return NIK;
    }

    public void setNIK(String NIK){
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return "Karyawan{" +
                "nama='" + Nama + '\'' +
                ", nik='" + NIK + '\'' +
                '}';
    }
}
