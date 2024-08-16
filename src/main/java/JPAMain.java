import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.*;
import model.Entity.User;

public class JPAMain {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		//데이터베이스 커넥션받기
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			User member = new User();
			member.setName("Hellob");
			
			em.persist(member); // 저장
//			
//			User findMember = em.find(User.class, 1L); // 조회
//			System.out.printf("%d %s\n",findMember.getId(), findMember.getName());
			// 삭제 em.remove(findMember);
			// findMember.setName("HelloJPA"); // 수정 저장을 하지 않더라도 자동으로 업데이트됨
			
			//트랜잭션 커밋
			tx.commit();
		} catch(Exception e) {
			tx.rollback();
		} finally {
			em.close(); // 트랜잭션 수행을 다했다면 반드시 닫아줄것
		}
		
		emf.close();
	}

}
