/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_unsec_creditor&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see UnsecuredCreditor
 * @generated
 */
public class UnsecuredCreditorTable extends BaseTable<UnsecuredCreditorTable> {

	public static final UnsecuredCreditorTable INSTANCE =
		new UnsecuredCreditorTable();

	public final Column<UnsecuredCreditorTable, Long> unsecuredCreditorId =
		createColumn(
			"unsecuredCreditorId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<UnsecuredCreditorTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, String> unsecuredCreditorName =
		createColumn(
			"unsecuredCreditorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, String> unsecuredCreditorDebt =
		createColumn(
			"unsecuredCreditorDebt", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, String>
		unsecuredCreditorAmount = createColumn(
			"unsecuredCreditorAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, String>
		unsecuredCreditorPayment = createColumn(
			"unsecuredCreditorPayment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, String>
		unsecuredCreditorCounter = createColumn(
			"unsecuredCreditorCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, Date> unsecuredCreditorDate =
		createColumn(
			"unsecuredCreditorDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<UnsecuredCreditorTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private UnsecuredCreditorTable() {
		super("nbp_osi_unsec_creditor", UnsecuredCreditorTable::new);
	}

}