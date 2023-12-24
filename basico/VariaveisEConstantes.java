package cursoJava.basico;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		//COSNTANTE FINAL E O SEU TIPO
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		String nome="Jeferson";
		int idade=37;
		double peso= 65.0, altura= 1.70;
		char sexo = 'm', cnh='a';
		boolean doadorOrgaos=true;
		
        System.out.println("Usuário: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("peso: "+ peso);
        System.out.println("altura: "+ altura);
        System.out.println("sexo: "+ sexo);
        System.out.println("habilitação: "+ cnh);
        System.out.println("doador de orgãos: "+ doadorOrgaos);
        System.out.println("gravidade: "+ ACELERACAO_GRAVIDADE_TERRA + " ms2");
	}

}
