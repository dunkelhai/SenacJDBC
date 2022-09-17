package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TESTE 1: department findById ====");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n==== TESTE 2: department findAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n==== TESTE 3: department insert ====");
        Department novoDepartamento = new Department(null, "D6");
        departmentDao.insert(novoDepartamento);
        System.out.println("Inserted! New id = " + novoDepartamento.getId());

        System.out.println("\n==== TESTE 4: department update ====");
        department = departmentDao.findById(6);
        department.setName("Comercial");
        departmentDao.update(department);
        System.out.println("Updated! " + department);

        System.out.println("\n==== TESTE 5: department delete ====");
        System.out.println("Digite o ID do departamento que deseja apagar do banco: ");
        int escolha = entrada.nextInt();
        departmentDao.deleteById(escolha);
        System.out.println("Deleted! ");

        entrada.close();

    }
}
