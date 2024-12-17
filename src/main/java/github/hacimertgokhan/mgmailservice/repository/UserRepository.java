package github.hacimertgokhan.mgmailservice.repository;

import github.hacimertgokhan.mgmailservice.modal.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("mongoUserRepository")
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}