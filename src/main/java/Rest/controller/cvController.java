package Rest.controller;

import Rest.model.cv;
import Rest.model.cvList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LYES-PC on 08/04/14.
 */

@Controller
@RequestMapping("/cv")
public class cvController {

    private cvList moncvList = new cvList();

    public void setMoncvList(cvList moncvList) {
        this.moncvList = moncvList;
    }

    public cvList getMoncvList() {
        return moncvList;
    }


    //const vide
    public cvController() {
    }

/*
@RequestMapping(value="{id}", method = RequestMethod.GET)
public @ResponseBody
cv getResumeInXML(@PathVariable String id){
        cv resumes = new cv("CHIOUKH", "Lyes", "Objectifs");
        return resumes;
    }
*/

    //Ajout de cvs
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public ResponseEntity<cvList>  putCvInList(@RequestBody cv cv) {
        moncvList.AjouterCV(cv);
        ResponseEntity<cvList> cvListResponseEntity=new ResponseEntity<cvList>(HttpStatus.OK);
        return cvListResponseEntity;
    }

    //Affichage d'un seul CV par num
    @RequestMapping(value="/{numero}", method = RequestMethod.GET)
    public ResponseEntity<cv> getCvInXML(@PathVariable int numero) {

        ResponseEntity<cv> cvResponseEntity=new ResponseEntity<cv>(moncvList.ChercherCv(numero),HttpStatus.OK);
        return cvResponseEntity;
    }

    //Affichage de tout les CVS
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<cvList> getLesCvsInXML() {
        //pour tester ***************************************
        ArrayList<String> scolarites = new ArrayList<String>();
        ArrayList<String> experiencePro = new ArrayList<String>();
        ArrayList<String> langues = new ArrayList<String>();
        scolarites.add("Licence Informatique, univ rouen, 2011");
        scolarites.add("Master Informatique, univ rouen, 2013");
        experiencePro.add("Expert test a google, 4 ans");
        experiencePro.add("Developpeur a Fcabook, 6mois");
        langues.add("Français");
        langues.add("Arabe");
        moncvList.AjouterCV(new cv(1, "chioukh", "lyes", "Recherche Stage", scolarites,
                experiencePro,
                langues));

        ArrayList<String> scolarites1 = new ArrayList<String>();
        ArrayList<String> experiencePro1 = new ArrayList<String>();
        ArrayList<String> langues1 = new ArrayList<String>();
        scolarites1.add("Licence media, univ rouen, 2011");
        scolarites1.add("Master chronique, univ rouen, 2013");
        experiencePro1.add("Chroniqueur NRJ, 4 ans");
        experiencePro1.add("Canal+ , 6mois");
        langues1.add("Français");
        langues1.add("Anglais");
        moncvList.AjouterCV(new cv(2, "Nicolas", "Bideau", "Recherche Stage", scolarites1,
                experiencePro1,
                langues1));
        //Fin pour tester ***************************************
        ResponseEntity<cvList> cvListResponseEntity=new ResponseEntity<cvList>(moncvList,HttpStatus.OK);
        return cvListResponseEntity;
    }

    //Suppression d'un seul cv, par num
    @RequestMapping(value="/{numero}", method = RequestMethod.DELETE)
    public ResponseEntity<cv> deleteCvInXML(@PathVariable int numero) {
        moncvList.SupprimerCV(numero);
        ResponseEntity<cv> cvDeleteResponseEntity=new ResponseEntity<cv>(HttpStatus.OK);
        return cvDeleteResponseEntity;
    }

    public static void main(String args[]) throws Exception {

        cvController mes_cvs = new cvController();
        System.out.println("Ajout d'un CV");
        mes_cvs.putCvInList(new cv(1, "chioukh", "lyes", "Objectif", new ArrayList<String>(),
                new ArrayList<String>(),
                new ArrayList<String>()));
/*

        mes_cvs.getCvInXML(1);
        */
}
}
