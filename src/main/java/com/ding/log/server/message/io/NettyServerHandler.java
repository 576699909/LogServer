package com.ding.log.server.message.io;

import com.ding.log.server.util.StringUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class NettyServerHandler  extends ChannelInboundHandlerAdapter {
    /**
     * 客户端连接会触发
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("NettyServerHandler active");
    }

    /**
     * 客户端发消息会触发
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String str= msg.toString();
        log.info("服务器收到消息: {}",str);
        Map<String, String> map = StringUtil.split(str);
        log.info("服务使用第:{} 组服务处理消息",map.get("group"));
        ctx.write("success");
        ctx.flush();
    }

    /**
     * 发生异常触发
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}