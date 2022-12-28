package com.test_ebean;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.ebean.annotation.Platform;
import io.ebean.dbmigration.DbMigration;

@SpringBootTest
public class MakeMigrations {
    @Test
    void contextLoads() {
        var dbMigration = DbMigration.create();
        dbMigration.setPlatform(Platform.SQLITE);
        // dbMigration.setPlatform(Platform.SQLITE);

        try {
            dbMigration.setName("add indexes to customer");
            dbMigration.generateMigration();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
