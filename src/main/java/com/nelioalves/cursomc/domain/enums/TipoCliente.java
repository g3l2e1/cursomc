package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física", "PF"),
	PESSOAJURIDICA(2, "Pessoa Jurídica", "PJ");
	
	private int cod;
	private String descricao;
	private String abrev;
	
	private TipoCliente(int cod, String descricao, String abrev) {
		this.cod = cod;
		this.descricao = descricao;
		this.abrev = abrev;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getAbrev() {
		return abrev;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido" + cod);
	}
	
}
