public class Main {

    public static void main(String[] args){
        System.out.println("=== CTI Insights Aula 04");

        // Etapa 1 criar um objeto da classe consultor

        // O objeto representa a pessoa responsavel pelo atendimento

        Consultor consultor = new Consultor(
            "CON-0095", "Daniel Vieira", 10);

        // Etapa 2 : Criar um objeto da classe Serviço

        // O serviço começa ativo porque é regra do cosntrutor

        Servico servico = new Servico(
            "SER-001", "Diagnostico de processo", "Analise dos processos iniciais da empresa");

        

        // Etapa 3 Criar um objeto da classe Cliente

        // O ultimo argumento é o objeto consultor criado na etapa 1
        // Assim o cliente fica ligado ao consultor responsavel


        Cliente cliente = new Cliente(
            "CTI-001", "Comercio", 1, "Entre R$ 1 e R$ 10 milhôes", consultor);

        


        // Etapa 4 Usar os gatters para consultar as informações

        System.out.println("\n--- Objetos criados ---");
        System.out.println("Codigo do cliente: " + cliente.getCodigoCti());
        System.out.println("Nome do consultor: " + consultor.getNome());
        System.out.println("Nome do servico: " + servico.getNome());


        // Etapa 5 testar um valor invalido no setter do cliente

        System.out.println("\n --- Teste de nivel invalido ---");
        cliente.setNivel(4);

        System.out.println("ivel mantido: " + cliente.getNivel());


        // Etapa 6 Testar um valor valido no Setter do cliente

        System.out.println("\n --- Teste de nivel valido ---");
        cliente.setNivel(2);
        System.out.println("Novo nível: " + cliente.getNivel());


        // Etapa 7 Tesar a regra do setter do Consultor
        // Anos de experiencia não podem ser negativos


        System.out.println("\n --- Teste de experiencia invalida ---");
        consultor.setAnosExperiencia(-2);
        System.out.println("Expriencia mantida: " + consultor.getAnosExperiencia() + "anos");

        // Etapa 8 : Testar os métodos de negocio da classe Serviço

        // Não usamos setAtivo, usamos ações com nomes claros 
        System.out.println("Serviço ativo no inicio ?" + servico.isAtivo());

        servico.desativar();
        System.out.println("Depois de ativar: " + servico.isAtivo());
        servico.ativar();
        System.out.println("Depois de ativar: " + servico.isAtivo());

        // Etapa 9 Criar um relatório com getters


        System.out.println("\n --- Relatório Final ---");
        System.out.println("Codigo CTI: " + cliente.getCodigoCti());
        System.out.println("Segmento" + cliente.getSegmento());
        System.out.println("Nivel: " + cliente.getNivel());
        System.out.println("Faixa de faturamento: " + cliente.getFaixaFaturamento());
        System.out.println("Consultor responsavel: " + cliente.getConsultorResponsavel().getNome());
        System.out.println("Serviço escolhido" + servico.getNome());
        System.out.println("Serviço ativo ? " + servico.isAtivo());

        System.out.println("\n Exemplo concluido");



    }



}
