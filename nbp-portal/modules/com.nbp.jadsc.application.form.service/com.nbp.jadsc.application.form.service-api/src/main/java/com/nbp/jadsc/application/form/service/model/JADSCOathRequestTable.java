/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_oath_request&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequest
 * @generated
 */
public class JADSCOathRequestTable extends BaseTable<JADSCOathRequestTable> {

	public static final JADSCOathRequestTable INSTANCE =
		new JADSCOathRequestTable();

	public final Column<JADSCOathRequestTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, Long> jadscOathRequestId =
		createColumn(
			"jadscOathRequestId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JADSCOathRequestTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, String> investigationType =
		createColumn(
			"investigationType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, String> partyName = createColumn(
		"partyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, String> requestReason =
		createColumn(
			"requestReason", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, String> comOfficial =
		createColumn(
			"comOfficial", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, Date> signatureDate =
		createColumn(
			"signatureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCOathRequestTable, Long> jadscApplicationId =
		createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCOathRequestTable() {
		super("nbp_jadsc_oath_request", JADSCOathRequestTable::new);
	}

}