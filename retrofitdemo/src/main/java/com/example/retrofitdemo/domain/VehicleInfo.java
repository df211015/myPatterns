package com.example.retrofitdemo.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class VehicleInfo {
    private String id;
    private String _id;
    private String createdAt;
    private Integer saleLabelType;
    private Integer carType;
    private Double inspectionScore;
    private String inspectionLevel;
    private CreatedBy createdBy;
    private String registrationDate;
    private Integer retryCount;
    private String ownerPhone;
    private Integer ownerGender;
    private Integer purchaseStatus;
    private Integer sourceType;
    private Double ensurePriceMin;
    private Double ensurePriceMax;
    private Integer isDetectionReport;
    private Integer isReDetectionReport;
    private Integer masterBrandId;
    private String masterBrandName;
    private Integer subBrandId;
    private String subBrandName;
    private String crmOrderId;
    private String reCrmOrderId;
    private String isChangeColor;
    private String changeColorType;
    private Integer acceptPriceChangeType;
    private String tradeBillDesc;
    private Integer prominentService;
    private Double reQuotedPrice;
    private String creatorDepartCode;
    private Integer channelType;
    private String saleTime;
    private Integer creatorCityId;
    private String creatorCityName;
    private Integer visitStatus;
    private String visitTime;
    private Integer sureSaleStatus;
    private String priceGrade;
    private Integer offlineAuditStatus;
    private Integer offlineOpStatus;
    private String offlineAuditRemark;
    //停售时间
    private String offlineTime;
    private String relUnId;
    private String relBizType;
    private String bizType;
    private Integer isMileageReal;
    private String ownerSourceId;
    private Integer ownerSourceType;
    private String ownerSourceName;
    //审核视频标清链接
    private String reportVideoSd;
    //审核视频高清链接
    private String reportVideoHd;
    //审核视频超清链接
    private String reportVideoFd;
    //检测视频链接
    private List<VideoClip> videoClips;
    //上架提交时间
    private String submitSaleInfoTime;
    //上架失败原因
    private String saleFailReason;
    //门店所属业务组Id
    private String ownerSourceBusinessGroup;
    //检测视频处理状态
    private Integer videoStatus;
    //采集人所属的部门Id
    private String creatorDepartId;
    //上架状态
    private Integer onsaleStatus;
    //分类综合描述
    private List<ItemSummary> groupSummary;
    //车源版本号
    private String ver;
    //车源综合描述
    private String summaryRemark;
    //车源全价
    private Double showPrice;
    //新车指导价
    private Double referPrice;
    //视频开始录制时间
    private String videoStartTime;
    //车源视频检测视频信息
    private List<VideoItemInfo> videoInfo;
    //更新时间
    private String updateTime;
    //下架备注
    private String offlineRemark;
    //车源业务来源
    private Integer bizTypeFrom;
    private Integer allowYdg;
    private Integer copyCar;
    private Integer supportFinance;
    private String forbiddenYdgRemark;
    private Integer simpleFlag;
    //门店车源阶段标识,1:采购阶段,2:上架阶段
    private Integer vehiclePhase;
    //上架时间
    private String firstSubmitSaleInfoTime;
    //销售方式,1:零售,2:批售,3:两都均可
    private Integer saleApproach;
    //分发类别,1:全国购,2:本地购
    private Integer promotionType;
    //采购方式,3:门店零采,4:实车寄售,6:门店渠采,8:网络寄售
    private Integer purchaseType;
    //采集人所属的门店Id
    private String belongToStoreId;
    //采集人所属的门店名称
    private String belongToStoreName;
    //质检确认状态,0:待确认,1:已确认
    private Integer qualityConfirmStatus;
    //所属采集店城市Id
    private Integer storeCityId;
    //复检城市id
    private Integer recheckcityid;
    //复检城市名称
    private String recheckcityname;
    //上架城市id
    private Integer onsalecityid;
    //上架城市名称
    private String onsalecityname;
    //实际百公里耗电，单位:度
    private String powerConsumption;
    //电池能量
    private String energyContent;
    //循环充电次数
    private Integer electricizeTimes;
    //0:否(默认),1:是, 租赁电池
    private Integer leaseBattery;
    //绝缘阻值：非必填，单位“Kohm”
    private String electricResistance;
    //累计放电电能：非必填，单位“度”
    private String accumulativeElectron;
    //1:正常，9:异常, 电池电压状态：非必选，无默认项
    private Integer batteryStatus;
    //1:有，9:无, 远程操控APP账号密码：必选，无默认项
    private Integer distanceControl;

    @Data
    public static class VideoItemInfo{
        private String positionCode;
        private String positionName;
        private List<CheckItem> checkItem;
    }

    @Data
    public static class CheckItem{
        private String itemName;
        private String itemCode;
        private List<VideoClipAlias> videoClips;
    }

   @Data
   public static class ItemSummary{
       private String categoryCode;
       private String remarkCode;
       private String remark;
   }

    @Data
    public static class VideoClipAlias{
        private String value;
        private String label;
        private Integer key;
        private Long duration;
    }

    @Data
    public static class VideoClip{
        private String url;
        private String videoName;
        private Integer code;
        private Long duration;
    }

    @Data
    public static class CreatedBy {
        private Person person;
        private List<Group> groups;
        private BusinessGroup businessGroup;
        private String id;

        @Data
        public static class Person {
            private String phone;
            private String name;
            private String id;
        }

        @Data
        public static class Group {
            private String name;
            private String id;
        }

        @Data
        public static class BusinessGroup {
            private KeyValue distinct;
            private KeyValue city;
            private KeyValue province;
            private String name;
            private String id;
        }

        private String token;
        private String username;
    }

    private VehicleDesc desc;

    @Data
    public static class VehicleDesc {
        private String brief; // 简述(后改为备注)
        private String detail; // 车辆描述
        private String auditComment;//审核备注
    }

    private Status status;

    @Data
    public static class Status {
        private Date operatedAt;
        private CreatedBy operatedBy;
        private String tag;
        private boolean deleted;
        private String certifyStatus;
        private String saleStatus;
        private String status;
        private String tagKeywords;
        private List<VehicleStatusReason> reasons;
        private String certifyPlatform;
        private String comment;

        @Data
        public static class VehicleStatusReason {
            private String key;
            private String value;
            private List<KeyValue> subReasons;
        }
    }

    private List<KeyLabel> features;
    private History history;

    @Data
    public static class History {
        private KeyValue registrationExterior;
        private List<Photo> registrationPhotos;
        private String registrationDate;
        private RegistrationInfo registrationInfo;

        @Data
        public static class RegistrationInfo {
            private String ownerName;
            private String ownerIdentityCardNumber;
            private String registeredBy;
            private String registeredAt;
            private String licenseNumber;
            private String city;
        }
    }

    private Inspection inspection;

    @Data
    private static class Inspection {
        private List<Map<String, String>> reports;
    }

    private Formalities formalities;

    @Data
    public static class Formalities {
        private VehicleCredential commercialInsurance;
        private VehicleCredential purchaseTax;
        private KeyValue habitat;
        private VehicleCredential inspection;
        private String manufacturedAt;
        private BigDecimal invoicePrice;
        private VehicleCredential invoice;
        private VehicleCredential compulsoryInsurance;
        private VehicleCredential environmentalCredential;
        private String lastTransferredAt;
        private VehicleCredential nameplate;
        private Map<String, Object> numOwners;
        private VehicleCredential transferReceipt;
        //曾使用方
        private Integer onceUsed;
        //现使用方
        private Integer currentUsed;
        //获得方式
        private Integer acquisitionType;

        @Data
        public static class VehicleCredential {
            private String value; // 证件 / 票据等凭证编号
            private String status; // 有/无/未见
            private List<Photo> photos; // 证件 / 票据附件
            private String expiredStatus; // 过期状态  expired/not_expired
            private String expiredAt; // 证件 / 票据到期日期
        }
    }

    private Summary summary;

    @Data
    public static class Summary {
        private String comment;
        private Integer seatingCapacity;
        private KeyValue use;
        private KeyValue ownerNature;
        private KeyValue numKeys;
        private KeyValue emissionStandard;
        private String sweptVolume;
        private String engineNumber;
        private KeyValue fuelType;
        private KeyValue bodyStyle;
        private KeyValue driveType;
        private Boolean isTurboBoost;
        private Address licenseAddress;
        private String licenseNumber;
        private DrivingLicense drivingLicense;
        private KeyValue transmission;

        @Data
        public static class DrivingLicense {
            private Photo copyFrontPhoto;
            private Photo originalBackPhoto;
            private Photo originalFrontPhoto;
            private Photo copyBackPhoto; //行驶证副页背面
            private Photo annualInspectionPhoto; //年检日期页
            private String ownerName; // 行驶证所有人
            private String ownerAddress;// 行驶证所有人住址
        }

        private Mileage mileage;

        @Data
        public static class Mileage {
            private Photo photo;
            private Double value;
        }

        private KeyValue exterior;
        private KeyValue interior;
    }

    private Address address;

    @Data
    public static class Address {
        private Map<String, Double> location;
        private String detail;
        private String cityName;
        private String cityCode;
        private String provinceName;
        private String provinceCode;
        private String districtCode;
        private String districtName;
    }

    private Owner owner;

    @Data
    public static class Owner {
        private String platform;
        private Address address;
        private String ownerType;
        private CreatedBy.BusinessGroup ownerBusinessGroup;
        private String ownerName;
        private String ownerId;
    }

    private String serialNumber;
    private List<Photo> photos;

    @Data
    public static class Photo {
        private Double latitude;
        private Double longitude;
        private String model;
        private String make;
        private String originalDate;
        private String label;
        private String key;
        private String cdn;
        private String source;
        private String lastUpdatedDate;
        private String categoryCode;
        private String categoryName;
    }

    private Price price;

    @Data
    public static class Price {
        private BigDecimal offerPrice;
        private String comment;
        private BigDecimal evalPrice;
        private KeyValue saleMode;
        private KeyValue saleType;
        private BigDecimal acceptablePrice;
        private BigDecimal quotedPrice;
        private String saleIntentLevel;
        private Double fullPrice;
    }

    private Spec spec;

    @Data
    public static class Spec {
        private String manualBrandModel;
        private String yearGroup;
        private String saleName;
        private String series;
        private Integer seriesId;
        private String brand;
        private Integer brandId;
        private String maker;
        private String modelId;
        private String levelId;
        private String updatedAt;
    }

    private Vin vin;

    @Data
    public static class Vin {
        private Photo photo;
        private String code;
    }

    @Data
    public static class KeyValue {
        private String key;
        private String value;
    }

    @Data
    public static class KeyLabel {
        private String key;
        private String label;
        private KeyValue value;
        private Photo photo;
        private String componentCode;
        private String componentName;
    }

    private String taskId;
    private String createrId;
    private String unifiedNumber;
    private String taskNo;
}