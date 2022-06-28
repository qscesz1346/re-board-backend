package io.cloudtype.waitlist.repository;

import io.cloudtype.waitlist.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
