package ktvolunteer.infra;

import ktvolunteer.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CommunityHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Community>> {

    @Override
    public EntityModel<Community> process(EntityModel<Community> model) {
        return model;
    }
}
