package github.hacimertgokhan.mgmailservice.service;

import github.hacimertgokhan.mgmailservice.modal.User;
import github.hacimertgokhan.mgmailservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(String.valueOf(id))) {
            throw new IllegalArgumentException("User cannot found.");
        }
        userRepository.deleteById(String.valueOf(id));
    }
}
