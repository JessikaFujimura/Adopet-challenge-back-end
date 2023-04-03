package com.br.Adopet_challenge_backend.controller;

import com.br.Adopet_challenge_backend.dto.TutorDto;
import com.br.Adopet_challenge_backend.model.Tutor;
import com.br.Adopet_challenge_backend.service.TutorService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutors")
public class TutorController {

    final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    @PostMapping
    public ResponseEntity<Tutor> createTutor(@RequestBody @Valid TutorDto tutorDto){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(tutorService.saveTutor(tutorDto));
    }

}
