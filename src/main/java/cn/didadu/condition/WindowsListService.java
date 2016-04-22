package cn.didadu.condition;

/**
 * Created by jinggg on 16/4/18.
 */
public class WindowsListService implements ListService{
    @Override public String showListCmd() {
        return "dir";
    }
}
