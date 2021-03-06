package com.amdmeetup.demodocs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
  @Id
  @GeneratedValue
  Long id;
  Long tweetId;
  Long userId;
  String content;
}
