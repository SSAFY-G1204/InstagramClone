package model.Entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Comments {
	@Id
	@Column(name="COMMENT_ID", nullable=false)
	@GeneratedValue
	private Long commentId;
	
	@Column(nullable=false)
	private String content;
	
	@CreationTimestamp
	private LocalDateTime regDate;
	
	@ManyToOne
	@JoinColumn(name="POST_ID", nullable=false)
	private Post post;
	
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable=false)
	private User user;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getCommentId() {
		return commentId;
	}
	
}
