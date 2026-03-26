public class Agendamento {

    private Cliente cliente;
    private Profissional profissional;
    private Servico servico;
    private String horario;

    public String getHorario() {//getHora servindo para retorna o valor do horario
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

//A classe Agendamento representa um horário marcado no sistema.
// Ela possui atributos que armazenam o cliente, o profissional, o serviço e o horário.
// Esses atributos são privados para garantir encapsulamento.
// A classe possui um construtor para inicializar os dados e um método que exibe as informações do agendamento."