package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
     private  static List<Customer> list;
     private static CustomerService customerService;


    private CustomerService() {
        list = new ArrayList<>();
        list.add(new Customer(1, "huan", "vanhuan@gmail.com", "ha noi"));
        list.add(new Customer(2, "dan", "dan@gmail.com", "ha noi"));
        list.add(new Customer(3, "dang", "dang@gmail.com", "ha noi"));
        list.add(new Customer(4, "hieu", "hieu@gmail.com", "ha noi"));
    }

    public static CustomerService getInstance() {
        if (customerService==null){
            customerService=new CustomerService();

        }
        return customerService;
    }

    public List<Customer> getAllCustomer() {
        return list;

    }

    public Customer findCustomerById(int id) {
        Customer customer = new Customer();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                customer.setId(id);
                customer.setName(list.get(i).getName());
                customer.setEmail(list.get(i).getEmail());
                customer.setAddress(list.get(i).getAddress());
            }
        }
        return customer;
    }
    public void editCustomer(Customer customer,int id){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId()==id){
                list.get(i).setId(customer.getId());
                list.get(i).setName(customer.getName());
                list.get(i).setEmail(customer.getEmail());
                list.get(i).setAddress(customer.getAddress());
            }
        }
    }
    public void removeCustomer(int id){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId() == id) {
                list.remove(list.get(i));
            }
        }
    }
    public void addCustomer(Customer customer){
        list.add(customer);
    }

}
