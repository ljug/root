
import java.io.Serializable;

import java.lang.Integer;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUIT")
public  class Produit implements Serializable {

    @Column(name="id",table="PRODUIT",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @ManyToOne(optional=false,targetEntity=Magasin.class)
    @JoinColumn(name="idMag",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Magasin idMag;

    @ManyToOne(optional=false,targetEntity=InfoProduit.class)
    @JoinColumn(name="infoProduit",referencedColumnName="id",table="infoProduit",insertable=true,nullable=true,unique=false,updatable=true)
    private InfoProduit infoProduit;

    @Column(name="qt",table="PRODUIT",nullable=false)
    @Basic
    private int qt;

    public Produit(){

    }


   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Magasin getIdMag() {
        return this.idMag;
    }


  public void setIdMag (Magasin idMag) {
        this.idMag = idMag;
    }



   public InfoProduit getInfoProduit() {
        return this.infoProduit;
    }


  public void setInfoProduit (InfoProduit infoProduit) {
        this.infoProduit = infoProduit;
    }



   public int getQt() {
        return this.qt;
    }


  public void setQt (int qt) {
        this.qt = qt;
    }

}

