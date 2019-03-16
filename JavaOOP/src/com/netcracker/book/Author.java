package com.netcracker.book;

import java.util.Objects;

public class Author {
    String name;
    String email;
    char gender;


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;
        return author.name.equals(this.name) && author.email.equals(this.email) && author.gender == this.gender;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + gender;
        return result;
    }
}
