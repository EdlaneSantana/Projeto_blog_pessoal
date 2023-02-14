//package com.blogpessoal.blogpessoal.Controller;
//
//
//import com.blogpessoal.blogpessoal.controller.PostagemController;
//import com.blogpessoal.blogpessoal.model.Usuario;
//import com.blogpessoal.blogpessoal.repository.PostagemRepository;
//import com.blogpessoal.blogpessoal.repository.UsuarioRepository;
//import com.blogpessoal.blogpessoal.service.UsuarioService;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class PostagemControllerTest {
//
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @Autowired
//    private PostagemController postagemController;
//
//    @Autowired
//    private PostagemRepository postagemRepository;
//
//    @Autowired
//    private UsuarioService usuarioService;
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//
//    @BeforeAll
//    void start(){
//        usuarioRepository.deleteAll();
//        usuarioService.cadastrarUsuario(new Usuario(0L, "Root", "root@root.com", "rootroot", " "));
//    }
//
//    @Test
//    @DisplayName("Logar na aplicação")
//    public void deveLogarNaAplicao(){
//        Optional<Usuario> usuarioCadastrado = usuarioService.cadastrarUsuario(new Usuario(0L, "Juliana Paes", "juliana_paes@email.com.br", "13465278", "https://i.imgur.com/JR7kUFU.jpg"));
//
//        HttpEntity<Usuario> corpoRequisicao = new HttpEntity<>(new Usuario("juliana_paes@email.com.br", "13465278" ));
//
//        ResponseEntity<String> resposta = testRestTemplate
//                .exchange("usuarios/logal", HttpMethod.POST, corpoRequisicao, String.class);
//
//
//        assertEquals(HttpStatus.);
//    }
//
//
//
//}
//