package com.amdmeetup.demodocs.repository;

import com.amdmeetup.demodocs.entities.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

  List<Comment> findByUserId(@Param("userId") Long userId);

}
