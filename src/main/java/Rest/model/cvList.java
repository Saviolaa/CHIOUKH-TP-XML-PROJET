package Rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by LYES-PC on 08/04/14.
 */

@XmlRootElement
public class cvList {
    @XmlElement
    List<cv> cvs = new ArrayList<cv>();

    /*Const vide*/
    public cvList(){
    }
    /*Const parametres*/
    public cvList(List<cv> cvList) {
        this.cvs = cvList;
    }


    //Ajouter un CV
    public void AjouterCV(cv cv) {

        //Variable pour la récuparetion du plus grand numero de cvs existant
        int temp=0;
        // Récupération d'un Iterator sur cvs
        Iterator iter = cvs.iterator();

        // Parcourir de la liste  des CV cvs
        while (iter.hasNext()) {

            //vérifier si le cv courant et le cv recherché
            cv elem = (cv) iter.next();

            if (elem.getNumero() > temp)
            {temp = elem.getNumero();}
        }
        //Une fois sortie du while, on aura dans temps le plus grand numero de
        //CV existant dans la liste des cvs
        if(temp==0){temp=1;}
        cv.setNumero(temp);
        //Ajouter le cv à cvs
        cvs.add(cv);

    }

    //Supprimer un CV
    public void SupprimerCV(int numero) {

        // Récupération d'un Iterator sur cvs
        Iterator iter = cvs.iterator();

        // Parcourir de la liste  des CV cvs
        while (iter.hasNext()) {
            //vérifier si le cv courant et le cv recherché
            cv elem = (cv) iter.next();
            if (elem.getNumero() == numero)
            {cvs.remove(elem);}
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
