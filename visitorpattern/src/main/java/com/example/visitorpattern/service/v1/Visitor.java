package com.example.visitorpattern.service.v1;

public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        String strCommonEmployee = this.getCommonEmployee(commonEmployee);
        System.out.println(strCommonEmployee);
    }

    @Override
    public void visit(Manager manager) {
        String strManagerInfo = this.getManagerInfo(manager);
        System.out.println(strManagerInfo);
    }

    private String getBasicInfo(Employee employee) {
        return String.format("姓名:%s,性别:%s,薪水:%s", employee.getName(), employee.getSex() == Employee.MALE ? "男" : "女", employee.getSalary());
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
