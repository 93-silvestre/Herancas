package br.com.generation.herancas;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguica sloth1 = new Preguica();
		
		dog1.setNome("Cachorro");
        dog1.setTipo("Golden Retriever");
        dog1.setIdade(12);
        dog1.setComprimento(56);
        dog1.setPatas(4);
        dog1.setSom("Latido");
        dog1.setVelocidade(3);
        
        horse1.setNome("Cavalo");
        horse1.setTipo("Banker");
        horse1.setIdade(30);
        horse1.setComprimento(150);
        horse1.setPatas(4);
        horse1.setSom("Relincho");
        horse1.setVelocidade(88);
        
        sloth1.setNome("Bicho Pregui�a");
        sloth1.setTipo("Pregui�a Comum");
        sloth1.setIdade(50);
        sloth1.setComprimento(42);
        sloth1.setPatas(4);
        sloth1.setSom("Sons de alta-frequ�ncia");
        sloth1.setVelocidade(0.27);
        
        
        System.out.println("====== Dados dos Animais ======");
		System.out.println("===============================");
        System.out.println("Especie: " + dog1.getNome());
        System.out.println("Ra�a: " + dog1.getTipo());
        System.out.println("Expectativa de vida em m�dia de: " + dog1.getIdade() + "anos");
        System.out.println("Altura: " + dog1.getComprimento() + "cm");
        System.out.println("Animal de: " + dog1.getPatas() + " patas");
        System.out.println("Som emitido por ele � : " + dog1.getSom());
        System.out.println("Pode percorrer correndo at�: " + dog1.getVelocidade() + "km");
        
        System.out.println("================================");
        
        System.out.println("Especie: " + horse1.getNome());
        System.out.println("Ra�a: " + horse1.getTipo());
        System.out.println("Expectativa de vida em m�dia de: " + horse1.getIdade() + " anos");
        System.out.println("Altura: " + horse1.getComprimento() + " cm");
        System.out.println("Animal de: " + horse1.getPatas() + " patas");
        System.out.println("Som emitido por ele � : " + horse1.getSom());
        System.out.println("Pode percorrer correndo at�: " + horse1.getVelocidade() + "km/h");
        
        System.out.println("================================");
        
        System.out.println("Especie: " + sloth1.getNome());
        System.out.println("Ra�a: " + sloth1.getTipo());
        System.out.println("Expectativa de vida em m�dia de: " + sloth1.getIdade() + " anos");
        System.out.println("Altura: " + sloth1.getComprimento() + " cm");
        System.out.println("Animal de: " + sloth1.getPatas() + " patas");
        System.out.println("Som emitido por ele � : " + sloth1.getSom() + " (por�m, s� emite esse som caso se sinta amea�ado)");
        System.out.println("Pode subir em �rvores em at�: " + sloth1.getVelocidade() + "km/h");
        
        
     
        
	}

}
