package Rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by LYES-PC on 06/05/14.
 */

@XmlRootElement(name="Experience")
@XmlType(propOrder = {"titre","duree", "societe"})
public class experience {

    private String titre;
    private String duree;
    private String societe;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }



    public experience() {
    }

    public experience(String titre, String duree, String societe) {
        this.titre = titre;
        this.duree = duree;
        this.societe = societe;

    }


}
