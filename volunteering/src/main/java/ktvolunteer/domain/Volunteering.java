package ktvolunteer.domain;

import ktvolunteer.domain.VolunteeringApplied;
import ktvolunteer.domain.VolunteeringEditted;
import ktvolunteer.domain.VolunteeringCanceled;
import ktvolunteer.VolunteeringApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="Volunteering_table")
@Data

//<<< DDD / Aggregate Root
public class Volunteering  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long volunteeringId;
    
    
    
    @Embedded
    private Address place;
    
    
    
    
    private Date schedule;
    
    
    
    
    private String title;
    
    
    
    
    private String category;
    
    
    
    
    private Integer personnel;

    @PostPersist
    public void onPostPersist(){
    봉사활동정보 봉사활동정보 = VolunteeringApplication.applicationContext
        .getBean(ktvolunteer.external.봉사활동정보Service.class)
        .봉사활동일정조회(get??);

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        ktvolunteer.external.  = new ktvolunteer.external.();
        // mappings goes here
        VolunteeringApplication.applicationContext.getBean(ktvolunteer.external.Service.class)
            .();


        VolunteeringApplied volunteeringApplied = new VolunteeringApplied(this);
        volunteeringApplied.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        ktvolunteer.external.  = new ktvolunteer.external.();
        // mappings goes here
        VolunteeringApplication.applicationContext.getBean(ktvolunteer.external.Service.class)
            .();


        VolunteeringEditted volunteeringEditted = new VolunteeringEditted(this);
        volunteeringEditted.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        ktvolunteer.external.  = new ktvolunteer.external.();
        // mappings goes here
        VolunteeringApplication.applicationContext.getBean(ktvolunteer.external.Service.class)
            .();


        VolunteeringCanceled volunteeringCanceled = new VolunteeringCanceled(this);
        volunteeringCanceled.publishAfterCommit();

    
    }

    public static VolunteeringRepository repository(){
        VolunteeringRepository volunteeringRepository = VolunteeringApplication.applicationContext.getBean(VolunteeringRepository.class);
        return volunteeringRepository;
    }






}
//>>> DDD / Aggregate Root
