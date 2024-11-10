class Solution {
    public int[] twoSum(int[] nums, int target) {
          // Проходим по каждому числу в массиве
        for (int i = 0; i < nums.length; i++) {
            // Для каждого числа ищем пару, с которой сумма равна target
            for (int j = i + 1; j < nums.length; j++) {
                // Если сумма двух чисел равна target, возвращаем их индексы
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        // Если решения нет, выбрасываем исключение (по условиям задачи решение всегда существует)
        throw new IllegalArgumentException("No solution found");
      
    }
}