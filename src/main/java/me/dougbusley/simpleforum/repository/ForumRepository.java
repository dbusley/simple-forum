package me.dougbusley.simpleforum.repository;

import me.dougbusley.simpleforum.model.Forum;
import me.dougbusley.simpleforum.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ForumRepository
    extends JpaRepository<Forum, Long>, QuerydslPredicateExecutor<Post> {}
