package com.webdev.fr.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@CrossOrigin
@RequestMapping(value = "/depot")
public class Depot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private int solde;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date date;
    @JoinColumn(name="compte_id",referencedColumnName = "id")
   // @JoinColumn(name = "user_id",referencedColumnName = "id")
    @ManyToOne(optional = false)
    @JsonIgnoreProperties("depot")
    private Compte compte;
   // private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

  /*  public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
}
