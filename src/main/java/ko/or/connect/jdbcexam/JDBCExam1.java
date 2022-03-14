package ko.or.connect.jdbcexam;

import java.util.List;

import ko.or.connect.jdbcexam.dao.RoleDao;
import ko.or.connect.jdbcexam.dto.Role;

public class JDBCExam1 {
public static void main(String[] args) {
	Role role123 = new Role(1,"asd");
	RoleDao dao = new RoleDao();
	dao.addRole(role123);
	
	
	System.out.print(dao.zoo(1000));
	
	
/*	List<Role> list = dao.getRoles();
	for (Role role : list) {
		System.out.println(role);
	}*/

}
}
