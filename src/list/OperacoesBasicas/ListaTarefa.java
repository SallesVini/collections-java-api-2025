package list.OperacoesBasicas;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Propriedades(valores) da classe ListaTarefa
    // Essa classe ela tem um atributo(propriedade) chamado ListaTarefa
    // que é uma lista, e essa lista vai ser do tipo Tarefa(da classe Tarefa)
    // Porque vamos armazenar nessa lista tarefas
    private List<Tarefa> tarefalist;

    // Construtor
    // E vamos criar esse construtor para que: sempre que instanciarmos(criarmos)
    // um objeto a partir dessa classe ListaTarefa, o construtor crie nesse objeto
    // uma lista vazia, esperando para adicionarmos tarefas nela

    // E o que vamos fazer é: a partir do momento que instanciarmos(criarmos) um objeto
    // a partir dessa classe, queremos que o construtor crie uma lista vazia para o objeto
    // com ArrayList. E a lista fique, esperando a gente passar tarefas para ela
    // Então sempre que eu criar um objeto do tipo ListaTarefa automaticamente esse objeto
    // já terá uma lista vazia esperando ser passado tarefas
    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }


    // Métodos(funcionalidades) da classe ListaTarefa
    // Metodo para adicionar tarefa
    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    // Metodo para remover tarefa
    // Como ArrayList aceita elementos repetidos, podemos esta querendo remover um elemento
    // que esteja repetido dentro da lista, por isso vamos criar aqui uma lista contendo
    // esses elementos que queremos remover, e vamos com um laço removendo todos eles
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefalist) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                // e estamos, adicionando na lista tarefasParaRemover as tarefas(t)
                // que são iguais a descrição e que são as que queremos remover
                tarefasParaRemover.add(t);
            }
        }
        // E como o removeAll() recebe uma coleção(uma lista). Vamos passar para ele
        // a lista tarefasParaRemover que contem os itens a serem removidos
        // e o removeAll() vai remover todos esses itens
        tarefalist.removeAll(tarefasParaRemover);
    }

    // Metodo para obter o numero total de tarefas
    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    // Metodo para obter as descricoes das tarefas
    // Vai exibir a lista de tarefas
    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }
}
