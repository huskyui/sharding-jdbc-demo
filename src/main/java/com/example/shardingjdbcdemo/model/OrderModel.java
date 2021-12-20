package com.example.shardingjdbcdemo.model;

import lombok.Data;

/**
 * @author 王鹏
 */
@Data
public class OrderModel {
    private Long id;
    private String serialId;
    private Long pieceKey;
    private Long memberId;
    private Integer status;
}
