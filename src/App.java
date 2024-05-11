import edu.dio.bootcamp.dominio.Conteudo;
import edu.dio.bootcamp.dominio.Curso;

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

    }
}
