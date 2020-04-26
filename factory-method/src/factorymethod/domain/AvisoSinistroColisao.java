package factorymethod.domain;

import factorymethod.enums.TipoAvisoSinistro;

public class AvisoSinistroColisao extends AvisoSinistroBase{

	private String objetoColisao;
	
	public AvisoSinistroColisao(String objetoColisao) {
		super(TipoAvisoSinistro.COLISAO);
		this.objetoColisao = objetoColisao;
	}

	public String getObjetoColisao() {
		return objetoColisao;
	}

	public void setObjetoColisao(String objetoColisao) {
		this.objetoColisao = objetoColisao;
	}
	
}
