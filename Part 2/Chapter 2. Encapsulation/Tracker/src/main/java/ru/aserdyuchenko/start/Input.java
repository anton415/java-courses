package ru.aserdyuchenko.start;

public interface Input {

	String askMenuChoice(String menuQuestion);
	String askNameForNewItem(String nameForNewItem);
	String askDescForNewItem(String descForNewItem);
	String askItemId(String itemId);
	int menuChoice(int choice);

}