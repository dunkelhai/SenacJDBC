package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

//        System.out.println("==== TESTE 1: seller findById ====");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);

//        System.out.println("\n==== TESTE 2: seller findByDepartment ====");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller obj : list){
//            System.out.println(obj);
//        }
//
//        System.out.println("\n==== TESTE 3: seller findAll ====");
//        list = sellerDao.findAll();
//        for (Seller obj : list){
//            System.out.println(obj);
//        }
//
//        System.out.println("\n==== TESTE 4: seller insert ====");
//        Seller newSeller = new Seller(null, "Joana", "joana@gmail.com", new Date(), 4000.00, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id = " + newSeller.getId());

//        System.out.println("\n==== TESTE 5: seller update ====");
//        seller = sellerDao.findById(1);
//        seller.setName("TEste Teste");
//        sellerDao.update(seller);
//        System.out.println("Updated! " + seller);

        System.out.println("\n==== TESTE 6: seller delete ====");
        System.out.println("Digite o ID do vendedor que deseja apagar do banco: ");
        int escolha = entrada.nextInt();
        sellerDao.deleteById(escolha);
        System.out.println("Deleted! ");

        entrada.close();

    }
}
