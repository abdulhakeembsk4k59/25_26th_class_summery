import java.util.*;

public class StudentScores {
    
    public static void main(String[] args) {
        Map<String, List<Integer>> scoresMap = new HashMap<>();
        scoresMap.put("1", Arrays.asList(10, 20, 10));
        scoresMap.put("2", Arrays.asList(10, 20, 11));
        
        Map<String, Integer> totalScoresMap = calculateTotalScores(scoresMap);
        System.out.println("Total Scores: " + totalScoresMap);
        
        Map<String, Double> averageScoresMap = calculateAverageScores(scoresMap);
        System.out.println("Average Scores: " + averageScoresMap);
        
        Map<String, Double> bestOfTwoAverageScoresMap = calculateBestOfTwoAverageScores(scoresMap);
        System.out.println("Best of Two Average Scores: " + bestOfTwoAverageScoresMap);
    }
    
    public static Map<String, Integer> calculateTotalScores(Map<String, List<Integer>> scoresMap) {
        Map<String, Integer> totalScoresMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : scoresMap.entrySet()) {
            int totalScore = 0;
            for (int score : entry.getValue()) {
                totalScore += score;
            }
            totalScoresMap.put(entry.getKey(), totalScore);
        }
        return totalScoresMap;
    }
    
    public static Map<String, Double> calculateAverageScores(Map<String, List<Integer>> scoresMap) {
        Map<String, Double> averageScoresMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : scoresMap.entrySet()) {
            int totalScore = 0;
            for (int score : entry.getValue()) {
                totalScore += score;
            }
            double averageScore = (double) totalScore / entry.getValue().size();
            averageScoresMap.put(entry.getKey(), averageScore);
        }
        return averageScoresMap;
    }
    
    public static Map<String, Double> calculateBestOfTwoAverageScores(Map<String, List<Integer>> scoresMap) {
        Map<String, Double> bestOfTwoAverageScoresMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : scoresMap.entrySet()) {
            List<Integer> scores = entry.getValue();
            Collections.sort(scores, Collections.reverseOrder());
            double bestOfTwoAverageScore = ((double) scores.get(0) + scores.get(1)) / 2;
            bestOfTwoAverageScoresMap.put(entry.getKey(), bestOfTwoAverageScore);
        }
        return bestOfTwoAverageScoresMap;
    }
    
}
