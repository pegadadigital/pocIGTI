
package br.com.banpara.producer.model;

import br.com.banpara.producer.model.domain.TipoTransacao;

public class Transacao {

	private String data;
	private String descricao;
	private Double valor;
	private Long nanotime;

	public Transacao(String data, String descricao, Double valor,Long nanotime) {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.nanotime = nanotime;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Long getNanotime() {
		return nanotime;
	}

	public void setNanotime(Long nanotime) {
		this.nanotime = nanotime;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Transacao [data=" + data + ", descricao=" + descricao + ", valor=" + valor + ", nanotime="+nanotime+"]";
	}

}
