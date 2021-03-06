/*
 * sonar_deerbelling_plugin
 * Copyright (C) 2015 guillaume jourdan
 * guillaume.jourdan.pro@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package com.github.gujou.deerbelling.sonarqube.plugin;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.Extension;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.PropertyType;
import org.sonar.api.SonarPlugin;

@Properties({
		@Property(key = ReportsKeys.TASKS_REPORT_SKIP_KEY, name = "Skip", description = "Skip tasks report generation.", defaultValue = ReportsKeys.TASKS_REPORT_SKIP_DEFAULT, global = true, project = true, module = false, type = PropertyType.BOOLEAN),
		@Property(key=ReportsKeys.TASKS_REPORT_TYPE_CSV_SEPARATOR_KEY, name = "Separator", description = "The CSV Separator.", defaultValue = ReportsKeys.TASKS_REPORT_TYPE_CSV_SEPARATOR_DEFAULT, global = true, project = true, module = false),
		@Property(key = ReportsKeys.TASKS_REPORT_SONAR_LOGIN_KEY, name = "Login", description = "WS API login.", global = true, project = true, module = false),
		@Property(key = ReportsKeys.TASKS_REPORT_SONAR_PWD_KEY, name = "Password", description = "WS API password.", global = true, project = true, module = false, type = PropertyType.PASSWORD) })
public class ReportsPlugin extends SonarPlugin {

	@Override
	public List<Class<? extends Extension>> getExtensions() {
		return Arrays.<Class<? extends Extension>> asList(TasksReportPostJob.class, TasksReportWidget.class, ApplicationReportWidget.class);
	}
}
