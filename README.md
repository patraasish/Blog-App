# Blogging Application

Welcome to the **Blogging Application**, a full-featured platform where users can share their thoughts by writing articles, comment on others' articles, like content, and follow other users. This application is built using **Spring Boot** and includes powerful features for a seamless blogging experience.

---

## Features

### User Management
- Create a new user account.
- Login functionality for authenticated access.
- User profiles showcasing bio and profile picture.

### Articles
- Write and publish articles with a title, subtitle, and tags.
- View articles with pagination and filtering options:
  - By tag: `/articles?tag=tag_name`
  - By author: `/articles?author=username`
  - Pagination: `/articles?page=3&size=10`
- Edit existing articles.

### Comments
- Post comments on articles.
- View all comments on a specific article.
- Delete comments by ID.

### Social Interactions
- Like articles.
- Follow other users.

---

## JSON Entities

### User
```json
{
  "id": 34,
  "username": "asish",
  "email": "asish@blog.com",
  "password": "xxxxxxxx",
  "authToken": "dakdflsjfkslfsldfkskldlfsf",
  "boi": "write really good articles",
  "image": "https://imagur.com/jksdk.png"
}
```

### Article
```json
{
  "id": 2,
  "title": "How the stock fell in 2022",
  "slug": "how-stock-market-fell-2022",
  "subtitle": "An article about how the stock market had a crash in 2022",
  "body": "This is an article about....<b>stock market</b>",
  "createdAt": "2024-02-06 03:40:55",
  "tags": ["finance", "stocks"]
}
```

### Comment
```json
{
  "id": 4,
  "title": "great article",
  "body": "this was a great article, loved reading it!",
  "createdAt": "2022-02-07 03:40:55"
}
```

---

## API Endpoints

### User Endpoints
- `POST /users` - Create a new user.
- `POST /users/login` - Login to the application.
- `GET /profiles/{username}` - Get user profile by username.

### Article Endpoints
- `GET /articles` - Get all articles with optional filters.
  - Filter by tag: `/articles?tag=tag_name`
  - Filter by author: `/articles?author=username`
  - Pagination: `/articles?page=3&size=10`
- `GET /articles/{article-slug}` - Get an article by its slug.
- `POST /articles` - Create a new article.
- `PATCH /articles/{article-slug}` - Edit an existing article.

### Comment Endpoints
- `GET /article/{article-slug}/comments` - Get all comments of an article.
- `POST /article/{article-slug}/comments` - Add a comment to an article.
- `DELETE /article/{article-slug}/comments/{comment-id}` - Delete a comment by ID.

---

## Dependencies

The following dependencies are required for this application:

- **Spring Boot DevTools**: For faster development.
- **Spring Configuration Processor**: To manage configurations easily.
- **Spring Web**: For building web applications.
- **Spring Data JPA**: To interact with the database using JPA.
- **H2 Database**: In-memory database for testing.
- **MySQL Driver**: For connecting to a MySQL database.

---

## Swagger

Use Swagger for API documentation and testing. Access the Swagger UI at:

[Swagger UI](http://localhost:8030/swagger-ui/index.html)

---


## Contribution

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push them to your fork.
4. Submit a pull request explaining your changes.

---

## Author

Developed by **Asish Patra**. Feel free to reach out for feedback or queries!

