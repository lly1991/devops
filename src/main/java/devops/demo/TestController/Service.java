package devops.demo.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/css")
public class Service
{
    @RequestMapping("/index")
    @ResponseBody
    public String index(){

        return "hellosssssssssss";
    }
}
