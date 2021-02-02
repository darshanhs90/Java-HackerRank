package Jan2021Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _1192CriticalConnectionsInANetwork {
	public static void main(String[] args) {
		System.out.println(criticalConnections(4,
				new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(0, 1)),
						new ArrayList<Integer>(Arrays.asList(1, 2)), new ArrayList<Integer>(Arrays.asList(2, 0)),
						new ArrayList<Integer>(Arrays.asList(1, 3))))));
	}

	public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		HashMap<Integer, HashSet<Integer>> adjList = new HashMap<Integer, HashSet<Integer>>();
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			adjList.put(i, new HashSet<Integer>());
		}

		for (List<Integer> connection : connections) {
			int source = connection.get(0);
			int destination = connection.get(1);
			adjList.get(source).add(destination);
			adjList.get(destination).add(source);
		}

		for (List<Integer> connection : connections) {
			int source = connection.get(0);
			int destination = connection.get(1);
			adjList.get(source).remove(destination);
			adjList.get(destination).remove(source);
			HashSet<Integer> visited = new HashSet<Integer>();
			dfs(source, visited, adjList);
			adjList.get(source).add(destination);
			adjList.get(destination).add(source);
			if (visited.size() < n)
				output.add(connection);
		}
		return output;
	}

	public static void dfs(Integer source, HashSet<Integer> visited, HashMap<Integer, HashSet<Integer>> adjList) {
		if (visited.contains(source))
			return;

		visited.add(source);
		Iterator<Integer> values = adjList.get(source).iterator();
		while (values.hasNext()) {
			dfs(values.next(), visited, adjList);
		}
	}

}
