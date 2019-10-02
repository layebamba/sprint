package com.webdev.fr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@CrossOrigin
//@EqualsAndHashCode(exclude = "users")


public class Partenaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(length = 50)
    private String nomagence;
    @Column(length = 30)
    private String ninea;
    @Column(length = 30)
    private String registre;
    @Column(length = 30)
    private String lieu;
    @Column(length = 20)
    private String phone;
    @Column(length = 25)
    private String status;
    @OneToMany(mappedBy ="partenaire")
    @JsonIgnoreProperties("partenaire")
   // private List<User>users;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomagence() {
        return nomagence;
    }

    public void setNomagence(String nomagence) {
        this.nomagence = nomagence;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

  //  public List<User> getUsers() {
   //     return users;
  //  }

   // public void setUsers(List<User> users) {
  //      this.users = users;
   // }
}
