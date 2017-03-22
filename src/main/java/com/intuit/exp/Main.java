package com.intuit.exp;

import com.intuit.exp.types.AccountsJob;
import com.intuit.exp.types.Job;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/***
 *
 */
public class Main {

    static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        Job job = new AccountsJob("1", "2", "3", "4");
        String s = objectMapper.writeValueAsString(job);
        System.out.println(s);

        Job job1 = objectMapper.readValue(s, Job.class);
        System.out.println(job1);

    }
}
