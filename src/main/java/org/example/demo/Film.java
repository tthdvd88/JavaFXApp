package org.example.demo;

public class Film {

    private int fkod;
    private String filmcim;
    private String szarmazas;
    private String mufaj;
    private int hossz;

    public Film(int fkod, String filmcim, String szarmazas, String mufaj, int hossz) {
        this.fkod = fkod;
        this.filmcim = filmcim;
        this.szarmazas = szarmazas;
        this.mufaj = mufaj;
        this.hossz = hossz;
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
