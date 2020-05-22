import java.awt.desktop.SystemEventListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Pattern;

public class StudyBase {
    //常量
    static final double PI = 3.14;
    static int age = 23;

    public static void main(String[] args){
//        //小整形
//        byte mybyte = 123;
//        //短整形
//        short myshort = 12333;
//        //整形
//        int myint = 2222222;
//        //长整形
//        long mylong = 12345566;
//        long res = mybyte+myshort+myint+mylong;
//        //System.out.println(res);
//
//        char char1 = '\\';
//        char char2 = '\u2605';
//        int a = 10;
//        int b = 5;
//        int c = char1;
//        System.out.println(c);
//        System.out.println(char1);
//        System.out.println(char2);
//
//        //输出静态变量
//        System.out.println("static age is :" + StudyBase.age);
//        final int num;
//        //num = 123456;
//        age = 10;
//        System.out.println("PI:"+ PI);
//        //System.out.println("num" + num);
//        System.out.println("age:" + age);

//        int a1 = 5;
//        b = ++a1;
//        System.out.println(b);
//        System.out.println(a1);
//        b = a1++;
//        System.out.println(b);
//        System.out.println(a1);

//        //异或计算类型，不用其他变量实现两变量互换
//        //异或有3个特点（1）0^0 = 0 ,0^1=1,如果等于0等于本身，1等于相反数
//        //特点2,1^0=1,1^1=0,如果等于0等于本身，1等于相反数
//        //异或本身等于本身
//        //如果计算异或，首先要先将来十进制变成2禁止，记忆方式有11得1,00得0,10得1,01得0,如果ab不同值就看第一位是什么就是什么
//        long A1 = 10;
//        long A2 = 20;
//        A1 = A1 ^ A2;
//        A2 = A2 ^ A1;
//        A1 = A1 ^ A2;
//        System.out.println(A1);
//        System.out.println(A2);
//
//        //强制转型
//        int A3 = (int)36.2;
//        System.out.println(A3);

//        //判断某一年是否闰年
//        Scanner scan = new Scanner(System.in);       //扫描器
//        System.out.println("请输入年份");
//        long year = scan.nextLong();        //接收用户输入
//        if(year % 4 == 0 && year % 100!=0 || year % 400 == 0){
//            System.out.println(year + "年是闰年");
//        }else{
//            System.out.println(year + "年不是闰年");
//        }

//        //计算球面面积
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入球形的半径");
//        double r = scan.nextDouble();
//        final double PI = 3.1415926;
//        double volume = 4.0/3.0 * PI * r * r * r;
//        System.out.println("球形的半径是：" + r);
//        System.out.println("圆周率是：" + PI);
//        System.out.println("面积是" + volume);

//        int A4 = 30;
//        int A5 = 20;
//        int A6 = A4 > A5 ? A4 : A5;
//        System.out.println(A6);

//        //矩形面积
//        double A4 = 38.9;
//        double A5 = 27.2;
//        double A6 = A4 * A5;
//        System.out.println(A6);

//        //复合语句,闭包函数
//        {
//            int A4 = 40;
//            System.out.println("输出 y 的值：" + A4);
//            int A5 = 245;
//            boolean A6;
//            {
//                A6 = A5 > A4;
//                System.out.println("A5 > A4成立吗" + A6);
//            }
//            String world = "hello ";
//            System.out.println(world);
//        }

//        //if 用法
//        int a = 100;
//        if(a<1){
//            System.out.println(a);
//        }else if(a > 10 && a < 100){
//            System.out.println("a");
//        }else{
//            System.out.println(a);
//        }

//        //switch case用法
//        int week = 3;
//        switch (week){
//            case 1:
//                System.out.println("Mon");
//                break;
//            case 2:
//                System.out.println("Tue");
//                break;
//            default:
//                System.out.println("None");
//        }

//        //验证信息合法性
//        String username = "jim1";
//        String pass = "123456";
//        if(!username.equals("jim")){
//            System.out.println("用户名非法");
//        }else if(!pass.equals("123456")){
//            System.out.println("密码错误");
//        }else{
//            System.out.println("OK");
//        }

//        //为员工分配部门
//        String name = "Jim 1 号";
//        String lang = "java";
//        System.out.println(name.hashCode());

//        //while语言使用
//        int x = 1;
//        int sum = 0;
//        while (x <= 1000){
//            sum += x;
//            x++;
//        }
//        System.out.println("sum is :" + sum);

//        //do while
//        int a = 100;
//        while (a == 60){
//            System.out.println("ok ! a == 60");
//            a--;
//        }
//
//        int b = 100;
//        do{
//            System.out.println("ok !b==100");
//            b--;
//        }
//        while (b == 60);

//        //for
//        int sum = 0;
//        for (int i = 2;i<=100;i+=2){
//            sum += i;
//        }
//        System.out.println(sum);

//        //for循环数组
//        int arr[] = {1,2,3};   //声明数组
//        for (int x : arr){
//            System.out.println(x);
//        }

        //使用while 遍历数组
//        String[] aves = new String[]{"猫","gou","蛇","1"};
//        int index = 0;
//        while (index < aves.length){
//            System.out.println(aves[index++]+ "");
//        }

//        for (String x : aves){
//            System.out.println(x);
//        }

//        //九九乘法表
//        for(int i = 1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.println(i +"*" + j + "=" + i*j);
//            }
//        }

//          //break中断单次循环
//        String[] array = new String[]{"bailu","dandinghe","wuya"};
//        for (String val: array){
//            if (val.equals("wuya")){
//                break;
//            }
//            System.out.println(val);
//        }


//        int [][] Score = new int[][]{{31,30,40},{20,12,25}};
//        for(int[] val : Score){
//            for (int val1: val){
//                System.out.println(val1);
//            }
//        }

//        String[][] arrays = new String[][]{{"abc","bcd"},{"ddd","baidu"}};
//        for (String[] val: arrays){
//            for(String val2 : val){
//                System.out.println(val2);
//            }
//        }

//        // 10以内的奇数，continue
//        int n;
//        for (n = 0;n<10;n++){
//            if (n % 2 == 0){
//                continue;
//            }
//            System.out.println(n);
//        }

//        String[] array = new String[]{"白鹭","丹顶鹤","老鹰","阿吉"};
//        for (String val : array){
//            if(val.equals("老鹰"))
//                break;
//            System.out.println("有：" + val);
//        }
//
//        int[][] myScore = new int[][]{{1,2,3,4,5},{10,20,30,40},{50,60,70,80}};
//        for (int[] val : myScore){
//            for (int val1: val){
//                if(val1 < 60){
//                    System.out.println("不及格：" + val1);
//                }else{
//                    System.out.println("及格：" + val1);
//                }
//            }
//        }

//        String[] niao = new String[]{"j1","j2","j3","j4","j1","j5","j1","j6"};
//        int num = 0;
//        for(String val : niao){
//            if(val.equals("j1")){
//                num++;
//            }
//        }
//        System.out.println(num);


        //数组的使用方式
//        int[] num = {11,12,13,1,15};
//        for(int i = 0;i < num.length;i++){
//            System.out.println(num[i] + "");
//        }
//
//        int min = num[0];
//        for (int j = 0;j < num.length - 1;j++){
//            if(min > num[j + 1]){
//                min = num[j + 1];
//            }
//        }
//        System.out.println("最小值" + min);

//        //多维数组
//        int a[][] = {{1,2,3,4,5},{1,4,5,6,7}};
//        for (int[] val : a){
//            for (int val1: val){
//                System.out.println(val1);
//            }
//        }

//        //定义一个三行四列的矩阵
//        int a[][] = new int[3][4];
//        for(int i = 0;i < a.length; i++){
//            for (int j = 0;j < a[i].length;j++){
//                System.out.println(a[i][j] + "");
//            }
//            System.out.println();
//        }

//        //对矩阵进行行转置运算
//        int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println("打印");
//        printArray(arr);
//
//        int arr2[][] = new int[arr.length][arr.length];
//        for (int i = 0;i< arr.length;i++){
//            for (int j = 0;j < arr[i].length;j++){
//                arr2[j][i] = arr[i][j];
//            }
//        }
//
//        System.out.println("后");
//        printArray(arr2);

        //求方阵的迹
//        int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        int tr = 0;
//        for (int i = 0;i < arr.length;i++){
//            for(int j = 0;j < arr.length;j++){
//                System.out.print(arr[i][j] + "");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0;i < arr.length;i++){
//            tr += arr[i][i];
//        }
//        System.out.println("方阵 arr[][] 的迹是" + tr);

//        //遍历一维数组
//        String day[] = new String[]{"aaa","dddd","123"};
//        for (String val : day){
//            System.out.println(val);
//        }


//        for (int i = 0;i < day.length;i++){
//            System.out.println(day[i]);
//        }

//        //遍历二维数组
//        String[][] day = new String[][]{{"zhouyi","zhouer","zhousan"},{"yizhou","yizhou2"}};
//        for (String [] val : day){
//            for (String val1: val){
//                System.out.println(val1);
//            }
//        }

//        for (int i = 0;i < day.length;i++){
//            for (int j = 0; j < day[i].length ; j++){
//                System.out.println(day[i][j]);
//            }
//        }

//        int arr2[][] = {{1,2,3,4,5},{6,7,8}};
//        for (int [] v: arr2) {
//            for ( int v1 : v) {
//                System.out.println(v1);
//            }
//        }

        //填充替换数据元素
//        int arr[] = new int[5];
//        Arrays.fill(arr,8); //使用同一个值对数组进行填充
//        for(int i = 0; i < arr.length;i++){
//            System.out.println("第" + (i+1) + "个元素是：" + arr[i]);
//        }

//        //指定填充数组范围
//        int arr[] = {1,2,3,4,5,7};
//        Arrays.fill(arr,1,3,100);
//        for (int i = 0;i < arr.length;i++){
//            System.out.println("第" + (i+1) + "个元素是：" + arr[i] );
//        }

//        //对数据进行排序
//        int arr [] = {8,5,345,24,6,7};
//        for(int val : arr){
//            System.out.println(val);
//        }
//
//        //对数据进行升序排序
//        Arrays.sort(arr);
//        for (int val : arr){
//            System.out.println(val);
//        }

        //复制数组
//        int arr[] = {1,2,34};
//
//        //复制数组,如果大于原数组长度则用0代替
//        int newArr[] = Arrays.copyOf(arr,5);
//        for (int i = 0; i < newArr.length;i++){
//            System.out.println(newArr[i]);
//        }

//        //复制指定范围的数组
//        int arr[] = {1,2,34,5,6};
//        //复制指定范围的数组
//        int newArr[] = Arrays.copyOfRange(arr,0,3);
//        for (int val: newArr){
//            System.out.println(val);
//        }

//        //对比一维数组、二维数组所占用的内存
//        int num1 = 10240*10240*2;      // 创建数组中元素个数
//        int[] arr1 = new int[num1];  // 创建int型一维数组
//        for (int i = 0;i <arr1.length ;i ++){
//            arr1[i] = i;
//        }
//
//        //获取占用内存总数，并将单位转换为MB
//        long mem1 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
//        System.out.println("用一维数组储存占用 内存总量为" + mem1);
//
//        int num2 = 10240 * 10240;
//        int [][] arr2 = new int[num2][2];  //创建二维数组
//        for(int i = 0;i < arr2.length;i++){
//            arr2[i][0] = i;
//            arr2[i][1] = i;
//        }
//        long mem2 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
//        System.out.println("用二维数组储存占用 内存总量为" + mem2);

//        //使用直接插入法排序
//        int [] arr = {3,5,1,2,8,5,3};
//        int tmp;
//        int j;
//        for (int i = 1;i < arr.length;i++){
//            tmp = arr[i];
//            for ( j = i - 1; j >= 0 && arr[j] > tmp ;j--){
//                arr[j + 1] = arr[j];
//            }
//            arr[j + 1] = tmp;
//        }
//
//        for (int i = 0 ; i < arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        //获取字符串长度
//        String s = "wwwwww.ddddafdsdfsaf";
//        System.out.println(s.length());

//        //获取字符串索引位置从0开始计算
//        String s = "abcdefghijklmn";
//        System.out.println(s.lastIndexOf('d'));

//        //获取字符串最后出现的地方
//        String s = "addda123sffsadsfg";
//        System.out.println(s.lastIndexOf("a"));

//        //或者字符串指定位置的字符
//        String s = "我是指定的";
//        System.out.println(s.charAt(2));

//        //去除字符串的左右空格
//        String s1 = "       fsf      ";
//        System.out.println(s1.trim());

//        //去除字符串所有空格
//        String text = "   a s d dddsd eees asdg t eqd ";
//        text = text.replaceAll(" ","");
//        System.out.println(text);

//        //代替字符串
//        String s = "bd bb ss";
//        String newS = s.replace("ss","aa");
//        System.out.print(newS);

//        //替代第一个出现的指定字符串
//        String s = "bab bab sss";
//        String news = s.replaceFirst("bab","aba");
//        System.out.print(news);

//        //字符串比较，
//        String a = "i am a stu";
//        String b = "i am a stu";
//        // == 是比较内存的位置,结果是false
//        System.out.print(a == b);
//
//        //比较字符串是否一致，区分大小写
//        System.out.print(a.equals(b));
//
//        //比较字符串是否一致，忽略大小写
//        System.out.print(a.equalsIgnoreCase(b));

//        //判断字符串是否以aa开头
//        String a = "aadddeeqertt";
////        System.out.print(a.startsWith("aa"));
////        System.out.print(a.startsWith("bb"));
//
//        //判断字符串是否意味tt结尾
//        System.out.print(a.endsWith("tt"));
//        System.out.print(a.endsWith("bb"));

//        String a = "aaaaaaaa";
////        //将字符串全部转成大写
////        System.out.print(a.toUpperCase());
//
////        //将字符串转换成全部小写\toLowerCase
////        System.out.print(a.toUpperCase().toLowerCase());

//        //字符串分割
//        String s = "abd,dad,dwt,dadt";
//        String[] news = s.split(",");
//        for (String val : news){
//            System.out.print(val);
//        }

//        //根据逗号或者句号分割字符串
//        String s = "dddd，aaaaa。qqqqq，eeeeee。";
//        String[] news = s.split("，|。");
//        for (String val : news){
//            System.out.print(val);
//        }

//        //判断字符串是否数字（页码120）
//        String s = "1234566dddddafsd454";
//        if(StudyBase.IsNumber(s)){
//            System.out.print(s + "是数字");
//        }else{
//            System.out.print(s + "不是数字");
//        }


//        //日期用法
        Date today = new Date();
//        //格式化月份英文缩写
//        String a = String.format(Locale.US,"%tb",today);
//        //格式化月份全写
//        String b = String.format(Locale.US,"%tB",today);
//        //格式化星期简称
//        String c = String.format("%ta",today);
//        //格式化星期全称
//        String d = String.format("%tA",today);
//        //格式化为4位的年分值
//        String e = String.format("%tY",today);
//        //格式化为2位的年份值
//        String f = String.format("%tm",today);
//        //格式化2位月份
//        String g = String.format("%tm",today);
//        //格式化2位的日期值
//        String h = String.format("%td",today);
//        //格式化为1位的日期值
//        String i = String.format("%te",today);

//        //时间用法
//        System.out.print("两位24小时制的小时：" + String.format("%tH",today));
//        System.out.print("两位12小时制的小时：" + String.format("%tl",today));
//        System.out.print("24小时制的小时：" + String.format("%tk",today));
//        System.out.print("12小时制的小时：" + String.format("%tl",today));
//        System.out.print("两位小时中的分钟：" + String.format("%tM",today));
//        System.out.print("两位分钟中的秒：" + String.format("%tS",today));
//        System.out.print("表示时区缩写形式的字符串：" + String.format("%tZ",today));
//        System.out.print("上午还是下午：" + String.format("%tp",today));

//        System.out.print("24小时格式化小时和分钟：" + String.format("%tR",today) + "\n");
//        System.out.print("24小时，格式化小时，分钟和秒：" + String.format("%tT",today) + "\n");
//        System.out.print("12小时制的时间，被格式化为：" + String.format("%tr",today) + "\n");
//        System.out.print("日期格式化为：" + String.format("%tD",today) + "\n");
//        System.out.print("ISO 8601格式化完整日期" + String.format("%tF",today) + "\n");
//        System.out.print("日期和时间被格式化为 + " + String.format("%tc",today) + "\n");

        //常规类型格式化
        //将结果以十进制显示
//        String str1 = String.format("%d",400/2);
//        String str2 = String.format("%b",3 > 5);
//        String str3 = String.format("%x",200);
//        System.out.print("400的一半是：" + str1);
//        System.out.print("3 > 5：" + str2);
//        System.out.print("200 的十六进制：" + str3);

//        //将数字变成汉字金额
//        Scanner scan = new Scanner(System.in);
//        String convert = convert(scan.nextDouble());
//        System.out.println(convert);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        //获取用户输入数字
//        double number = scan.nextDouble();
//        System.out.println("Locale 类的常量作为构造参数获得不同的货币格式：");
//        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        System.out.println("Locale.China : "  + format.format(number));

//        String s1 = "Mrkj007";
//        String s2 = "mrkj007";
//        boolean bn1 = s1.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
//        boolean bn2 = s2.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
//        System.out.println(s1 + "是合法数据吗" + bn1);

//        String regex = "\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";
//        String str1 = "aaa@";
//        String str2 = "aaaa";
//        String str3 = "aaaa@111.com";
//        if(str1.matches(regex)){
//            System.out.println(str1 + "是email");
//        }
//
//        if(str2.matches(regex)){
//            System.out.println(str2 + "是一个email 格式");
//        }
//
//        if(str3.matches(regex)){
//            System.out.println(str3 + "是一个email 格式");
//        }else{
//            System.out.println(str3 + "不是一个email 格式");
//        }
//        String tel1 = "13451474141";
//        System.out.println(checkPhone(tel1));


//        String ip = "192.168.11.1";
//        System.out.println(matchesIp(ip));

//        //匹配中文字数
//        String text = "aa飞电风扇444订单saddfsd141";
//        int amount = 0;
//        for (int i = 0; i < text.length() ; i ++){
//            boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$","" + text.charAt(i));
//            if(matches){
//                amount ++;
//            }
//        }
//        System.out.println("text 中文有 " + amount + "个汉字");

//        String str = "";
//        //定义执行操作的开始时间
//        long strTime = System.currentTimeMillis();
//        for (long i = 0;i < 100000; i++){
//            str += i;
//        }
//
//        long endTime = System.currentTimeMillis();
//        long time = endTime - strTime;
//        System.out.println("消耗时间：" + time);
//
//        //创建字符串生成器
//        StringBuilder builder = new StringBuilder("");
//        strTime = System.currentTimeMillis();
//        for (long j = 0;j < 1000000;j++){
//            builder.append(j);
//        }
//
//        endTime = System.currentTimeMillis();
//        time = endTime - strTime;
//        System.out.println("消耗时间：" + time);


//        String g = "good";
//        //构造字符串生成器
//        StringBuffer builder = new StringBuffer();
//        //将g的值追加到字符串生成器
//        builder.append(g);
//        System.out.println("追加后bulider的值：" + builder);

//        //构建初始内容为sunday的字符串缓存
//        StringBuffer buffer = new StringBuffer("sunday");
//        //构造字符串生成器
//        StringBuilder builder = new StringBuilder();
//        //向字符串生成器中追加字符串缓存
//        builder.append(buffer);
//        System.out.println("追加后bulider的值：" + builder);

//        String s1 = "int";
//        String s2 = "ser";
//        //构造初始化为int的字符串生成器
//        StringBuilder builder = new StringBuilder(s1);
//        //向索引为2处添加字符串ser,位置从1开始算
//        builder.insert(2,s2);
//        System.out.println("追加后的builder值是：" + builder);

//        //构建字符串生成器
//        StringBuilder builder = new StringBuilder("SringBuilders");
//        //删除字符串，要指定开始位置和结束位置，第二个参数不是长度，是位置
//        StringBuilder s2 = builder.delete(5,10);
//        System.out.println("删除后的：" + s2);

//        //字符串生成器转成字符串
//        StringBuilder builder = new StringBuilder("helloworld");
//        String s = builder.toString();

        /* 汉字和字母转成unicoder */
//        String text = "明日 soft";
//        //获取字符串的字符数组
//        char[] charArray = text.toCharArray();
//        //构建生成器
//        StringBuilder builder = new StringBuilder();
//        for (char c : charArray){
//            builder.append((int)c + " ");
//        }
//        //unicoder是
//        System.out.println(builder.toString());

//        /* 去除字符串中的重复字符串 */
//        String s = "命运入海风-吹着青春的周，飘摇的，曲折的，度过累时间的海！";
//        //创建生成器
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0;i<sb.length() ; i ++){
//            for(int j = i+1;j<sb.length();j++){
//                //在字符生成器中，charAt通过索引获取值
//                if(sb.charAt(i) == sb.charAt(j)){
//                    //在字符生成器中，charAt通过索引删除值
//                    sb.deleteCharAt(j);
//                }
//            }
//        }
//
//        System.out.println("新字符串：" + sb);


//        String value = "我是阿吉";
//        char secret = '傻';
//        String encrypt = EandU(value,secret);
//        System.out.println("加密后的值：" + encrypt);
//        String uncrypt = EandU(encrypt,secret);
//        System.out.println("解密后的值：" + uncrypt);

    }

