package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Top top;
    private Bottoms bottoms;
    private Cloths cloths;
    private Client client;
    private Order order;
    @BeforeEach
    void setUp() {
        top = new Top("T-shirt", Size.XL, 15000, Material.coton, Sleeves.Long);
        bottoms = new Bottoms("pants", Size.M, 10000, Material.other, 55);
        client = new Client("Manda", "Solontiana", Instant.parse("2006-02-21T08:00:00Z"), "Lot II 59b", "solontianamandanirina@gmail.com", "0384294450");
        order = new Order(Instant.now(), "Ordering t-shirt", List.of(top, bottoms), 1);

    }

    @Test
    void get_total_amount() {
        assertEquals(25000, order.getTotalAmount());
    }

}