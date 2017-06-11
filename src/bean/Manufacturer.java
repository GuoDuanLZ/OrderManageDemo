package bean;

/**
 * Created by wzly on 17-5-28.
 */
public class Manufacturer {
    private int mid;
    private String mname;
    private String mleader;
    private String mphone;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMleader() {
        return mleader;
    }

    public void setMleader(String mleader) {
        this.mleader = mleader;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mleader='" + mleader + '\'' +
                ", mphone=" + mphone +
                '}';
    }
}
