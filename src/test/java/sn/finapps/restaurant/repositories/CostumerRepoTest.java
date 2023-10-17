//package sn.finapps.restaurant.repositories;
//
//import org.assertj.core.api.Assert;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import sn.finapps.restaurant.model.Costumer;
//import sn.finapps.restaurant.services.ICostumerService;
//import sn.finapps.restaurant.services.impl.CostumerServiceImpl;
//import test.model.Employee;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.mockito.Mockito.verify;
//
//
//@DataJpaTest
//class CostumerRepoTest {
//
//    @Mock
//    private CostumerRepo costumerRepo;
//
//    private CostumerServiceImpl costumerService;
//
//    @BeforeEach
//    void setUp(){
//        this.costumerService = new CostumerServiceImpl(costumerRepo);
//    }
//    @BeforeEach
//    void setUps(){
//        Costumer costumer = new Costumer(1L, "diallo", "bhoye", "78677876", "bh@gmail.com","mermo");
//        //when
//        costumerRepo.save(costumer);
//    }
//
//    @Test
//    void findAll(){
//        costumerService.findAll();
//        verify(costumerRepo).findAll();
//    }
//
//    @Test
//    void findEmailExiste(){
//
//        //given
//        String email = "bhkkk@gmail.com";
//        Costumer costumer = new Costumer(1L, "diallo", "bhoye", "78677876", "bh@gmail.com","mermo");
//        //when
//        costumerRepo.save(costumer);
//        final Boolean result = costumerRepo.selectExistsEmail(email);
//        //then
//        assertThat(result).isTrue();
//
//    }
//}
