package at.fh.ima.swengs.bbleague.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.security.access.prepost.PreAuthorize; TODO: uncomment for basic auth

import java.util.List;
//@PreAuthorize("hasRole('ROLE_USER')") TODO: just uncomment for basic authentication
@RepositoryRestResource
public interface LeagueRepository extends PagingAndSortingRepository<League, Long> {

    //This would be exposed under the URL: http://localhost:8080/leagues/search/...
   public League findByName(@Param("name") String name);
   public List<League> findByLand(@Param("land") String land);
   public League findById(@Param("id") String id);


}
