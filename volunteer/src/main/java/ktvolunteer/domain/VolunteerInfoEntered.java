package ktvolunteer.domain;

import java.time.LocalDate;
import java.util.*;
import ktvolunteer.domain.*;
import ktvolunteer.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VolunteerInfoEntered extends AbstractEvent {

    private Long userId;
    private String name;
    private Date birth;
    private String tel;
    private Email email;
    private Photo profileImg;
    private String interest;
    private Date time;
    private Address location;

    public VolunteerInfoEntered(VolunteerInfo aggregate) {
        super(aggregate);
    }

    public VolunteerInfoEntered() {
        super();
    }
}
//>>> DDD / Domain Event
