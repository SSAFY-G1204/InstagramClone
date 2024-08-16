package model.Entity;

import javax.persistence.*;

@Entity
public class Media {
	@Id
	@Column(name="MEDIA_ID")
	@GeneratedValue
	private Long mediaId;
	
	@ManyToOne
	@JoinColumn(name="POST_ID")
	private Post post; 
	
	private String imageSrc;
	
	public Long getMediaId() {
		return mediaId;
	}

	public void setMediaId(Long mediaId) {
		this.mediaId = mediaId;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
}
