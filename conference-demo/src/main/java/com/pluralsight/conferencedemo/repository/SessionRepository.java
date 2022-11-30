package com.pluralsight.conferencedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
