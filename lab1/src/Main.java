import java.util.UUID;

class User {
    UUID userId;
    String name;
    String email;
    String passwordHash;
    Role role;

    enum Role {
        USER, ADMIN
    }
}

class Book {
    UUID bookId;
    String title;
    int rating;
    int reviewCount;
    int publishedYear;
}

class Review {
    UUID reviewId;
    int rating;
    String comment;
    UUID userId;
    UUID bookId;
}

class UserBookStatus {
    UUID userId;
    UUID bookId;
    Status status;

    enum Status {
        READING, PLANNING, FINISHED
    }
}

class Author {
    UUID authorId;
    String name;
}

class BookAuthorTable {
    UUID bookId;
    UUID authorId;
}

class Genre {
    UUID genreId;
    String name;
}

class BookGenreTable {
    UUID bookId;
    UUID genreId;
}

class FriendshipTable {
    UUID userId;
    UUID friendId;
}