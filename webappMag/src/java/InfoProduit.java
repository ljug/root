
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public  class InfoProduit implements Serializable {

    @Id
    private Long id;

    @Basic
    private String description;

    @Basic
    private String reference;

    public InfoProduit(){

    }


   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getDescription() {
        return this.description;
    }


  public void setDescription (String description) {
        this.description = description;
    }



   public String getReference() {
        return this.reference;
    }


  public void setReference (String reference) {
        this.reference = reference;
    }

}

