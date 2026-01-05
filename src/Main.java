import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", "Introdução à programação em Java", 40);
        Curso curso2 = new Curso("Java Avançado", "Conceitos avançados de Java", 60);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Sessão de mentoria para desenvolvedores Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}