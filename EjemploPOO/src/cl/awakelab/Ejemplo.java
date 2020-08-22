package cl.awakelab;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p = new Persona();
		p.setNombre("Pollito");
		System.out.println(p.getNombre());
		
		Persona ely = new Persona("Elizabeth", "Chacana", 29);
		System.out.println(ely.getNombre());
		ely.caminar();
	}

}
