package cn.bugstack.chatgpt.data.trigger.http.dto;

import lombok.Data;

/**
 * @description:
 * @author：cheese，微信：
 * @date: 2024-02-27
 * @Copyright： 公众号：
 */
@Data
public class ChoiceEntity {

    /** stream = true 请求参数里返回的属性是 delta */
    private MessageEntity delta;
    /** stream = false 请求参数里返回的属性是 delta */
    private MessageEntity message;
}
