package com.test_ebean;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.ebean.migration.MigrationConfig;
import io.ebean.migration.MigrationRunner;

@SpringBootTest
public class Migrate {

    @Test
    void contextLoads() {
        var config = new MigrationConfig();
        config.setDbUsername("sa");
        config.setDbPassword("sa");
        config.setDbUrl("jdbc:sqlite:myapp");

        var runner = new MigrationRunner(config);
        runner.run();
    }
}
