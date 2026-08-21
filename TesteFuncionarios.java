public class TesteFuncionarios {
    public static void main(String[] academico) {
      
        gerente gerente = new gerente("Carlos Souza", 8500.0, "Tecnologia");

      
        gerente.calcularBonus();

     
        System.out.println("Nome: " + gerente.nome);
        System.out.println("Salário: R$ " + gerente.salario);
        System.out.println("Departamento: " + gerente.departamento);
    }
}