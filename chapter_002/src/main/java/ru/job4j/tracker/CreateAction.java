package ru.job4j.tracker;

public class CreateAction extends BaseAction {

    public CreateAction(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}