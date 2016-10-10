package com.cinema.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by thomasd on 10/10/16
 */
public class Film implements Serializable {

    @Id
    @GeneratedValue
    private int noFilm;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private int duree;

    @Column(nullable = false)
    private String dateSortie;

    @Column(nullable = false)
    private int budget;

    @Column(nullable = false)
    private int montantRecette;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getMontantRecette() {
        return montantRecette;
    }

    public void setMontantRecette(int montantRecette) {
        this.montantRecette = montantRecette;
    }
}
