package com.dias.workshop.services;

import com.dias.workshop.domain.Post;
import com.dias.workshop.domain.User;
import com.dias.workshop.dto.UserDTO;
import com.dias.workshop.repository.PostRepository;
import com.dias.workshop.repository.UserRepository;
import com.dias.workshop.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {


    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
