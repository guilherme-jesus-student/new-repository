public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Mãe", "119999999");
        Profissional prof = new Profissional("Ana Karina", "118888888", "Manicure");
        Servico servico = new Servico("Unha em gel", 80);

        Cliente cliente2 = new Cliente("Guilherme", "117777777");
        Profissional prof2 = new Profissional("Ana Karina", "116666666", "Manicure");
        Servico servico2 = new Servico("Manicure", 50);


        Agendamento ag = new Agendamento(cliente, prof, servico, "10:00");
        Agendamento ag2 = new Agendamento(cliente2, prof2, servico2, "11:00");
        Agenda agenda = new Agenda();

        agenda.adicionarAgendamento(ag);
        agenda.adicionarAgendamento(ag2);

        agenda.cancelarPorHorario("10:00");

        agenda.listarAgendamentos();
    }
