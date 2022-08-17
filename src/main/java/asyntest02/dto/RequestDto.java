package asyntest02.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author ymx
 * @Name RequestDto
 * @CreateTime 2022/8/17
 * @ProjectName AsynTest01
 * @Description:
 */
@Data
public class RequestDto implements Serializable {

    private String date;

    private int serialNum;

}
