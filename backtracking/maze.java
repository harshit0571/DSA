// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    static int maze(int r, int c){
        if(c==1 || r==1){
            return 1;
        }
        int right=maze(r-1, c);
        int down=maze(r,c-1);
        return right+down;
    }
    public static void main(String[] args) {
       System.out.println(maze(3,3));
    }
}
