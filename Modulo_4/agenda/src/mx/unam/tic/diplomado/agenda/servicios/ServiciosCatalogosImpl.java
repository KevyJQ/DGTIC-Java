package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.dao.CatalogosDAO;
import mx.unam.tic.diplomado.agenda.modelo.dao.CatalogosDAOImpl;
import mx.unam.tic.diplomado.agenda.modelo.entidades.MedioContacto;
import mx.unam.tic.diplomado.agenda.modelo.entidades.TipoContacto;

public class ServiciosCatalogosImpl implements ServiciosCatalogos {
	
	private static ServiciosCatalogosImpl instance;
	
	private ServiciosCatalogosImpl() {
		
	}
	
	public static ServiciosCatalogosImpl getInstance() {
		if (instance == null) {
			instance = new ServiciosCatalogosImpl();
		}
		return instance;
	}
	
	@Override
	public List<TipoContacto> cargaTiposContacto() {
		CatalogosDAO catalogosDAO = CatalogosDAOImpl.getInstance();
		return catalogosDAO.cargaTiposContacto();
	}
	
	@Override
	public TipoContacto cargaTipoContactoPorId(Integer id) {
		CatalogosDAO catalogosDAO = CatalogosDAOImpl.getInstance();
		return catalogosDAO.cargaTipoContactoPorId(id);
	}
	
	@Override
	public List<MedioContacto> cargaMediosContacto() {
		CatalogosDAO catalogosDAO = CatalogosDAOImpl.getInstance();
		return catalogosDAO.cargaMediosContacto();
	}

	@Override
	public MedioContacto cargaMedioContactoPorId(Integer id) {
		CatalogosDAO catalogosDAO = CatalogosDAOImpl.getInstance();
		return catalogosDAO.cargaMedioContactoPorId(id);
	}

}
