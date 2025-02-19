package ktvolunteer.external;

import java.util.Date;
import lombok.Data;

@Data
public class 봉사활동정보 {

    private Long id;
    private Object place;
    private Date schedule;
    private String title;
    private Object associationInfoId;
}
