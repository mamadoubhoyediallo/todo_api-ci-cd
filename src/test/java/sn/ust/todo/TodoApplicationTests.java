//package sn.ust.todo;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//
////@SpringBootTest(classes = TodoApplicationTests.class)
//class TodoApplicationTests {
//
//    Calculator calculator = new Calculator();
//
//    @Test
//    void testSum(){
//
//        //given
//        int x = 5;
//        int y = 10;
//
//        int z = 15;
//        //when
//        int sum = calculator.sum(x, y);
//        //then
//        assertThat(sum).isEqualTo(z);
//
//    }
//    @BeforeEach
//    void setUp(){
//        System.out.println("Setting up");
//    }
//
//
//
//    class Calculator {
//
//        int sum(int x, int y){
//            return x+y;
//        }
//    }
//
//}
