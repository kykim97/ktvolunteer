package ktvolunteer.domain;

import ktvolunteer.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "matchingInfos",
    path = "matchingInfos"
)
public interface MatchingInfoRepository
    extends PagingAndSortingRepository<MatchingInfo, Long> {}
