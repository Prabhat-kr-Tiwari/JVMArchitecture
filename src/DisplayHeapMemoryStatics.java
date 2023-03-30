public class DisplayHeapMemoryStatics
{
    public static void main(String[] args) {
        double mb=1024*1024;
        Runtime r=Runtime.getRuntime();
        System.out.println("max Memory   "+r.maxMemory()/mb);
        System.out.println("Total Memory  "+r.totalMemory()/mb);
        System.out.println("Free Memory   "+r.freeMemory()/mb);
        System.out.println("consumed Memory  "+(r.totalMemory()- r.freeMemory())/mb);

    }
}
/*
Microsoft Windows [Version 10.0.19044.2728]
(c) Microsoft Corporation. All rights reserved.

C:\Users\prabhat>D:

D:\>cd JavaByDurgaSir\Java\src

D:\JavaByDurgaSir\Java\src>ls
AbstractClass       DisplayHeapMemoryStatics.java  JVMArchitectureByDurgaSir  Package
ClassLevelModifier  HowClassLoaderWorks            Oops                       abstractclass.java

D:\JavaByDurgaSir\Java\src>javac DisplayHeapMemoryStatics.java

D:\JavaByDurgaSir\Java\src>java DisplayHeapMemoryStatics
Error: Could not find or load main class DisplayHeapMemoryStatics
Caused by: java.lang.ClassNotFoundException: DisplayHeapMemoryStatics

D:\JavaByDurgaSir\Java\src>java DisplayHeapMemoryStatics.java
max Memory   2008.0
Total Memory  126.0
Free Memory   109.51802825927734
consumed Memory  16.481971740722656

D:\JavaByDurgaSir\Java\src>java -Xmx512m DisplayHeapMemoryStatics
Error: Could not find or load main class DisplayHeapMemoryStatics
Caused by: java.lang.ClassNotFoundException: DisplayHeapMemoryStatics

D:\JavaByDurgaSir\Java\src>java -Xmx512m DisplayHeapMemoryStatics.java
max Memory   512.0
Total Memory  126.0
Free Memory   109.0379409790039
consumed Memory  16.962059020996094

D:\JavaByDurgaSir\Java\src>java DisplayHeapMemoryStatics.java
max Memory   2008.0
Total Memory  126.0
Free Memory   109.03797912597656
consumed Memory  16.962020874023438

D:\JavaByDurgaSir\Java\src>java -Xms12m DisplayHeapMemoryStatics
Error: Could not find or load main class DisplayHeapMemoryStatics
Caused by: java.lang.ClassNotFoundException: DisplayHeapMemoryStatics

D:\JavaByDurgaSir\Java\src>java -Xms12m DisplayHeapMemoryStatics.java
max Memory   2008.0
Total Memory  15.0
Free Memory   10.220977783203125
consumed Memory  4.779022216796875

D:\JavaByDurgaSir\Java\src>java -Xms62m DisplayHeapMemoryStatics.java
max Memory   2008.0
Total Memory  62.0
Free Memory   45.03797912597656
consumed Memory  16.962020874023438

D:\JavaByDurgaSir\Java\src>
*/
