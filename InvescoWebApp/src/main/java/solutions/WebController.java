package solutions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @RequestMapping("/index")
    public String greeting(@RequestParam(value="name", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
    
    @RequestMapping("/bonds")
    public String index(@RequestParam(value="name", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "bonds";
    }

}
 	