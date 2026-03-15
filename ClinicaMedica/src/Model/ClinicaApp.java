package Model;

public class ClinicaApp {

    String nomeClinica;
    String especialidade;
    int quantidadeConsultorios;

    void abrirClinica() {
        System.out.println("A clínica " + nomeClinica + " está aberta.");
    }

    void mostrarDadosClinica() {
        System.out.println("Nome da clínica: " + nomeClinica);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Quantidade de consultórios: " + quantidadeConsultorios);
    }

    void fecharClinica() {
        System.out.println("A clínica " + nomeClinica + " está fechada.");
    }

    public static void main(String[] args) {

        ClinicaApp clinica = new ClinicaApp();
        clinica.nomeClinica = "Vida Saudável";
        clinica.especialidade = "Clínica Geral";
        clinica.quantidadeConsultorios = 5;

        clinica.abrirClinica();
        clinica.mostrarDadosClinica();

        Paciente p1 = new Paciente();
        p1.nome = "Pedro";
        p1.idade = 50;
        p1.cpf = "12345678900";
        p1.sintoma = "Dor de cabeça";

        p1.exibirPaciente();
        p1.agendarConsulta();
        p1.realizarConsulta();
        p1.receberAlta();

        clinica.fecharClinica();
    }
}
