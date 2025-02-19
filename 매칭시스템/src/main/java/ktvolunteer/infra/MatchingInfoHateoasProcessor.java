package ktvolunteer.infra;

import ktvolunteer.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MatchingInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MatchingInfo>> {

    @Override
    public EntityModel<MatchingInfo> process(EntityModel<MatchingInfo> model) {
        return model;
    }
}
