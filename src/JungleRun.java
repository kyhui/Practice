import java.util.*;
import java.io.*;

class JungleRun{
	private static char map[][]; 
	private static int track[][];
	private static int greedy=Integer.MAX_VALUE;
	private static void atry(int x,int y,int count){
		//when we get to the end update the number of movements
		if(map[x][y]=='E')  {
			if(count<greedy) greedy=count;
		}
		else if(track[x][y]==0){
			track[x][y]=1;
			if(x-1>=0 && map[x-1][y]!='T') atry(x-1,y,count+1); //try north
			if(y-1>=0 && map[x][y-1]!='T') atry(x,y-1,count+1); //try west
			if(x+1<map[x].length && map[x+1][y]!='T') atry(x+1,y,count+1); //try south
			if(y+1<map[y].length && map[x][y+1]!='T') atry(x,y+1,count+1); //try east
			track[x][y]=0;
		}
	}

	public static void main(String args[]) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		track = new int[n][n];
		//use to find 'S'
		int x=0,y=0;
		//build the map
		for(int i=0;i<n;i++) {
			String str[] = br.readLine().split(" ");
			for(int j=0;j<n;j++) {
				map[i][j] = str[j].charAt(0);
				if(map[i][j]=='S') {
					x=i;y=j;
				}
			}
		}
		atry(x,y,0);
		System.out.println(greedy);
	}
}