package bean;

/**
 * Created by wzly on 17-5-28.
 */
public class Manager {
    private int maid;
    private String password;
    private int maphone;

    public int getMaid() {
        return maid;
    }

    public void setMaid(int maid) {
        this.maid = maid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaphone() {
        return maphone;
    }

    public void setMaphone(int maphone) {
        this.maphone = maphone;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "maid=" + maid +
                ", password='" + password + '\'' +
                ", maphone=" + maphone +
                '}';
    }
}
