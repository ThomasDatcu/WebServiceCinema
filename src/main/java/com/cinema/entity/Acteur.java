package com.cinema.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by thomasd on 10/10/16.
 */
public class Acteur implements Serializable {

    @Id
    @GeneratedValue
    private int noAct;

    @Column(nullable = false)
    private String nomAct;

    @Column(nullable = false)
    private String prenAct;

    @Column(nullable = false)
    private String dateNaiss;

    @Column(nullable = true)
    private String dateDeces;

    public Acteur(String prenAct, String nomAct, String dateNaiss, String dateDeces){
        this.prenAct = prenAct;
        this.nomAct = nomAct;
        this.dateNaiss = dateNaiss;
        this.dateDeces = dateDeces;
    }

    public Acteur(String prenAct, String nomAct, String dateNaiss){
        this.prenAct = prenAct;
        this.nomAct = nomAct;
        this.dateNaiss = dateNaiss;
     }

    public String getNomAct() {
        return nomAct;
    }

    public void setNomAct(String nomAct) {
        this.nomAct = nomAct;
    }

    public String getPrenAct() {
        return prenAct;
    }

    public void setPrenAct(String prenAct) {
        this.prenAct = prenAct;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(String dateDeces) {
        this.dateDeces = dateDeces;
    }
}
