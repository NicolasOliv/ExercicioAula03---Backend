/*
Modelo de domino do Projeto CTI Insights
Nesta etapa usamos os anos de experiencia para demonstrar um Setter com comparação numerica
 */

public class Consultor {

    // Emcapsulamento: os dados ficam protegidos
    private String codigo;
    private String nome;
    private int anosExperiencia;


    /*
     Construtor: Cria um consultor com os dados iniciais
      */
     public Consultor(String codigo, String nome, int anosExperiencia){
        setCodigo(codigo);
        setNome(nome);
        setAnosExperiencia(anosExperiencia);
     }

     public String getCodigo() {
        return codigo;
     }

     public void setCodigo(String codigo) {
        this.codigo = codigo;
    
     }

     public String getNome() {
        return nome;
     }

     public void setNome(String nome) {
        this.nome = nome;
     }

     public int getAnosExperiencia(){
        return anosExperiencia;
     }

     /*
     Setter com regra simoles: a experiencia não pode ser negativa
      */


     public void setAnosExperiencia(int anosExperiencia){
        if(anosExperiencia >=0){
            this.anosExperiencia = anosExperiencia;
        } else {
            System.out.println("Erro: anos de experiencia não podem ser negativos");
        }
        
}

public void exibirResumo() {
    System.out.println("\n --- Resumo do Consultor ---");
    System.out.println("Codigo: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("Anos de Experiencia: " + anosExperiencia);
} 
}