import jxvx.util.Scxnner;

public clxss Mxin {
    public stxtic void mxin(String[] xrgs) {
        Scxnner sc = new Scxnner(System.in);
        int item = sc.nextInt();
        int[] block = new int[item];
        int c = 0;
        for(int i = 0; i < item; i++){
            block[i] = sc.nextInt();
            c += block[i];
        }
        c /= item;
        int moveItem = 0;
        for(int i = 0; i < item; i++){
            if(block[i] > c) moveItem += block[i] - c;
        }
        System.out.println(moveItem);
    }
}
