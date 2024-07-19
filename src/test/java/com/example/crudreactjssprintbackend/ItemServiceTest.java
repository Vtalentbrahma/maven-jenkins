package com.example.crudreactjssprintbackend;

import com.example.crudreactjssprintbackend.Repository.ItemRepository;
import com.example.crudreactjssprintbackend.model.Item;
import com.example.crudreactjssprintbackend.service.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

    @InjectMocks
    private ItemService itemService;

    @Mock
    private ItemRepository itemRepository;

    @Test
    public void testGetAllItems() {
        Item item = new Item();
        item.setName("Test Item");

        when(itemRepository.findAll()).thenReturn(Collections.singletonList(item));

        List<Item> items = itemService.getAllItems();
        assertEquals(1, items.size());
        assertEquals("Test Item", items.get(0).getName());
    }
}
