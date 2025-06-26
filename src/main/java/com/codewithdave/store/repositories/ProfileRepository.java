package com.codewithdave.store.repositories;

import com.codewithdave.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
