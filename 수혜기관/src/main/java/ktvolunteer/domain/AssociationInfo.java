package ktvolunteer.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktvolunteer.domain.AssociationInfoEntered;
import ktvolunteer.수혜기관Application;
import lombok.Data;

@Entity
@Table(name = "AssociationInfo_table")
@Data
//<<< DDD / Aggregate Root
public class AssociationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long associationId;

    @Embedded
    private Address address;

    private String tel;

    private Integer bizNumber;

    @Embedded
    private Email email;

    @PostPersist
    public void onPostPersist() {
        AssociationInfoEntered associationInfoEntered = new AssociationInfoEntered(
            this
        );
        associationInfoEntered.publishAfterCommit();
    }

    public static AssociationInfoRepository repository() {
        AssociationInfoRepository associationInfoRepository = 수혜기관Application.applicationContext.getBean(
            AssociationInfoRepository.class
        );
        return associationInfoRepository;
    }
}
//>>> DDD / Aggregate Root
