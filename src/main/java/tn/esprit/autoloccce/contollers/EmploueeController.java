package tn.esprit.autoloccce.contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IEmployeService;
import tn.esprit.autoloccce.entities.Employe;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmploueeController {
    private IEmployeService employeService;
   @PostMapping("/addEmploye")
   public Employe addEmploye(@RequestBody Employe employe){
        return employeService.addEmploye(employe);
   }

   @GetMapping("/getEmployeById/{id}")
   public Employe addEmploye(@PathVariable Long id){
       return employeService.getEmployeeByID(id);
   }
   @GetMapping("/GetAllEmploye")
   public List<Employe> GetAllEmploye(){
       return employeService.GetAllEmploye();
   }
   @DeleteMapping("/deleteEmploye/{id}")
   public void deleteEmploye(@PathVariable Long id){
        employeService.deleteEmploye(id);
   }
   @PutMapping("/UpdateEmploye/{id}")
   public Employe addEmploye(@PathVariable Long id ,@RequestBody Employe emp){
       return employeService.UpdateEmploye(emp,id);
   }
}
