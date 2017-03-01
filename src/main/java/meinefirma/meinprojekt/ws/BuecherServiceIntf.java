package meinefirma.meinprojekt.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Dienst-Interface
 */
@WebService
public interface BuecherServiceIntf {

	BuecherTO createBuch(@WebParam(name = "buch") BuchDO buch) throws Exception;

	BuecherTO getBuchByIsbn(@WebParam(name = "isbn") Long isbn);

	BuecherTO findeBuecher(@WebParam(name = "buch") BuchDO buch);
}
