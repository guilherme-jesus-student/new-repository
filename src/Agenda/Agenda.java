import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Agendamento> agendamentos = new ArrayList<>();

    public void adicionarAgendamento(Agendamento agendamento){
        agendamentos.add(agendamento);
    }

    public void listarAgendamentos(){
        System.out.println("====AGENDAMENTOS=====");
        for(Agendamento a : agendamentos){
            a.mostrarAgendamento();
            System.out.println("-----------------------");
        }
    }

    public void cancelarPorHorario(String horario) {

        for (int i = 0; i < agendamentos.size(); i++) {

            if (agendamentos.get(i).getHorario().equals(horario)) {
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