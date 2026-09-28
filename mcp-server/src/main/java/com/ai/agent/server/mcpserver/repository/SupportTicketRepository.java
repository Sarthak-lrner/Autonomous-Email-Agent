package com.ai.agent.server.mcpserver.repository;

import com.ai.agent.server.mcpserver.domain.SupportTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupportTicketRepository extends JpaRepository<SupportTicket, Long> {

    List<SupportTicket> findByCustomerEmailIgnoreCaseOrderByCreatedAtDesc(String email);
}
