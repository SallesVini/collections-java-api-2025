package list.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {

        // Criando objetos a partir da classe Tarefa e adicionando as tarefas
        // ao objeto(lista) criado a partir da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // verificando se a lista criada ao criar o objeto new ListaTarefa()
        // esta vazia
        System.out.println(listaTarefa.obterNumeroTotalTarefas());


        // adicionando tarefas a lista de tarefas
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");

        // agora vamos verificar se o número de tarefas na lista mudou, quando adicionamos
        // uma nova tarefa
        System.out.println(listaTarefa.obterNumeroTotalTarefas());


        // removendo tarefas da lista
        listaTarefa.removerTarefa("Tarefa 3");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());


        // obter descrição da tarefa
        listaTarefa.obterDescricoesTarefas();
    }
}
