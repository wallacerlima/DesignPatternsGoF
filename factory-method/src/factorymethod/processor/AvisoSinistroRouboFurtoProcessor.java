package factorymethod.processor;

import factorymethod.domain.AvisoSinistroBase;
import factorymethod.domain.AvisoSinistroRouboFurto;

public class AvisoSinistroRouboFurtoProcessor implements IAvisoSinistroProcessor {

	@Override
	public void avisarSinistro(AvisoSinistroBase avisoSinistro) {
		System.out.println("Avisando sinistro de roubo ou furto: " + avisoSinistro.getId());
		
		ProcessarAviso((AvisoSinistroRouboFurto) avisoSinistro);
	}

	private static void ProcessarAviso(AvisoSinistroRouboFurto avisoSinistroRouboFurto) {
		System.out.println("Número do B.O.: " + avisoSinistroRouboFurto.getNumBO());
	}
	
}
