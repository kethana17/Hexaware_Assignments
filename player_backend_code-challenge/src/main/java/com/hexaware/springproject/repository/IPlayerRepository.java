package com.hexaware.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hexaware.springproject.entity.Player;
import java.util.List;

public interface IPlayerRepository extends JpaRepository<Player , Integer>{
	
    @Query("select p from Player p where p.role='batsmen'")
	public List<Player> findAllPlayerByRole();
	
}
