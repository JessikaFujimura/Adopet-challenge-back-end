package com.br.Adopet_challenge_backend.service;

import com.br.Adopet_challenge_backend.dto.TutorDto;
import com.br.Adopet_challenge_backend.exception.NotFoundException;
import com.br.Adopet_challenge_backend.model.Tutor;
import com.br.Adopet_challenge_backend.repository.TutorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Tutor searchTutorById(Long id) {
        return tutorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Não encontrado"));
    }

    public List<Tutor> getAllTutors() {
       List<Tutor> tutors = tutorRepository.findAll();
       if (tutors.isEmpty()) {
           throw new NotFoundException("Não encontrado");
       }
       return tutors;
    }

    public Tutor updateTutor(TutorDto tutorDto) {
        Tutor entity = searchTutorById(tutorDto.getUidTutor());
        BeanUtils.copyProperties(tutorDto, entity);
        return tutorRepository.save(entity);
    }
}
