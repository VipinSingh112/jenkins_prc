/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_application_pre&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreInitiation
 * @generated
 */
public class JadscAppliPreInitiationTable
	extends BaseTable<JadscAppliPreInitiationTable> {

	public static final JadscAppliPreInitiationTable INSTANCE =
		new JadscAppliPreInitiationTable();

	public final Column<JadscAppliPreInitiationTable, Long>
		jadscAppliPreInitiationId = createColumn(
			"jadscAppliPreInitiationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JadscAppliPreInitiationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, Date>
		dateOfPreInitiation = createColumn(
			"dateOfPreInitiation", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, String> outcome =
		createColumn(
			"outcome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreInitiationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JadscAppliPreInitiationTable() {
		super("nbp_jadsc_application_pre", JadscAppliPreInitiationTable::new);
	}

}