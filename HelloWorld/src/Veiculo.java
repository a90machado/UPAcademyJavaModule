
public class Veiculo {
	private int rodas;
	private int portas;
	private String marca;
	private boolean avariado;
	
	public Veiculo(int rodas, int portas, String marca, boolean avariado) {
		this.rodas = rodas;
		this.portas = portas;
		this.marca = marca;
		this.avariado = avariado;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAvariado() {
		return avariado;
	}

	public void setAvariado(boolean avariado) {
		this.avariado = avariado;
	}
	
	
}
