package org.example.demo;

public class Mozimusor {

    private int moziazon;
    private String mozinev;
    private int irszam;
    private String cim;
    private int telefon;
    private int fkod;
    private String filmcim;
    private String szarmazas;
    private String mufaj;
    private int hossz;

    public Mozimusor(int moziazon, String mozinev, int irszam, String cim, int telefon, int fkod, String filmcim, String szarmazas, String mufaj, int hossz) {
        this.moziazon = moziazon;
        this.mozinev = mozinev;
        this.irszam = irszam;
        this.cim = cim;
        this.telefon = telefon;
        this.fkod = fkod;
        this.filmcim = filmcim;
        this.szarmazas = szarmazas;
        this.mufaj = mufaj;
        this.hossz = hossz;
    }

    public int getMoziazon() {
        return moziazon;
    }

    public void setMoziazon(int moziazon) {
        this.moziazon = moziazon;
    }

    public String getMozinev() {
        return mozinev;
    }

    public void setMozinev(String mozinev) {
        this.mozinev = mozinev;
    }

    public int getIrszam() {
        return irszam;
    }

    public void setIrszam(int irszam) {
        this.irszam = irszam;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getFkod() {
        return fkod;
    }

    public void setFkod(int fkod) {
        this.fkod = fkod;
    }

    public String getFilmcim() {
        return filmcim;
    }

    public void setFilmcim(String filmcim) {
        this.filmcim = filmcim;
    }

    public String getSzarmazas() {
        return szarmazas;
    }

    public void setSzarmazas(String szarmazas) {
        this.szarmazas = szarmazas;
    }

    public String getMufaj() {
        return mufaj;
    }

    public void setMufaj(String mufaj) {
        this.mufaj = mufaj;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }
}
