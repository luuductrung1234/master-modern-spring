package com.learning.mastermodernspring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
    @Autowired
    JdbcConnection jdbcConnection;

    /**
     * @param jdbcConnection the jdbcConnection to set
     */
    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    /**
     * @return the jdbcConnection
     */
    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}