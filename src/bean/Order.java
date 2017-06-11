package bean;

/**
 * Created by wzly on 17-5-26.
 */
public class Order {
    private int oid;
    private int pid;
    private int eid;
    private int cid;
    private int ostate;
    private int money;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getOstate() {
        return ostate;
    }

    public void setOstate(int ostate) {
        this.ostate = ostate;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", pid=" + pid +
                ", eid=" + eid +
                ", cid=" + cid +
                ", onum=" + ostate +
                ", money=" + money +
                '}';
    }
}
