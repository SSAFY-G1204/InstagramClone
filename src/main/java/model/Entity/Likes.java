package model.Entity;

import javax.persistence.*;

@Entity
public class Likes {
	@Id
	@GeneratedValue
	@Column(name="LIKE_ID")
	private Long likeId;
	
	@ManyToOne
	@JoinColumn(name="POST_ID",nullable=false)
	private Post post;
	
	@ManyToOne
	@JoinColumn(name="USER_ID",nullable=false)
	private User user;

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

	public Long getLikeId() {
		return likeId;
	}
}
