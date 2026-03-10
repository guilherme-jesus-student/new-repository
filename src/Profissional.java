public class Profissional extends  Pessoa{

    private String especialidade;

    public Profissional(String nome,String telefone,String especialidade){
        super(nome,telefone);
        this.especialidade=especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
