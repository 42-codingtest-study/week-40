package b3_2525;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());


        min = (min + time % 60);
        if (min / 60 != 0) {
            hour += min / 60;
            min %= 60;
        }
        hour = (hour + time / 60) % 24;

        System.out.printf("%d %d", hour, min);

    }
}
