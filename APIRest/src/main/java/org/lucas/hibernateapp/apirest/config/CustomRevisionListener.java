package org.lucas.hibernateapp.apirest.config;

import org.hibernate.envers.RevisionListener;
import org.lucas.hibernateapp.apirest.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity;}
}
