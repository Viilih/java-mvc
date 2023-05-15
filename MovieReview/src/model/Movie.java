package model;

import java.util.ArrayList;

public class Movie {
    private String nomeFilme;
    private int anoFilme;
    private ArrayList<String> elenco;
    private float avaliacao;
    private String desc;
    
    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public int getAnoFilme() {
        return anoFilme;
    }
    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }
    public ArrayList getElenco() {
        return elenco;
    }
    public void setElenco(ArrayList elenco) {
        this.elenco = elenco;
    }
    public Movie(String nomeFilme, int anoFilme, ArrayList elenco) {
        this.nomeFilme = nomeFilme;
        this.anoFilme = anoFilme;
        this.elenco = elenco;
    }


}