package ktvolunteer.domain;

import java.time.LocalDate;
import java.util.*;
import ktvolunteer.domain.*;
import ktvolunteer.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VolunteeringCanceled extends AbstractEvent {

    private Long volunteeringId;
    private Address place;
    private Date schedule;
    private String title;
    private String category;
    private Integer personnel;

    public VolunteeringCanceled(Volunteering aggregate) {
        super(aggregate);
    }

    public VolunteeringCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
