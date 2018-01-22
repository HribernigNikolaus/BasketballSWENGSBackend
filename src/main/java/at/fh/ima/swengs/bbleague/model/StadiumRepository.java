package at.fh.ima.swengs.bbleague.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.security.access.prepost.PreAuthorize; todo: uncomment for basic auth

import java.util.List;
//@PreAuthorize("hasRole('ROLE_USER')")TODO: just uncomment for basic authentication
@RepositoryRestResource
public interface StadiumRepository extends PagingAndSortingRepository<Stadium, Long> {

    //This would be exposed under the URL: http://localhost:8080/stadiums/search/...
  public  Stadium findByNameAndCity(@Param("name") String name, @Param("city") String city);
  public  List<Stadium> findByLandAndCity(@Param("land") String land, @Param("city")String city);

}
