package Rest;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by LYES-PC on 01/04/14.
 */
@WebService(endpointInterface="rest.model.CvService")
public class CvImpl implements CvService {

    public Cv getCv() {
        return new Cv("Dupon", "jEan", "test");
    }

    public CvArray getAllCv() {
        CvArray listcv = new CvArray();
        listcv.cvList = new ArrayList<Cv>();
        listcv.cvList.add(new Cv("Lyes", "Chioukh", "RMA"));
        listcv.cvList.add(new Cv("Saviola", "Lyes", "ACM"));
        listcv.cvList.add(new Cv("Patrick", "Jean", "INT"));
        return listcv;
    }
}
