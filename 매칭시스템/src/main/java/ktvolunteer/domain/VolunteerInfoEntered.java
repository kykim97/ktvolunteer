package ktvolunteer.domain;

import java.util.*;
import ktvolunteer.domain.*;
import ktvolunteer.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class VolunteerInfoEntered extends AbstractEvent {

    private Long userId;
    private String name;
    private Date birth;
    private String tel;
    private Object email;
    private Object profileImg;
    private String interest;
    private Date time;
    private Object location;
}
