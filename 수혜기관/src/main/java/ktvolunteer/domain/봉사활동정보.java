package ktvolunteer.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktvolunteer.domain.봉사활동일정등록됨;
import ktvolunteer.수혜기관Application;
import lombok.Data;

@Entity
@Table(name = "봉사활동정보_table")
@Data
//<<< DDD / Aggregate Root
public class 봉사활동정보 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Address place;

    private Date schedule;

    private String title;

    @Embedded
    private AssociationInfoId associationInfoId;

    @PostPersist
    public void onPostPersist() {
        봉사활동일정등록됨 봉사활동일정등록됨 = new 봉사활동일정등록됨(this);
        봉사활동일정등록됨.publishAfterCommit();
    }

    public static 봉사활동정보Repository repository() {
        봉사활동정보Repository 봉사활동정보Repository = 수혜기관Application.applicationContext.getBean(
            봉사활동정보Repository.class
        );
        return 봉사활동정보Repository;
    }
}
//>>> DDD / Aggregate Root
