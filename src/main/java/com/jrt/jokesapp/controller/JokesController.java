package com.jrt.jokesapp.controller;

import com.jrt.jokesapp.service.GetRandomQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private GetRandomQuoteService getRandomQuoteService;

    public JokesController(GetRandomQuoteService getRandomQuoteService) {
        this.getRandomQuoteService = getRandomQuoteService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {

        model.addAttribute("joke", getRandomQuoteService.GetRandomQuote());

        System.out.println(getRandomQuoteService.GetRandomQuote().getJoke());

        return "chucknorris";
    }
}
