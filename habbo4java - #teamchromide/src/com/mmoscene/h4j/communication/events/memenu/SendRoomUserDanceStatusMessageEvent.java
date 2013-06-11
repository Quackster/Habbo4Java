package com.mmoscene.h4j.communication.events.memenu;

import com.mmoscene.h4j.communication.GameEvent;
import com.mmoscene.h4j.communication.Request;
import com.mmoscene.h4j.communication.composers.memenu.SendRoomUserDanceStatusMessageComposer;
import com.mmoscene.h4j.network.sessions.Session;

public class SendRoomUserDanceStatusMessageEvent implements GameEvent {
    @Override
    public void parse(Session session, Request request) {
        int id = request.readInt();

        session.getHabbo().getRoomActor().getCurrentRoom().respond(
                SendRoomUserDanceStatusMessageComposer.compose(
                        session.getHabbo().getId(),
                        id
                )
        );
    }
}
