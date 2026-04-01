import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Agendamento> agendamentos = new ArrayList<>();

    public void adicionarAgendamento(Agendamento agendamento) {
        if (agendamento == null) {
            throw new IllegalArgumentException("Agendamento não pode ser nulo");
        }

        for (Agendamento a : agendamentos) {
            if (a.getHorario().equals(agendamento.getHorario())) {
                throw new IllegalArgumentException("Já existe agendamento nesse horário");
            }
        }

        agendamentos.add(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return agendamentos;
    }

    public boolean cancelarPorHorario(LocalDateTime horario) {
        return agendamentos.removeIf(a -> a.getHorario().equals(horario));
    }
}