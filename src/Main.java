public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        try {
            executarSistema(agenda);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void executarSistema(Agenda agenda) {

        Cliente cliente = new Cliente("Guilherme", "117777777");
        Profissional prof = new Profissional("Ana", "118888888", "Manicure");
        Servico servico = new Servico("Unha", 50);

        Agendamento ag = new Agendamento(cliente, prof, servico,
                LocalDateTime.of(2026, 4, 1, 10, 0));

        agenda.adicionarAgendamento(ag);

        agenda.listarAgendamentos().forEach(System.out::println);
    }
}