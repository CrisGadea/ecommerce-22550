package ar.com.ecommerce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		user.setNombreUsuario("Roxana");
		user.setPassword("1234");
		user.setEstaRegistrado(true);
		user.setEmail("mail@mail.com");
		
		
		Usuario user2 = new Usuario(1L, "cristian", "cris@mail.com","5678", false);
		System.out.println("El usuario " + user2.getNombreUsuario() + " tiene como valor de registro: " + user2.getEstaRegistrado());
		user2.setEstaRegistrado(true);
		System.out.println("El usuario " + user2.getNombreUsuario() + " tiene como valor de registro: " + user2.getEstaRegistrado());
		
		System.out.println("El usuario " + user.getNombreUsuario() + " saluda al usuario " + user2.getNombreUsuario());
		
		//TODO: Generar instancias de productos y hacer que un usuario pueda comprar un producto
		/*
		Producto prod = new Producto();
		System.out.println(user.comprar(prod));
		*/
		
		
		
	}

}
