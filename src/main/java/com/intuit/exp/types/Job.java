package com.intuit.exp.types;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

/***
 *
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AccountsJob.class, name = "accountsJob"),
        @JsonSubTypes.Type(value = TransactionsJob.class, name = "transactionsJob")
})
public class Job {

}
