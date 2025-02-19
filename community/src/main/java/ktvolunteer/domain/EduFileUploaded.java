package ktvolunteer.domain;

import java.time.LocalDate;
import java.util.*;
import ktvolunteer.domain.*;
import ktvolunteer.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class EduFileUploaded extends AbstractEvent {

    private Long communityId;
    private String title;
    private String content;
    private File addedFile;

    public EduFileUploaded(Community aggregate) {
        super(aggregate);
    }

    public EduFileUploaded() {
        super();
    }
}
//>>> DDD / Domain Event
