package com.demo.docker.apidemodocker.gateway.repository.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "livro")
public class LivroDocument {

    @Id
    private String codigo;

    private String nome;

    private BigDecimal preco;
}
