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

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<cvList>  putCvInList(@RequestBody cv cv) {
        moncvList.AjouterCV(cv);
        ResponseEntity<cvList> cvListResponseEntity=new ResponseEntity<cvList>(HttpStatus.OK);
        return cvListResponseEntity;
    }

    @RequestMapping(value="/{numero}", method = RequestMethod.GET)
    public ResponseEntity<cv> getCvInXML(@PathVariable int numero) {

        ResponseEntity<cv> cvResponseEntity=new ResponseEntity<cv>(moncvList.ChercherCv(numero),HttpStatus.OK);
        return cvResponseEntity;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<cvList> getLesCvsInXML() {

        ResponseEntity<cvList> cvListResponseEntity=new ResponseEntity<cvList>(moncvList,HttpStatus.OK);
        return cvListResponseEntity;
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
