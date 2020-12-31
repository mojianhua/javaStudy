package springbootmysql.mapper;

import springbootmysql.bean.Employees;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeesMapper {

    public Employees getEmpById(Integer id);

    public void insertEmp(Employees employees);
}
