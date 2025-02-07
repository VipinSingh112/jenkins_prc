/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_dev_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetails
 * @generated
 */
public class SezDeveloperDetailsTable
	extends BaseTable<SezDeveloperDetailsTable> {

	public static final SezDeveloperDetailsTable INSTANCE =
		new SezDeveloperDetailsTable();

	public final Column<SezDeveloperDetailsTable, Long> sezDeveloperDetailsId =
		createColumn(
			"sezDeveloperDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDeveloperDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, String> developerName =
		createColumn(
			"developerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, String> developerNumber =
		createColumn(
			"developerNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, String> developerControl =
		createColumn(
			"developerControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Date> letterOfApprovalDate =
		createColumn(
			"letterOfApprovalDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Date> sezDeveloperDate =
		createColumn(
			"sezDeveloperDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Long>
		letterOfApprovalEntrtyId = createColumn(
			"letterOfApprovalEntrtyId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Long>
		sezDeveloperAgreementEntryId = createColumn(
			"sezDeveloperAgreementEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<SezDeveloperDetailsTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDeveloperDetailsTable() {
		super("nbp_sez_dev_details", SezDeveloperDetailsTable::new);
	}

}