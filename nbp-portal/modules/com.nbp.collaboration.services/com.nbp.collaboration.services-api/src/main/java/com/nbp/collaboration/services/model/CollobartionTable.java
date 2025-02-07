/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.collaboration.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_collaboration&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Collobartion
 * @generated
 */
public class CollobartionTable extends BaseTable<CollobartionTable> {

	public static final CollobartionTable INSTANCE = new CollobartionTable();

	public final Column<CollobartionTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, Long> collaborationId = createColumn(
		"collaborationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CollobartionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> stageName = createColumn(
		"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> userType = createColumn(
		"userType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> comment = createColumn(
		"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> uploadedDocId = createColumn(
		"uploadedDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, String> applicationId = createColumn(
		"applicationId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CollobartionTable, Integer> archived = createColumn(
		"archived", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private CollobartionTable() {
		super("nbp_collaboration", CollobartionTable::new);
	}

}