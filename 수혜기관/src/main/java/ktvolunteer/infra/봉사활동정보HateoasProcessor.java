package ktvolunteer.infra;

import ktvolunteer.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 봉사활동정보HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<봉사활동정보>> {

    @Override
    public EntityModel<봉사활동정보> process(EntityModel<봉사활동정보> model) {
        return model;
    }
}
