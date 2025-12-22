# ChatBot with Langchain4J, Spring Boot and AstraDB

This repository contains source code for the chatbot application, that can answer questions based on the information contained in a given vector DB.

It uses the LangChain4J framework to interact with OpenAI LLM, AstraDB to store the embeddings, and Spring Boot as the framework to create REST API.

You can find the application running against Ollama with Llama3 and PGVector Embedding store in the branch - `ollama_with_pgvector`

Here is the question I asked our application
```text
What is the moon ?
```

And here is the answer provided by our application
```text
**What is the moon?**

Moon is the Earth's only Satelite
