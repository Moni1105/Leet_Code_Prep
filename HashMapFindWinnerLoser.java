
import java.util.*;
class HashMapFindWinnerLoser {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss = new HashSet<>(), oneLoss = new HashSet<>(),
        moreLosses = new HashSet<>();

for (int i=0;i<matches.length;i++) {
    int winner = matches[i][0], loser = matches[i][1];
    // Add winner.
    if (!oneLoss.contains(winner) && !moreLosses.contains(winner)) {
        zeroLoss.add(winner);
    }
    // Add or move loser.
    if (zeroLoss.contains(loser)) {
        zeroLoss.remove(loser);
        oneLoss.add(loser);
    } else if (oneLoss.contains(loser)) {
        oneLoss.remove(loser);
        moreLosses.add(loser);
    } else if (moreLosses.contains(loser)) {
        continue;
    } else {
        oneLoss.add(loser);
    }
}

List<List<Integer>> answer =
    Arrays.asList(new ArrayList<>(), new ArrayList<>());
answer.get(0).addAll(zeroLoss);
answer.get(1).addAll(oneLoss);
Collections.sort(answer.get(0));
Collections.sort(answer.get(1));

return answer;
}
    public static void main(String args[]){
        HashMapFindWinnerLoser as= new HashMapFindWinnerLoser();
        int[][] matches= new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> hs= as.findWinners(matches);
        System.out.println(hs);
    }
}
