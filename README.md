# APRENDENDO-JAVA
Este repositório Java serve como uma "sandbox" para estudo, prototipagem e validação de algoritmos, sintaxe e bibliotecas. Focado nos pilares da POO, uso de pacotes, *Collections* e APIs sobre a JVM (JDK 17+), o espaço centraliza experimentos práticos com controle de versão via Git/GitHub antes da aplicação em projetos de produção.

//public static void main(String[] args) 
é o método principal de um programa Java. É por ele que a execução do programa começa.

Explicação de cada parte
public
Indica que o método pode ser acessado por qualquer classe.
A JVM precisa encontrá-lo para iniciar o programa.
static
Permite que o método seja executado sem criar um objeto da classe.
void
Significa que o método não retorna nenhum valor.
main
É o nome especial do método que a JVM procura para iniciar a execução.
String[] args
É um vetor (array) de textos.
Armazena argumentos que podem ser passados ao programa quando ele é executado.
Exemplo
public class Teste {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}

Quando o programa é executado, a JVM chama automaticamente o método main() e exibe:

Olá, mundo!

**Resumo rápido

Parte	=  Função
public	=  	Acesso livre ao método
static	=  	Pode ser executado sem criar objeto
void	=  	Não retorna valor
main	=  	Método principal do programa
String[] args	Recebe parâmetros de entrada