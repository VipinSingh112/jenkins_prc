/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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
 * @see JadscApplicationPreInitiation
 * @generated
 */
public class JadscApplicationPreInitiationTable
	extends BaseTable<JadscApplicationPreInitiationTable> {

	public static final JadscApplicationPreInitiationTable INSTANCE =
		new JadscApplicationPreInitiationTable();

	public final Column<JadscApplicationPreInitiationTable, Long>
		jadscAppliPreInitiationId = createColumn(
			"jadscAppliPreInitiationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JadscApplicationPreInitiationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, Date>
		dateOfPreInitiation = createColumn(
			"dateOfPreInitiation", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, String> outcome =
		createColumn(
			"outcome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationPreInitiationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JadscApplicationPreInitiationTable() {
		super(
			"nbp_jadsc_application_pre",
			JadscApplicationPreInitiationTable::new);
	}

}