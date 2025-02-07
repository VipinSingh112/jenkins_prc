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
 * The table class for the &quot;nbp_jadsc_info_request&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCInformationRequest
 * @generated
 */
public class JADSCInformationRequestTable
	extends BaseTable<JADSCInformationRequestTable> {

	public static final JADSCInformationRequestTable INSTANCE =
		new JADSCInformationRequestTable();

	public final Column<JADSCInformationRequestTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, Long> jadscInfoRequestId =
		createColumn(
			"jadscInfoRequestId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JADSCInformationRequestTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> mainTelephone =
		createColumn(
			"mainTelephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> officeTelephone =
		createColumn(
			"officeTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> cellTelephone =
		createColumn(
			"cellTelephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> otherContact =
		createColumn(
			"otherContact", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		whatsappTelephone = createColumn(
			"whatsappTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> emailContact =
		createColumn(
			"emailContact", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> contactPerName =
		createColumn(
			"contactPerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		contactPerPosition = createColumn(
			"contactPerPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> contactPerPhone =
		createColumn(
			"contactPerPhone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> contactPerEmail =
		createColumn(
			"contactPerEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		altContactPerName = createColumn(
			"altContactPerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		altContactPerPosition = createColumn(
			"altContactPerPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		altContactPerPhone = createColumn(
			"altContactPerPhone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		altContactPerEmail = createColumn(
			"altContactPerEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> comOperationYear =
		createColumn(
			"comOperationYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> products =
		createColumn(
			"products", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> marketSharePer =
		createColumn(
			"marketSharePer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		tradeRemedyMeasure = createColumn(
			"tradeRemedyMeasure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String>
		fiveYearsInvestment = createColumn(
			"fiveYearsInvestment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> planCapacity =
		createColumn(
			"planCapacity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, String> growthProjection =
		createColumn(
			"growthProjection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCInformationRequestTable, Long> jadscApplicationId =
		createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCInformationRequestTable() {
		super("nbp_jadsc_info_request", JADSCInformationRequestTable::new);
	}

}