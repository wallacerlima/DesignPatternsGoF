package factorymethod.processor;

import factorymethod.domain.AvisoSinistroBase;

public interface IAvisoSinistroProcessor {
	public void avisarSinistro(AvisoSinistroBase avisoSinistro);
}
