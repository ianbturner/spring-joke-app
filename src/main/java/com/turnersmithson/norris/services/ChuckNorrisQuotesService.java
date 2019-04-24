package com.turnersmithson.norris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class ChuckNorrisQuotesService implements QuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuotesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
