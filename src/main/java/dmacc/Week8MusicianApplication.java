package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.RecordLabel;
import dmacc.beans.Musician;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MusicianRepository;

@SpringBootApplication
public class Week8MusicianApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(Week8MusicianApplication.class, args);
	}
	
	/*@Autowired
	MusicianRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Musician c = appContext.getBean("musician", Musician.class);
		c.setGenre("Rock");
		repo.save(c);
		
		//Create a bean to use - not managed by Spring
		Musician d = new Musician("Blink-182", "333-333-3333", "Punk");
		RecordLabel a = new RecordLabel("Geffen", "Hollywood,CA", "Interscope Records");
		d.setRecordLabel(a);
		repo.save(d);
		
		List<Musician> allMyMusicians = repo.findAll();
		for(Musician people: allMyMusicians) {
			System.out.println(people.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}*/

}