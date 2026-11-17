public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) return 0; // if i == j than shortest distance will be 0 

        int n = m.length;
        int[] queue = new int[n]; // array of ints for junctions that need to be checked
        boolean[] visited = new boolean[n]; // array of booleans that hold value if index was already visited
        int[] distance = new int[n]; // array of int for distances from i to the indexes 

        int tail = 0; // where was the last place we added to queue
        int head = 0; // where are currently in queue

        // adding i info to the arrays
        queue[tail++] = i; 
        visited[i] = true;
        distance[i] = 0;

        // while goes as long as we have something to check in queue
        while(head < tail){
            int current = queue[head++]; 

            // goes through all of m[current] values to check if we can go to somewhere from current that we have not visited
            for(int next = 0; next < n; next++){
                if (m[current][next] == 1 && !visited[next]){
                    distance[next] = distance[current] + 1;
                    if (next == j){
                        return distance[next];
                    }
                    else{
                        queue[tail++] = next;
                        visited[next] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}