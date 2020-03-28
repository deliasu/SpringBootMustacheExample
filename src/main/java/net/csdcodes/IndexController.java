package net.csdcodes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author csdcodes.net
 * @since 2020/3/29
 */
@Controller
public class IndexController {
    @GetMapping("/")
    private String index(Model model){
        model.addAttribute("name", "Mike");
        model.addAttribute("website", "csdcodes.net");
        return "index";
    }
}
