package cn.bugstack.chatgpt.data.domain.openai.service;

import cn.bugstack.chatgpt.data.domain.openai.model.aggregates.ChatProcessAggregate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

/**
 * @description:
 * @author：cheese，微信：
 * @date: 2024-02-27
 * @Copyright： 公众号：
 */
public interface IChatService {

    ResponseBodyEmitter completions(ChatProcessAggregate chatProcess);
}
