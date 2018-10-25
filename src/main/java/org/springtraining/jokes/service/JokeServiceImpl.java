package org.springtraining.jokes.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes quotes;

	public JokeServiceImpl() {
		quotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}
}
