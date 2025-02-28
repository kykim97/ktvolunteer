package ktvolunteer.domain;

import java.util.Date;
import java.util.List;
import ktvolunteer.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "봉사활동정보",
    path = "봉사활동정보"
)
public interface 봉사활동정보Repository
    extends PagingAndSortingRepository<봉사활동정보, Long> {}
