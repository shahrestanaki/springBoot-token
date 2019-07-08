package com.service.entity;

import com.config.exception.AppException;
import com.config.Messages;
import com.model.entity.User;
import com.repository.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired(required = true)
    Messages msg;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void save(User user) {
        if (user.getUsername().equalsIgnoreCase("admin")) {
            throw new AppException(msg.messageFa("UserService.save.Username.notValid"));
        }
        if (user.getRules() == 0) {
            throw new AppException(msg.messageFa("UserService.save.Rules.notValid"));
        }
        user.setCreatedate(new Date());
        userRepository.save(user);
    }

    public void edit(User user) {
        if (user.getId() == null) {
            throw new AppException(msg.messageFa("UserService.edit.id.null"));
        }
        if (user.getRules() == 0) {
            throw new AppException(msg.messageFa("UserService.save.Rules.notValid"));
        }
        user.setChangedate(new Date());
        /////////user.setEdituser(); currentUser
        userRepository.updateEdit(user);
    }
}
