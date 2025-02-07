/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicPayment
 * @generated
 */
public class MiicPaymentTable extends BaseTable<MiicPaymentTable> {

	public static final MiicPaymentTable INSTANCE = new MiicPaymentTable();

	public final Column<MiicPaymentTable, Long> miicPaymentId = createColumn(
		"miicPaymentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MiicPaymentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicPaymentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicPaymentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicPaymentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicPaymentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicPaymentTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicPaymentTable, Long> miicApplicationId =
		createColumn(
			"miicApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MiicPaymentTable() {
		super("nbp_miic_payment", MiicPaymentTable::new);
	}

}