package dao;
//import static org.junit.Assert.*;
//

import cn.team.dao.UserDAO;
import cn.team.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDAOTest {
   @Autowired
   private UserDAO userDAO;
   @Test
   public void testQueryUser() throws Exception {
       String name = "chris";
       String password = "123";
       User user = userDAO.queryUser(name, password);
       System.out.println(user);
       name = "usertest";
       user = userDAO.queryUser(name, password);
       System.out.println(user);
   }
//
//    @Test
//    public void testQueryUserByName() throws Exception {
//        String name = "chris";
//        User user = userDAO.queryUserByName(name);
//        assertNotNull(user);
//        System.out.println(user);
//        name = "jkasdhfjkashd";
//        user = userDAO.queryUserByName(name);
//        assertNull(name + " exists!", user);
//    }
//
//    @Test
//    public void testInsertUser() throws Exception {
////        String name = "李四";
////        String password = "123456";
////        userDAO.insertUser(name, password);
////        User user = userDAO.queryUser(name, password);
////        System.out.println(user);
//    }
//
}