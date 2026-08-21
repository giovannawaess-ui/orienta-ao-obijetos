
    public class Gerente extends Funcionario {
        String departamento;
    
        
        public Gerente(String nome, double salario, String departamento) {
            super(nome, salario); 
            this.departamento = departamento;
        }
    
        
        @Override
        public void calcularBonus() {
            System.out.println("Bônus do gerente: 20% do salário.");
        }
    }

