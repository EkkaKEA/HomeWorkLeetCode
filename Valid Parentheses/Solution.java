﻿public class Solution {
    public boolean isValid(String s) {
        // Проверяем, если длина строки нечетная, то скобки не могут быть корректно закрыты
        if (s.length() % 2 != 0) {
            return false;
        }

        // Создаем стек для хранения открывающих скобок
        char[] stack = new char[s.length()];
        int top = -1; // Индекс верхушки стека

        // Проходим по каждому символу в строке
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Получаем текущий символ

            // Если символ — открывающая скобка, добавляем его в стек
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c; // Помещаем скобку на верхушку стека
            } else {
                // Если стек пуст (нет соответствующей открывающей скобки), возвращаем false
                if (top == -1) {
                    return false;
                }
                
                // Проверяем, совпадает ли текущая закрывающая скобка с верхушкой стека
                char openBracket = stack[top--]; // Убираем верхний элемент из стека
                if ((c == ')' && openBracket != '(') ||
                    (c == '}' && openBracket != '{') ||
                    (c == ']' && openBracket != '[')) {
                    return false; // Если не совпадает, строка некорректна
                }
            }
        }

        // Если стек пуст в конце, то все скобки корректно закрыты
        return top == -1;
    }
}
