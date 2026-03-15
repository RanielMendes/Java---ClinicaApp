package Model;

public class Paciente {

    String nome;
    int idade;
    String cpf;
    String sintoma;

    void exibirPaciente() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Sintoma: " + sintoma);
    }

    void agendarConsulta() {
        System.out.println("Consulta agendada para " + nome);
    }

    void realizarConsulta() {
        System.out.println("Consulta sendo realizada para " + nome);
    }

    void receberAlta() {
        System.out.println(nome + " recebeu alta.");
    }
}