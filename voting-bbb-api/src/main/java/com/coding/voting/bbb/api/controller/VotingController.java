package com.coding.voting.bbb.api.controller;

import com.coding.voting.bbb.api.model.ParticipantModel;
import com.coding.voting.bbb.api.service.VotingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voting")
@AllArgsConstructor
public class VotingController {

    private final VotingService votingService;

    @PostMapping
    public ResponseEntity<String> vote(@RequestBody ParticipantModel participantModel) {
        votingService.addEvent(participantModel);
        return ResponseEntity.ok("computed vote");
    }
}
