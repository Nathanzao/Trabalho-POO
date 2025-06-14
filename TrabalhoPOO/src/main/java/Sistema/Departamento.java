package Sistema;

public class Departamento {
    private String codigo;
    private String nome;
    private int MAX = 5;
    private int cont = 0;
    private Funcionario[] funcionarios = new Funcionario[MAX];

    public Departamento(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario f){
        if(cont < MAX){
            funcionarios[cont] = f;
            cont++;
        }else{
            System.out.println("Limite de funcionários atingido.");
        }
    }

    public void listarFuncionarios(){
        for(int i = 0; i < cont; i++){
            System.out.println(funcionarios[i]);
        }
    }

    public double gastoTotal(){
        double total = 0;
        for(int i = 0; i < cont; i++){
            total += funcionarios[i].calcularSalario();
        }
        return total;
    }

    public Funcionario BuscarFuncionarioPorCodigo(String cod){
        int i = 0;

        while(i < cont){
            if(funcionarios[i].getCodigo().equals(cod)){
                return funcionarios[i];
            }
        }

        return null;
    }

    public void ExibirFuncionariosFaixa(double a, double b){
        int i = 0;

        System.out.println("Exibindo funcionarios com salario entre " + a + " e " + b + ": ");
        while(i < cont){
            if((funcionarios[i].getSalario() >= a) && (funcionarios[i].getSalario() <= b)){
                funcionarios[i].info();
            }
        }
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCont(){
        return cont;
    }

}
