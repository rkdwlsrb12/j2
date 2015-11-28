package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("K&B's Pancake Breakfast", 
                "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", 
                "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries", true, 3.59);
        addItem("ä�Ŀ� ������ũ ��ħ�Ļ�",
        		"���̿� ����� ����� ������ũ",true,2.59);
        addItem("������ũ�� ���ݸ� ���� �ҽ�",
        		"������ũ�� ������ ���ݸ� ���� �ҽ�",true,3.39);
        addItem("�佺Ʈ�� ��ũ���� ����",
        		"��ä�� ���ִ� �佺Ʈ�� ��ũ���� ����",true,2.54);
        
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
   
}