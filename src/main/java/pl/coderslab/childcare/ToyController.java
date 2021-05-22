package pl.coderslab.childcare;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/toy")
@RequiredArgsConstructor
public class ToyController {
    private final ToyRepository toyRepository;

    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("toys", toyRepository.findAll());
        return "/toys/all";
    }
}
