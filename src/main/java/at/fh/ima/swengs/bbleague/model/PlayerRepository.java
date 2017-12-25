package at.fh.ima.swengs.bbleague.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {

        //This would be exposed under the URL: http://localhost:8080/passengers/search/findByFirstNameAndLastName
        public List<Player> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName")String lastName);

}
