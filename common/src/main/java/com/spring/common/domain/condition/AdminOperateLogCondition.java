package com.spring.common.domain.condition;

import com.spring.common.domain.condition.help.BaseCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AdminOperateLogCondition extends BaseCondition {

    @ApiModelProperty(value = "operator")
    private String operator;
    @ApiModelProperty(value = "主键排序类型")
    @Pattern(regexp = "asc|desc", message = "时间排序类型（asc|desc）")
    private String createTimeSortType = "desc";
    @ApiModelProperty(value = "操作类别")
    private String operateName;
    @ApiModelProperty(value = "角色列表")
    Set<String> roleUkSet = new HashSet<>();
    @ApiModelProperty(value = "操作结果")
    @Pattern(regexp = "1|0", message = "1成功，0失败")
    private Integer result;

}
