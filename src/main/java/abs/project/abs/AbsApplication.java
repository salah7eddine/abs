package abs.project.abs;

import abs.project.abs.dao.EtudiantRepository;
import abs.project.abs.dao.FormationRepository;
import abs.project.abs.entities.Etudiant;
import abs.project.abs.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class AbsApplication implements CommandLineRunner {

	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private FormationRepository formationRepository;

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(AbsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Formation f1 = formationRepository.save(new Formation(null,"PHP",30,null));
		Formation f2 = formationRepository.save(new Formation(null,"JAVA",40,null));
		Formation f3 = formationRepository.save(new Formation(null,"Oracle",40,null));

		etudiantRepository.save(new Etudiant(null,"Abousaid","Hamza","ahamza@gmail.com",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Abousaid","meryem","ameryem@gmail.com",new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"Abousaid","salah","asalah@gmail.com",new Date(),f3));
		etudiantRepository.save(new Etudiant(null,"Abousaid","wissam","awissam@gmail.com",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Abousaid","youness","ayouness@gmail.com",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Abousaid","hiba","ahiba@gmail.com",new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"Abousaid","Sirine","asirine@gmail.com",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Abousaid","Mona","amona@gmail.com",new Date(),f3));
	}
}
