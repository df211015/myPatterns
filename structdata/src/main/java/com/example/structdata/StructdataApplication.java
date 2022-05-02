package com.example.structdata;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class StructdataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StructdataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动...");

//        LocalDateTime now = LocalDateTime.now();
//
//        LocalDate localDate = now.toLocalDate();
//
//        LocalTime localTime = now.toLocalTime();
//
//        String strDate = localDate.toString();
//        String strTime = localTime.toString();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime localDateNew = LocalDateTime.parse("2019-12-07 07:43:53", formatter);
//
//        LongAdder longAdder = new LongAdder();
//
//        String str = "";

//        List<String> list = Arrays.asList("yellow", "red", "green", "blue");
//        //注意该方法是取反，并不是逆序排序
//        Collections.reverse(list);
////        Collections.sort(list);
////        Collections.reverse(list);
//        Collections.sort(list);
//        int green = Collections.binarySearch(list, "blue");
//        System.out.println(String.format("二分查找:%s", green));
//        String str = String.format("%04d", youNumber);
//        List<String> lstImgUrl = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            String str = String.format("str_%04d", i);
//            lstImgUrl.add(str);
//        }
//
//        List<List<String>> lists = ArraysUtils.divideEqually(lstImgUrl, 5);
//
//
//        String myStr = "Good morning.Have a good class.Have a good class.Have fun!";
//        String[] words = myStr.split("[\\s+\\p{P}]");
////        TreeMap<String, Integer> treeMap = new TreeMap<>((s, anotherString) -> s.compareTo(anotherString));
//        TreeMap<String, Integer> treeMap = new TreeMap<>();
//        for (String item : words) {
//            if (StringUtils.isNotBlank(item)) {
//                if (!treeMap.containsKey(item)) {
//                    treeMap.put(item, 1);
//                } else {
//                    Integer integer = treeMap.get(item);
//                    treeMap.put(item, ++integer);
//                }
//            }
//        }
//
//        treeMap.forEach((k, v) -> {
//            System.out.println(String.format("k=%s,v=%s", k, v));
//        });
//
//        String text = "";


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        System.out.println("原始数据是：" + list);
//
//        int pageSize = 2;
//        System.out.println("每页大小是：" + pageSize);
//
//        RamPagerHelper<Integer> pager = new RamPagerHelper<>(list, pageSize);
//        System.out.println("总页数是: " + pager.getPageCount());
//
//        System.out.println("<- - - - - - - - - - - - - ->");
//
//        // 无需感知页码情况下使用
//        Iterator<List<Integer>> iterator = pager.iterator();
//        while (iterator.hasNext()) {
//            List<Integer> next = iterator.next();
//            System.out.println("next: " + next);
//        }
//
//        System.out.println("<- - - - - - - - - - - - - ->");
//        // 需要指定页码情况使用，页码从第一页开始，且小于等于总页数！
//        for (int i = 1; i <= pager.getPageCount(); i++) {
//            List<Integer> page = pager.page(i);
//            System.out.println("第 " + i + " 页数据是:" + page);
//        }

//        Set<String> set = new HashSet<String>();
//        set.add("abcde");
//        Iterator<String> it = set.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            System.out.println(str);
//        }

//        try {
//
//            List<CityInfoDto> lst = new ArrayList();
//            CityInfoDto item = new CityInfoDto();
//            item.setIndex(100);
//            item.setName("100name");
//            item.setCode(100);
//            lst.add(item);
//
//            CityInfoDto item2 = new CityInfoDto();
//            item2.setIndex(200);
//            item2.setName("200name");
//            item2.setCode(200);
//            lst.add(item2);
//
//            CityInfoDto item3 = new CityInfoDto();
//            item3.setIndex(300);
//            item3.setName(null);
//            item3.setCode(300);
//            lst.add(item3);
//
//            CityInfoDto item4 = new CityInfoDto();
//            item4.setIndex(400);
//            item4.setName(null);
//            item4.setCode(400);
//            lst.add(item4);
//
//
//            LinkedHashMap<Integer, String> collect1 = lst.stream().collect(LinkedHashMap::new, (m, v) -> m.put(v.getIndex(), v.getName()), LinkedHashMap::putAll);
//
//            Map<Integer, String> collect = lst.stream().collect(Collectors.toMap(CityInfoDto::getIndex, CityInfoDto::getName));
//
//            String s = JSON.toJSONString(collect);
//        } catch (Exception ex) {
//            String msg = ex.toString();
//
//            String strErr = "";
//        }


