import java.util.ArrayList; //é uma implementacao da lista ,gerenciador da capacidade interna
import java.util.List; // Aqui eu tenho uma interface que representa  uma lista de objetos
//Eu importei List e ArrayList para armazenar os agendamentos dentro de uma lista dinâmica, seja ele faz uma busca super rapida nos agendamentos

public class Agenda { // Classe do sistema

    private List<Agendamento> agendamentos = new ArrayList<>();// Essa lista pode guarda varios objetos da classe
    //encapslameto com o private, interface List garantindo a Segurança dos tipos e o desacoplamento me deixando livre , <> sao os Generics , e por  fim instancio o ArrayList

    public void adicionarAgendamento(Agendamento agendamento){ // Criando um Metodo Agendamento esse metodo adiciona um agendamento
        agendamentos.add(agendamento);//Esse Metodo permite adionar ===== Agendamento agendamento recebe um metodo agendamento
    }

    public void listarAgendamentos(){ //  Metodo de Listagem,esse Metodo mostra todos agendamentos cadastrados
        System.out.println("====AGENDAMENTOS=====");
        for(Agendamento a : agendamentos){ // For each para percorrer os elementos da lista
            a.mostrarAgendamento();// aqui eu chamo um metodo da classe agendamento ===Ex Cliente -Profissional-Serviço- Horario
            System.out.println("-----------------------");
        }
        //Esse método percorre todos os agendamentos da lista e mostra suas informações no console
    }

    public void cancelarPorHorario(String horario) {

        for (int i = 0; i < agendamentos.size(); i++) { // o (i) me dar o local exato da lista

            if (agendamentos.get(i).getHorario().equals(horario)) {// Pega o objeto que esta na posicao -Chama o metodo dentro desses agendamentos - compara os horarios (Equals)
                agendamentos.remove(i);
                System.out.println("Agendamento cancelado com sucesso!");
                return;
            }
        }
        System.out.println("Horario invalido!");
    }
}



//src
// ├── Pessoa.java
// ├── Cliente.java
// ├── Profissional.java
// ├── Servico.java
// ├── Agendamento.java
// ├── Agenda.java
// └── Main.java

//private: Você está aplicando o Encapsulamento. Isso garante que a integridade da sua lista de agendamentos seja preservada, pois ela só será alterada por métodos que você definir (como adicionarAgendamento()), e não por qualquer outra classe.
//
//List: Você está praticando o Desacoplamento (ou "Programar para Interfaces"). Isso te dá liberdade. Se amanhã o salão mudar a regra e a List precisar vir de um banco de dados ou ser uma LinkedList, você só muda a instância, não o código todo.
//
//<> (Generics): Você está garantindo a Type Safety (Segurança de Tipos). Isso evita o famoso erro de "tentar colocar um parafuso numa caixa de ovos". O compilador te avisa na hora se você tentar guardar algo que não seja um Agendamento.
//
//new ArrayList<>(): Você está escolhendo a Implementação. Você optou pelo ArrayList porque ele é imbatível para leitura e busca (que é o que um salão mais faz: olhar a agenda).
//"A classe Agenda representa a agenda do sistema. Ela utiliza uma lista para armazenar vários objetos da classe Agendamento. A classe possui métodos para adicionar agendamentos, listar todos os agendamentos e cancelar um agendamento com base no horário."