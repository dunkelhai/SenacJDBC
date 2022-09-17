import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testes {
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
    SellerDao sellerDao = DaoFactory.createSellerDao();

    @Test
    void validaDepartamentoExiste() {
        Assertions.assertNotNull(departmentDao.findById(1), "Departamento não existe!");
    }

    @Test
    void validaVendedorExiste(){
        Assertions.assertNotNull(sellerDao.findById(2), "Vendedor não existe!");
    }

}
