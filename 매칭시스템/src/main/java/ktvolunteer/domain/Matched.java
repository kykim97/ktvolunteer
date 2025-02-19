package ktvolunteer.domain;

import java.time.LocalDate;
import java.util.*;
import ktvolunteer.domain.*;
import ktvolunteer.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Matched extends AbstractEvent {

    private Long matchingId;
    private Long userId;
    private Long associationId;
    private Address location;
    private String category;

    public Matched(MatchingInfo aggregate) {
        super(aggregate);
    }

    public Matched() {
        super();
    }
}
//>>> DDD / Domain Event
