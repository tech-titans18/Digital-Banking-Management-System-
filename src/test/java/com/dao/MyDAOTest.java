package com.example.project.dao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyDAOTest {
    @Test
    void testFetchData() {
        MyDAO dao = new MyDAO();
        String result = dao.fetchData();
        assertEquals("Data from DAO", result);
    }
}
