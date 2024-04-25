package in.anku.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anku.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
