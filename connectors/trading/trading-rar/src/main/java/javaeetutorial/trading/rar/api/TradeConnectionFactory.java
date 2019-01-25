/*
 * Copyright (c) 2014, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package javaeetutorial.trading.rar.api;

import javax.resource.ResourceException;

public interface TradeConnectionFactory {

    /* Applications call this method, which delegates on the container's
     * connection manager to obtain a connection instance through
     * TradeManagedConnectionFactory */
    public TradeConnection getConnection() throws ResourceException;
    
}