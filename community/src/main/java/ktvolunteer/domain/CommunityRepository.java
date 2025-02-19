package ktvolunteer.domain;

import ktvolunteer.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "communities",
    path = "communities"
)
public interface CommunityRepository
    extends PagingAndSortingRepository<Community, Long> {}
