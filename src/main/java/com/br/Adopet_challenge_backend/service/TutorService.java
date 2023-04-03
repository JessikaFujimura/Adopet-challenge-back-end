package com.br.Adopet_challenge_backend.service;

import com.br.Adopet_challenge_backend.dto.TutorDto;
import com.br.Adopet_challenge_backend.model.Tutor;
import com.br.Adopet_challenge_backend.repository.TutorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public Tutor saveTutor(TutorDto tutorDto) {
        Tutor entity = new Tutor();
        BeanUtils.copyProperties(tutorDto, entity);
        return tutorRepository.save(entity);
    }
}
