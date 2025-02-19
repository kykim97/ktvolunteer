package ktvolunteer.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktvolunteer.domain.Matched;
import ktvolunteer.domain.MatchingComfirmed;
import ktvolunteer.domain.MatchingEditted;
import ktvolunteer.매칭시스템Application;
import lombok.Data;

@Entity
@Table(name = "MatchingInfo_table")
@Data
//<<< DDD / Aggregate Root
public class MatchingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matchingId;

    private Long userId;

    private Long associationId;

    @Embedded
    private Address location;

    private String category;

    @PostPersist
    public void onPostPersist() {
        Matched matched = new Matched(this);
        matched.publishAfterCommit();

        MatchingComfirmed matchingComfirmed = new MatchingComfirmed(this);
        matchingComfirmed.publishAfterCommit();

        MatchingEditted matchingEditted = new MatchingEditted(this);
        matchingEditted.publishAfterCommit();
    }

    public static MatchingInfoRepository repository() {
        MatchingInfoRepository matchingInfoRepository = 매칭시스템Application.applicationContext.getBean(
            MatchingInfoRepository.class
        );
        return matchingInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void match(VolunteerInfoEntered volunteerInfoEntered) {
        //implement business logic here:

        /** Example 1:  new item 
        MatchingInfo matchingInfo = new MatchingInfo();
        repository().save(matchingInfo);

        */

        /** Example 2:  finding and process
        

        repository().findById(volunteerInfoEntered.get???()).ifPresent(matchingInfo->{
            
            matchingInfo // do something
            repository().save(matchingInfo);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
