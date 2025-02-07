/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_factories_stand_act_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfo
 * @generated
 */
public class FactoriesStandardActInfoTable
	extends BaseTable<FactoriesStandardActInfoTable> {

	public static final FactoriesStandardActInfoTable INSTANCE =
		new FactoriesStandardActInfoTable();

	public final Column<FactoriesStandardActInfoTable, Long>
		factoriesStandardActId = createColumn(
			"factoriesStandardActId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoriesStandardActInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActEstablishmentName = createColumn(
			"standardsActEstablishmentName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActAddParish = createColumn(
			"standardsActAddParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActAddress = createColumn(
			"standardsActAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String> standardsActTel =
		createColumn(
			"standardsActTel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActWhatsAppNum = createColumn(
			"standardsActWhatsAppNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActEmail = createColumn(
			"standardsActEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActFaxNum = createColumn(
			"standardsActFaxNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActOperatorName = createColumn(
			"standardsActOperatorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActOperatorAddress = createColumn(
			"standardsActOperatorAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActParish = createColumn(
			"standardsActParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActOperatorTel = createColumn(
			"standardsActOperatorTel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardActProductManufactured = createColumn(
			"standardActProductManufactured", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardActBrandManufactured = createColumn(
			"standardActBrandManufactured", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActProductSize = createColumn(
			"standardsActProductSize", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, Date>
		standardsActLastDate = createColumn(
			"standardsActLastDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		standardsActPurpose = createColumn(
			"standardsActPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, Date> standardsActDate =
		createColumn(
			"standardsActDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, String>
		establishmentBefore = createColumn(
			"establishmentBefore", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesStandardActInfoTable, Long>
		factoriesApplicationId = createColumn(
			"factoriesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FactoriesStandardActInfoTable() {
		super(
			"nbp_factories_stand_act_info", FactoriesStandardActInfoTable::new);
	}

}