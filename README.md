<div align="center">
  <h1>📚 BookStore Backend & SwipeAI Companion</h1>
  <p>
    <strong>A modern, AI-powered backend for the 3D Real Book Reader and Swipe Books Application.</strong>
  </p>

  <!-- Badges -->
  <p>
    <img src="https://img.shields.io/badge/Java-17-orange.svg" alt="Java 17" />
    <img src="https://img.shields.io/badge/Spring%20Boot-3.3.2-brightgreen.svg" alt="Spring Boot 3.3.2" />
    <img src="https://img.shields.io/badge/Database-MySQL-lightgrey.svg" alt="MySQL" />
  </p>
</div>

---

## 📖 About The Project

Welcome to the **BookStore Backend**! This repository serves as the robust foundation powering a revolutionary reading experience. It is designed to support the **3D Swipe Books Reader**, bringing an editorial, physical-feeling reading sanctuary to your browser. 

Beyond serving books, this backend integrates the **SwipeAI Literary Companion**—an intelligent, state-aware chat interface powered by **LLM**. It allows readers to interact, ask contextual queries about their current reading, and get instant, intelligent responses, acting as a personal literary assistant.

---

## ✨ Key Functionality

*   **🤖 SwipeAI Literary Companion:** Powered by Spring AI and LLM models, providing a sophisticated, context-aware chatbot experience right alongside the book.
*   **📖 3D Book Reader Support:** Seamlessly serves PDF textures and book metadata to support a high-fidelity 3D book rendering frontend.
*   **🧠 Intelligent Vector Store Memory:** Ready for semantic search and conversational memory using Spring AI Vector Store integrations.
*   **💾 Robust Data Management:** Built on top of Spring Data JPA and MySQL for reliable, scalable book and user data persistence.

---

## 🛠️ Tech Stack

*   **Language:** Java 17
*   **Framework:** Spring Boot 3.3.2
*   **AI Integration:** Spring AI (LLM Starter)
*   **Database:** MySQL
*   **ORM:** Hibernate / Spring Data JPA
*   **Build Tool:** Maven

---

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

*   [Java Development Kit (JDK) 17](https://jdk.java.net/17/) or higher.
*   [Apache Maven](https://maven.apache.org/) (or use the included wrapper).
*   [MySQL Server](https://dev.mysql.com/downloads/mysql/) running locally.

### 1. Database Setup

Create a new MySQL database for the application:

```sql
CREATE DATABASE bookstore;
```

Make sure your database credentials match those in the configuration file, or update them accordingly.

### 3. Running the Application

Once your database and API keys are configured, run the application using Maven:

```bash
./mvnw spring-boot:run
```

The server will start, typically on `http://localhost:8080`.

---

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

<div align="center">
  <p>Built with ❤️ by the Swipe Books Team.</p>
</div>
