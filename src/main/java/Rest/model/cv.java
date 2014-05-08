package Rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by LYES-PC on 08/04/14.
 */
@XmlRootElement(name = "cv")
@XmlType(propOrder = {"numero","name", "prenom", "objectif", "scolarites", "listexperience", "langues" })
public class cv {


    /*Numéro de CV*/

    private int numero;
    /*Nom*/

    private String name;
    /*Prenom*/

    private String prenom;
    /*Objectifs*/

    private String objectif;
    /*Parcours Scolaire*/

    private ListeScolarites scolarites;
    /*Exépriences*/
    private ListeExperiences listexperience;

    /*Langues maitrisées*/
    private ListeLangues langues;

    public cv(int numero,String name, String prenom, String objectif, ListeScolarites scolarites, ListeExperiences experiences, ListeLangues langues) {
        this.numero = numero;
        this.name = name;
        this.prenom = prenom;
        this.objectif = objectif;
        this.scolarites = scolarites;
        this.listexperience = experiences;
        this.langues = langues;
    }

    public cv() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public ListeScolarites getScolarites() {
        return scolarites;
    }

    public void setScolarites(ListeScolarites scolarites) {
        this.scolarites = scolarites;
    }

    public ListeExperiences getListexperience() {
        return listexperience;
    }

    public void setListexperience(ListeExperiences listexperience) {
        this.listexperience = listexperience;
    }

    public ListeLangues getLangues() {
        return langues;
    }

    public void setLangues(ListeLangues langues) {
        this.langues = langues;
    }
}
