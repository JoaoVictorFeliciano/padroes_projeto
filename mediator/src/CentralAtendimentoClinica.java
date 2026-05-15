public class CentralAtendimentoClinica implements MediadorClinica {

    private Recepcao recepcao;
    private Medico medico;
    private Enfermagem enfermagem;
    private Laboratorio laboratorio;
    private Paciente paciente;

    public void setRecepcao(Recepcao recepcao) {
        this.recepcao = recepcao;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setEnfermagem(Enfermagem enfermagem) {
        this.enfermagem = enfermagem;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public void enviarMensagem(String mensagem, Participante remetente) {
        System.out.println("CENTRAL DE ATENDIMENTO");
        System.out.println("Mensagem recebida de " + remetente.nome + ": " + mensagem);

        if (remetente instanceof Paciente) {
            recepcao.receber("Paciente chegou para atendimento.");

        } else if (remetente instanceof Recepcao) {
            medico.receber("Paciente encaminhado para consulta.");

        } else if (remetente instanceof Medico) {
            enfermagem.receber("Preparar paciente para exame.");
            laboratorio.receber("Realizar exame solicitado pelo médico.");

        } else if (remetente instanceof Laboratorio) {
            medico.receber("Resultado do exame disponível.");

        } else if (remetente instanceof Enfermagem) {
            recepcao.receber("Paciente preparado e atendimento finalizado.");
        }
    }
}