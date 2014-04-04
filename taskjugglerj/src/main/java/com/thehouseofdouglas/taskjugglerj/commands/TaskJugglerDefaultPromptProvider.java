/*
 * Copyright (C) 2014 Peter Douglas
 * Copyright (C) 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014
 * 	by Chris Schlaeger <cs@taskjuggler.org>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.thehouseofdouglas.taskjugglerj.commands;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;

/**
 *
 * @author Peter Douglas
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class TaskJugglerDefaultPromptProvider extends DefaultPromptProvider {

    @Override
    public String getPrompt() {
        return "tj3>";
    }

    @Override
    public String getProviderName() {
        return "TJ3 Shell Prompt";
    }

}
