package me.dougbusley.simpleforum.repository;

import me.dougbusley.simpleforum.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Long> {}
