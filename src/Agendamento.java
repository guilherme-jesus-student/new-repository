import java.time.LocalDateTime;

public class Agendamento {

    private Cliente cliente;
    private Profissional profissional;
    private Servico servico;
    private LocalDateTime horario;

    public Agendamento(Cliente cliente, Profissional profissional, Servico servico, LocalDateTime horario) {
        if (cliente == null || profissional == null || servico == null || horario == null) {
            throw new IllegalArgumentException("Dados do agendamento não podem ser nulos");
        }
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
        this.horario = horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Servico getServico() {
        return servico;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() +
                " | Profissional: " + profissional.getNome() +
                " | Serviço: " + servico.getNome() +
                " | Horário: " + horario;
    }
}