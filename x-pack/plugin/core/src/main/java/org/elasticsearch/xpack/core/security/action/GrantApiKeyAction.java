/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.core.security.action;

import org.elasticsearch.action.ActionType;

/**
 * ActionType for the creation of an API key on behalf of another user
 * This returns the {@link CreateApiKeyResponse} because the REST output is intended to be identical to the {@link CreateApiKeyAction}.
 */
public final class GrantApiKeyAction extends ActionType<CreateApiKeyResponse> {

    public static final String NAME = "cluster:admin/xpack/security/api_key/grant";
    public static final GrantApiKeyAction INSTANCE = new GrantApiKeyAction();

    private GrantApiKeyAction() {
        super(NAME, CreateApiKeyResponse::new);
    }

}
