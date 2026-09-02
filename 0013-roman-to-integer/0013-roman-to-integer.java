class Solution {
    static Map<String, Integer> valuesHash = new HashMap<>();
    static {
        valuesHash.put("I", 1);
        valuesHash.put("V", 5);
        valuesHash.put("X", 10);
        valuesHash.put("L", 50);
        valuesHash.put("C", 100);
        valuesHash.put("D", 500);
        valuesHash.put("M", 1000);
        valuesHash.put("IV", 4);
        valuesHash.put("IX", 9);
        valuesHash.put("XL", 40);
        valuesHash.put("XC", 90);
        valuesHash.put("CD", 400);
        valuesHash.put("CM", 900);
    }

    public int romanToInt(String s) {
        int sum = 0, i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1) {
                String twoSymbols = s.substring(i, i + 2);
                if (valuesHash.containsKey(twoSymbols)) {
                    sum += valuesHash.get(twoSymbols);
                    i = i + 2;
                    continue;
                }
            }
            String oneSymbol = s.substring(i, i + 1);
            sum += valuesHash.get(oneSymbol);
            i++;
        }
        return sum;
    }
}
