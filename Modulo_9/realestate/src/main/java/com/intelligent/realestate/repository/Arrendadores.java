package com.intelligent.realestate.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.intelligent.realestate.bean.Arrendador;

public class Arrendadores implements Serializable {

	private static final long serialVersionUID = 2L;
	private List<ArrendadorEntity> arrendadores;

	public Arrendadores() {
		arrendadores = new ArrayList<>();
	}

	public void agregar(Arrendador arrendador) {
		ArrendadorEntity arrendaEntity = new ArrendadorEntity();
		arrendaEntity.setNombre(arrendador.getNombre());
		arrendaEntity.setPaterno(arrendador.getPaterno());
		arrendaEntity.setMaterno(arrendador.getMaterno());
		arrendaEntity.setCorreo(arrendador.getCorreo());
		arrendaEntity.setDireccion(arrendador.getDireccion());
		arrendaEntity.setCiudad(arrendador.getCiudad());
		arrendaEntity.setEstado(arrendador.getEstado());
		arrendadores.add(arrendaEntity);
	}

	public List<ArrendadorEntity> getArrendadores() {
		return arrendadores;
	}
}
