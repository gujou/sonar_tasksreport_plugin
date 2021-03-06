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

public interface ReportsKeys {

	static final String TASKS_REPORT_SKIP_KEY = "tasks.report.skip";
	static final String TASKS_REPORT_SKIP_DEFAULT = "false";

	static final String TASKS_REPORT_TYPE_XLS_EXTENSION = "xls";
	static final String TASKS_REPORT_TYPE_CSV_EXTENSION = "csv";
	static final String APPLICATION_REPORT_TYPE_PDF_EXTENSION = "pdf";
	
	public static final String TASKS_REPORT_TYPE_CSV_SEPARATOR_KEY = "tasks.report.csv.separator";
	public static final String TASKS_REPORT_TYPE_CSV_SEPARATOR_DEFAULT = ",";

	public static final String TASKS_REPORT_SONAR_URL_KEY = "sonar.host.url";
	public static final String TASKS_REPORT_SONAR_URL_DEFAULT = "http://localhost:9000";
	
	public static final String TASKS_REPORT_SONAR_LOGIN_KEY = "tasks.report.password";
	public static final String TASKS_REPORT_SONAR_PWD_KEY = "tasks.report.user";

}
