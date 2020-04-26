package factorymethod.domain;

import factorymethod.enums.TipoAvisoSinistro;

public class AvisoSinistroRouboFurto extends AvisoSinistroBase {

	private String numBO;
	
	public AvisoSinistroRouboFurto(String numBO) {
		super(TipoAvisoSinistro.ROUBO_FURTO);
		this.numBO = numBO;
	}

	public String getNumBO() {
		return numBO;
	}

	public void setNumBO(String numBO) {
		this.numBO = numBO;
	}
	
}