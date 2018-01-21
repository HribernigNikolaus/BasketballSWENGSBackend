package at.fh.ima.swengs.bbleague.model;

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface LeagueRepository extends PagingAndSortingRepository<League, Long> {

    //This would be exposed under the URL: http://localhost:8080/leagues/search/...
   public League findByName(@Param("name") String name);
   public List<League> findByLand(@Param("land") String land);
   public League findById(@Param("id") String id);


}
