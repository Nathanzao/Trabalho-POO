package Sistema;

public class Departamento {
    private int MAX; /*Quantidade maxima de funcionarios.*/
    private String codigo;
    private String nomeDepartamento;
    Funcionario[] funcinarios;



    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
}
