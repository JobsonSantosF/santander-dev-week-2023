package dio.santanderdevweek2023.service;

import dio.santanderdevweek2023.dio.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
