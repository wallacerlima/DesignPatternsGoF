package factorymethod.domain;

import java.util.UUID;

import factorymethod.enums.TipoAvisoSinistro;

public abstract class AvisoSinistroBase {
	
	protected UUID id;
	protected TipoAvisoSinistro tipoSinistro;
	
	public AvisoSinistroBase(TipoAvisoSinistro tipoSinistro) {
		super();
		this.setId(UUID.randomUUID());
		this.tipoSinistro = tipoSinistro;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public TipoAvisoSinistro getTipoSinistro() {
		return tipoSinistro;
	}

	public void setTipoSinistro(TipoAvisoSinistro tipoSinistro) {
		this.tipoSinistro = tipoSinistro;
	}
	
}
