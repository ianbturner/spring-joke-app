package com.turnersmithson.norris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesService implements QuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    ChuckNorrisQuotesService()
    {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
