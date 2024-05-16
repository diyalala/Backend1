package com.example.demo.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FutsalRepository extends JpaRepository<Futsal, integer> {

}
