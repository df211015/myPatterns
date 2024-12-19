package com.example.interpreter.service.customize02;

import java.util.ArrayList;
import java.util.List;

public final class RetailStandardCheckFactory {
    private RetailStandardCheckFactory() {
    }

    /**
     * 根据枚举项校验不符合零售标准code
     *
     * @param detectionItemCode
     * @param exceptionDescription
     * @return
     */
    public static List<ERejectRetailStandardReason> getRetailStandardType(String detectionItemCode, String exceptionDescription) {
        List<ERejectRetailStandardReason> lstRejectRetailStandardReason = new ArrayList<>();
        List<ERetailStandardExceptionLevel> items = ERetailStandardExceptionLevel.findItems(detectionItemCode);
        if (null != items) {
            for (ERetailStandardExceptionLevel item : items) {
                ERejectRetailStandardReason rejectRetailStandardReason = ERejectRetailStandardReason.findItem(item.getExceptionCode());
                if (null == rejectRetailStandardReason) {
                    continue;
                }
                Boolean checkFlag = Boolean.FALSE;
                switch (rejectRetailStandardReason) {
                    case NRSRC1:
                        checkFlag = checkBigDamage(exceptionDescription);
                        break;
                    case NRSRC2:
                        checkFlag = checkNormalDamage(exceptionDescription);
                        break;
                    case NRSRC3:
                        checkFlag = checkFlooded(exceptionDescription);
                        break;
                    case NRSRC4:
                        checkFlag = checkSkylightLeakage(exceptionDescription);
                        break;
                    case NRSRC5:
                        checkFlag = checkMeterSetting(exceptionDescription);
                        break;
                    case NRSRC6:
                        checkFlag = checkHail(exceptionDescription);
                        break;
                    case NRSRC8:
                        checkFlag = checkConditionFault(exceptionDescription);
                        break;
                    case NRSRC9:
                        checkFlag = checkLifeLimit(exceptionDescription);
                        break;
                    case NRSRC10:
                        checkFlag = checkDriveMileage(exceptionDescription);
                        break;
                    case NRSRC11:
                        checkFlag = checkTransferTimes(exceptionDescription);
                        break;
                }
                if (checkFlag) {
                    lstRejectRetailStandardReason.add(rejectRetailStandardReason);
                }
            }
            return (lstRejectRetailStandardReason.size() > 0) ? lstRejectRetailStandardReason : null;
        }

        return null;
    }

    /**
     * 重大损伤
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkBigDamage(String exceptionDescription) {
        List<DetectionExpression> lstExpression = new ArrayList<>();
        DetectionTerminalExpression detectionItemExpression = new DetectionTerminalExpression("A柱,B柱,C柱,D柱,底盘,车身底板纵梁");
        lstExpression.add(new DetectionTerminalExpression("变形"));
        lstExpression.add(new DetectionTerminalExpression("修复"));
        lstExpression.add(new DetectionTerminalExpression("切割"));
        lstExpression.add(new DetectionTerminalExpression("焊接"));
        lstExpression.add(new DetectionTerminalExpression("更换"));
        DetectionAndExpression orExpressionPlus = new DetectionAndExpression(detectionItemExpression, lstExpression);

        return orExpressionPlus.interpret(exceptionDescription);
    }

    /**
     * 一般损伤
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkNormalDamage(String exceptionDescription) {
        List<DetectionExpression> lstExpression = new ArrayList<>();
        DetectionTerminalExpression detectionItemExpression = new DetectionTerminalExpression("底大边主体及封边(不可拆卸),水箱框架,后围板,翼子板内衬,后翼子板(不可拆卸),后备箱底板(含备胎槽),元宝梁,车架号,漆面改装,车身覆盖件");
        lstExpression.add(new DetectionTerminalExpression("变形"));
        lstExpression.add(new DetectionTerminalExpression("修复"));
        lstExpression.add(new DetectionTerminalExpression("切割"));
        lstExpression.add(new DetectionTerminalExpression("焊接"));
        lstExpression.add(new DetectionTerminalExpression("更换"));
        DetectionAndExpression orExpressionPlus = new DetectionAndExpression(detectionItemExpression, lstExpression);

        return orExpressionPlus.interpret(exceptionDescription);
    }

    /**
     * 泡水车
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkFlooded(String exceptionDescription) {
        return Boolean.FALSE;
    }

    /**
     * 天窗漏水
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkSkylightLeakage(String exceptionDescription) {
        return Boolean.FALSE;
    }

    /**
     * 调表车
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkMeterSetting(String exceptionDescription) {
        return Boolean.FALSE;
    }

    /**
     * 冰雹车
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkHail(String exceptionDescription) {
        return Boolean.FALSE;
    }


    /**
     * 工况故障
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkConditionFault(String exceptionDescription) {
        List<DetectionExpression> lstExpression = new ArrayList<>();
        DetectionTerminalExpression detectionItemExpression = new DetectionTerminalExpression("仪表故障灯");
        lstExpression.add(new DetectionTerminalExpression("发动机故障灯"));
        lstExpression.add(new DetectionTerminalExpression("水温报警灯"));
        lstExpression.add(new DetectionTerminalExpression("气囊灯"));
        lstExpression.add(new DetectionTerminalExpression("机油灯亮"));
        lstExpression.add(new DetectionTerminalExpression("新能源车故障红灯"));
        DetectionAndExpression orExpressionPlus = new DetectionAndExpression(detectionItemExpression, lstExpression);

        return orExpressionPlus.interpret(exceptionDescription);
    }

    /**
     * 年限超限
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkLifeLimit(String exceptionDescription) {
        return Boolean.FALSE;
    }

    /**
     * 公里数超限
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkDriveMileage(String exceptionDescription) {
        return Boolean.FALSE;
    }

    /**
     * 过户次数超限
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkTransferTimes(String exceptionDescription) {
        return Boolean.FALSE;
    }

    /**
     * 机电异常
     *
     * @param exceptionDescription
     * @return
     */
    private static Boolean checkElectricException(String exceptionDescription) {
        List<DetectionExpression> lstExpression = new ArrayList<>();
        DetectionTerminalExpression detectionItemExpression = new DetectionTerminalExpression("发动机,变速箱");
        lstExpression.add(new DetectionTerminalExpression("更换"));
        lstExpression.add(new DetectionTerminalExpression("整体拆装大修过"));
        lstExpression.add(new DetectionTerminalExpression("发动机缸体严重漏油"));
        lstExpression.add(new DetectionTerminalExpression("异响"));
        lstExpression.add(new DetectionTerminalExpression("异常烧机油"));
        lstExpression.add(new DetectionTerminalExpression("冒蓝烟"));
        lstExpression.add(new DetectionTerminalExpression("挂挡困难"));
        lstExpression.add(new DetectionTerminalExpression("行驶跳空档"));
        lstExpression.add(new DetectionTerminalExpression("离合器打滑"));
        lstExpression.add(new DetectionTerminalExpression("严重漏油"));
        DetectionAndExpression orExpressionPlus = new DetectionAndExpression(detectionItemExpression, lstExpression);

        return orExpressionPlus.interpret(exceptionDescription);
    }
}
