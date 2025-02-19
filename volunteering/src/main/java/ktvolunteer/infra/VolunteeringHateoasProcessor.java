package ktvolunteer.infra;

import ktvolunteer.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VolunteeringHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Volunteering>> {

    @Override
    public EntityModel<Volunteering> process(EntityModel<Volunteering> model) {
        return model;
    }
}
