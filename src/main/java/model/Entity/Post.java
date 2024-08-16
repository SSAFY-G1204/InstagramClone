package model.Entity;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Post {
	@Id
	@Column(name="POST_ID")
	@GeneratedValue
	private Long postId;
	
	@Column(nullable=false)
	private Long imageId;
	
	private String content;
	
	@Column(nullable=false)
	private Long liking;
	
	@CreationTimestamp
	private LocalDateTime regDate;
	
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable = false)
	private User user;

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getLiking() {
		return liking;
	}

	public void setLiking(Long liking) {
		this.liking = liking;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
