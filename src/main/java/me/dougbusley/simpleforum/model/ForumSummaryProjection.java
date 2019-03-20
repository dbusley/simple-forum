package me.dougbusley.simpleforum.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "summary", types = Forum.class)
public interface ForumSummaryProjection {
  String getTopic();

  @Value("#{target.posts.size()}")
  Integer getPostCount();
}
