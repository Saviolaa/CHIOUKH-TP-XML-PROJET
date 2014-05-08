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

    public cvController() {
    }


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

        ResponseEntity<cvList> cvListResponseEntity=new ResponseEntity<cvList>(moncvList,HttpStatus.OK);
        return cvListResponseEntity;
    }

    //Suppression d'un seul cv, par num
    @RequestMapping(value="/delete/{numero}", method = RequestMethod.DELETE)
    public ResponseEntity<cv> deleteCvInXML(@PathVariable int numero) {
        moncvList.SupprimerCV(numero);
        ResponseEntity<cv> cvDeleteResponseEntity=new ResponseEntity<cv>(HttpStatus.OK);
        return cvDeleteResponseEntity;
    }
}
