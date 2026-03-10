public class Agendamento {

    private Cliente cliente;
    private Profissional profissional;
    private Servico servico;
    private String horario;

    public String getHorario() {
        return horario;
    }

    public Agendamento(Cliente cliente, Profissional profissional, Servico servico, String horario){
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
        this.horario = horario;
    }

    public void mostrarAgendamento(){
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Profissional: " + profissional.getNome());
        System.out.println("Serviço: " + servico.getNome());
        System.out.println("Horário: " + horario);
    }
}