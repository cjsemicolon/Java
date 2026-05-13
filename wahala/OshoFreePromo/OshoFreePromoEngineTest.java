import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OshoFreePromoEngineTest {

@Test
void testZeroPercentDiscountTier() {
assertEquals(4000, OshoFreePromoEngine.discountPrice(4000, "STATER10"));

}

@Test
void testTenPercentDiscountTier() {
assertEquals(4500, OshoFreePromoEngine.discountPrice(5000, "STATER10"));

}

@Test
void testTwentyPercentDiscountTier() {
assertEquals(12000, OshoFreePromoEngine.discountPrice(15000, "BIGBOY20"));

}

@Test
void testThirtyFivePercentDiscountTier() {
assertEquals(19500, OshoFreePromoEngine.discountPrice(30000, "OSHOFREE35"));

}

@Test
void testInvalidPromoCode() {
assertEquals(30000, OshoFreePromoEngine.discountPrice(30000, "OSHOFREE3562"));

}



}
