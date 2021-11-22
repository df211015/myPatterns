package com.example.structdata;

import com.example.structdata.service.IdGenerator;
import com.example.structdata.service.impl.RandomIdGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

        IdGenerator idGenerator = new RandomIdGenerator();
        String generate = idGenerator.generate();
    }
}
