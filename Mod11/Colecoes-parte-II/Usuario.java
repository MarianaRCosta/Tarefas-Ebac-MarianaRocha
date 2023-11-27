package ExercMod11;

public class Usuario implements Comparable <Usuario> {
	private String nome;
	private String genero;

	public Usuario (String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//Usado para converter o objeto em String
		public String toString() {
			return this.nome;
		}
		
		public String toString1() {
			return this.genero;
		}
		
	//Usado para comparação entre objetos e verificar se o mesmo é igual
		public int compareTo(Usuario usuario) {
			return this.nome.compareTo(usuario.getNome());
		}
		
		public int compareTo1(Usuario usuario) {
			return this.genero.compareTo(usuario.getNome());
		}
}
