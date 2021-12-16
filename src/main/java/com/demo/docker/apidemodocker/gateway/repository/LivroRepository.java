package com.demo.docker.apidemodocker.gateway.repository;

import com.demo.docker.apidemodocker.gateway.repository.data.LivroDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends MongoRepository<LivroDocument, String> {
}
