/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacture_add_comp_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalCompanyInfo
 * @generated
 */
public class ManuAdditionalCompanyInfoTable
	extends BaseTable<ManuAdditionalCompanyInfoTable> {

	public static final ManuAdditionalCompanyInfoTable INSTANCE =
		new ManuAdditionalCompanyInfoTable();

	public final Column<ManuAdditionalCompanyInfoTable, Long>
		manuAdditionalCompanyInfoId = createColumn(
			"manuAdditionalCompanyInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManuAdditionalCompanyInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, String>
		companyNameRepresentative = createColumn(
			"companyNameRepresentative", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, String>
		companySignatureRepresentative = createColumn(
			"companySignatureRepresentative", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, Date> signatureDate =
		createColumn(
			"signatureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, String>
		customBrokerName = createColumn(
			"customBrokerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, String>
		customBrokerAddress = createColumn(
			"customBrokerAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, String>
		telephoneNumber = createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, String> brokerId =
		createColumn(
			"brokerId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuAdditionalCompanyInfoTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManuAdditionalCompanyInfoTable() {
		super(
			"nbp_manufacture_add_comp_info",
			ManuAdditionalCompanyInfoTable::new);
	}

}