//        String packagecityid = "417654";
//        String provinceId = String.format("%s0000", String.valueOf(packagecityid).substring(0, 2));
//        Integer myInt = Integer.valueOf(provinceId);

//        ProcessFactory.getMyProcess();
//
//        String str = "更新后的文件名";

//        ItemDto itemDto_0 = new ItemDto();
//        itemDto_0.setId("000");
//        itemDto_0.setName("000_name");
//        itemDto_0.setRemark("000_remark");
//
//        ItemDto itemDto_1 = new ItemDto();
//        itemDto_1.setId("100");
//        itemDto_1.setName("100_name");
//        itemDto_1.setRemark("100_remark");
//
//        ItemDto itemDto_2 = new ItemDto();
//        itemDto_2.setId("200");
//        itemDto_2.setName("200_name");
//        itemDto_2.setRemark("200_remark");
//
//        IlinkData ilinkData = new LinkDataImpl();
//        ilinkData.add(itemDto_0);
//        ilinkData.add(itemDto_1);
//        ilinkData.add(itemDto_2);
//
//        ilinkData.show();

//        int[] intarray = {1, 2, 3, 4, 5};
//        List<Integer> list = Arrays.asList(intarray);
//        List<int[]> list = Arrays.asList(intarray);
//        List<Integer> list = Ints.asList(intarray);
//        System.out.println(list);

//        try {
//            IdGenerator idGenerator = new RandomIdGenerator();
//            String generate = idGenerator.generate();
//        } catch (IllegalArgumentException ex) {
//            String exMsg1 = "";
//        } catch (Exception e) {
//            String exMsg2 = "";
//        }

//        IdGenerator idGenerator = new RandomIdGenerator();
//        String generate = idGenerator.generate();

//        String join = String.join("", Collections.nCopies(5, "-"));
//        String str1 = "";

//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < 5; i++) {
//            sb.append("-");
//        }
//        String str2 = sb.toString();

//        Integer n = 5;
//        String format = String.format(String.format("%%0%s", String.format("%sd", n)), 0);
//        //String format = String.format("%05d", 0);
//        String str3 = "";

//        Integer str1 = getVerPlus("1.2.3.4");
//        System.out.println(String.format("group:%s", str1));
//
//        Integer str2 = getVerPlus("1.2.4");
//        System.out.println(String.format("group:%s", str2));
//
//        Date date = getQualityEndDate("2022-04-11");
//        Date date2 = getQualityEndDate("2022-04-13");
//        //在date实例的后面
//        boolean after = date.before(date2);
//        //在date实例的前面
//        boolean before = date.before(date2);
//        String str = "";

//        String str = "冀B7JA07";
//        String str2 = str.substring(0,2);
//        String str3 = "";

        String unifiedNumber = "123456";
        List<String> strings = Arrays.asList(unifiedNumber);
        String str = "";
    }

    public static Date getQualityEndDate(String strDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(strDate);
        return date;
    }

    private static final String ver_partern = "(\\d+\\.\\d+\\.\\d+)(?:\\.\\d+)?";

    /**
     * 获取主版本号,仅截取主版本号数据
     *
     * @param strFullVersion 全版本号数据
     * @return 主版本号
     */
    public static Integer getVerPlus(String strFullVersion) {
        Pattern compile = Pattern.compile(ver_partern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher(strFullVersion);
        boolean findFlag = matcher.find();
        if (findFlag) {
            String ver = matcher.group(1);
            Integer iVersion = null;
            if (StringUtils.isNotBlank(ver)) {
                String sVer = ver.replaceAll("\\.", "");
                iVersion = Integer.valueOf(sVer);
            }

            return iVersion;
        }

        return null;
    }
}
