package com.xxtyace.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@TableName("people")
public class People {

    @NotNull
    @TableField("id")
    private String id;

    @NotNull
    @TableField("name")
    private String name;

    @NotNull
    @TableField("age")
    private Integer age;

    @NotNull
    @TableField("sex")
    private String sex;
}
