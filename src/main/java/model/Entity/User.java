package model.Entity;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(name = "NAME_UNIQUE", columnNames = { "USER_NAME" }) })
public class User {
	@Id
	@Column(name="USER_ID")
	@GeneratedValue
	private Long userId;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, name = "USER_NAME")
	private String name;

	@Column(nullable = false)
	private String provider;

	private String profileImage;

	private String profileCtt;

	@Column(nullable = false)
	private Long followings;

	@Column(nullable = false)
	private Long followers;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getProfileCtt() {
		return profileCtt;
	}

	public void setProfileCtt(String profileCtt) {
		this.profileCtt = profileCtt;
	}

	public Long getFollowings() {
		return followings;
	}

	public void setFollowings(Long followings) {
		this.followings = followings;
	}

	public Long getFollowers() {
		return followers;
	}

	public void setFollowers(Long followers) {
		this.followers = followers;
	}

	public Long getUserId() {
		return userId;
	}
}
