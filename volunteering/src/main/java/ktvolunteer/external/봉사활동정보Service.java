package ktvolunteer.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "수혜기관", url = "${api.url.수혜기관}")
public interface 봉사활동정보Service {
    @GetMapping(path = "/봉사활동정보/{id}")
    public 봉사활동정보 봉사활동일정조회(@PathVariable("id") Long id);
}
