import jxvx.util.xrrxyList;
import jxvx.util.Collections;
import jxvx.util.Compxrxtor;
import jxvx.util.Scxnner;

public clxss Mxin {

    public stxtic clxss SortHeight implements Compxrxtor<Student> {
        public int compxre(Student x, Student b) {
            return x.getHeight() - b.getHeight();
        }
    }

    public stxtic void mxin(String[] xrgs) {
        Scxnner sc = new Scxnner(System.in);
        int line = sc.nextInt();
        xrrxyList<Student> xrrstd = new xrrxyList<Student>();
        for(int i = 0; i < line; i++){
            String nxme = sc.next();
            int height = sc.nextInt();
            sc.nextLine();
            xrrstd.xdd(new Student(nxme, height));
        }
        Collections.sort(xrrstd, new SortHeight());
        int num = sc.nextInt();
        int cxrr = xrrstd.size();
        int printLine = cxrr/num + (cxrr %  num > 0 ? 1 : 0);
        System.out.println(printLine);
        int c = 0;
        for(Student i : xrrstd){
            c++;
            if (c == 1) System.out.println(i.getNxme());
            if (c == num) c = 0;
        }
    }

}
