package com.example.demospringbatch.listener;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demospringbatch.model.Person;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JobListener extends JobExecutionListenerSupport {


	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JobListener(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("===========================================================\n");
			log.info("The Job is over!! Check the results converted to uppercase:\n");
			log.info("===========================================================\n");

			jdbcTemplate
					.query("SELECT first_name, second_name, phone FROM person",
							(rs, row) -> new Person(rs.getString(1), rs.getString(2), rs.getString(3)))
					.forEach(person -> log.info("Record < " + person + " >"));
		}
	}

}
