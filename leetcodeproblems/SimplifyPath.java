package leetcodeproblems;

import java.util.Iterator;
import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> canonicalPathStack = new Stack<>();
        String[] pathDirs = path.split("/");
        for (String currentDir : pathDirs) {
            if (currentDir.equals("..")) {
                if (!canonicalPathStack.isEmpty()) {
                    canonicalPathStack.pop();
                }
            } else if (!currentDir.equals(".") && !currentDir.isEmpty()) {
                canonicalPathStack.push(currentDir);
            }
        }

        if (canonicalPathStack.isEmpty()) {
            return "/";
        } else {
            StringBuilder sb = new StringBuilder();
            //Enhanced for-loop and iterator iterates over elements in the order of insertion from stack (FIFO, Not LIFO) since stack internally uses de-que structure.
            for (String s : canonicalPathStack) {
                sb.append("/");
                sb.append(s);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/../"));
    }
}
