/*
ID: 100021881
LANG: JAVA
PROG: spin
*/

// if you want to turn all the debug on, just find and replace "// DEBUG " with nothing

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Deque;
import java.util.LinkedList;

/*
 * spin
 */
public class spin {
    public static void main(String[] args) throws Exception {
        // set startTime to measure how long the program takes
        long startTime = System.currentTimeMillis();

        // create input BufferedReader from file
        BufferedReader br = new BufferedReader(new FileReader("spin.in"));

        Wheel[] wheels = new Wheel[5];

        for (int i = 0; i < 5; i++) {    
            StringTokenizer l = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(l.nextToken());
            int num = Integer.parseInt(l.nextToken());
            wheels[i] = new Wheel(speed, num);
            for (int j = 0; j < num*2; j++) {
                wheels.cuts[i]=Integer.parseInt(l.nextToken());
            }
        }

        br.close();



        for (int i = 0; i < 5; i++)
            for (int j = 0; j < wheels[i].cuts.size(); j+=2)
                for (int k = 0; k <= wheels[i].cuts.get(j+1); k++)
                    wheels[i].empty[(wheels[i].cuts.get(j))%360] = true;

        int res = -1;
        loop: for (int t = 0; t < 360; t++) {
            for (int i = 0; i < 5; i++){
                int pos = (wheels[i].speed*t)%360;
                
            }
        }


        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("spin.out")));

        out.close();
        // print final time taken
        System.out.println(System.currentTimeMillis() - startTime);
    }

    static class Wheel {
        int speed;
        int[] cuts;
        boolean[] empty;
        int[] e;
        public Wheel(int spd, int num) {
            speed = spd;
            cuts = new int[num*2];
            empty = new boolean[360];
            e = new int[360];
        }
    }
}