package com.example.crudreactjssprintbackend.service;

import com.example.crudreactjssprintbackend.Repository.ItemRepository;
import com.example.crudreactjssprintbackend.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
