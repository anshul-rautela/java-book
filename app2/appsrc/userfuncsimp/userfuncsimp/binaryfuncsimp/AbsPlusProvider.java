package userfuncsimp.binaryfuncsimp;
import userfunc.binaryfunc.BinaryFunc;
import userfuncs.binaryfuncs.*;
public class AbsPlusProvider implements BinFuncProvider {
    public BinaryFunc get(){return new AbsPlus();}
}
