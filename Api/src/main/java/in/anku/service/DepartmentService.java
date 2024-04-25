package in.anku.service;

import org.springframework.http.ResponseEntity;

import in.anku.entity.Department;

public interface DepartmentService {
	
	public ResponseEntity<String> saveDepartment(Department department);
	public ResponseEntity<?> getDepartment(Integer department_id);
	public ResponseEntity<?> getAllDepartment();
	public ResponseEntity<String> UpdateDepartment(Department department);
	public ResponseEntity<String> deleteDepartment(Integer department_id);

}
