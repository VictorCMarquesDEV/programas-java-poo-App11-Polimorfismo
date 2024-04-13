package App11;

public class Master {

	public static void main(String[] args) {
		Mamifero m1 = new Mamifero();
		Reptil r1 = new Reptil();
		Peixe p1 = new Peixe();
		Ave a1 = new Ave();
		
		m1.emitirSom();
		r1.emitirSom();
		p1.soltarBolha();
		a1.fazerNinho();
		
		Canguru c1 = new Canguru();
		Cachorro k1 = new Cachorro();
		
		c1.locomover();
		k1.abanarRabo();
		
		Cobra s1 = new Cobra();
		Tartaruga t1 = new Tartaruga();
		
		s1.emitirSom();
		t1.locomover();
		
		Goldfish g1 = new Goldfish();
		
		g1.emitirSom();
		
		Arara b1 = new Arara();
		
		b1.locomover();
		
		
		c1.locomover();
		k1.locomover();
		c1.emitirSom();
		k1.emitirSom();
	}
}

/*
# Polimorfismo: mesmo nome, vários comportamentos;
	% Sobreposição: Override -> filho adquire prioridade sobre a mãe;
	% Sobrecaraga: Overload -> argumentos precisam ser diferentes;
# Assinatura do Método: Quantidade e os tipos dos parâmetros;
*/