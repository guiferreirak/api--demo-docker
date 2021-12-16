package com.demo.docker.apidemodocker.entrypoints.http;

import com.demo.docker.apidemodocker.gateway.repository.LivroRepository;
import com.demo.docker.apidemodocker.gateway.repository.data.LivroDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LivroController {

    private final LivroRepository livroRepository;

    @GetMapping("livros")
    public List<LivroDocument> getLivros() {

        return livroRepository.findAll();
    }

    @PostMapping("livro")
    public List<LivroDocument> saveLivros(@RequestBody List<LivroDocument> livrosRequest) {

        return livroRepository.saveAll(livrosRequest);
    }
}
