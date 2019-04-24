package com.turnersmithson.norris.controllers;

import com.turnersmithson.norris.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jokes {

    private QuoteService quoteService;

    @Autowired
    public Jokes(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping({ "/", ""})
    public String getJoke( Model model )
    {
        model.addAttribute("joke", quoteService.getRandomQuote());
        return "chucknorris";
    }
}
