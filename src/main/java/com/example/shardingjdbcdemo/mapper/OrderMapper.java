package com.example.shardingjdbcdemo.mapper;

import com.example.shardingjdbcdemo.model.OrderModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author 王鹏
 */
@Mapper
public interface OrderMapper {
    @Insert("insert into order_main(serial_id,piece_key,member_id,order_status) values(#{serialId},#{pieceKey},#{memberId},#{status})")
    int insert(OrderModel orderModel);


    @Select("select * from order_main where piece_key in (1,2)")
    List<Map<String,Object>> selectList();
}
