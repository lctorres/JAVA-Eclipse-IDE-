package negocio;

public class VideoJuego extends IEntregable {

	public static final int HORAS_ESTIMADAS_DEFECTO = 10;
	public static final int ESTADO_ENTREGADO_DEFECTO = false;
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public VideoJuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_DEFECTO;
		this.entregado = ESTADO_ENTREGADO_DEFECTO;
		this.genero = "";
		this.compañia = "";
	}
	
	public 
}
