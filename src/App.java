import java.time.LocalDate;

import edu.dio.bootcamp.dominio.Bootcamp;
import edu.dio.bootcamp.dominio.Conteudo;
import edu.dio.bootcamp.dominio.Curso;
import edu.dio.bootcamp.dominio.Dev;
import edu.dio.bootcamp.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("Descrição Curso de java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de java 2");
        curso2.setDescricao("Descrição Curso de java 2");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da Mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println("Conteudos inscritos: " + dev1.getConteudoInscritos());
        System.out.println("Conteudos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("Total de XP: " + dev1.calcularTotalXp());

        System.out.println("=================================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos: " + dev2.getConteudoInscritos());        
        System.out.println("Conteudos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("Total de XP: " + dev2.calcularTotalXp());
    }
}
