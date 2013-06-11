package com.mmoscene.h4j.communication.events.handshake;

import com.mmoscene.h4j.communication.GameEvent;
import com.mmoscene.h4j.communication.Request;
import com.mmoscene.h4j.communication.composers.handshake.SendSecretKeyMessageComposer;
import com.mmoscene.h4j.network.sessions.Session;

public class SendSecretKeyMessageEvent implements GameEvent {
    @Override
    public void parse(Session session, Request request) {
        session.respond(SendSecretKeyMessageComposer.compose());
    }
}
