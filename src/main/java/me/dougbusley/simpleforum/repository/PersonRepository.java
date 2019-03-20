package me.dougbusley.simpleforum.repository;

import me.dougbusley.simpleforum.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
