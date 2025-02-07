/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_agri_desk_verification&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgriDeskVerification
 * @generated
 */
public class AgriDeskVerificationTable
	extends BaseTable<AgriDeskVerificationTable> {

	public static final AgriDeskVerificationTable INSTANCE =
		new AgriDeskVerificationTable();

	public final Column<AgriDeskVerificationTable, Long>
		agriDeskVerificationId = createColumn(
			"agriDeskVerificationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgriDeskVerificationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriDeskVerificationTable, String> documentStatus =
		createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AgriDeskVerificationTable() {
		super("nbp_agri_desk_verification", AgriDeskVerificationTable::new);
	}

}