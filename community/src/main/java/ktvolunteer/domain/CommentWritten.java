package ktvolunteer.domain;

import java.time.LocalDate;
import java.util.*;
import ktvolunteer.domain.*;
import ktvolunteer.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CommentWritten extends AbstractEvent {

    private Long communityId;
    private String title;
    private String content;
    private File addedFile;

    public CommentWritten(Community aggregate) {
        super(aggregate);
    }

    public CommentWritten() {
        super();
    }
}
//>>> DDD / Domain Event
