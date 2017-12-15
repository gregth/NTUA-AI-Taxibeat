import java.util.*;

class SearchNodeComparator implements Comparator<SearchNode> {
    @Override
    public int compare(SearchNode a, SearchNode b) {
        double aG = a.getRouteCost(), bG = b.getRouteCost();
        double aH = a.getHeuristic(), bH = b.getHeuristic();

        if (a.stringify().equals(b.stringify())) {
            return 0;
        }

        if (aG + aH < bG + bH) {
            return -1;
        }

        return 1;
    }
}
