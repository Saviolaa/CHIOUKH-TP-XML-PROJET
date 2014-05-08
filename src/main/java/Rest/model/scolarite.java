package Rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by LYES-PC on 08/05/14.
 */
@XmlRootElement(name="scolarite")
@XmlType(propOrder = {"titre","universite", "pays","debut", "fin"})
        public class scolarite {

    private String titre;
    private String universite;
    private String pays;
    private String debut;
    private String fin;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public scolarite(String titre, String universite, String pays, String debut, String fin) {
        this.titre = titre;
        this.universite = universite;
        this.pays = pays;
        this.debut = debut;
        this.fin = fin;
    }

    public scolarite() {
    }
}
