package com.cice.gestionequipo.service;

import java.util.List;

import com.cice.gestionequipo.entidades.Jugador;
import com.cice.gestionequipo.entidades.Paritido;

public interface JugadorService extends EntrenadorService{

	
	public void seleccionarTitularProximoPartido();
	public List<Jugador> listaDeTitulares();
	public List<Paritido> getPartidosComoConvocado();
	public List<Paritido> getPartidosComoTitular();
}
