package com.cricket.apis.services;

import com.cricket.apis.entities.Match;

import java.util.List;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();

    //getLiveMatches
    List<Match> getLiveMatches();

    //get points table
    List<List<String>> getPointTable();

}
