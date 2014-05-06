package Rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by LYES-PC on 08/04/14.
 */
@XmlRootElement(name = "cv")
@XmlType(propOrder = {//"numero",
"name", "prenom", "objectif", "scolarites", "experiencePro", "langues" })
public class cv {

    /*Numéro de CV*/
   // int numero;
    /*Nom*/
    String name;
    /*Prenom*/
    String prenom;
    /*Objectifs*/
    String objectif;
    /*Parcours Scolaire*/
    @XmlElement
    List<String> scolarites;
    /*Exépriences*/
    @XmlElement
    List<String> experiencePro;
    /*Langues maitrisées*/
    @XmlElement
    List<String> langues;


    public cv() {

    }

    public String getName (){
        return name;
    }

    @XmlElement
    public void setName (String name){
        this.name = name;
    }
/*
    public int getNumero (){
        return numero;
    }

    @XmlElement
    public void setNumero (int numero){
        this.numero = numero;
    }
*/
    public String getPrenom (){
        return prenom;
    }

    @XmlElement
    public void setPrenom (String prenom){
        this.prenom = prenom;
    }

    public String getObjectif (){
        return objectif;
    }

    @XmlElement
    public void setObjectif (String objectif){
        this.objectif = objectif;
    }

    public cv(int numero, String name, String prenom, String objectif,
              List<String> scolarites,
              List<String> experiencePro,
              List<String> langues ){
     //   this.numero=numero;
        this.name=name;
        this.prenom=prenom;
        this.objectif=objectif;
        this.scolarites = scolarites;
        this.experiencePro = experiencePro;
        this.langues = langues;
    }
}