    public static String EandU(String value,char secret){
        //将需要加密的内容转换为字节数组
        byte[] bt = value.getBytes();
        for(int i = 0;i < bt.length;i++){
            //通过异或运算进行加密
            bt[i] = (byte)(bt[i] ^ (int) secret);
        }
        return new String(bt,0,bt.length);
    }

    /*ip正则*/
    public static String matchesIp(String text){
        if(text != null && !text.isEmpty()){
            String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|(1-9)\\d|[1-9])\\."
                    + "(1\\d{2}|2[0-4]\\|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\|25[0-5]|[1-9]\\d|\\d)$";
            if(text.matches(regex)){
                return text + "\n 是一个合法的iP";
            }else{
                return text + "\n 不是一个合法ip";
            }
        }
        return "请输入id";
    }

//    //手机合法性
//    public static String checkPhone(String phone){
//        String regex = "1[3,5,8]\\d{9}$";
//        if(phone.matches(regex)){
//            return phone + "\n 是合法的手机号";
//        }else{
//            return phone + "\n 不是合法的手机号";
//        }
//    }
//
//    public static String convert(double d){
//        //实例化DecimalFormat对象
//        DecimalFormat df = new DecimalFormat("#0.###");
//        //格式化double数字
//        String strNum = df.format(d);
//        //判断是否包含小数点
//        if(strNum.indexOf('.') != -1){
//            //截取字符串
//            String num = strNum.substring(0,strNum.indexOf("."));
//            if(num.length() > 12){
//                System.out.print("数字太大，不能完成转换！");
//                return "";
//            }
//        }
//
//        String point = "";
//        if(strNum.indexOf(".") != -1){
//            point = "元";
//        }else{
//            point = "元整";
//        }
//
//        String result = "";
//    }
//
//    //讲整数部分转换成大写
//    public static String getInteger(String num){
//        //判断是否包含小数
//        if(num.indexOf(".") != -1){
//            num = num.substring(0,num.indexOf('.'));
//        }
//
//        //反转字符串
//        num = new StringBuffer(num).reverse().toString();
//        StringBuffer temp = new StringBuffer();
//        for(int i = 0;i < num.length();i++){
//            temp.append(STR_UNIT[i]);
//            temp.append(STR_NUMBER[num.charAt(i) - 48]);
//        }
//
//        //反转字符串
//        num = temp.reverse().toString();
//        num= numReplace(num,"零10");
//    }

    public static boolean IsNumber(String str){
        //将字符串拆分并赋给字符串数组
        char[] c = str.toCharArray();
        for (int i = 0;i < c.length; i++){
            //如果是数字继续循环
            if(Character.isDigit(c[i])){
            }else{
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[][] arr) {
        for (int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}
