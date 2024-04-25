package in.anku.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.anku.dao.DepartmentRepository;
import in.anku.entity.Department;
@Service
public class DepartmentServiceimpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	

	  @Override
		public ResponseEntity<String> saveDepartment(Department department) {
		  try {
			  Optional<Department> byId = this.departmentRepository.findById(department.getDepartment_id());
			if (byId.isPresent()) {
				return ResponseEntity.ok("Duplicate Entry");
			} else {
				this.departmentRepository.save(department);
				return ResponseEntity.ok("sucessfully Added");

			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Something went Wrong");
		}
			
		}
	@Override
	public ResponseEntity<?> getDepartment(Integer department_id) {
		try {
			Optional<Department> optional = this.departmentRepository.findById(department_id);
			if (optional.isPresent()) {
				Optional<Department> optional2 = this.departmentRepository.findById(department_id);
				return ResponseEntity.status(200).body(optional2.get());
			}else {
				return ResponseEntity.notFound().build();
			}
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("something went Wrong"); 
		}
	}

	@Override
	public ResponseEntity<?> getAllDepartment() {
		try {
			List<Department> all = this.departmentRepository.findAll();
			if (all.isEmpty()) {
				return ResponseEntity.notFound().build();
			} else {
				List<Department> all2 = this.departmentRepository.findAll();
				return ResponseEntity.status(200).body(all2);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("something went Wrong");
		}
	}

	@Override
	public ResponseEntity<String> UpdateDepartment(Department department) {
		try {
			Optional<Department> byId = this.departmentRepository.findById(department.getDepartment_id());
			if (byId.isPresent()) {
				this.departmentRepository.save(department);
				return ResponseEntity.ok("Updated");
				
			}else {
				return ResponseEntity.ok("Updation Failed");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("something went Wrong");
		}
	}

	@Override
	public ResponseEntity<String> deleteDepartment(Integer department_id) {
		try {
			Optional<Department> byId = this.departmentRepository.findById(department_id);
			if (byId.isPresent()) {
				this.departmentRepository.deleteById(department_id);
				return ResponseEntity.ok("SuccessFully Deleted");
			} else {
				return ResponseEntity.ok("Id Not Exist");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("something went Wrong");
		}
	}


		

}





