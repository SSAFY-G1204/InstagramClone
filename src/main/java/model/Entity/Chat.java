package model.Entity;
import javax.persistence.*;

@Entity
public class Chat {
	@Id
	@GeneratedValue
	@Column(name="CHAT_ID")
	private Long chatId;
	
	@Column(nullable=false)
	private String content;
	
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="RECEIVE_USER_ID", nullable=false)
	private User receiveUser;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getReceiveUser() {
		return receiveUser;
	}

	public void setReceiveUser(User receiveUser) {
		this.receiveUser = receiveUser;
	}

	public Long getChatId() {
		return chatId;
	}
	
	
}
