package com.jrt.jokesapp.service;

import com.jrt.jokesapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetRandomQuoteServiceImpl implements GetRandomQuoteService {

    public Joke GetRandomQuote() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        Joke joke = new Joke();
        joke.setJoke(chuckNorrisQuotes.getRandomQuote());
        return joke;
    }
}
