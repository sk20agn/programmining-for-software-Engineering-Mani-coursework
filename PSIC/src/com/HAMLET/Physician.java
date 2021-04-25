package com.HAMLET;


public class Physician extends Member {
    private Util util;
    public Physician(String id, String fullName, String address, String telephoneNumber,Util util) {
        super(id, fullName, address, telephoneNumber);
        this.util = util;
    }

    public Physician() {
    }

    public Util getUtil() {
        return util;
    }

    public void setUtil(Util util) {
        this.util = util;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' + util;
    }
}
