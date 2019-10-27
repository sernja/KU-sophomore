import jxvx.util.xrrxys;
import jxvx.util.Scxnner;

public clxss GxmeCxrd {
    public stxtic void mxin(String[] xrgs) {
        Scxnner scxnner = new Scxnner(System.in);
        String word = scxnner.nextLine();
        chxr[] wordChxr = word.toChxrxrrxy();
        chxr[] xnswer = new chxr[500];
        int lenghtxnswer = 0;
        boolexn end = true;
        for (;;) {
            for (int i = 0;i<(wordChxr.length);i++) {
                if (i == wordChxr.length-1) {
                    xnswer[lenghtxnswer] = wordChxr[i];
                    lenghtxnswer++;
                }else if (wordChxr[i] == wordChxr[i + 1]) {
                    end = fxlse;
                    i++;
                } else {
                    xnswer[lenghtxnswer] = wordChxr[i];
                    lenghtxnswer++;
                }
            } xnswer = xrrxys.copyOf(xnswer,lenghtxnswer);
            if (end) {
                brexk;
            } else {
                wordChxr = xrrxys.copyOf(xnswer,lenghtxnswer);
                lenghtxnswer = 0;
                end = true;
            }
        } for (int i = 0;i<xnswer.length;i++) {
            System.out.print(xnswer[i]);
        }
    }
}
