/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ale.drogaria.util;

import ale.drogaria.util.HibernateUtil;
import org.junit.After;
import org.junit.Test;


/**
 *
 * @author matheus
 */
public class hibernateUtilTest {
    
    @Test
    public void conectar() {
        HibernateUtil.getSessionFactory().openSession();
    }
    
    @After
    public void close() {
                HibernateUtil.getSessionFactory().close();

    }
}
