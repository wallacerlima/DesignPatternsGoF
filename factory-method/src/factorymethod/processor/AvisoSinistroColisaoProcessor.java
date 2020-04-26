package factorymethod.processor;

import factorymethod.domain.AvisoSinistroBase;
import factorymethod.domain.AvisoSinistroColisao;

public class AvisoSinistroColisaoProcessor implements IAvisoSinistroProcessor {

	@Override
	public void avisarSinistro(AvisoSinistroBase avisoSinistro) {
		System.out.println("Avisando sinistro de roubo ou furto: " + avisoSinistro.getId());
		
		ProcessarAviso((AvisoSinistroColisao) avisoSinistro);
	}

	private static void ProcessarAviso(AvisoSinistroColisao avisoSinistroColisao) {
		System.out.println("Colisão em: " + avisoSinistroColisao.getObjetoColisao());
	}
	
}
