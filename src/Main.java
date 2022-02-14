import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();
        dev1.setNome("Desenvolvedor Primeiro");
        dev2.setNome("Desenvolvedor Segundo");


        Cursos curso1 = new Cursos();
        Cursos curso2 = new Cursos();
        curso1.setTitulo("Java for WEB");
        curso2.setTitulo("Javascript for WEB");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setDescricao("Descrição do curso de Javascript");
        curso1.setCargaHoraria(6);
        curso2.setCargaHoraria(5);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Configuração de ambiente");
        mentoria.setDescricao("Descrição da mentoria de Configuração de ambiente");
        mentoria.setData(LocalDate.now());

        Questoes questao1 = new Questoes("Desafio 1: Criar uma Classe",0);
        Questoes questao2 = new Questoes("Desafio 2: Função para calcular área de um quadrilatero",1);
        Questoes questao3 = new Questoes("Desafio 3: Teste de esforço com equação de Fibonacci",2);
        questao1.setEnunciado("Enuciado da Questão 1 ");
        questao2.setEnunciado("Enuciado da Questão 2 ");
        questao3.setEnunciado("Enuciado da Questão 3 ");

        Desafios desafio1 = new Desafios();
        desafio1.setTitulo("Primeiro desafio de Java");
        desafio1.setDescricao("Descrição do Primeiro desafio");
        desafio1.getQuestoes().add(questao1);
        desafio1.getQuestoes().add(questao2);
        desafio1.getQuestoes().add(questao3);

        Set<Conteudos> conteudos = new LinkedHashSet<>();
        conteudos.add(curso1);
        conteudos.add(curso2);
        conteudos.add(mentoria);
        conteudos.add(desafio1);


        Bootcamp bootcamp1  = new Bootcamp("Java e Angular","Descrição do Bootacamp",45);
        bootcamp1.setConteudos(conteudos);

        dev1.inscreverBootcamp(bootcamp1);
        dev2.inscreverBootcamp(bootcamp1);

        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir("Resposta questão 1 do deafio 1");


        dev2.progredir();
        dev2.progredir();

        System.out.println("===== Dev 1 =====");
        System.out.println(dev1.getNome());
        System.out.println("Conteudos inscritos de "+dev1.getNome()+" = "+dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos de "+dev1.getNome()+" = "+dev1.getConteudosConcluidos());
        System.out.println("===== Desafio =====");
        System.out.println(dev1.getConteudosInscritos().stream().findFirst().get());

        System.out.println("===== Dev 2 =====");
        System.out.println(dev2.getNome());
        System.out.println("Conteudos inscritos de "+dev2.getNome()+" = "+dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos de "+dev2.getNome()+" = "+dev2.getConteudosConcluidos());
        System.out.println("===== Desafio =====");
        System.out.println(dev2.getConteudosInscritos().stream().findFirst().get());

    }
}
