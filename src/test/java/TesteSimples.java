import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import org.junit.Test;

public class TesteSimples {
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

   @Test
   public void deleteDepartment() {
        System.out.println("\n==== TESTE: department delete ====");
        if (departmentDao.findById(1) == null){
            System.out.println("Erro no teste!");
            assert false;
        } else {
            System.out.println("Teste ok!");
            assert true;
        }
    }
}

