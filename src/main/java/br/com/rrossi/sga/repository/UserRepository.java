package br.com.rrossi.sga.repository;

import br.com.rrossi.sga.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByName(String name);
}
