package org.example.demo;

public class Mozi {

    private String moziazon;
    private String mozinev;
    private String irszam;
    private String cim;
    private String telefon;

    public Mozi(String moziazon, String mozinev, String irszam, String cim, String telefon) {
        this.moziazon = moziazon;
        this.mozinev = mozinev;
        this.irszam = irszam;
        this.cim = cim;
        this.telefon = telefon;
    }

    public String getMoziazon() {
        return moziazon;
    }

    public void setMoziazon(String moziazon) {
        this.moziazon = moziazon;
    }

    public String getMozinev() {
        return mozinev;
    }

    public void setMozinev(String mozinev) {
        this.mozinev = mozinev;
    }

    public String getIrszam() {
        return irszam;
    }

    public void setIrszam(String irszam) {
        this.irszam = irszam;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
