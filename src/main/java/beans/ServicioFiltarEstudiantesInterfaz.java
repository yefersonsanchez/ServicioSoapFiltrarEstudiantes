package beans;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Local
public interface ServicioFiltarEstudiantesInterfaz {

    @WebMethod
    public String filtrar(String pay1, String pay2);
}
