/*
字符流中第一个不重复的字符

题目描述
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。
 */


/*

流文件和一般问题不同，buffer的内容是在不断改变的，在测试过程中也是调用一个insert，一次解函数。

一个字符占4位，因此不会超过128个，可以申请一个128大小的数组来实现一个简易的哈希表。
时间复杂度为O(n)，空间复杂度O(1).
 */
public class Solution{
    public int [] hashtable = new int[128];
    public StringBuffer s = new StringBuffer();
    public void Insert(char ch){
        s.append(ch);
        hashtable[ch]++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
        char[] str = s.toString().toCharArray();
        for (char c : str) {
            if (hashtable[c] == 1) return c;
        }
        return '#';
    }
}
