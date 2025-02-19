package ktvolunteer.domain;

import ktvolunteer.domain.PostWritten;
import ktvolunteer.domain.CommentWritten;
import ktvolunteer.domain.VolunteeringScheduleAnnounced;
import ktvolunteer.domain.EduFileUploaded;
import ktvolunteer.CommunityApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="Community_table")
@Data

//<<< DDD / Aggregate Root
public class Community  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long communityId;
    
    
    
    
    private String title;
    
    
    
    
    private String content;
    
    
    
    @Embedded
    private File addedFile;

    @PostPersist
    public void onPostPersist(){


        PostWritten postWritten = new PostWritten(this);
        postWritten.publishAfterCommit();



        CommentWritten commentWritten = new CommentWritten(this);
        commentWritten.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        ktvolunteer.external.  = new ktvolunteer.external.();
        // mappings goes here
        CommunityApplication.applicationContext.getBean(ktvolunteer.external.Service.class)
            .();


        VolunteeringScheduleAnnounced volunteeringScheduleAnnounced = new VolunteeringScheduleAnnounced(this);
        volunteeringScheduleAnnounced.publishAfterCommit();



        EduFileUploaded eduFileUploaded = new EduFileUploaded(this);
        eduFileUploaded.publishAfterCommit();

    
    }

    public static CommunityRepository repository(){
        CommunityRepository communityRepository = CommunityApplication.applicationContext.getBean(CommunityRepository.class);
        return communityRepository;
    }






}
//>>> DDD / Aggregate Root
