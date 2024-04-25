package in.anku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anku.entity.Department;
import in.anku.service.DepartmentService;

@RestController
@RequestMapping(value="/v1")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/department")
	public ResponseEntity<String> saveDepartment(@RequestBody Department department){
		return this.departmentService.saveDepartment(department);
		
	}
	@GetMapping("/department/{department_id}")
	public ResponseEntity<?> getDepartment(@PathVariable Integer department_id) {
		return this.departmentService.getDepartment(department_id);
	}

}
