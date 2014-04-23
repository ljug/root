
import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Magasin")
public  class Magasin implements Serializable {

    @Column(name="id",table="Magasin",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @OneToMany(targetEntity=Produit.class,mappedBy="idMag")
    private List<Produit> produitCollection;

    @Column(name="description",table="Magasin",nullable=false,length=65535)
    @Lob
    @Basic
    private String description;

    @Column(name="nom",table="Magasin",nullable=false,length=45)
    @Basic
    private String nom;

    public Magasin(){

    }


   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public List<Produit> getProduitCollection() {
        return this.produitCollection;
    }


  public void setProduitCollection (List<Produit> produitCollection) {
        this.produitCollection = produitCollection;
    }



   public String getDescription() {
        return this.description;
    }


  public void setDescription (String description) {
        this.description = description;
    }



   public String getNom() {
        return this.nom;
    }


  public void setNom (String nom) {
        this.nom = nom;
    }

}

