package com.langchain.rag.chatbot;

import dev.langchain4j.chain.ConversationalRetrievalChain;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class ChatController {

    private final ConversationalRetrievalChain conversationalRetrievalChain;

    @PostMapping
    public String chatWithPdf(@RequestBody String text) {
        var answer = conversationalRetrievalChain.execute(text);
        log.debug("Answer is - {}", answer);
        return answer;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
