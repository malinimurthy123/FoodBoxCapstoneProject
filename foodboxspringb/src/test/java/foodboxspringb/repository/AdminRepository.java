package foodboxspringb.repository;


import foodboxspringb.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String>{

    Admin findByusername(String username);

}