package abs.project.abs.dao;

import abs.project.abs.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    /*@Query("select p from Etudiant e where e.nom like :x")
    public List<Etudiant> chercher(@Param("x") String nom);*/

    public List<Etudiant> findByFirstNameContains(String lastName);
}
