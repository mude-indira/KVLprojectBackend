package com.studio.demo.repository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studio.demo.model.KvlModel;
import com.studio.demo.model.KvlModel1;

public interface BookingRepository extends JpaRepository<KvlModel1, Long> {
    Optional<KvlModel1> findByUsernameAndEventNameAndEventDate(String username, String eventName, String eventDate);


}
