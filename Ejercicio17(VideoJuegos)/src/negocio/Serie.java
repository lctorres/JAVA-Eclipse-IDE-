package negocio;

public class Serie implements IEntregable {
	
	public static final int NUMERO_TEMPORADAS_DEFECTO = 3;
	public static final int ESTADO_ENTREGADO_DEFECTO = false;
	
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = NUMERO_TEMPORADAS_DEFECTO;
		this.entregado = ESTADO_ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}
	
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
