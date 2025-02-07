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
 * The table class for the &quot;nbp_osi_preferred_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PreferredCreditor
 * @generated
 */
public class PreferredCreditorTable extends BaseTable<PreferredCreditorTable> {

	public static final PreferredCreditorTable INSTANCE =
		new PreferredCreditorTable();

	public final Column<PreferredCreditorTable, Long> preferredCreditorId =
		createColumn(
			"preferredCreditorId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PreferredCreditorTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, String> preferredCreditorName =
		createColumn(
			"preferredCreditorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, String>
		preferredCreditorLiability = createColumn(
			"preferredCreditorLiability", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, String>
		preferredCreditorAmount = createColumn(
			"preferredCreditorAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, String>
		preferredCreditorPayment = createColumn(
			"preferredCreditorPayment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, String>
		preferredCreditorCounter = createColumn(
			"preferredCreditorCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, Date> preferredCreditorDate =
		createColumn(
			"preferredCreditorDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PreferredCreditorTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private PreferredCreditorTable() {
		super("nbp_osi_preferred_detail", PreferredCreditorTable::new);
	}

}