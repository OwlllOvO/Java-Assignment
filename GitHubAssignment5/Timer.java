package GitHubAssignment5;
import java.util.Arrays;
import java.util.Random;
public class Timer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100000];
        Random rd = new Random();
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = rd.nextInt(100000);
        }
        StopWatch sw = new StopWatch();
        Arrays.sort(arr);
        sw.stop();
        System.out.println(sw.getElaspsedTime() + "ms");
	}
}
class StopWatch {
	private long startTime;
	private long endTime;
	StopWatch(){
		startTime=System.currentTimeMillis();
	}
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	public long getElaspsedTime() {
		return endTime-startTime;
	}
}
