import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição Curso JS");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição Mentoria Java");
		mentoria1.setData(LocalDate.now());
				
		/*System.out.println(curso1.toString());
		System.out.println(curso2.toString());		
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMichelle = new Dev();
		devMichelle.setNome("Michelle");
		devMichelle.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Michelle: " + devMichelle.getConteudosInscritos());
		devMichelle.progredir();
		devMichelle.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Michelle: " + devMichelle.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Michelle: " + devMichelle.getConteudosConcluidos());
		System.out.println("XP: " + devMichelle.calcularTotalXp());
		
		System.out.println("--------------------------------------------");
		
		Dev devPaulino = new Dev();
		devPaulino.setNome("Paulino");
		devPaulino.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Paulino: " + devPaulino.getConteudosInscritos());
		devPaulino.progredir();
		devPaulino.progredir();
		devPaulino.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Paulino: " + devPaulino.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Paulino: " + devPaulino.getConteudosConcluidos());
		System.out.println("XP: " + devPaulino.calcularTotalXp());
	}
	
}
