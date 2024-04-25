//package in.anku.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import in.anku.dao.DepartmentStateRepository;
//import in.anku.entity.DepartmentState;
//@Service
//public class DepartmentStateServiceImpl implements DepartmentStateService {
//	@Autowired
//	private DepartmentStateRepository departmentStateRepository;
//
//	@Override
//	public ResponseEntity<String> saveDepartmentState(DepartmentState departmentState) {
//		try {
//			Optional<DepartmentState> byId = this.departmentStateRepository.findById(departmentState.getDepartmentState_id());
//			
//			if (byId.isPresent()) {
//				return ResponseEntity.ok("Duplicate Entry");
//			} else {
//				this.departmentStateRepository.save(departmentState);
//				return ResponseEntity.ok("succesfully Added");
//			}
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Something went Wrong");
//		}
//	}
//
//	@Override
//	public ResponseEntity<?> getDepartmentState(Integer departmentState_id) {
//		try {
//			Optional<DepartmentState> byId = this.departmentStateRepository.findById(departmentState_id);
//			
//			if (byId.isPresent()) {
//				Optional<DepartmentState> optional = this.departmentStateRepository.findById(departmentState_id);
//				return ResponseEntity.status(200).body(optional.get());
//			} else {
//				return ResponseEntity.notFound().build();
//			}
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Something went Wrong");
//		
//		}
//	}
//
//	@Override
//	public ResponseEntity<?> getAllDepartmentState() {
//		try {
//			List<DepartmentState> all = this.departmentStateRepository.findAll();
//			if (all.isEmpty()) {
//				return ResponseEntity.notFound().build();
//			} else {
//				List<DepartmentState> all2 = this.departmentStateRepository.findAll();
//				return ResponseEntity.status(200).body(all2);
//			}
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Something went Wrong");
//			
//		}
//	}
//
//	@Override
//	public ResponseEntity<String> UpdateDepartmentState(DepartmentState departmentState) {
//		try {
//			Optional<DepartmentState> byId = this.departmentStateRepository.findById(departmentState.getDepartmentState_id());
//			if (byId.isPresent()) {
//				this.departmentStateRepository.save(departmentState);
//				return ResponseEntity.ok("Updated");
//			} else {
//				return ResponseEntity.ok("Updation Fail");
//			}
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Something went Wrong");
//			
//		}
//	}
//
//	@Override
//	public ResponseEntity<String> deleteDepartmentState(Integer departmentState_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//


//}
