package ir.ac.iust.dml.kg.search.feedback.web.rest;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/feedback/")
@Api(tags = "feedback", description = "سرویس‌های بازخورد")
public class FeedbackRestServices {

  @RequestMapping(value = "/send", method = RequestMethod.GET)
  @ResponseBody
  public Boolean send() throws Exception {
    return true;
  }
}
