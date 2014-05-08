package Rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by LYES-PC on 08/04/14.
 */

@XmlRootElement(name = "CvListe")
public class cvList {

    private List<cv> cvs = new ArrayList<cv>();

    public List<cv> getCvs() {
        return cvs;
    }

    public void setCvs(List<cv> cvs) {
        this.cvs = cvs;
    }

    /*Const vide*/
    public cvList(){
        /********** Premier CV ******************************/
        List<scolarite> scolarites = new ArrayList<scolarite>();
        scolarites.add(new scolarite("Licence", "Universite USTHB", "Algerie", "01/09/2008", "01/07/2011"));
        scolarites.add(new scolarite("Master 2", "Universite USTHB", "Algerie", "01/09/2011", "01/07/2013"));
        ListeScolarites listeScolarites = new ListeScolarites(scolarites);

        List<experience> experiences = new ArrayList<experience>();
        experiences.add(new experience("Testeur", "4 mois", "OoridoO"));
        experiences.add(new experience("Manager plateforme", "1 ans", "Nedjma"));
        ListeExperiences listeExperiences = new ListeExperiences(experiences);

        List<langue> langues = new ArrayList<langue>();
        langues.add(new langue("Arabe",5));
        langues.add(new langue("Français",5));
        langues.add(new langue("Anglais",4));

        ListeLangues listeLangues = new ListeLangues(langues);
       /********** Premier CV ******************************/
        /********** Duexième CV ******************************/
        List<scolarite> scolarites1 = new ArrayList<scolarite>();
        scolarites1.add(new scolarite("Master 2", "Universite USTHB", "Algerie", "01/09/2011", "01/07/2013"));
        scolarites1.add(new scolarite("Master 1", "Universite Rouen", "France", "01/09/2013", "01/07/2014"));
        ListeScolarites listeScolarites1 = new ListeScolarites(scolarites1);

        List<experience> experiences1 = new ArrayList<experience>();
        experiences1.add(new experience("Developpeur PHP", "4 mois", "Agora"));
        ListeExperiences listeExperiences1 = new ListeExperiences(experiences1);

        List<langue> langues1 = new ArrayList<langue>();
        langues1.add(new langue("Français",5));
        langues1.add(new langue("Anglais",4));

        ListeLangues listeLangues1 = new ListeLangues(langues1);
        /********** Deuxième CV ******************************/


        cvs.add(new cv(1,"Saviola", "lyes", "Recherche Stage", listeScolarites, listeExperiences, listeLangues));
        cvs.add(new cv(2,"Holland", "Sarco", "Propose son expertise", listeScolarites1, listeExperiences1, listeLangues1));


    }

    public cvList(List<cv> cvList) {
        this.cvs = cvList;
    }


    //Ajouter un CV
    public void AjouterCV(cv cv) {
        this.cvs.add(cv);
    }

    //Supprimer un CV
    public void SupprimerCV(int numero) {

        // Récupération d'un Iterator sur cvs
        Iterator iter = cvs.iterator();

        // Parcourir de la liste  des CV cvs
        while (iter.hasNext()) {
            //vérifier si le cv courant est le cv recherché
             cv elem = (cv) iter.next();
             if (elem.getNumero() == numero){
             cvs.remove(elem);
             }
        }

    }

    //Chercher un CV
    public cv ChercherCv(int numero) {

        // Récupération d'un Iterator sur cvs
        Iterator iter = cvs.iterator();

        // Parcourir de la liste  des CV cvs
        while (iter.hasNext()) {
            //vérifier si le cv courant et le cv recherché
           cv elem = (cv) iter.next();
           if (elem.getNumero() == numero)
           {return elem;}
       }
        // Si le cv n'existe pas
    return null;
    }

}
