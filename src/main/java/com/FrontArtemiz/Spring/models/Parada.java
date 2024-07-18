package com.FrontArtemiz.Spring.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="controlparadas")
public class Parada implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="id_causal")
	int id_causal;
	@Column(name="causal")
	String desc_causal;
	@Column(name="fecha")
	String fecha;
	@Column(name="time")
	String time;
	
	@Override
	public String toString() {
		return "Parada [id=" + id + ", id_causal=" + id_causal + ", desc_causal=" + desc_causal + ", fecha=" + fecha
				+ ", time=" + time + "]";
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
