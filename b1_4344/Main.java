package b1_4344;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main{
  public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int c = Integer.parseInt(br.readLine());

      for (int i = 0; i < c; i++) {
          String str = br.readLine();
          String[] arr = str.split(" ");
          int n = Integer.parseInt(arr[0]);
          int sum = 0, k, s = 0;
          for (k = 1; k <= n; k++) {
              sum += Integer.parseInt(arr[k]);
          }
          for(k = 1; k <= n; k++) {
              if(Integer.parseInt(arr[k]) > (float) sum/n) s += 1;
          }
          System.out.printf("%.3f", (float)s / n * 100);
          System.out.println("%");
      }

  }

}
