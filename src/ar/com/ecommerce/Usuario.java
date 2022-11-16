package ar.com.ecommerce;

public class Usuario {

	private Long idUsuario;
	private String nombreUsuario;
	private String email;
	private String password;
	private Boolean estaRegistrado;
	//TODO: agregar un campo: saldoEnCuenta (Double)
	
	public Usuario(Long idUsuario, String nombreUsuario, String email, String password, Boolean estaRegistrado) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.password = password;
		this.estaRegistrado = estaRegistrado;
	}

	public Usuario() {}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEstaRegistrado() {
		return estaRegistrado;
	}

	public void setEstaRegistrado(Boolean estaRegistrado) {
		this.estaRegistrado = estaRegistrado;
	}
	
	public Boolean registrar() {
		return true;
	}
	
	public Boolean login() {
		return true;
	}
	
	//TODO: Modificar el método para que un usuario pueda comprar correctamente un producto
	public Boolean comprar(Producto producto) {
		// TODO: Si el precio del producto es mayor que el saldoEnCuenta, no se pueda comprar (devuelva false)
		return true;
	}
	
	public Boolean cambiarContrasenia(String contrasenia) {
		password = contrasenia;
		return true;
	}
	
}
