package poo.projeto.dominio.FakeDB;

import poo.projeto.dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina>{

    @Override
    protected void CarregarDados() { // codigo 600 a 700 -> Disciplinas
        this.lista.add(new Disciplina(601, "Arquitetura de Computadores", "História dos computadores, Arquitetura de Von Neumann, microprocessadores"));
        this.lista.add(new Disciplina(602, "Lógica Computacional", "Conceito e história de lógica, Operadores lógicos"));
        this.lista.add(new Disciplina(603, "Sistemas de Computação e Informação", "História dos sistemas de computação, Frameworks, ferramentas de desenvolvimento"));// 1 periodo
        this.lista.add(new Disciplina(604, "Algoritmos e Lógica de Programação", "Comandos básicos, Estruturas de decisão e repetição, Funções"));
        this.lista.add(new Disciplina(605, "Modelagem de dados", "Introdução ao modelo Entidade Relacionamento, Modelo Físico, Relações entre entidades"));
        this.lista.add(new Disciplina(606, "Matemática Discreta", "Funções de primeiro e segundo grau, Logaritmo, Combinações e Arranjos")); // 2 periodo
        this.lista.add(new Disciplina(607, "Algoritmo e Estrutura de dados", "Listas encadeadas, pilhas, filas, hash table"));
        this.lista.add(new Disciplina(608, "Redes de Computadores", "Ipv4, Ipv6, Redes Locais, Endereços IP"));
        this.lista.add(new Disciplina(609, "Engenharia de Softwares", "Vida Útil do Software, Métodos Ágeis, Certificações de qualidade"));// 3 periodo
        this.lista.add(new Disciplina(610, "Programação Orientada a Objetos", "Pilares de POO, Objetos, Classes, Listas, Programação em Camadas"));
        this.lista.add(new Disciplina(611, "Sistemas de Telecomunicação", "Antenas e Receptores, Fibra Óptica, Frequência das Ondas, Atenuação do Sinal"));
        this.lista.add(new Disciplina(612, "Algoritmo e Estrutura de Dados Avançado", "Listas, Pilhas, Filas, Funções Recursivas, Manipulação de Arquivos, Métodos de Ordenação"));// 4 periodo
        this.lista.add(new Disciplina(613, "Compiladores", "Tradução do código para binário"));
        this.lista.add(new Disciplina(614, "Programação em Banco de Dados", "Linguagem SQL, Principais Bancos de dados, Transição do modelo Físico para o Banco de dados"));
        this.lista.add(new Disciplina(615, "Computação Gráfica", "Geração de imagens através de algoritmos")); // 5 periodo
        this.lista.add(new Disciplina(616, "Programação Orientada a Objetos II", "Aprofundamento dos conceitos aprendidos em POO, com foco em projetos reais"));
        this.lista.add(new Disciplina(617, "Sistemas Embarcados", "Estudo e configuração de sistemas embarcados"));
        this.lista.add(new Disciplina(618, "Internet das Coisas", "Estudo do conceito de internet das coisas, conhecido como IOT, cada vez mais presente no cotidiano")); // 6 periodo
        this.lista.add(new Disciplina(619, "Fundamentos da Inteligência Artificial", "Estudo dos principais conceitos de inteligência artificial, além de suas aplicações"));
        this.lista.add(new Disciplina(620, "Estágio Obrigatório", "Estágio realizado pelo aluno, cumprindo uma carga horária definida"));
        this.lista.add(new Disciplina(621, "Analise de Complexidade de Algoritmos", "Analisar e Calcular a complexidade de algoritmos através de diversos fatores, como tempo de execução")); // 7 periodo
        this.lista.add(new Disciplina(622, "Trabalho de Conclusão de Curso", "Trabalho realizado pelos alunos do curso, que deve ser defendido e avaliado pela banca"));
        this.lista.add(new Disciplina(623, "Computação em Nuvem", "Estudo e aplicação do conceito de Computação na nuvem"));
        this.lista.add(new Disciplina(624, "Sistemas Distribuidos", "Aplicação dos conceitos aprendidos em Sistemas Operacionais, para a utilização dos Sistemas distribuidos em diversos cenários")); // 8 periodo
       
    }
    public DisciplinaFakeDB(){
        super();
    }
}
