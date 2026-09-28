package com.ai.agent.server.mcpserver.repository;

import com.ai.agent.server.mcpserver.domain.Refund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundRepository extends JpaRepository<Refund, Long> {
}
