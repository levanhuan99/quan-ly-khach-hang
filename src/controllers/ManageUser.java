package controllers;


import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CustomerService;

import java.util.List;

@Controller
public class ManageUser {

    private CustomerService customerService =CustomerService.getInstance();

    @GetMapping("/customers")
    public String getCustomer(Model model) {
        List<Customer> list = customerService.getAllCustomer();
        model.addAttribute("list", list);
        return "form";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model) {
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("oldId", id);
        model.addAttribute("customerEdit", customer);
        return "form_edit";
    }

    @PostMapping("/save")
    public String saveEdit(@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam String address, @RequestParam int oldID, Model model) {
        Customer customer = new Customer(id, name, email, address);
        customerService.editCustomer(customer, oldID);
        List<Customer> list = customerService.getAllCustomer();
        model.addAttribute("list", list);
        return "form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam int id, Model model) {
        customerService.removeCustomer(id);
        List<Customer> list = customerService.getAllCustomer();
        model.addAttribute("list", list);
        return "form";

    }

    @GetMapping("/add")
    public String addCustomer() {
        return "add_form";
    }
    @PostMapping("/save_new_customer")
    public String saveCustomer(@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam String address,Model model){
        Customer customer=new Customer(id,name,email,address);
        customerService.addCustomer(customer);
        List<Customer> list = customerService.getAllCustomer();
        model.addAttribute("list", list);
        return "form";
    }
}
