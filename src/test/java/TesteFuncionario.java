import org.junit.Test;

public class TesteFuncionario {

	@Test
	public void test() {
		Funcionario nico = new Funcionario ();
		nico.setNome("Nico Steppat");
		nico.setCpf("12345678");
		nico.setSalario(2850);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
