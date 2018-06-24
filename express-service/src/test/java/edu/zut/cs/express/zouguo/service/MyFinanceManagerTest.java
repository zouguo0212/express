package edu.zut.cs.express.zouguo.service;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.zouguo.daomain.MyFinance;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/6/24 14:09
 */

public class MyFinanceManagerTest extends GenericManagerTestCase<Long,MyFinance,MyFinanceManager> {

    MyFinanceManager myFinanceManager;

    @Autowired
    public void setMyFinanceManager(MyFinanceManager myFinanceManager){
        this.myFinanceManager = myFinanceManager;
        this.manager = this.myFinanceManager;
    }

    public MyFinanceManagerTest(){
        super(MyFinance.class);
    }

    @Before
    public void setup() throws Exception {
        /**
         * @author: Zouguo0212
         * @Description:
         * @Date: 2018/6/24 13:55
        */
        MyFinance myFinance = new MyFinance();
        myFinance.setId(1L);
        myFinance.setName("李四");
        myFinance.setSex("男");
        myFinance.setAge(25);
        myFinance.setBalance(5000);
        this.entity = this.manager.save(myFinance);
        System.out.println(this.entity);
    }

    @Test
    public void testFindByname(){
        /**
         * @author: Zouguo0212
         * @Description:
         * @Date: 2018/6/24 14:26
        */
        List<MyFinance> result = this.myFinanceManager.findByname("李");
        assertNotNull(result);
        System.out.println(result);
    }

    @Test
    public void testFindByid(){
        /**
         * @author: Zouguo0212
         * @Description:
         * @Date: 2018/6/24 14:36
        */
        List<MyFinance> result = this.myFinanceManager.findByid(1L);
        assertNotNull(result);
        System.out.println(result);
    }

    @Test
    public void testSave(){
        
    }
}
