package model.Entity;

import javax.persistence.*;

@Entity
public class Relation {
	@GeneratedValue @Id 
	private Long relationId;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="FOLLOWING_ID")
	private User followers;

	public Long getRelationId() {
		return relationId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getFollowers() {
		return followers;
	}

	public void setFollowers(User followers) {
		this.followers = followers;
	}

}
