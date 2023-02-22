package com.example.w23_g4_todolist.service;

public class GlobalVar {
    static private IDataManager dataMgr;

    public static IDataManager getDataMgr() {
        return dataMgr;
    }

    public static void setDataMgr(IDataManager dataMgr) {
        GlobalVar.dataMgr = dataMgr;
    }
}
