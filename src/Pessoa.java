public abstract class Pessoa { //    Aqui eu estou Criando uma Classe

    private String nome;   // Aqui eu estou Criando um Atributo Da Classe
    private String telefone; // -------- Declarar

    public Pessoa(String nome, String telefone) {// Aqui é o Construtor
        this.nome = nome;// Thid é uma referencia ao objeto atual da classe, usada pa acessar atributos ou métodos do propio objeto
        this.telefone = telefone;
    }
    public String getNome() { //Aqui esse metotod (getNOme) permite ler o valor do atributo que no caso é o nome
        return nome;
    }
    public String getTelefone() {  //Aqui esse metotod (getTelefone) permite ler o valor do atributo que no caso é o nome
        return telefone;

    }
}
