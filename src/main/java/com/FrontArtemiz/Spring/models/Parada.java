package com.FrontArtemiz.Spring.models;

public class Parada {
	int id,id_causal;
	String desc_causal;
	String fecha;
	String maquina;
	
	@Override
	public String toString() {
		return "Parada [id=" + id + ", id_causal=" + id_causal + ", desc_causal=" + desc_causal + ", fecha=" + fecha
				+ ", maquina=" + maquina + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_causal() {
		return id_causal;
	}
	public void setId_causal(int id_causal) {
		this.id_causal = id_causal;
	}
	public String getDesc_causal() {
		return desc_causal;
	}
	public void setDesc_causal(String desc_causal) {
		this.desc_causal = desc_causal;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMaquina() {
		return maquina;
	}
	public void setMaquina(String maquina) {
		this.maquina = maquina;
	}
	
	
	
}
