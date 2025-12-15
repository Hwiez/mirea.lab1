package pract_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordChain {

    public static String getLine(String... words) {
        if (words == null || words.length == 0) {
            return "";
        }

        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        StringBuilder result = new StringBuilder();

        // Начинаем с первого слова
        result.append(wordList.get(0));
        wordList.remove(0);

        boolean found;
        do {
            found = false;
            String lastWord = result.toString();
            char lastChar = Character.toLowerCase(lastWord.charAt(lastWord.length() - 1));

            for (int i = 0; i < wordList.size(); i++) {
                String currentWord = wordList.get(i);
                char firstChar = Character.toLowerCase(currentWord.charAt(0));

                if (lastChar == firstChar) {
                    result.append(" ").append(currentWord);
                    wordList.remove(i);
                    found = true;
                    break;
                }
            }
        } while (found && !wordList.isEmpty());

        // Если остались слова, добавляем их в конец
        for (String word : wordList) {
            result.append(" ").append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in))) {
            System.out.print("Введите имя файла: ");
            String fileName = reader.readLine();

            List<String> words = new ArrayList<>();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    String[] lineWords = line.split("\\s+");
                    words.addAll(Arrays.asList(lineWords));
                }
            }

            System.out.println("Слова из файла: " + words);
            System.out.println("Результат: " + getLine(words.toArray(new String[0])));

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());

            // Пример для тестирования без файла
            System.out.println("\nПример работы с тестовыми данными:");
            String testWords = "Киев Нью-Йорк Амстердам Вена Мельбурн";
            System.out.println("Слова: " + testWords);
            System.out.println("Результат: " + getLine(testWords.split("\\s+")));
        }
    }
}