package me.dougbusley.simpleforum.repository;

import me.dougbusley.simpleforum.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {}
