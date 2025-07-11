package com.uwu.QBitAuth.config;

import org.hibernate.boot.model.FunctionContributions;
import org.hibernate.boot.model.FunctionContributor;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Component;

/**
 * Configures custom Hibernate functions.
 * This class implements {@link FunctionContributor} to register custom SQL functions
 * that can be used in JPQL or Criteria queries.
 */
@Component
public class DatabaseConfig implements FunctionContributor {

    /**
     * Contributes the custom "regexp" function to Hibernate's function registry.
     * This allows the use of the REGEXP operator in JPQL queries, which is supported by SQLite.
     *
     * @param functionContributions The registry for custom function contributions.
     */
    @Override
    public void contributeFunctions(FunctionContributions functionContributions) {
        functionContributions.getFunctionRegistry().registerPattern(
            "regexp",
            "?1 REGEXP ?2",
            functionContributions.getTypeConfiguration().getBasicTypeRegistry().resolve(StandardBasicTypes.BOOLEAN)
        );
    }
}
