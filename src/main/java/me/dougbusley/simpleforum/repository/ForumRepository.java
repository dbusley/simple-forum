package me.dougbusley.simpleforum.repository;

import me.dougbusley.simpleforum.model.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Forum, Long> {}
