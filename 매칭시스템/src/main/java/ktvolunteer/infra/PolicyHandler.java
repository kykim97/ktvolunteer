package ktvolunteer.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import ktvolunteer.config.kafka.KafkaProcessor;
import ktvolunteer.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MatchingInfoRepository matchingInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='VolunteerInfoEntered'"
    )
    public void wheneverVolunteerInfoEntered_Match(
        @Payload VolunteerInfoEntered volunteerInfoEntered
    ) {
        VolunteerInfoEntered event = volunteerInfoEntered;
        System.out.println(
            "\n\n##### listener Match : " + volunteerInfoEntered + "\n\n"
        );

        // Sample Logic //
        MatchingInfo.match(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
