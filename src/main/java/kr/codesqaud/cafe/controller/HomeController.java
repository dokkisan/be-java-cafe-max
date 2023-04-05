package kr.codesqaud.cafe.controller;

import kr.codesqaud.cafe.article.MemoryArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/"})
    public String home() {
        return "index";
    }
}
