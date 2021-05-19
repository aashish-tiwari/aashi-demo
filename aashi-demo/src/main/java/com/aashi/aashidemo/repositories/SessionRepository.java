package com.aashi.aashidemo.repositories;

import com.aashi.aashidemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
