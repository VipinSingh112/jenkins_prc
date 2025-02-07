/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_collaboration&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartion
 * @generated
 */
public class CannabisCollobartionTable
	extends BaseTable<CannabisCollobartionTable> {

	public static final CannabisCollobartionTable INSTANCE =
		new CannabisCollobartionTable();

	public final Column<CannabisCollobartionTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, Long>
		cannabisCollaborationId = createColumn(
			"cannabisCollaborationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisCollobartionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> cannabisStage =
		createColumn(
			"cannabisStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> userType =
		createColumn(
			"userType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> comment =
		createColumn(
			"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> uploadedDocId =
		createColumn(
			"uploadedDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, String> applicationId =
		createColumn(
			"applicationId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisCollobartionTable, Integer> archived =
		createColumn(
			"archived", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private CannabisCollobartionTable() {
		super("nbp_cannabis_collaboration", CannabisCollobartionTable::new);
	}

}