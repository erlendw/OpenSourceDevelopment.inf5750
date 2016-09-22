package no.uio.inf5750.Assignment1.dao;

import no.uio.inf5750.Assignment1.model.Message;

/**
 * Created by erlend on 08.09.2016.
 */
public interface MessageDao
{
    int save( Message message );
    Message get( int id );
    Message getLast();
}
