package factorymethod.factory;

import factorymethod.enums.TipoAvisoSinistro;
import factorymethod.processor.AvisoSinistroColisaoProcessor;
import factorymethod.processor.AvisoSinistroRouboFurtoProcessor;
import factorymethod.processor.IAvisoSinistroProcessor;

public class AvisoSinistroFactory {
	
	public static IAvisoSinistroProcessor createAvisoSinistroProcessor(TipoAvisoSinistro tipoAvisoSinistro) {
		
		if(tipoAvisoSinistro.equals(TipoAvisoSinistro.ROUBO_FURTO)) {
			return new AvisoSinistroRouboFurtoProcessor();
		}
		
		if(tipoAvisoSinistro.equals(TipoAvisoSinistro.COLISAO)) {
			return new AvisoSinistroColisaoProcessor();
		}
		
		return null;
	}
	
}