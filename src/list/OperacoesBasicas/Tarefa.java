package list.OperacoesBasicas;

public class Tarefa {

    // Propriedades(valores) da classe Tarefa
    // Nessa classe Tarefa, só vamos ter a descrição da tarefa. Do que se trata a tarefa.
    private String descricao;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }


    // Métodos(funcionalidades) da classe Tarefa
    // Metodo Getter
    public String getDescricao() {
        return descricao;
    }

    // Sobrescrevendo o metodo toString
    // Para quando printarmos a descrição da tarefa, ela apaercer de fato a descrição formatada
    @Override
    public String toString() {
        return descricao;
    }
}
