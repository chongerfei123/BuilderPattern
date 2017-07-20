package st.zlei.com.buildpattern;

import android.util.Log;


/**
 * Created by zl on 2017/7/20.
 */

public class Test {
    private static final String TAG = "test";

    private int a;
    private int b;
    private int c;
    private int d;
    private int f;
    private int g;
    private int h;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;


    private Test(Build build) {
       this.a = build.a;
       this.b = build.b;
       this.c = build.c;
       this.d = build.d;
       this.f = build.f;
       this.g = build.g;
       this.h = build.h;
       this.A = build.A;
       this.B = build.B;
       this.C = build.C;
       this.D = build.D;
       this.E = build.E;
       this.F = build.F;
       this.G = build.G;
       this.H = build.H;
    }

    public void log(){
        Log.d(TAG, "log: a:"+a+",b:"+b+",c:"+c+",d:"+d+",f:"+f+",g:"+g+",h:"+h+",A:"+A+",B:"+B+",C:"+C+",D:"+D+",E:"+E+",F:"+F+",G:"+G+",H:"+H+",");
    }
    public static class Build {

        private int a = 1;
        private int b = 2;
        private int c = 3;
        private int d = 4;
        private int f = 5;
        private int g = 6;
        private int h = 7;
        private String A = "A";
        private String B = "B";
        private String C = "C";
        private String D = "D";
        private String E = "E";
        private String F = "F";
        private String G = "G";
        private String H = "H";

        public Test build(){
            return new Test(this);
        }
        public Build(int a, String a1) {
            this.a = a;
            A = a1;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public int getD() {
            return d;
        }

        public String getE() {
            return E;
        }

        public int getF() {
            return f;
        }

        public int getG() {
            return g;
        }

        public int getH() {
            return h;
        }



        public Build setA(int a) {
            this.a = a;
            return this;
        }

        public Build setB(int b) {
            this.b = b;
            return this;
        }

        public Build setC(int c) {
            this.c = c;
            return this;
        }

        public Build setD(int d) {
            this.d = d;
            return this;
        }

        public Build setF(int f) {
            this.f = f;
            return this;
        }

        public Build setG(int g) {
            this.g = g;
            return this;
        }

        public Build setH(int h) {
            this.h = h;
            return this;
        }

        public Build setA(String a) {
            A = a;
            return this;
        }

        public Build setB(String b) {
            B = b;
            return this;
        }

        public Build setC(String c) {
            C = c;
            return this;
        }

        public Build setD(String d) {
            D = d;
            return this;
        }

        public Build setE(String e) {
            E = e;
            return this;
        }

        public Build setF(String f) {
            F = f;
            return this;
        }

        public Build setG(String g) {
            G = g;
            return this;
        }

        public Build setH(String h) {
            H = h;
            return this;
        }
    }

}

