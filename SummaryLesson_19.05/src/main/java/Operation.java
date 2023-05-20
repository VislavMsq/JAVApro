public enum Operation {
    PLUS{
        public int apply(int x, int y){
            return x + y;
        }
    },
    MULTYPLY{
        public int apply(int x, int y){
            return x * y;
        }
    };

    public abstract int apply(int x, int y);

}
