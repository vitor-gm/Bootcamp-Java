import br.com.java.poo.Bootcamp.Bootcamp;
import br.com.java.poo.Bootcamp.Curso;
import br.com.java.poo.Bootcamp.Dev;
import br.com.java.poo.Bootcamp.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Lógica", "Introdução lógica de programação!", 8);
        Curso curso2 = new Curso("Algoritmos", "Introdução algoritmos!", 10);
        Curso curso3 = new Curso("Estrutura de dados", "Introdução Estrutura de dados!",10);
        Mentoria mentoria1 = new Mentoria("GitHub", "Como se destacar no gitHub!");
        Mentoria mentoria2 = new Mentoria("Portifólio", "Como exibir seu conhecimento!");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Introdução ao Java!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriel");
        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setNome("Julianna");
        dev2.inscreverBootcamp(bootcamp);

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        dev1.progredir();



    }
}