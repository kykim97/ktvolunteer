package ktvolunteer.domain;

import java.time.LocalDate;
import java.util.*;
import ktvolunteer.domain.*;
import ktvolunteer.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class MatchingEditted extends AbstractEvent {

    private Long matchingId;
    private Long userId;
    private Long associationId;
    private Address location;
    private String category;

    public MatchingEditted(MatchingInfo aggregate) {
        super(aggregate);
    }

    public MatchingEditted() {
        super();
    }
}
//>>> DDD / Domain Event
