/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_noti_legal_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NotifiLegalInfo
 * @generated
 */
public class NotifiLegalInfoTable extends BaseTable<NotifiLegalInfoTable> {

	public static final NotifiLegalInfoTable INSTANCE =
		new NotifiLegalInfoTable();

	public final Column<NotifiLegalInfoTable, Long> notifiLegalInfoId =
		createColumn(
			"notifiLegalInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NotifiLegalInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> legalPersonName =
		createColumn(
			"legalPersonName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> legalPersonAddress =
		createColumn(
			"legalPersonAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> organizationName =
		createColumn(
			"organizationName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> organizationAddress =
		createColumn(
			"organizationAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> contactNumber =
		createColumn(
			"contactNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> legalPersonEmail =
		createColumn(
			"legalPersonEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, String> practiceNature =
		createColumn(
			"practiceNature", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NotifiLegalInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NotifiLegalInfoTable() {
		super("nbp_hsra_noti_legal_info", NotifiLegalInfoTable::new);
	}

}