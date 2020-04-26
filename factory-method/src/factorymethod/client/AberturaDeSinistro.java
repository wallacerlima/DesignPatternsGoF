package factorymethod.client;

import factorymethod.domain.AvisoSinistroColisao;
import factorymethod.domain.AvisoSinistroRouboFurto;
import factorymethod.enums.TipoAvisoSinistro;
import factorymethod.factory.AvisoSinistroFactory;
import factorymethod.processor.IAvisoSinistroProcessor;

public class AberturaDeSinistro {

	public static void main(String[] args) {
		
		AvisoSinistroColisao avisoColisao = new AvisoSinistroColisao("Muro");
		
		IAvisoSinistroProcessor sinistroColisaoProcessor = AvisoSinistroFactory.createAvisoSinistroProcessor(TipoAvisoSinistro.COLISAO);
		sinistroColisaoProcessor.avisarSinistro(avisoColisao);

		AvisoSinistroRouboFurto avisoSinistroRouboFurto = new AvisoSinistroRouboFurto("2020123454");
		
		IAvisoSinistroProcessor sinistroRouboFurtoProcessor = AvisoSinistroFactory.createAvisoSinistroProcessor(TipoAvisoSinistro.ROUBO_FURTO);
		sinistroRouboFurtoProcessor.avisarSinistro(avisoSinistroRouboFurto);
	}

}
