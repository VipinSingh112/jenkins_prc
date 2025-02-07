/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_application_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPermit
 * @generated
 */
public class OsiApplicationPermitTable
	extends BaseTable<OsiApplicationPermitTable> {

	public static final OsiApplicationPermitTable INSTANCE =
		new OsiApplicationPermitTable();

	public final Column<OsiApplicationPermitTable, Long>
		osiApplicationPermitId = createColumn(
			"osiApplicationPermitId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiApplicationPermitTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, String> decision =
		createColumn(
			"decision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, Date> dateOfDecision =
		createColumn(
			"dateOfDecision", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, Date> dateOfIssue =
		createColumn(
			"dateOfIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, String> permitNumber =
		createColumn(
			"permitNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationPermitTable, String> fileEntryId =
		createColumn(
			"fileEntryId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private OsiApplicationPermitTable() {
		super("nbp_osi_application_permit", OsiApplicationPermitTable::new);
	}

}