package ordenacaoIII;

public class Funcionario {
		public static String metas;
		public static String salario;
		
		public static String getMetas() {
			return metas;
		}

		public static void setMetas(String metas) {
			Funcionario.metas = metas;
		}

		public static String getSalario() {
			return salario;
		}

		public static void setSalario(String salario) {
			Funcionario.salario = salario;
		}

		public void trabalhar() {
			System.out.println("O funcionarioesta Trabalhando como o esperado e cumprindo seus objetivos");
			
		}
	}

