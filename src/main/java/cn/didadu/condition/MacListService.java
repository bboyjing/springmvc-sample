package cn.didadu.condition;

import java.util.List;

/**
 * Created by jinggg on 16/4/18.
 */
public class MacListService implements ListService{
    @Override public String showListCmd() {
        return "ls";
    }
}
