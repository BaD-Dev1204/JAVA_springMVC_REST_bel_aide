package be.baddev.java_springmvc_rest_bel_aide.dal.repositories;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, UUID> {
}