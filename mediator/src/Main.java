public class Main {
    public static void main(String[] args) {

        CentralAtendimentoClinica central = new CentralAtendimentoClinica();
        Recepcao recepcao = new Recepcao(central, "Recepção");
        Medico medico = new Medico(central, "Dr. Carlos");
        Enfermagem enfermagem = new Enfermagem(central, "Enfermagem");
        Laboratorio laboratorio = new Laboratorio(central, "Laboratório");
        Paciente paciente = new Paciente(central, "Davi");

        central.setRecepcao(recepcao);
        central.setMedico(medico);
        central.setEnfermagem(enfermagem);
        central.setLaboratorio(laboratorio);
        central.setPaciente(paciente);

        paciente.enviar("Cheguei para atendimento.");

        recepcao.enviar("Iniciando atendimento do paciente.");

        medico.enviar("Solicitando exames do paciente.");

        laboratorio.enviar("Exames realizados com sucesso.");

        enfermagem.enviar("Paciente preparado e liberado.");
    }
}