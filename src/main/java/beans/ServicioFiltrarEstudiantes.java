package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import lecturapayloads.LecturaPayloads;

@LocalBean
@Stateless
@WebService(endpointInterface = "beans.ServicioFiltarEstudiantesInterfaz")
public class ServicioFiltrarEstudiantes implements ServicioFiltarEstudiantesInterfaz {

    @EJB

    @Override
    public String filtrar(String pay1, String pay2) {

        String res = null;
        LecturaPayloads pays = new LecturaPayloads();
        try {
            res = pays.lectura(pay1, pay2);
        } catch (JAXBException ex) {
            Logger.getLogger(ServicioFiltrarEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Me equivoque");
        }

        return res;
    }
}
