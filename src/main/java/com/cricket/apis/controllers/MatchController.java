package com.cricket.apis.controllers;

import com.cricket.apis.entities.Match;
import com.cricket.apis.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cricket")
public class MatchController {

    private MatchService matchService;
    public MatchController(MatchService matchService){
        this.matchService = matchService;
    }
    @CrossOrigin(origins = "https://cricket-geek-frontend-hm77.vercel.app")
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }
    @CrossOrigin(origins = "https://cricket-geek-frontend-hm77.vercel.app")
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }
    @CrossOrigin(origins = "https://cricket-geek-frontend-hm77.vercel.app")
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }


}
