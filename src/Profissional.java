public class Profissional extends Pessoa {

    private String especialidade;

    public Profissional(String nome, String telefone, String especialidade) {
        super(nome, telefone);
        setEspecialidade(especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Especialidade não pode ser vazia");
        }
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Profissional: " + getNome() + " | Especialidade: " + especialidade;
    }
}