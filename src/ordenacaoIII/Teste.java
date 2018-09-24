package ordenacaoIII;


public class Teste {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		Empresa.nome = "NITRONET INFORMATICA";
		Empresa.CNPJ = "30063856000177";
		
		Funcionario.metas = "ESCREVER ESSE PROGRAMA";
		Funcionario.salario = "100";
		
		Proprietario.gerenciamento = "SOCIO PROPRIETARIO";
		
		System.out.println("Nome da Empressa: " + Empresa.nome+ ", " + "CNPJ: " + Empresa.CNPJ);
		System.out.println("Meta para o Funcionario: " + Funcionario.metas + ", " + "Salario Mensal: " + Funcionario.salario);
		System.out.println("Jeovan F. Costa: " + Proprietario.gerenciamento);
		
		
	}

}
