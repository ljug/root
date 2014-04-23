/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.cofares;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pfares
 */
@Entity
@Table(name = "MAGAZIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Magazin.findAll", query = "SELECT m FROM Magazin m"),
    @NamedQuery(name = "Magazin.findByIdMagazin", query = "SELECT m FROM Magazin m WHERE m.idMagazin = :idMagazin"),
    @NamedQuery(name = "Magazin.findByNom", query = "SELECT m FROM Magazin m WHERE m.nom = :nom")})
public class Magazin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMagazin")
    private Integer idMagazin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;
    @Lob
    @Size(max = 65535)
    @Column(name = "commentaires")
    private String commentaires;
    @ManyToMany(mappedBy = "magazinList")
    private List<Produit> produitList;

    public Magazin() {
    }

    public Magazin(Integer idMagazin) {
        this.idMagazin = idMagazin;
    }

    public Magazin(Integer idMagazin, String nom) {
        this.idMagazin = idMagazin;
        this.nom = nom;
    }

    public Integer getIdMagazin() {
        return idMagazin;
    }

    public void setIdMagazin(Integer idMagazin) {
        this.idMagazin = idMagazin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    @XmlTransient
    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMagazin != null ? idMagazin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magazin)) {
            return false;
        }
        Magazin other = (Magazin) object;
        if ((this.idMagazin == null && other.idMagazin != null) || (this.idMagazin != null && !this.idMagazin.equals(other.idMagazin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.cofares.Magazin[ idMagazin=" + idMagazin + " ]";
    }
    
}
