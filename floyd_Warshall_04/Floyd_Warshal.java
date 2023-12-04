package floyd_Warshall_04;

import java.io.*;
import java.lang.*;
import java.util.*;
//Floydd Warshall Algorithm
//-Ashim Nepal
//
public class Floyd_Warshal{
	
	final static int INF=9999, V = 4;
	
	void floydWarshall(int dist[][]) {
		int i,j,k;
		
		for (k=0; k<V; k++) {
			for (i=0; i<V; i++) {
				for(j=0; j<V; j++) {
					if (dist[i][k] + dist[k][j]
							<dist[i][j])
						dist[i][j]=dist[i][k]+dist[k][j];
				}
			}
		}
		printSolution(dist);
	}
	
	void printSolution(int dist[][]){
		System.out.println("The following matrix shows the shortest "
				+ "distance between every pair of vertices");
		for(int i=0; i<V; ++i) {
			for(int j = 0; j<V; ++j) {
				if(dist[i][j]==INF)
					System.out.println("INF");
				else
					System.out.print(dist[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		
		int graph[][]= { { 0, 5, INF, 10},
				{INF,0,3,INF},
				{INF,INF,0,1},
				{INF, INF, INF,0}};
		Floyd_Warshal fw=new Floyd_Warshal();
		fw.floydWarshall(graph);
		}

	}


