package dgtic.core.servicio;

public class PredeterminadoServicio {
	private static EmpleadoServicio empleadoServicio=new EmpleadoServicioImpl();
	private static ReporteEmpleadoServicio empleadoReporteServicio=new ReporteEmpleadoServicioImpl(); private PredeterminadoServicio() {
	}
	public EmpleadoServicio getEmpleadoServicio() { return empleadoServicio;
	}
	public ReporteEmpleadoServicio getReporteEmpleadoServicio() { return empleadoReporteServicio;
	}

}
