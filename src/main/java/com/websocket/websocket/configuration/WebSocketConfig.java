package com.websocket.websocket.configuration;

import com.websocket.websocket.handlers.SocketConnectionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

// web socket connections is handled 
// by this class
@Configuration
@EnableWebSocket
public class WebSocketConfig
        implements WebSocketConfigurer {

    // Overriding a method which register the socket
    // handlers into a Registry
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry
                .addHandler(new SocketConnectionHandler(), "/hello")
                .setAllowedOrigins("*");
    }
}
