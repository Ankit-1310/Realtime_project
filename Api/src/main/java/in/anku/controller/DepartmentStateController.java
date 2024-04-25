//package in.anku.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import in.anku.entity.DepartmentState;
//import in.anku.service.DepartmentStateService;
//
//@RestController
//@RequestMapping("/v1")
//public class DepartmentStateController {
//	@Autowired
//	private DepartmentStateService departmentStateService;
//	
//	@PostMapping("/department_stats")
//	public ResponseEntity<String> saveDepartmentState(@RequestBody DepartmentState departmentState ){
//		return this.departmentStateService.saveDepartmentState(departmentState);
//	}
//	@GetMapping("/department_stats/{departmentState_id}")
//	public ResponseEntity<?> getDepartmentState(@PathVariable Integer departmentState_id){
//		return this.departmentStateService.getDepartmentState(departmentState_id);
//	}
//	
//	
//}
